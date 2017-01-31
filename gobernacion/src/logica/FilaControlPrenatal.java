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
public class FilaControlPrenatal extends Fila{
    private String index;
    private String consecutivo;
    private String cert_nac_entregado;
    private String fecha_entrega_dane;
    private String entidad_quien_recibe;
    private String fecha_entrega_en_sds;
    private String nombre_de_quien_recibe_en_la_entidad;
    private String municipio;
    private String institucion_de_salud;
    private String observaciones;
    private String fecha_entrega_municipio;

    public FilaControlPrenatal(String cert_nac_entregado, String fecha_entrega_dane, String municipio, String entidad_quien_recibe, String nombre_de_quien_recibe_en_la_entidad,String fecha_entrega_municipio) {
        this.cert_nac_entregado = cert_nac_entregado;
        this.fecha_entrega_dane = fecha_entrega_dane;
        this.entidad_quien_recibe = entidad_quien_recibe;
        this.nombre_de_quien_recibe_en_la_entidad = nombre_de_quien_recibe_en_la_entidad;
        this.municipio = municipio;
        this.fecha_entrega_municipio =fecha_entrega_municipio;
    }
    
    
    

    public FilaControlPrenatal(String index, String consecutivo, String cert_nac_entregado, String fecha_entrega_dane, String entidad_quien_recibe, String fecha_entrega_en_sds, String nombre_de_quien_recibe_en_la_entidad, String municipio, String institucion_de_salud, String observaciones) {
        this.index = index;
        this.consecutivo = consecutivo;
        this.cert_nac_entregado = cert_nac_entregado;
        this.fecha_entrega_dane = fecha_entrega_dane;
        this.entidad_quien_recibe = entidad_quien_recibe;
        this.fecha_entrega_en_sds = fecha_entrega_en_sds;
        this.nombre_de_quien_recibe_en_la_entidad = nombre_de_quien_recibe_en_la_entidad;
        this.municipio = municipio;
        this.institucion_de_salud = institucion_de_salud;
        this.observaciones = observaciones;
    }

    
    
    
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
    
    

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getCert_nac_entregado() {
        return cert_nac_entregado;
    }

    public void setCert_nac_entregado(String cert_nac_entregado) {
        this.cert_nac_entregado = cert_nac_entregado;
    }

    public String getFecha_entrega_dane() {
        return fecha_entrega_dane;
    }

    public void setFecha_entrega_dane(String fecha_entrega_dane) {
        this.fecha_entrega_dane = fecha_entrega_dane;
    }

    public String getEntidad_quien_recibe() {
        return entidad_quien_recibe;
    }

    public void setEntidad_quien_recibe(String entidad_quien_recibe) {
        this.entidad_quien_recibe = entidad_quien_recibe;
    }

    public String getFecha_entrega_en_sds() {
        return fecha_entrega_en_sds;
    }

    public void setFecha_entrega_en_sds(String fecha_entrega_en_sds) {
        this.fecha_entrega_en_sds = fecha_entrega_en_sds;
    }

    public String getNombre_de_quien_recibe_en_la_entidad() {
        return nombre_de_quien_recibe_en_la_entidad;
    }

    public void setNombre_de_quien_recibe_en_la_entidad(String nombre_de_quien_recibe_en_la_entidad) {
        this.nombre_de_quien_recibe_en_la_entidad = nombre_de_quien_recibe_en_la_entidad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getInstitucion_de_salud() {
        return institucion_de_salud;
    }

    public void setInstitucion_de_salud(String institucion_de_salud) {
        this.institucion_de_salud = institucion_de_salud;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
