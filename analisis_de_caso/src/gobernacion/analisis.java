/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gobernacion;

import java.io.File;
import logica.*;
import logica.ManejadorMunicipio;
/**
 *
 * @author dark
 */
public class analisis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        logica.Analisis a = new logica.Analisis(
//                    new File("/home/dark/aaaaa/GOBERNACIÓN/SOPORTE/gobernacion2.xls"), 
//                    new File("/home/dark/aaaaa/GOBERNACIÓN/SOPORTE/gobernacion2.xls"),
//                    new File("/home/dark/aaaaa/GOBERNACIÓN/Dane.xls"),
//                    new File("/home/dark/aaaaa/GOBERNACIÓN/ESTADISTICA VITAL/defunciones2.xls"),
//                    new File("/home/dark/aaaaa/GOBERNACIÓN/ESTADISTICA VITAL/nacimientos2.xls"));
//        a.generarWorkBook();
//        a.extraerNodos(0);
//        a.report1DeudasDelDane();
//        logica.Analisis a = new logica.Analisis(
//                    new File("/home/dark/aaaaa/SOPORTE/CONTROL DE PAPELERIA 2015-DASALUD.xls"), 
//                    new File("/home/dark/aaaaa/SOPORTE/CONTROL DE PAPELERIA 2015-DASALUD.xls"),
//                    new File("/home/dark/aaaaa/DEUDA-2013-2014-2015-certificados.xls"),
//                    new File("/home/dark/aaaaa/ESTADISTICA VITAL/Revision 20-08-2016/Defunciones/Achi_d.xls"),
//                    new File("/home/dark/aaaaa/ESTADISTICA VITAL/Revision 20-08-2016/Nacimientos/Achi_n.xls"));
//        a.generarWorkBook();
//        a.extraerNodos(0);
//        a.reportActual();
        logica.Analisis a = new logica.Analisis();
        File dane[];
        dane = new File[]{new File("/home/dark/a/Dane.xls")};
        File vital_vivos[]=new File[]{new File("/home/dark/a/Nacimientos/2012-1.xls"),
                                        new File("/home/dark/a/Nacimientos/2012-2.xls"),
                                        new File("/home/dark/a/Nacimientos/2012-3.xls"),
                                        new File("/home/dark/a/Nacimientos/2013-1.xls"),
                                        new File("/home/dark/a/Nacimientos/2013-2.xls"),
                                        new File("/home/dark/a/Nacimientos/2014-1.xls"),
                                        new File("/home/dark/a/Nacimientos/2014-2.xls"),
                                        new File("/home/dark/a/Nacimientos/2015-1.xls"),
                                        new File("/home/dark/a/Nacimientos/2015-2.xls"),
                                        new File("/home/dark/a/Nacimientos/2016-1.xls")
        };
        File vital_difuntos[]=new File[]{new File("/home/dark/a/Defunciones/2012-1.xls"),
                                        new File("/home/dark/a/Defunciones/2012-2.xls"),
                                        new File("/home/dark/a/Defunciones/2012-3.xls"),
                                        new File("/home/dark/a/Defunciones/2013.xls"),
                                        new File("/home/dark/a/Defunciones/2014.xls"),
                                        new File("/home/dark/a/Defunciones/2015.xls"),
                                        new File("/home/dark/a/Defunciones/2016.xls")
        };
        int muni[]=new int[]{0,1,2,3,4,5};
        a.extraerMultiplesArchivos(dane, vital_vivos, vital_difuntos, muni);
//      
//        ArchivoControlPrenatalDefuncion control_prenatal_defuncion = new ArchivoControlPrenatalDefuncion(new File("/home/dark/aaaaa/SOPORTE/CONTROL DE PAPELERIA 2014-DASALUD.xls"));
//        control_prenatal_defuncion.seleccionarMunicipio(0);
//        control_prenatal_defuncion.generarWorkBook();
//        control_prenatal_defuncion.extraerNodos();
        
//        ArchivoControlPrenatalVivo control_prenatal_vivo = new ArchivoControlPrenatalVivo(new File("/home/dark/aaaaa/SOPORTE/CONTROL DE PAPELERIA 2014-DASALUD.xls"));
//        control_prenatal_vivo.generarWorkBook();
//        control_prenatal_vivo.extraerNodos();
        
//        ArchivoDeudaCertificado deuda_certificado = new ArchivoDeudaCertificado(new File("/home/dark/aaaaa/DEUDA-2013-2014-2015-certificados.xls"));
//        deuda_certificado.generarWorkBook();
//        deuda_certificado.extraerNodos();
        
        
//        ArchivoEstadisticaVitalDefunciones estadistica_vital_defunfion = new ArchivoEstadisticaVitalDefunciones(new File("/home/dark/aaaaa/ESTADISTICA VITAL/Revision 20-08-2016/Defunciones/Achi_d.xls"));
//        estadistica_vital_defunfion.generarWorkBook();
//        estadistica_vital_defunfion.extraerNodos();
        
////        
//        ArchivoEstadisticaVitalNacimientos estadistica_vital_nacimientos = new ArchivoEstadisticaVitalNacimientos(new File("/media/dark/EXPRESS/GOBERNACIÓN/ESTADISTICA VITAL/Revision 20-08-2016/Nacimientos/Achi_n.xls"));
//        estadistica_vital_nacimientos.generarWorkBook();
//        estadistica_vital_nacimientos.extraerNodos();
    }
    
}
