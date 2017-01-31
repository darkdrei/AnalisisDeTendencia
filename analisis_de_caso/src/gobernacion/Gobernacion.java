/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gobernacion;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import jxl.read.biff.BiffException;
import logica.ArchivoControlPrenatalDefuncion;
import logica.ArchivoControlPrenatalVivo;
import logica.ArchivoDeudaCertificado;
import logica.ArchivoEstadisticaVitalDefunciones;
import logica.ArchivoEstadisticaVitalNacimientos;
import logica.EstadisticaVital_defuncion;
import logica.Excel;

/**
 *
 * @author dark
 */
public class Gobernacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BiffException {
        // TODO code application logic here
        JFileChooser f = new JFileChooser();     
            FileNameExtensionFilter filter = new FileNameExtensionFilter("xls & XLS", "xls");
            f.setFileFilter(filter); 
            int op = f.showOpenDialog(f);      
            if(op == JFileChooser.APPROVE_OPTION){
                System.err.println("El archivo es aceptado");
                ArchivoControlPrenatalDefuncion e = new ArchivoControlPrenatalDefuncion(f.getSelectedFile());
                e.generarWorkBook();
                e.extraerNodos();
//                ArchivoEstadisticaVitalDefunciones e2 = new ArchivoEstadisticaVitalDefunciones(f.getSelectedFile());
//                e2.generarWorkBook();
//                e2.extraerNodos();
                System.err.println(f.getSelectedFile());
                /*ArchivoEstadisticaVitalNacimientos e3 = new ArchivoEstadisticaVitalNacimientos(f.getSelectedFile());
                e3.generarWorkBook();
                e3.extraerNodos();*/
            }else{
                JOptionPane.showMessageDialog(null,"Cargado de archivo","La extensión debe ser ZIP.",JOptionPane.INFORMATION_MESSAGE);
           }
    }
    
}
