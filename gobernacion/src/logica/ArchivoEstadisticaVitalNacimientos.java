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
public class ArchivoEstadisticaVitalNacimientos extends Excel {

    private ArrayList<FilaEstadisticaVitalNacimientos> nacimientos;

    public ArrayList<FilaEstadisticaVitalNacimientos> extraerFilasVivos(ArrayList l) {
        ArrayList<FilaEstadisticaVitalNacimientos> tem = new ArrayList<>();
        for (FilaEstadisticaVitalNacimientos l1 : getNacimientos()) {
            tem.add(l1);
        }
        return tem;
    }

    public ArchivoEstadisticaVitalNacimientos(File archivo) {
        super(archivo);
        nacimientos = new ArrayList<>();
    }

    public ArchivoEstadisticaVitalNacimientos() {
        super();
        nacimientos = new ArrayList<>();
    }

    @Override
    public void addFila(Object o) {
        this.nacimientos.add((FilaEstadisticaVitalNacimientos) o);
    }

    public ArrayList<FilaEstadisticaVitalNacimientos> getNacimientos() {
        return nacimientos;
    }

    public void setNacimientos(ArrayList<FilaEstadisticaVitalNacimientos> nacimientos) {
        this.nacimientos = nacimientos;
    }

    @Override
    public void extraerNodos() {
        if (this.getArchivo().exists()) {
            Sheet shee = this.getWork_book().getSheet(0);
            //System.out.println("Vivos");
            for (int i = 1; i < shee.getRows(); i++) {
                if (this.municipios.contains(shee.getCell(2, i).getContents())) {
                    //System.out.println(i + " " + shee.getCell(2, i).getContents() + " " + shee.getCell(1, i).getContents() + " " + shee.getCell(2, i).getContents() + " " + shee.getCell(3, i).getContents());
                    this.addFila(
                            new FilaEstadisticaVitalNacimientos(1 + "",
                                    shee.getCell(0, i).getContents(),
                                    shee.getCell(0, i).getContents(),
                                    shee.getCell(1, i).getContents(),
                                    shee.getCell(2, i).getContents(),
                                    shee.getCell(3, i).getContents(),
                                    shee.getCell(4, i).getContents(),
                                    shee.getCell(5, i).getContents(),
                                    shee.getCell(6, i).getContents(),
                                    shee.getCell(7, i).getContents(),
                                    shee.getCell(8, i).getContents(),
                                    shee.getCell(9, i).getContents(),
                                    shee.getCell(10, i).getContents(),
                                    shee.getCell(11, i).getContents(),
                                    shee.getCell(12, i).getContents(),
                                    shee.getCell(13, i).getContents(),
                                    shee.getCell(14, i).getContents(),
                                    shee.getCell(15, i).getContents(),
                                    shee.getCell(16, i).getContents(),
                                    shee.getCell(17, i).getContents(),
                                    shee.getCell(18, i).getContents(),
                                    shee.getCell(19, i).getContents(),
                                    shee.getCell(20, i).getContents(),
                                    shee.getCell(21, i).getContents(),
                                    shee.getCell(22, i).getContents(),
                                    shee.getCell(23, i).getContents(),
                                    shee.getCell(24, i).getContents(),
                                    shee.getCell(25, i).getContents(),
                                    shee.getCell(26, i).getContents(),
                                    shee.getCell(27, i).getContents(),
                                    shee.getCell(28, i).getContents(),
                                    shee.getCell(29, i).getContents(),
                                    shee.getCell(30, i).getContents(),
                                    shee.getCell(31, i).getContents(),
                                    shee.getCell(32, i).getContents(),
                                    shee.getCell(33, i).getContents(),
                                    shee.getCell(34, i).getContents(),
                                    shee.getCell(35, i).getContents(),
                                    shee.getCell(36, i).getContents(),
                                    shee.getCell(37, i).getContents(),
                                    shee.getCell(38, i).getContents(),
                                    shee.getCell(39, i).getContents(),
                                    shee.getCell(40, i).getContents(),
                                    shee.getCell(41, i).getContents(),
                                    shee.getCell(42, i).getContents(),
                                    shee.getCell(43, i).getContents(),
                                    shee.getCell(44, i).getContents(),
                                    shee.getCell(45, i).getContents(),
                                    shee.getCell(46, i).getContents(),
                                    shee.getCell(47, i).getContents(),
                                    shee.getCell(48, i).getContents(),
                                    shee.getCell(49, i).getContents(),
                                    shee.getCell(50, i).getContents(),
                                    shee.getCell(51, i).getContents(),
                                    shee.getCell(52, i).getContents(),
                                    shee.getCell(53, i).getContents(),
                                    shee.getCell(54, i).getContents(),
                                    shee.getCell(55, i).getContents(),
                                    shee.getCell(56, i).getContents(),
                                    shee.getCell(57, i).getContents()));
                }
            }
        }
    }

