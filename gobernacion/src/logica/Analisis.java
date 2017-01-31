/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.File;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jxl.read.biff.BiffException;

/**
 *
 * @author dark
 */
public class Analisis implements OperacionesLibro {

    private boolean semaforo;
    private File file;
    private ArchivoControlPrenatalDefuncion control_prenatal_defuncion;
    private ArchivoControlPrenatalVivo control_prenatal_vivo;
    private ArchivoDeudaCertificado deuda_certificado;
    private ArchivoEstadisticaVitalDefunciones estadistica_vital_defunfion;
    private ArchivoEstadisticaVitalNacimientos estadistica_vital_nacimientos;
    private ArchivoEstadisticaVitalDefunciones estadistica_vital_defunfion_todos;
    private ArchivoEstadisticaVitalNacimientos estadistica_vital_nacimientos_todos;
    private Vector<String> municipios = new Vector<>();
    private ArrayList<String> pendientes_generales_dane_vivos = new ArrayList<>();
    private ArrayList<String> pendientes_generales_dane_difuntos = new ArrayList<>();
    private boolean primera_instancia = false;
    private String respuesta = "";

    public Analisis(File control_prenatal_defuncion, File control_prenatal_vivo, File deuda_certificado, File estadistica_vital_defunfion, File estadistica_vital_nacimientos) {
        this.file = estadistica_vital_defunfion;
        this.control_prenatal_defuncion = new ArchivoControlPrenatalDefuncion(control_prenatal_defuncion);
        this.control_prenatal_vivo = new ArchivoControlPrenatalVivo(control_prenatal_vivo);
        this.deuda_certificado = new ArchivoDeudaCertificado(deuda_certificado);
        this.estadistica_vital_defunfion = new ArchivoEstadisticaVitalDefunciones(estadistica_vital_defunfion);
        this.estadistica_vital_nacimientos = new ArchivoEstadisticaVitalNacimientos(estadistica_vital_nacimientos);
    }

    public Analisis() {
        this.file = file;
        this.control_prenatal_defuncion = new ArchivoControlPrenatalDefuncion();
        this.control_prenatal_vivo = new ArchivoControlPrenatalVivo();
        this.deuda_certificado = new ArchivoDeudaCertificado();
        this.estadistica_vital_defunfion = new ArchivoEstadisticaVitalDefunciones();
        this.estadistica_vital_nacimientos = new ArchivoEstadisticaVitalNacimientos();
        this.estadistica_vital_defunfion_todos = new ArchivoEstadisticaVitalDefunciones();
        this.estadistica_vital_nacimientos_todos = new ArchivoEstadisticaVitalNacimientos();
    }

    @Override
    public void generarWorkBook() {
        this.control_prenatal_defuncion.generarWorkBook();
        this.control_prenatal_vivo.generarWorkBook();
        this.deuda_certificado.generarWorkBook();
        this.estadistica_vital_defunfion.generarWorkBook();
        this.estadistica_vital_nacimientos.generarWorkBook();
    }

    public boolean isSemaforo() {
        return semaforo;
    }

