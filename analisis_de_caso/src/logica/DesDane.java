/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author E7250
 */
public class DesDane {
    private String entregado_codigo;
    private String secretaria;
    private String fecha_entrega;
    private String ips;
    private String municipio;
    private String tipo_doc;
    private String documento;
    private String primer_apellido;
    private String segundo_apellido;
    private String primer_nombre;
    private String segundo_nombre;

    public DesDane(String entregado_codigo, String secretaria, String fecha_entrega, String ips, String municipio, String tipo_doc, String documento, String primer_apellido, String segundo_apellido, String primer_nombre, String segundo_nombre) {
        this.entregado_codigo = entregado_codigo;
        this.secretaria = secretaria;
        this.fecha_entrega = fecha_entrega;
        this.ips = ips;
        this.municipio = municipio;
        this.tipo_doc = tipo_doc;
        this.documento = documento;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
    }

    public String getEntregado_codigo() {
        return entregado_codigo;
    }

    public void setEntregado_codigo(String entregado_codigo) {
        this.entregado_codigo = entregado_codigo;
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }
    
    
    
}
