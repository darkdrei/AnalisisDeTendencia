/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.File;
import java.util.ArrayList;
import jxl.Sheet;

/**
 *
 * @author E7250
 */
public class ArchivoDane extends Excel{
    private ContenedorDesDane vivos;
    private ContenedorDesDane muertos;
    private ArrayList<String> columna_difuntos = new ArrayList<>();

    public ArchivoDane() {
        super(null);
        vivos = new ContenedorDesDane();
        muertos = new ContenedorDesDane();
    }
    
    

    public ArchivoDane(File archivo) {
        super(archivo);
        vivos = new ContenedorDesDane();
        muertos = new ContenedorDesDane();
    }
    
    public ArrayList<DeudasCertificado> extraerFilasVivos(ArrayList l){
        return null;
    }
    
    public ArrayList<DeudasCertificado> extraerFilasFallecidos(ArrayList l){
        return null;
    }


    @Override
    public void extraerNodos() {
        System.out.println(this.getArchivo().exists());
        if (this.getArchivo().exists()) {
            System.out.println("El archivo");
            Sheet shee = this.getWork_book().getSheet(0);
            //System.out.println("Vivos");
            for (int i = 1; i < shee.getRows(); i++) {
                if (this.municipios.contains(shee.getCell(4, i).getContents())) {
                    System.out.println(i + " " + shee.getCell(2, i).getContents() + " " + shee.getCell(1, i).getContents() + " " + shee.getCell(2, i).getContents() + " " + shee.getCell(3, i).getContents());
                    this.vivos.add(new DesDane(shee.getCell(0, i).getContents(),
                            shee.getCell(1, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(3, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(2, i).getContents()));
                }
            }
            //System.err.println("Difuntos:::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            shee = this.getWork_book().getSheet(1);
            for (int i = 1; i < shee.getRows(); i++) {
                if (this.municipios.contains(shee.getCell(4, i).getContents())) {
                    System.out.println("llego " + shee.getCell(2, i).getContents() + " " + shee.getCell(1, i).getContents() + " " + shee.getCell(2, i).getContents() + " " + shee.getCell(3, i).getContents());
                    this.muertos.add(new DesDane(shee.getCell(0, i).getContents(),
                            shee.getCell(1, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(3, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(2, i).getContents()));
                }
            }
        }
    }

    public ArrayList<String> getColumna_difuntos() {
        return columna_difuntos;
    }

    public void setColumna_difuntos(ArrayList<String> columna_difuntos) {
        this.columna_difuntos = columna_difuntos;
    }

    public ArrayList<String> getColumna() {
        return columna;
    }

    public void setColumna(ArrayList<String> columna) {
        this.columna = columna;
    }
    
    @Override
    public void getColumna(int columna) {
        this.setColumna(new ArrayList<>());
        for (DesDane d : this.vivos.getDatos()) {
            this.getColumna().add(d.getEntregado_codigo());
        }
        this.setColumna_difuntos(new ArrayList<>());
        for (DesDane d: this.muertos.getDatos()) {
            this.getColumna_difuntos().add(d.getEntregado_codigo());
        }
    }
}
