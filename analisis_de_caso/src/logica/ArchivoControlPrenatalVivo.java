/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.File;
import java.util.ArrayList;
import java.util.Vector;
import jxl.Sheet;

/**
 *
 * @author dark
 */
public class ArchivoControlPrenatalVivo extends Excel{
    private ArrayList<ControlPapeleriaNacimientos> nacimientos;

    public ArchivoControlPrenatalVivo(File archivo) {
        super(archivo);
        nacimientos = new ArrayList<>();
    }
    
    public ArrayList<ControlPapeleriaNacimientos> extraerFilas(ArrayList l){
        ArrayList<ControlPapeleriaNacimientos> tem = new ArrayList<>();
        for (ControlPapeleriaNacimientos l1 : getNacimientos()) {
            tem.add(l1);
        }
        return tem;
    }
    
    @Override
    public void addFila(Object o){
        this.nacimientos.add((ControlPapeleriaNacimientos)o);
    }
    
    @Override
    public void extraerNodos() {
        if (this.getArchivo().exists()){
            Sheet shee = this.getWork_book().getSheet(0);
            //System.out.println("Vivos");
            for (int i = 1; i < shee.getRows(); i++) {
                if(this.municipios.contains(shee.getCell(6, i).getContents())){
                    //System.out.println(i+" "+shee.getCell(6, i).getContents()+" "+shee.getCell(1, i).getContents()+" "+shee.getCell(2, i).getContents()+" "+shee.getCell(3, i).getContents());
                    this.addFila(
                        new ControlPapeleriaNacimientos(i+"",
                                shee.getCell(0, i).getContents(),
                                shee.getCell(1, i).getContents(), 
                                shee.getCell(2, i).getContents(), 
                                shee.getCell(3, i).getContents(), 
                                shee.getCell(4, i).getContents(),
                                shee.getCell(5, i).getContents(), 
                                shee.getCell(6, i).getContents(), 
                                shee.getCell(7, i).getContents(), 
                                shee.getCell(8, i).getContents()));
                }
            }
        }
    }
    
    @Override
    public void extraerNodosTipo2() {
        if (this.getArchivo().exists()){
            Sheet shee = this.getWork_book().getSheet(0);
            //System.out.println("Vivos");
            for (int i = 1; i < shee.getRows(); i++) {
                if(this.municipios.contains(shee.getCell(6, i).getContents())){
                    //System.out.println(i+" "+shee.getCell(6, i).getContents()+" "+shee.getCell(1, i).getContents()+" "+shee.getCell(2, i).getContents()+" "+shee.getCell(3, i).getContents());
                    this.addFila(
                        new ControlPapeleriaNacimientos(i+"",
                                shee.getCell(0, i).getContents(),
                                shee.getCell(1, i).getContents(), 
                                shee.getCell(2, i).getContents(), 
                                shee.getCell(3, i).getContents(), 
                                shee.getCell(4, i).getContents(),
                                shee.getCell(5, i).getContents(), 
                                shee.getCell(6, i).getContents(), 
                                shee.getCell(7, i).getContents(), 
                                shee.getCell(8, i).getContents()));
                }
            }
        }
    }

    @Override
    public void extraerNodosTipo3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArchivoControlPrenatalVivo() {
        super();
        nacimientos = new ArrayList<>();
    }
    
    @Override
    public void extraerNodos(int op){
        if (op == 1){
            this.extraerNodos();
        }
    }
    
    
    @Override
    public void getColumna(int columna) {
        this.setColumna(new ArrayList<>());
        for (ControlPapeleriaNacimientos d : this.nacimientos) {
            this.getColumna().add(d.getCert_nac_entregado());
        }
    }

    public ArrayList<ControlPapeleriaNacimientos> getNacimientos() {
        return nacimientos;
    }

    public void setNacimientos(ArrayList<ControlPapeleriaNacimientos> nacimientos) {
        this.nacimientos = nacimientos;
    }
    
    
}
