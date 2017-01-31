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
public class ArchivoDeudaCertificado extends Excel {

    private ArrayList<DeudasCertificado> vivos;
    private ArrayList<DeudasCertificado> muertos;
    private ArrayList<String> columna_difuntos = new ArrayList<>();

    public ArchivoDeudaCertificado() {
        super();
        vivos = new ArrayList<>();
        muertos = new ArrayList<>();
    }
    
    

    public ArchivoDeudaCertificado(File archivo) {
        super(archivo);
        vivos = new ArrayList<>();
        muertos = new ArrayList<>();
    }
    
    public ArrayList<DeudasCertificado> extraerFilasVivos(ArrayList l){
        ArrayList<DeudasCertificado> tem = new ArrayList<>();
        for (DeudasCertificado l1 : getVivos()) {
            tem.add(l1);
        }
        return tem;
    }
    
    public ArrayList<DeudasCertificado> extraerFilasFallecidos(ArrayList l){
        ArrayList<DeudasCertificado> tem = new ArrayList<>();
        for (DeudasCertificado l1 : getVivos()) {
            tem.add(l1);
        }
        return tem;
    }

    @Override
    public void addFila(Object o) {
        this.vivos.add((DeudasCertificado) o);
    }

    public void addVivo(DeudasCertificado d) {
        this.vivos.add(d);
    }

    public void addMuertos(DeudasCertificado d) {
        this.muertos.add(d);
    }

    @Override
    public void extraerNodos() {
        if (this.getArchivo().exists()) {
            Sheet shee = this.getWork_book().getSheet(0);
            //System.out.println("Vivos");
            for (int i = 1; i < shee.getRows(); i++) {
                if (this.municipios.contains(shee.getCell(2, i).getContents())) {
                    //System.out.println(i + " " + shee.getCell(2, i).getContents() + " " + shee.getCell(1, i).getContents() + " " + shee.getCell(2, i).getContents() + " " + shee.getCell(3, i).getContents());
                    this.addVivo(new DeudasCertificado(shee.getCell(0, i).getContents(),
                            shee.getCell(1, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(3, i).getContents()));
                }
            }
            //System.err.println("Difuntos:::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            shee = this.getWork_book().getSheet(1);
            for (int i = 1; i < shee.getRows(); i++) {
                if (this.municipios.contains(shee.getCell(2, i).getContents())) {
                    //System.out.println(" " + shee.getCell(2, i).getContents() + " " + shee.getCell(1, i).getContents() + " " + shee.getCell(2, i).getContents() + " " + shee.getCell(3, i).getContents());
                    this.addMuertos(new DeudasCertificado(shee.getCell(0, i).getContents(),
                            shee.getCell(1, i).getContents(),
                            shee.getCell(2, i).getContents(),
                            shee.getCell(3, i).getContents()));
                }
            }
        }
    }
    
    @Override
    public void getColumna(int columna) {
        this.setColumna(new ArrayList<>());
        for (DeudasCertificado d : this.vivos) {
            this.getColumna().add(d.getCerticado());
        }
        this.setColumna_difuntos(new ArrayList<>());
        for (DeudasCertificado d : this.muertos) {
            this.getColumna_difuntos().add(d.getCerticado());
        }
    }

    public ArrayList<DeudasCertificado> getVivos() {
        return vivos;
    }

    public void setVivos(ArrayList<DeudasCertificado> vivos) {
        this.vivos = vivos;
    }

    public ArrayList<DeudasCertificado> getMuertos() {
        return muertos;
    }

    public void setMuertos(ArrayList<DeudasCertificado> muertos) {
        this.muertos = muertos;
    }

    public ArrayList<String> getColumna_difuntos() {
        return columna_difuntos;
    }

    public void setColumna_difuntos(ArrayList<String> columna_difuntos) {
        this.columna_difuntos = columna_difuntos;
    }
    
    

}
