/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gobernacion;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author dark
 */
public class practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> municipios = new ArrayList<>();
//        municipios.add(new String("ACHI"));
//        municipios.add(new String("ACHÍ"));
//        municipios.add(new String("MAGANGUE"));
//        municipios.add(new String("MAGANGUÉ"));
//        municipios.add(new String("MAGUANGUE"));
//        municipios.add(new String("MONTECRISTO"));
//        municipios.add(new String("PINILLOS"));
//        municipios.add(new String("SAN JACINTO DEL CAUCA"));
//        municipios.add(new String("TIQUISIO"));
        municipios.add("1");
        municipios.add("2");
        municipios.add("3");
        municipios.add("4");
        municipios.add("5");
        municipios.add("6");
        municipios.add("7");
        municipios.add("8");
        ArrayList<String> b = new ArrayList<>();
        b.add("8");
        b.add("7");
        b.add("6");
        b.add("5");
        System.out.println(municipios);
        municipios.retainAll(b);
        System.out.println(municipios);
        ArrayList<String> municipio = new ArrayList<>();
        municipio.add("1");
        municipio.add("2");
        municipio.add("3");
        municipio.add("4");
        municipio.add("5");
        municipio.add("6");
        municipio.add("7");
        municipio.add("8");
        municipio.removeAll(b);
        System.out.println(municipio);
    }
    
}