    public void setSemaforo(boolean semaforo) {
        this.semaforo = semaforo;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    

    public ArchivoEstadisticaVitalDefunciones getEstadistica_vital_defunfion_todos() {
        return estadistica_vital_defunfion_todos;
    }

    public void setEstadistica_vital_defunfion_todos(ArchivoEstadisticaVitalDefunciones estadistica_vital_defunfion_todos) {
        this.estadistica_vital_defunfion_todos = estadistica_vital_defunfion_todos;
    }

    public ArchivoEstadisticaVitalNacimientos getEstadistica_vital_nacimientos_todos() {
        return estadistica_vital_nacimientos_todos;
    }

    public void setEstadistica_vital_nacimientos_todos(ArchivoEstadisticaVitalNacimientos estadistica_vital_nacimientos_todos) {
        this.estadistica_vital_nacimientos_todos = estadistica_vital_nacimientos_todos;
    }

    public ArrayList<String> getPendientes_generales_dane_vivos() {
        return pendientes_generales_dane_vivos;
    }

    public void setPendientes_generales_dane_vivos(ArrayList<String> pendientes_generales_dane_vivos) {
        this.pendientes_generales_dane_vivos = pendientes_generales_dane_vivos;
    }

    public ArrayList<String> getPendientes_generales_dane_difuntos() {
        return pendientes_generales_dane_difuntos;
    }

    public void setPendientes_generales_dane_difuntos(ArrayList<String> pendientes_generales_dane_difuntos) {
        this.pendientes_generales_dane_difuntos = pendientes_generales_dane_difuntos;
    }

    public boolean isPrimera_instancia() {
        return primera_instancia;
    }

    public void setPrimera_instancia(boolean primera_instancia) {
        this.primera_instancia = primera_instancia;
    }

    public void extraerMultiplesArchivos(File dane[], File vital_vivos[], File vital_difuntos[], int muni[]) {
        /**
         * Extraer informacion archivos del dane*
         */
        ManejadorMunicipio m = new ManejadorMunicipio();
        semaforo = false;
        for (int n : muni) {
            System.out.println("Analizando " + m.getMunicipio(n) + "***********************");
            respuesta+="Analizando " + m.getMunicipio(n) + "***********************";
            this.getDeuda_certificado().setVivos(new ArrayList<DeudasCertificado>());
            this.getDeuda_certificado().setMuertos(new ArrayList<DeudasCertificado>());
                for (File dane1 : dane) {
                    this.getDeuda_certificado().setArchivo(dane1);
                    this.getDeuda_certificado().generarWorkBook();
                    this.getDeuda_certificado().seleccionarMunicipio(n);
                    this.getDeuda_certificado().extraerNodos();
                }
            this.getEstadistica_vital_nacimientos().setNacimientos(new ArrayList<FilaEstadisticaVitalNacimientos>());
            for (File vital_viv : vital_vivos) {
                
                this.getEstadistica_vital_nacimientos().setArchivo(vital_viv);
                this.getEstadistica_vital_nacimientos().generarWorkBook();
                this.getEstadistica_vital_nacimientos().seleccionarMunicipio(n);
                this.getEstadistica_vital_nacimientos().extraerNodos();
                if (!semaforo) {
                    this.getEstadistica_vital_nacimientos_todos().setArchivo(vital_viv);
                    this.getEstadistica_vital_nacimientos_todos().generarWorkBook();
                    this.getEstadistica_vital_nacimientos_todos().seleccionarMunicipio(-1);
                    this.getEstadistica_vital_nacimientos_todos().extraerCualquierNodos();
                }
            }
            for (File vital_dif : vital_difuntos) {
                this.getEstadistica_vital_defunfion().setDefunciones(new ArrayList<EstadisticaVital_defuncion>());
                this.getEstadistica_vital_defunfion().setArchivo(vital_dif);
                this.getEstadistica_vital_defunfion().generarWorkBook();
                this.getEstadistica_vital_defunfion().seleccionarMunicipio(n);
                this.getEstadistica_vital_defunfion().extraerNodos();
                if (!semaforo) {
                    this.getEstadistica_vital_defunfion_todos().setArchivo(vital_dif);
                    this.getEstadistica_vital_defunfion_todos().generarWorkBook();
                    this.getEstadistica_vital_defunfion_todos().seleccionarMunicipio(-1);
                    System.out.println(this.getEstadistica_vital_defunfion_todos().getMunicipios());
                    this.getEstadistica_vital_defunfion_todos().extraerCualquieraNodos();                    System.out.println(this.getEstadistica_vital_defunfion_todos().getDefunciones().size());
                }
            }
            if (!semaforo) {
                this.getEstadistica_vital_defunfion_todos().getColumna(1);
                this.getEstadistica_vital_nacimientos_todos().getColumna(1);
            }
            semaforo = true;
            /**
             * **************************************************************
             */
            reportActual();
            this.getEstadistica_vital_nacimientos().setNacimientos(new ArrayList<FilaEstadisticaVitalNacimientos>());
            this.getEstadistica_vital_defunfion().setDefunciones(new ArrayList<EstadisticaVital_defuncion>());
            /**
             * **************************************************************
             */
        }
    }

    @Override
    public void extraerNodos() {
        this.control_prenatal_defuncion.extraerNodos();
        this.control_prenatal_vivo.extraerNodos();
        this.deuda_certificado.extraerNodos();
        this.estadistica_vital_defunfion.extraerNodos();
        this.estadistica_vital_nacimientos.extraerNodos();
    }

    @Override
    public void extraerNodos(int op) {
        this.control_prenatal_defuncion.seleccionarMunicipio(op);
        this.control_prenatal_defuncion.extraerNodos();
        this.control_prenatal_vivo.seleccionarMunicipio(op);
        this.control_prenatal_vivo.extraerNodos();
        this.deuda_certificado.seleccionarMunicipio(op);
        this.deuda_certificado.extraerNodos();
        this.estadistica_vital_defunfion.seleccionarMunicipio(op);
        this.estadistica_vital_defunfion.extraerNodos();
        this.estadistica_vital_nacimientos.seleccionarMunicipio(op);
        this.estadistica_vital_nacimientos.extraerNodos();
    }

    public void reporte1VivosDaneNOEntrego() {
        this.getControl_prenatal_vivo().getColumna(1);
        //System.out.println("control prenatal vivo "+this.getControl_prenatal_vivo().getColumna().size());
        this.getEstadistica_vital_nacimientos().getColumna(1);
        //System.out.println("Estadistica prenatal vivos : "+this.getEstadistica_vital_nacimientos().getColumna().size());
        //System.out.println("tamaño inicial: "+this.getEstadistica_vital_nacimientos().getColumna().size());
        this.getEstadistica_vital_nacimientos().getColumna().retainAll(this.getControl_prenatal_vivo().getColumna());
        //System.out.println("tamaño final: "+this.getEstadistica_vital_nacimientos().getColumna().size());
        ArrayList<String> no_reportados_por_dane = new ArrayList<>();
        for (String resul_filtro : this.getEstadistica_vital_nacimientos().getColumna()) {
            no_reportados_por_dane.add(new String(resul_filtro));
        }
        reportActual();
    }

    public void reportActual() {
        //se estraen los registros del dane
        this.getDeuda_certificado().getColumna(1);
//        System.out.println(this.getDeuda_certificado().getColumna());
//        System.out.println(this.getDeuda_certificado().getColumna_difuntos());
        System.out.println("_______________");
        respuesta+="_______________";
        //Se estrae la estadistica vital vivos y fallecidos
        this.getEstadistica_vital_defunfion().getColumna(1);
        this.getEstadistica_vital_nacimientos().getColumna(1);
        //Se filtran los q estan en ambos
        /*System.out.println(this.getEstadistica_vital_nacimientos().getColumna());
        System.out.println(this.getEstadistica_vital_defunfion().getColumna());*/
        this.getDeuda_certificado().getColumna().retainAll(this.getEstadistica_vital_nacimientos().getColumna());
        this.getDeuda_certificado().getColumna_difuntos().retainAll(this.getEstadistica_vital_defunfion().getColumna());
        /*ontenedores temporales para los archivos q se encuentran en ambos*/
        ArrayList<String> temporal_vivos_intersecta = new ArrayList<>();
        for (String temporal_vivos_intersecta1 : this.getDeuda_certificado().getColumna()) {
            temporal_vivos_intersecta.add(new String(temporal_vivos_intersecta1));
        }
        ArrayList<String> temporal_difuntos_intersecta = new ArrayList<>();
        for (String temporal_difunto_intersecta : this.getDeuda_certificado().getColumna_difuntos()) {
            temporal_difuntos_intersecta.add(new String(temporal_difunto_intersecta));
        }
        System.out.println();
        respuesta+="Esta en ambos archivos";
        System.out.println("Esta en ambos archivos");
        respuesta+="Vivos " + temporal_vivos_intersecta;
        System.out.println("Vivos " + temporal_vivos_intersecta);
        respuesta+="Difuntos " + temporal_difuntos_intersecta;
        System.out.println("Difuntos " + temporal_difuntos_intersecta);
        this.getDeuda_certificado().getColumna(1);
        this.getDeuda_certificado().getColumna().removeAll(temporal_vivos_intersecta);
        this.getDeuda_certificado().getColumna_difuntos().removeAll(temporal_difuntos_intersecta);
        respuesta+="_____Analisis en todos los q debe el municipio________";
        System.out.println("_____Analisis en todos los q debe el municipio________");
        respuesta+="Vivos  \n"+this.getDeuda_certificado().getColumna();
        System.out.println("Vivos  \n"+this.getDeuda_certificado().getColumna());
        respuesta+="Difuntos  \n"+this.getDeuda_certificado().getColumna_difuntos();
        System.out.println("Difuntos  \n"+this.getDeuda_certificado().getColumna_difuntos());
        // TEMPORAL DE LOS Q DEBE EL MUNICIPIO
        ArrayList<String> temporal_vivos_debe = new ArrayList<>();
        for (String temporal_vivos_intersecta1 : this.getDeuda_certificado().getColumna()) {
            temporal_vivos_intersecta.add(new String(temporal_vivos_intersecta1));
        }
        ArrayList<String> temporal_difuntos_debe = new ArrayList<>();
        for (String temporal_difunto_intersecta : this.getDeuda_certificado().getColumna_difuntos()) {
            temporal_difuntos_intersecta.add(new String(temporal_difunto_intersecta));
        }
        // SE inicia los valores para todos verificar q no este en todos
        temporal_vivos_debe.retainAll(this.getEstadistica_vital_nacimientos_todos().getColumna());
        temporal_difuntos_debe.retainAll(this.getEstadistica_vital_defunfion_todos().getColumna());
        respuesta+="\n_____debe el municipio pero esta en otro año a municipio________";
        System.out.println("_____debe el municipio pero esta en otro año a municipio________");
        respuesta+="\nVivos  \n"+temporal_vivos_debe;
        System.out.println("Vivos  \n"+temporal_vivos_debe);
        respuesta+="\nDifuntos  \n"+temporal_difuntos_debe;
        System.out.println("Difuntos  \n"+temporal_difuntos_debe);
        respuesta+="\n_____Los que debe el municipio por q no se encuentra________";
        System.out.println("_____Los que debe el municipio por q no se encuentra________");
        this.getDeuda_certificado().getColumna().removeAll(temporal_vivos_debe);
        this.getDeuda_certificado().getColumna_difuntos().removeAll(temporal_difuntos_debe);
        respuesta+="\nVivos  \n"+this.getDeuda_certificado().getColumna();
        System.out.println("Vivos  \n"+this.getDeuda_certificado().getColumna());
        respuesta+="\nDifuntos  \n"+this.getDeuda_certificado().getColumna_difuntos();
        System.out.println("Difuntos  \n"+this.getDeuda_certificado().getColumna_difuntos());
        respuesta+="\n=======================================";
        
    }

    public void report1DeudasDelDane() {
        this.getDeuda_certificado().getColumna(1);
        //System.out.println("certificados vivos "+this.getDeuda_certificado().getColumna());
        //System.out.println("certificados difuntos "+this.getDeuda_certificado().getColumna_difuntos());
        this.getControl_prenatal_vivo().getColumna(1);
        //System.out.println("soporte de vivos : "+this.getControl_prenatal_vivo().getColumna());
        this.getControl_prenatal_defuncion().getColumna(1);
        //System.out.println("soporte de difuntos : "+this.getControl_prenatal_defuncion().getColumna());
        //Deudas del dane con la alcaldia VIVOS
        this.getDeuda_certificado().getColumna().retainAll(this.getControl_prenatal_vivo().getColumna());
        ////Deudas del dane con la alcaldia difuntos
        this.getDeuda_certificado().getColumna_difuntos().retainAll(this.getControl_prenatal_defuncion().getColumna());
        /* Temporales de la insercion de deuda certificado a soporte */
        ArrayList<String> temporal_deuda_interseccion_soporte_defunciones = new ArrayList<>();
        for (String temporal_deuda_interseccion_soporte1 : this.getDeuda_certificado().getColumna_difuntos()) {
            temporal_deuda_interseccion_soporte_defunciones.add(temporal_deuda_interseccion_soporte1);
        }
        ArrayList<String> temporal_deuda_interseccion_soporte_vivos = new ArrayList<>();
        for (String temporal_deuda_interseccion_soporte1 : this.getDeuda_certificado().getColumna()) {
            temporal_deuda_interseccion_soporte_vivos.add(temporal_deuda_interseccion_soporte1);
        }
        this.getDeuda_certificado().getColumna(1);
        this.getDeuda_certificado().getColumna_difuntos().removeAll(temporal_deuda_interseccion_soporte_defunciones);
        this.getDeuda_certificado().getColumna().removeAll(temporal_deuda_interseccion_soporte_vivos);
        //System.out.println("certificados temporal vivos resultante entregados "+temporal_deuda_interseccion_soporte_vivos);
        //System.out.println("certificados temporal difuntos resultante entregados "+temporal_deuda_interseccion_soporte_defunciones);
        //System.out.println("certificados vivos resultante faltantes "+this.getDeuda_certificado().getColumna());
        //System.out.println("certificados difuntos resultante faltantes "+this.getDeuda_certificado().getColumna_difuntos());
        //System.out.println(file.getName().split("_")[0]);
        String respuesta = "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
        respuesta += "\n\t*****Reporte del municipio " + file.getName().split("_")[0] + "***";
        respuesta += "\n  Faltantes por entregar por parte del dane : \n\t***Defunciones***";
        /**
         * ALMACENADORES DE LOS REGISTRO QUE DEBE EL DANE*
         */
        ArrayList<String> faltantes_soporte_defunciones = new ArrayList<>();
        for (String temporal_deuda_interseccion_soporte1 : this.getDeuda_certificado().getColumna_difuntos()) {
            faltantes_soporte_defunciones.add(temporal_deuda_interseccion_soporte1);
            respuesta += "\n " + temporal_deuda_interseccion_soporte1;
        }
        respuesta += "\n\n\t***Nacimientos***";
        ArrayList<String> faltante_soporte_vivos = new ArrayList<>();
        for (String temporal_deuda_interseccion_soporte1 : this.getDeuda_certificado().getColumna()) {
            faltante_soporte_vivos.add(temporal_deuda_interseccion_soporte1);
            respuesta += "\n  " + temporal_deuda_interseccion_soporte1;
        }
        respuesta += "\n_________________________________________________";
        respuesta += "\n\t---Entregas pendientes por parte del municipio";
        //System.out.println("certificados vivos resultante faltantes "+faltante_soporte_vivos);
        //System.out.println("certificados difuntos resultante faltantes "+faltantes_soporte_defunciones);
        // ******** LOS SERTIFICADOS que hacen falta por parte del municipio
        this.getEstadistica_vital_nacimientos().getColumna(1);
        this.getEstadistica_vital_defunfion().getColumna(1);
        //System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //System.out.println(temporal_deuda_interseccion_soporte_vivos);
        //System.out.println(temporal_deuda_interseccion_soporte_defunciones);
        respuesta += "\n\n\t***Nacimientos***";
        ArrayList<String> tiene_municipio_vivos = new ArrayList<>();
        for (String tiene_municipio_vivo : temporal_deuda_interseccion_soporte_vivos) {
            tiene_municipio_vivos.add(tiene_municipio_vivo);
        }
        ArrayList<String> tiene_municipio_difuntos = new ArrayList<>();
        for (String tiene_municipio_vivo : temporal_deuda_interseccion_soporte_defunciones) {
            tiene_municipio_difuntos.add(tiene_municipio_vivo);
        }
        //System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //System.out.println("Valores para el municipio nacimientos "+this.getEstadistica_vital_nacimientos().getColumna().size());
        //System.out.println("Valores para el municipio difuntos"+this.getEstadistica_vital_defunfion().getColumna().size());
        temporal_deuda_interseccion_soporte_vivos.removeAll(this.getEstadistica_vital_nacimientos().getColumna());
        temporal_deuda_interseccion_soporte_defunciones.removeAll(this.getEstadistica_vital_defunfion().getColumna());
        //System.out.println("Lo que debe el municipios de vivo "+temporal_deuda_interseccion_soporte_vivos);
        //System.out.println("Lo que debe el municipios de difuntos "+temporal_deuda_interseccion_soporte_defunciones);
        for (String tiene_municipio_viv : temporal_deuda_interseccion_soporte_vivos) {
            respuesta += "\n" + tiene_municipio_viv;
        }
        respuesta += "\n\n\t***Difuntos***";
        for (String tiene_municipio_difunt : temporal_deuda_interseccion_soporte_defunciones) {
            respuesta += "\n" + tiene_municipio_difunt;
        }
        //System.out.println("_________________________________________________");
        tiene_municipio_vivos.removeAll(temporal_deuda_interseccion_soporte_vivos);
        tiene_municipio_difuntos.removeAll(temporal_deuda_interseccion_soporte_defunciones);
        //System.out.println("Tiene municipio vivos "+tiene_municipio_vivos);
        //System.out.println("Tiene municipio  difuntos "+tiene_municipio_difuntos);
        respuesta += "\n_________________________________________________";
        respuesta += "\n\t---Entregas por parte del municipio";
        respuesta += "\n\n\t***Vivos***";
        for (String tiene_municipio_viv : tiene_municipio_vivos) {
            respuesta += "\n" + tiene_municipio_viv;
        }
        respuesta += "\n\n\t***Difuntos***";
        for (String tiene_municipio_viv : tiene_municipio_difuntos) {
            respuesta += "\n" + tiene_municipio_viv;
        }
        System.out.println(respuesta);
    }

    public void report1DeudasDelDane(String m) {
        this.getDeuda_certificado().getColumna(1);
        //System.out.println("certificados vivos "+this.getDeuda_certificado().getColumna());
        //System.out.println("certificados difuntos "+this.getDeuda_certificado().getColumna_difuntos());
        this.getControl_prenatal_vivo().getColumna(1);
        //System.out.println("soporte de vivos : "+this.getControl_prenatal_vivo().getColumna());
        this.getControl_prenatal_defuncion().getColumna(1);
        //System.out.println("soporte de difuntos : "+this.getControl_prenatal_defuncion().getColumna());
        //Deudas del dane con la alcaldia VIVOS
        this.getDeuda_certificado().getColumna().retainAll(this.getControl_prenatal_vivo().getColumna());
        ////Deudas del dane con la alcaldia difuntos
        this.getDeuda_certificado().getColumna_difuntos().retainAll(this.getControl_prenatal_defuncion().getColumna());
        /* Temporales de la insercion de deuda certificado a soporte */
        ArrayList<String> temporal_deuda_interseccion_soporte_defunciones = new ArrayList<>();
        for (String temporal_deuda_interseccion_soporte1 : this.getDeuda_certificado().getColumna_difuntos()) {
            temporal_deuda_interseccion_soporte_defunciones.add(temporal_deuda_interseccion_soporte1);
        }
        ArrayList<String> temporal_deuda_interseccion_soporte_vivos = new ArrayList<>();
        for (String temporal_deuda_interseccion_soporte1 : this.getDeuda_certificado().getColumna()) {
            temporal_deuda_interseccion_soporte_vivos.add(temporal_deuda_interseccion_soporte1);
        }
        this.getDeuda_certificado().getColumna(1);
        this.getDeuda_certificado().getColumna_difuntos().removeAll(temporal_deuda_interseccion_soporte_defunciones);
        this.getDeuda_certificado().getColumna().removeAll(temporal_deuda_interseccion_soporte_vivos);
        //System.out.println("certificados temporal vivos resultante entregados "+temporal_deuda_interseccion_soporte_vivos);
        //System.out.println("certificados temporal difuntos resultante entregados "+temporal_deuda_interseccion_soporte_defunciones);
        //System.out.println("certificados vivos resultante faltantes "+this.getDeuda_certificado().getColumna());
        //System.out.println("certificados difuntos resultante faltantes "+this.getDeuda_certificado().getColumna_difuntos());
        //System.out.println(file.getName().split("_")[0]);
        String respuesta = "\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
        respuesta += "\n\t*****Reporte del municipio " + municipios + "***";
        respuesta += "\n  Faltantes por entregar por parte del dane : \n\t***Defunciones***";
        /**
         * ALMACENADORES DE LOS REGISTRO QUE DEBE EL DANE*
         */
        ArrayList<String> faltantes_soporte_defunciones = new ArrayList<>();
        for (String temporal_deuda_interseccion_soporte1 : this.getDeuda_certificado().getColumna_difuntos()) {
            faltantes_soporte_defunciones.add(temporal_deuda_interseccion_soporte1);
            respuesta += "\n " + temporal_deuda_interseccion_soporte1;
        }
        respuesta += "\n\n\t***Nacimientos***";
        ArrayList<String> faltante_soporte_vivos = new ArrayList<>();
        for (String temporal_deuda_interseccion_soporte1 : this.getDeuda_certificado().getColumna()) {
            faltante_soporte_vivos.add(temporal_deuda_interseccion_soporte1);
            respuesta += "\n  " + temporal_deuda_interseccion_soporte1;
        }
        respuesta += "\n_________________________________________________";
        respuesta += "\n\t---Entregas pendientes por parte del municipio";
        //System.out.println("certificados vivos resultante faltantes "+faltante_soporte_vivos);
        //System.out.println("certificados difuntos resultante faltantes "+faltantes_soporte_defunciones);
        // ******** LOS SERTIFICADOS que hacen falta por parte del municipio
        this.getEstadistica_vital_nacimientos().getColumna(1);
        this.getEstadistica_vital_defunfion().getColumna(1);
        //System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //System.out.println(temporal_deuda_interseccion_soporte_vivos);
        //System.out.println(temporal_deuda_interseccion_soporte_defunciones);
        respuesta += "\n\n\t***Nacimientos***";
        ArrayList<String> tiene_municipio_vivos = new ArrayList<>();
        for (String tiene_municipio_vivo : temporal_deuda_interseccion_soporte_vivos) {
            tiene_municipio_vivos.add(tiene_municipio_vivo);
        }
        ArrayList<String> tiene_municipio_difuntos = new ArrayList<>();
        for (String tiene_municipio_vivo : temporal_deuda_interseccion_soporte_defunciones) {
            tiene_municipio_difuntos.add(tiene_municipio_vivo);
        }
        //System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //System.out.println("Valores para el municipio nacimientos "+this.getEstadistica_vital_nacimientos().getColumna().size());
        //System.out.println("Valores para el municipio difuntos"+this.getEstadistica_vital_defunfion().getColumna().size());
        temporal_deuda_interseccion_soporte_vivos.removeAll(this.getEstadistica_vital_nacimientos().getColumna());
        temporal_deuda_interseccion_soporte_defunciones.removeAll(this.getEstadistica_vital_defunfion().getColumna());
        //System.out.println("Lo que debe el municipios de vivo "+temporal_deuda_interseccion_soporte_vivos);
        //System.out.println("Lo que debe el municipios de difuntos "+temporal_deuda_interseccion_soporte_defunciones);
        for (String tiene_municipio_viv : temporal_deuda_interseccion_soporte_vivos) {
            respuesta += "\n" + tiene_municipio_viv;
        }
        respuesta += "\n\n\t***Difuntos***";
        for (String tiene_municipio_difunt : temporal_deuda_interseccion_soporte_defunciones) {
            respuesta += "\n" + tiene_municipio_difunt;
        }
        //System.out.println("_________________________________________________");
        tiene_municipio_vivos.removeAll(temporal_deuda_interseccion_soporte_vivos);
        tiene_municipio_difuntos.removeAll(temporal_deuda_interseccion_soporte_defunciones);
        //System.out.println("Tiene municipio vivos "+tiene_municipio_vivos);
        //System.out.println("Tiene municipio  difuntos "+tiene_municipio_difuntos);
        respuesta += "\n_________________________________________________";
        respuesta += "\n\t---Entregas por parte del municipio";
        respuesta += "\n\n\t***Vivos***";
        for (String tiene_municipio_viv : tiene_municipio_vivos) {
            respuesta += "\n" + tiene_municipio_viv;
        }
        respuesta += "\n\n\t***Difuntos***";
        for (String tiene_municipio_viv : tiene_municipio_difuntos) {
            respuesta += "\n" + tiene_municipio_viv;
        }
        System.out.println(respuesta);
    }

    @Override
    public void readNode(File f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getColumna(int columna) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ArchivoControlPrenatalDefuncion getControl_prenatal_defuncion() {
        return control_prenatal_defuncion;
    }

    public void setControl_prenatal_defuncion(ArchivoControlPrenatalDefuncion control_prenatal_defuncion) {
        this.control_prenatal_defuncion = control_prenatal_defuncion;
    }

    public ArchivoControlPrenatalVivo getControl_prenatal_vivo() {
        return control_prenatal_vivo;
    }

    public void setControl_prenatal_vivo(ArchivoControlPrenatalVivo control_prenatal_vivo) {
        this.control_prenatal_vivo = control_prenatal_vivo;
    }

    public ArchivoDeudaCertificado getDeuda_certificado() {
        return deuda_certificado;
    }

    public void setDeuda_certificado(ArchivoDeudaCertificado deuda_certificado) {
        this.deuda_certificado = deuda_certificado;
    }

    public ArchivoEstadisticaVitalDefunciones getEstadistica_vital_defunfion() {
        return estadistica_vital_defunfion;
    }

    public void setEstadistica_vital_defunfion(ArchivoEstadisticaVitalDefunciones estadistica_vital_defunfion) {
        this.estadistica_vital_defunfion = estadistica_vital_defunfion;
    }

    public ArchivoEstadisticaVitalNacimientos getEstadistica_vital_nacimientos() {
        return estadistica_vital_nacimientos;
    }

    public void setEstadistica_vital_nacimientos(ArchivoEstadisticaVitalNacimientos estadistica_vital_nacimientos) {
        this.estadistica_vital_nacimientos = estadistica_vital_nacimientos;
    }

    public Vector<String> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(Vector<String> municipios) {
        this.municipios = municipios;
    }

    @Override
    public void extraerNodosTipo2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void extraerNodosTipo3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
