/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author dark
 */
public class DeudasCertificado {
    private String certicado;
    private String fecha_entrega_dane;
    private String municipio;
    private String entidad_quien_recibe;

    public DeudasCertificado(String certicado, String fecha_entrega_dane,String municipio, String entidad_quien_recibe) {
        this.certicado = certicado;
        this.fecha_entrega_dane = fecha_entrega_dane;
        this.municipio = municipio;
        this.entidad_quien_recibe = entidad_quien_recibe;
    }

    public String getCerticado() {
        return certicado;
    }

    public void setCerticado(String certicado) {
        this.certicado = certicado;
    }

    public String getFecha_entrega_dane() {
        return fecha_entrega_dane;
    }

    public void setFecha_entrega_dane(String fecha_entrega_dane) {
        this.fecha_entrega_dane = fecha_entrega_dane;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEntidad_quien_recibe() {
        return entidad_quien_recibe;
    }

    public void setEntidad_quien_recibe(String entidad_quien_recibe) {
        this.entidad_quien_recibe = entidad_quien_recibe;
    }
    
    
}