    public void extraerCualquierNodos() {
        if (this.getArchivo().exists()) {
            Sheet shee = this.getWork_book().getSheet(0);
            //System.out.println("Vivos");
            for (int i = 1; i < shee.getRows(); i++) {

                //System.out.println(i + " " + shee.getCell(2, i).getContents() + " " + shee.getCell(1, i).getContents() + " " + shee.getCell(2, i).getContents() + " " + shee.getCell(3, i).getContents());
                this.addFila(
                        new FilaEstadisticaVitalNacimientos(1 + "",
                                shee.getCell(0, i).getContents(),
                                shee.getCell(0, i).getContents(),
                                shee.getCell(1, i).getContents(),
                                shee.getCell(2, i).getContents(),
                                shee.getCell(3, i).getContents(),
                                shee.getCell(4, i).getContents(),
                                shee.getCell(5, i).getContents(),
                                shee.getCell(6, i).getContents(),
                                shee.getCell(7, i).getContents(),
                                shee.getCell(8, i).getContents(),
                                shee.getCell(9, i).getContents(),
                                shee.getCell(10, i).getContents(),
                                shee.getCell(11, i).getContents(),
                                shee.getCell(12, i).getContents(),
                                shee.getCell(13, i).getContents(),
                                shee.getCell(14, i).getContents(),
                                shee.getCell(15, i).getContents(),
                                shee.getCell(16, i).getContents(),
                                shee.getCell(17, i).getContents(),
                                shee.getCell(18, i).getContents(),
                                shee.getCell(19, i).getContents(),
                                shee.getCell(20, i).getContents(),
                                shee.getCell(21, i).getContents(),
                                shee.getCell(22, i).getContents(),
                                shee.getCell(23, i).getContents(),
                                shee.getCell(24, i).getContents(),
                                shee.getCell(25, i).getContents(),
                                shee.getCell(26, i).getContents(),
                                shee.getCell(27, i).getContents(),
                                shee.getCell(28, i).getContents(),
                                shee.getCell(29, i).getContents(),
                                shee.getCell(30, i).getContents(),
                                shee.getCell(31, i).getContents(),
                                shee.getCell(32, i).getContents(),
                                shee.getCell(33, i).getContents(),
                                shee.getCell(34, i).getContents(),
                                shee.getCell(35, i).getContents(),
                                shee.getCell(36, i).getContents(),
                                shee.getCell(37, i).getContents(),
                                shee.getCell(38, i).getContents(),
                                shee.getCell(39, i).getContents(),
                                shee.getCell(40, i).getContents(),
                                shee.getCell(41, i).getContents(),
                                shee.getCell(42, i).getContents(),
                                shee.getCell(43, i).getContents(),
                                shee.getCell(44, i).getContents(),
                                shee.getCell(45, i).getContents(),
                                shee.getCell(46, i).getContents(),
                                shee.getCell(47, i).getContents(),
                                shee.getCell(48, i).getContents(),
                                shee.getCell(49, i).getContents(),
                                shee.getCell(50, i).getContents(),
                                shee.getCell(51, i).getContents(),
                                shee.getCell(52, i).getContents(),
                                shee.getCell(53, i).getContents(),
                                shee.getCell(54, i).getContents(),
                                shee.getCell(55, i).getContents(),
                                shee.getCell(56, i).getContents(),
                                shee.getCell(57, i).getContents()));
            }

        }
    }

    @Override
    public void getColumna(int columna) {
        this.setColumna(new ArrayList<>());
        for (FilaEstadisticaVitalNacimientos d : this.nacimientos) {
            this.getColumna().add(d.getNumero_certificado());
        }
    }

}
