/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author dark
 */
public  class ManejadorMunicipio {

        private ArrayList<Municipio> municipios;

        public ManejadorMunicipio() {
            this.municipios = new ArrayList<>();
            this.municipios.add(new logica.Municipio(0,"ACHI"));
            this.municipios.add(new Municipio(0,"ACHÍ"));
            this.municipios.add(new Municipio(1,"MAGANGUE"));
            this.municipios.add(new Municipio(1,"MAGANGUÉ"));
            this.municipios.add(new Municipio(1,"MAGUANGUE"));
            this.municipios.add(new Municipio(2,"MONTECRISTO"));
            this.municipios.add(new Municipio(3,"PINILLOS"));
            this.municipios.add(new Municipio(4,"SAN JACINTO DEL CAUCA"));
            this.municipios.add(new Municipio(5,"TIQUISIO"));
            this.municipios.add(new Municipio(0,"ACH�"));
        }
        
        public String getMunicipio(int id){
            corte:
            for (Municipio municipio : municipios) {
                if(municipio.getId()==id){
                    return municipio.getNombre();
                }            }
            return "";
        }
        
        public ArrayList<String> getMunicipios(int id){
            ArrayList<String> mun_tem = new ArrayList<>();
            for (Municipio mun_tem1 : this.municipios) {
                if(mun_tem1.getId()==id && id != -1)
                    mun_tem.add(mun_tem1.getNombre());
                if(id==-1)
                    mun_tem.add(mun_tem1.getNombre());
            }
            return mun_tem;
        }
}