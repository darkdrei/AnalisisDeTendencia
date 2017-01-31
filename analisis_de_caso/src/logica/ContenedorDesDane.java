/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author E7250
 */
public class ContenedorDesDane {
    private ArrayList<DesDane> datos;

    public ContenedorDesDane() {
        this.datos = new ArrayList<>();
    }

    public ArrayList<DesDane> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<DesDane> datos) {
        this.datos = datos;
    }
    
    public void add(DesDane v){
        this.getDatos().add(v);
    }
}
