/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gobernacion;
import java.io.File;
import logica.*;
/**
 *
 * @author E7250
 */
public class Analisis2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here*
        ManejadorMunicipio muni = new ManejadorMunicipio();
        File f;
        f = new File("C:\\gobernqcion\\dane2015.xls");
        System.out.println(f.exists());
        ArchivoDane dane = new ArchivoDane(new File("C:\\gobernqcion\\dane2015.xls"));
        dane.generarWorkBook();
        //dane.setArchivo(new File("C:\\Users\\E7250\\Desktop\\gobernqcion\\dane2015.xls"));
        System.out.println(dane.getArchivo().exists());
        System.out.println(muni.getMunicipios(1));
        dane.setMunicipios(muni.getMunicipios(1));
        dane.extraerNodos();
    }
    
}
