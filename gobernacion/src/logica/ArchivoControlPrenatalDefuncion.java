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
public class ArchivoControlPrenatalDefuncion extends Excel {

    private ArrayList<ControlPapeleriaDefunciones> defunciones;

    public ArchivoControlPrenatalDefuncion() {
        super();
        defunciones = new ArrayList<>();
    }

    
    
    public ArchivoControlPrenatalDefuncion(File archivo) {
        super(archivo);
        defunciones = new ArrayList<>();
    }

    @Override
    public void addFila(Object o) {
        this.defunciones.add((ControlPapeleriaDefunciones) o);
    }
    
    public ArrayList<ControlPapeleriaDefunciones> extraerFilas(ArrayList l){
        ArrayList<ControlPapeleriaDefunciones> tem = new ArrayList<>();
        for (ControlPapeleriaDefunciones l1 : getDefunciones()) {
            tem.add(l1);
        }
        return tem;
    }

    @Override
    public void extraerNodos() {
        if (this.getArchivo().exists()) {
            Sheet shee = this.getWork_book().getSheet(1);
            String fecha ="";
            for (int i = 1; i < shee.getRows(); i++) {
                //System.out.println(shee.getCell(6, i).getContents());
                //fecha=shee.getCell(4, i).getContents().length()>0?shee.getCell(4, i).getContents():fecha;
                if (this.municipios.contains(shee.getCell(6, i).getContents())) {
                    //System.out.println("Defunciones control prenatal  "+shee.getCell(4, i).getContents()+"  "+shee.getCell(1, i).getContents());
                    //System.out.println(i + " " + shee.getCell(6, i).getContents() + " " + shee.getCell(1, i).getContents() + " " + shee.getCell(2, i).getContents() + " " + shee.getCell(3, i).getContents());
                    this.addFila(
                            new ControlPapeleriaDefunciones(i + "",
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
    public void getColumna(int columna) {
        this.setColumna(new ArrayList<>());
        for (ControlPapeleriaDefunciones d : this.defunciones) {
            this.getColumna().add(d.getCert_nac_entregado());
        }
    }

    public ArrayList<ControlPapeleriaDefunciones> getDefunciones() {
        return defunciones;
    }

    public void setDefunciones(ArrayList<ControlPapeleriaDefunciones> defunciones) {
        this.defunciones = defunciones;
    }
    
    
}
