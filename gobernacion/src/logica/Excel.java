/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author dark
 */
public class Excel implements OperacionesLibro {

    private File archivo;
    private Workbook work_book;
    protected ArrayList<String> municipios = new ArrayList<>();
    protected ArrayList<String> columna = new ArrayList<>();
    private int opcion_municipio;

    public ArrayList<String> getMunicipios() {
        return municipios;
    }
    
    public void seleccionarMunicipio(){
        ManejadorMunicipio m = new ManejadorMunicipio();
        this.setMunicipios(m.getMunicipios(this.getOpcion_municipio()));
    }
    
    public void seleccionarMunicipio(int op){
        ManejadorMunicipio m = new ManejadorMunicipio();
        this.setMunicipios(m.getMunicipios(op));
    }

    public int getOpcion_municipio() {
        return opcion_municipio;
    }

    public void setOpcion_municipio(int opcion_municipio) {
        this.opcion_municipio = opcion_municipio;
    }
    
    

    public ArrayList<String> getColumna() {
        return columna;
    }

    public void setColumna(ArrayList<String> columna) {
        this.columna = columna;
    }

    public void setMunicipios(ArrayList<String> municipios) {
        this.municipios = municipios;
    }

    public Excel(File archivo) {
        this.archivo = archivo;
    }
    
    public Excel(){
    
    }

    @Override
    public void generarWorkBook() {
        try {
            try {
                work_book = Workbook.getWorkbook(archivo);
            } catch (BiffException ex) {
                Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
            work_book = null;
        }
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Workbook getWork_book() {
        return work_book;
    }

    public void setWork_book(Workbook work_book) {
        this.work_book = work_book;
    }

    @Override
    public void readNode(File f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void extraerNodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addFila(Object o) {
    }

    @Override
    public void getColumna(int columna) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void extraerNodos(int op) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*public class Municipio {

        private int id;
        private String nombre;

        public Municipio(int id, String nombre) {
            this.id = id;
            this.nombre = nombre;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    public  class ManejadorMunicipio {

        private ArrayList<Municipio> municipios;

        public ManejadorMunicipio() {
            this.municipios = new ArrayList<>();
            this.municipios.add(new Municipio(0,"ACHI"));
            this.municipios.add(new Municipio(0,"ACHÍ"));
            this.municipios.add(new Municipio(1,"MAGANGUE"));
            this.municipios.add(new Municipio(1,"MAGANGUÉ"));
            this.municipios.add(new Municipio(1,"MAGUANGUE"));
            this.municipios.add(new Municipio(2,"MONTECRISTO"));
            this.municipios.add(new Municipio(3,"PINILLOS"));
            this.municipios.add(new Municipio(4,"SAN JACINTO DEL CAUCA"));
            this.municipios.add(new Municipio(5,"TIQUISIO"));
            this.municipios.add(new Municipio(0,"ACH�"));
        }
        
        public String getMunicipio(int id){
            corte:
            for (Municipio municipio : municipios) {
                if(municipio.getId()==id){
                    return municipio.getNombre();
                }            }
            return "";
        }
        
        public ArrayList<String> getMunicipios(int id){
            ArrayList<String> mun_tem = new ArrayList<>();
            for (Municipio mun_tem1 : this.municipios) {
                if(mun_tem1.getId()==id && id != -1)
                    mun_tem.add(mun_tem1.getNombre());
                if(id==-1)
                    mun_tem.add(mun_tem1.getNombre());
            }
            return mun_tem;
        }
    }*/

    @Override
    public void extraerNodosTipo2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void extraerNodosTipo3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
