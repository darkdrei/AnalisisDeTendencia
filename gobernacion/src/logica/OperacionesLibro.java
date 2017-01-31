/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author dark
 */
public interface OperacionesLibro {
    public void readNode(File f);
    public void extraerNodos();
    public void extraerNodosTipo2();
    public void extraerNodosTipo3();
    public void extraerNodos(int op);
    public void generarWorkBook();
    public void getColumna(int columna);
    
}
