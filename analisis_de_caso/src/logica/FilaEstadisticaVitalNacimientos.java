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
public class FilaEstadisticaVitalNacimientos extends Fila{
    private String index;
    private String numero_certificado;
    private String departamento;
    private String municipio;
    private String area_nacimiento;
    private String inspeccion_corregimiento_o_caserio_nacimiento;
    private String sitio_nacimiento;
    private String codigo_institucion;
    private String nombre_institucion;
    private String sexo;
    private String peso;
    private String talla;
    private String fecha_nacimiento;
    private String hora_nacimiento;
    private String parto_atendido_por;
    private String tiempo_de_gestion;
    private String numero_consultas_prenatales;
    private String tipo_parto;
    private String multiplicidad_embarazo;
    private String apgar1;
    private String apgar2;
    private String grupo_sanguineo;
    private String factor_rh;
    private String pertenecia_etnica;
    private String grupo_indigena;
    private String nombre_madre;
    private String apellidos_madre;
    private String tipo_documento_madre;
    private String numero_documento_madre;
    private String edad_madre;
    private String estado_conyugal_madre;
    private String nivel_educativo_madre;
    private String ultimo_año_aprovado_madre;
    private String pais_residencia;
    private String departamento_residencia;
    private String municipio_residencia;
    private String area_residencial;
    private String localidad;
    private String barrio;
    private String direccion;
    private String centro_poblado;
    private String rural_disperso;
    private String numero_hijos_nacidos_vivos;
    private String fecha_anterior_hijo_nacido_vivo;
    private String numero_embarazos;
    private String regimen_seguridad;
    private String tipo_administradora;
    private String nombre_administradora;
    private String edad_padre;
    private String nivel_educativo_padre;
    private String ultimo_año_aprobado_padre;
    private String nombres_y_apellidos_certificador;
    private String numero_documento_certificador;
    private String tipo_documento_certificador;
    private String profesion_certificador;
    private String registro_profesional_certificador;
    private String departamento_expedicion;
    private String municipio_expedicion;
    private String fecha_expedicion;
    private String estado_certificado;

    public FilaEstadisticaVitalNacimientos(String index, String numero_certificado, String departamento, String municipio, String area_nacimiento, String inspeccion_corregimiento_o_caserio_nacimiento, String sitio_nacimiento, String codigo_institucion, String nombre_institucion, String sexo, String peso, String talla, String fecha_nacimiento, String hora_nacimiento, String parto_atendido_por, String tiempo_de_gestion, String numero_consultas_prenatales, String tipo_parto, String multiplicidad_embarazo, String apgar1, String apgar2, String grupo_sanguineo, String factor_rh, String pertenecia_etnica, String grupo_indigena, String nombre_madre, String apellidos_madre, String tipo_documento_madre, String numero_documento_madre, String edad_madre, String estado_conyugal_madre, String nivel_educativo_madre, String ultimo_año_aprovado_madre, String pais_residencia, String departamento_residencia, String municipio_residencia, String area_residencial, String localidad, String barrio, String direccion, String centro_poblado, String rural_disperso, String numero_hijos_nacidos_vivos, String fecha_anterior_hijo_nacido_vivo, String numero_embarazos, String regimen_seguridad, String tipo_administradora, String nombre_administradora, String edad_padre, String nivel_educativo_padre, String ultimo_año_aprobado_padre, String nombres_y_apellidos_certificador, String numero_documento_certificador, String tipo_documento_certificador, String profesion_certificador, String registro_profesional_certificador, String departamento_expedicion, String municipio_expedicion, String fecha_expedicion, String estado_certificado) {
        this.index = index;
        this.numero_certificado = numero_certificado;
        this.departamento = departamento;
        this.municipio = municipio;
        this.area_nacimiento = area_nacimiento;
        this.inspeccion_corregimiento_o_caserio_nacimiento = inspeccion_corregimiento_o_caserio_nacimiento;
        this.sitio_nacimiento = sitio_nacimiento;
        this.codigo_institucion = codigo_institucion;
        this.nombre_institucion = nombre_institucion;
        this.sexo = sexo;
        this.peso = peso;
        this.talla = talla;
        this.fecha_nacimiento = fecha_nacimiento;
        this.hora_nacimiento = hora_nacimiento;
        this.parto_atendido_por = parto_atendido_por;
        this.tiempo_de_gestion = tiempo_de_gestion;
        this.numero_consultas_prenatales = numero_consultas_prenatales;
        this.tipo_parto = tipo_parto;
        this.multiplicidad_embarazo = multiplicidad_embarazo;
        this.apgar1 = apgar1;
        this.apgar2 = apgar2;
        this.grupo_sanguineo = grupo_sanguineo;
        this.factor_rh = factor_rh;
        this.pertenecia_etnica = pertenecia_etnica;
        this.grupo_indigena = grupo_indigena;
        this.nombre_madre = nombre_madre;
        this.apellidos_madre = apellidos_madre;
        this.tipo_documento_madre = tipo_documento_madre;
        this.numero_documento_madre = numero_documento_madre;
        this.edad_madre = edad_madre;
        this.estado_conyugal_madre = estado_conyugal_madre;
        this.nivel_educativo_madre = nivel_educativo_madre;
        this.ultimo_año_aprovado_madre = ultimo_año_aprovado_madre;
        this.pais_residencia = pais_residencia;
        this.departamento_residencia = departamento_residencia;
        this.municipio_residencia = municipio_residencia;
        this.area_residencial = area_residencial;
        this.localidad = localidad;
        this.barrio = barrio;
        this.direccion = direccion;
        this.centro_poblado = centro_poblado;
        this.rural_disperso = rural_disperso;
        this.numero_hijos_nacidos_vivos = numero_hijos_nacidos_vivos;
        this.fecha_anterior_hijo_nacido_vivo = fecha_anterior_hijo_nacido_vivo;
        this.numero_embarazos = numero_embarazos;
        this.regimen_seguridad = regimen_seguridad;
        this.tipo_administradora = tipo_administradora;
        this.nombre_administradora = nombre_administradora;
        this.edad_padre = edad_padre;
        this.nivel_educativo_padre = nivel_educativo_padre;
        this.ultimo_año_aprobado_padre = ultimo_año_aprobado_padre;
        this.nombres_y_apellidos_certificador = nombres_y_apellidos_certificador;
        this.numero_documento_certificador = numero_documento_certificador;
        this.tipo_documento_certificador = tipo_documento_certificador;
        this.profesion_certificador = profesion_certificador;
        this.registro_profesional_certificador = registro_profesional_certificador;
        this.departamento_expedicion = departamento_expedicion;
        this.municipio_expedicion = municipio_expedicion;
        this.fecha_expedicion = fecha_expedicion;
        this.estado_certificado = estado_certificado;
    }

    @Override
    public String toString() {
        return "FilaEstadisticaVitalNacimientos{" + "index=" + index + ", numero_certificado=" + numero_certificado + ", departamento=" + departamento + ", municipio=" + municipio + ", area_nacimiento=" + area_nacimiento + ", inspeccion_corregimiento_o_caserio_nacimiento=" + inspeccion_corregimiento_o_caserio_nacimiento + ", sitio_nacimiento=" + sitio_nacimiento + ", codigo_institucion=" + codigo_institucion + ", nombre_institucion=" + nombre_institucion + ", sexo=" + sexo + ", peso=" + peso + ", talla=" + talla + ", fecha_nacimiento=" + fecha_nacimiento + ", hora_nacimiento=" + hora_nacimiento + ", parto_atendido_por=" + parto_atendido_por + ", tiempo_de_gestion=" + tiempo_de_gestion + ", numero_consultas_prenatales=" + numero_consultas_prenatales + ", tipo_parto=" + tipo_parto + ", multiplicidad_embarazo=" + multiplicidad_embarazo + ", apgar1=" + apgar1 + ", apgar2=" + apgar2 + ", grupo_sanguineo=" + grupo_sanguineo + ", factor_rh=" + factor_rh + ", pertenecia_etnica=" + pertenecia_etnica + ", grupo_indigena=" + grupo_indigena + ", nombre_madre=" + nombre_madre + ", apellidos_madre=" + apellidos_madre + ", tipo_documento_madre=" + tipo_documento_madre + ", numero_documento_madre=" + numero_documento_madre + ", edad_madre=" + edad_madre + ", estado_conyugal_madre=" + estado_conyugal_madre + ", nivel_educativo_madre=" + nivel_educativo_madre + ", ultimo_a\u00f1o_aprovado_madre=" + ultimo_año_aprovado_madre + ", pais_residencia=" + pais_residencia + ", departamento_residencia=" + departamento_residencia + ", municipio_residencia=" + municipio_residencia + ", area_residencial=" + area_residencial + ", localidad=" + localidad + ", barrio=" + barrio + ", direccion=" + direccion + ", centro_poblado=" + centro_poblado + ", rural_disperso=" + rural_disperso + ", numero_hijos_nacidos_vivos=" + numero_hijos_nacidos_vivos + ", fecha_anterior_hijo_nacido_vivo=" + fecha_anterior_hijo_nacido_vivo + ", numero_embarazos=" + numero_embarazos + ", regimen_seguridad=" + regimen_seguridad + ", tipo_administradora=" + tipo_administradora + ", nombre_administradora=" + nombre_administradora + ", edad_padre=" + edad_padre + ", nivel_educativo_padre=" + nivel_educativo_padre + ", ultimo_a\u00f1o_aprobado_padre=" + ultimo_año_aprobado_padre + ", nombres_y_apellidos_certificador=" + nombres_y_apellidos_certificador + ", numero_documento_certificador=" + numero_documento_certificador + ", tipo_documento_certificador=" + tipo_documento_certificador + ", profesion_certificador=" + profesion_certificador + ", registro_profesional_certificador=" + registro_profesional_certificador + ", departamento_expedicion=" + departamento_expedicion + ", municipio_expedicion=" + municipio_expedicion + ", fecha_expedicion=" + fecha_expedicion + ", estado_certificado=" + estado_certificado + '}';
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getNumero_certificado() {
        return numero_certificado;
    }

    public void setNumero_certificado(String numero_certificado) {
        this.numero_certificado = numero_certificado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getArea_nacimiento() {
        return area_nacimiento;
    }

    public void setArea_nacimiento(String area_nacimiento) {
        this.area_nacimiento = area_nacimiento;
    }

    public String getInspeccion_corregimiento_o_caserio_nacimiento() {
        return inspeccion_corregimiento_o_caserio_nacimiento;
    }

    public void setInspeccion_corregimiento_o_caserio_nacimiento(String inspeccion_corregimiento_o_caserio_nacimiento) {
        this.inspeccion_corregimiento_o_caserio_nacimiento = inspeccion_corregimiento_o_caserio_nacimiento;
    }

    public String getSitio_nacimiento() {
        return sitio_nacimiento;
    }

    public void setSitio_nacimiento(String sitio_nacimiento) {
        this.sitio_nacimiento = sitio_nacimiento;
    }

    public String getCodigo_institucion() {
        return codigo_institucion;
    }

    public void setCodigo_institucion(String codigo_institucion) {
        this.codigo_institucion = codigo_institucion;
    }

    public String getNombre_institucion() {
        return nombre_institucion;
    }

    public void setNombre_institucion(String nombre_institucion) {
        this.nombre_institucion = nombre_institucion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getHora_nacimiento() {
        return hora_nacimiento;
    }

    public void setHora_nacimiento(String hora_nacimiento) {
        this.hora_nacimiento = hora_nacimiento;
    }

    public String getParto_atendido_por() {
        return parto_atendido_por;
    }

    public void setParto_atendido_por(String parto_atendido_por) {
        this.parto_atendido_por = parto_atendido_por;
    }

    public String getTiempo_de_gestion() {
        return tiempo_de_gestion;
    }

    public void setTiempo_de_gestion(String tiempo_de_gestion) {
        this.tiempo_de_gestion = tiempo_de_gestion;
    }

    public String getNumero_consultas_prenatales() {
        return numero_consultas_prenatales;
    }

    public void setNumero_consultas_prenatales(String numero_consultas_prenatales) {
        this.numero_consultas_prenatales = numero_consultas_prenatales;
    }

    public String getTipo_parto() {
        return tipo_parto;
    }

    public void setTipo_parto(String tipo_parto) {
        this.tipo_parto = tipo_parto;
    }

    public String getMultiplicidad_embarazo() {
        return multiplicidad_embarazo;
    }

    public void setMultiplicidad_embarazo(String multiplicidad_embarazo) {
        this.multiplicidad_embarazo = multiplicidad_embarazo;
    }

    public String getApgar1() {
        return apgar1;
    }

    public void setApgar1(String apgar1) {
        this.apgar1 = apgar1;
    }

    public String getApgar2() {
        return apgar2;
    }

    public void setApgar2(String apgar2) {
        this.apgar2 = apgar2;
    }

    public String getGrupo_sanguineo() {
        return grupo_sanguineo;
    }

    public void setGrupo_sanguineo(String grupo_sanguineo) {
        this.grupo_sanguineo = grupo_sanguineo;
    }

    public String getFactor_rh() {
        return factor_rh;
    }

    public void setFactor_rh(String factor_rh) {
        this.factor_rh = factor_rh;
    }

    public String getPertenecia_etnica() {
        return pertenecia_etnica;
    }

    public void setPertenecia_etnica(String pertenecia_etnica) {
        this.pertenecia_etnica = pertenecia_etnica;
    }

    public String getGrupo_indigena() {
        return grupo_indigena;
    }

    public void setGrupo_indigena(String grupo_indigena) {
        this.grupo_indigena = grupo_indigena;
    }

    public String getNombre_madre() {
        return nombre_madre;
    }

    public void setNombre_madre(String nombre_madre) {
        this.nombre_madre = nombre_madre;
    }

    public String getApellidos_madre() {
        return apellidos_madre;
    }

    public void setApellidos_madre(String apellidos_madre) {
        this.apellidos_madre = apellidos_madre;
    }

    public String getTipo_documento_madre() {
        return tipo_documento_madre;
    }

    public void setTipo_documento_madre(String tipo_documento_madre) {
        this.tipo_documento_madre = tipo_documento_madre;
    }

    public String getNumero_documento_madre() {
        return numero_documento_madre;
    }

    public void setNumero_documento_madre(String numero_documento_madre) {
        this.numero_documento_madre = numero_documento_madre;
    }

    public String getEdad_madre() {
        return edad_madre;
    }

    public void setEdad_madre(String edad_madre) {
        this.edad_madre = edad_madre;
    }

    public String getEstado_conyugal_madre() {
        return estado_conyugal_madre;
    }

    public void setEstado_conyugal_madre(String estado_conyugal_madre) {
        this.estado_conyugal_madre = estado_conyugal_madre;
    }

    public String getNivel_educativo_madre() {
        return nivel_educativo_madre;
    }

    public void setNivel_educativo_madre(String nivel_educativo_madre) {
        this.nivel_educativo_madre = nivel_educativo_madre;
    }

    public String getUltimo_año_aprovado_madre() {
        return ultimo_año_aprovado_madre;
    }

    public void setUltimo_año_aprovado_madre(String ultimo_año_aprovado_madre) {
        this.ultimo_año_aprovado_madre = ultimo_año_aprovado_madre;
    }

    public String getPais_residencia() {
        return pais_residencia;
    }

    public void setPais_residencia(String pais_residencia) {
        this.pais_residencia = pais_residencia;
    }

    public String getDepartamento_residencia() {
        return departamento_residencia;
    }

    public void setDepartamento_residencia(String departamento_residencia) {
        this.departamento_residencia = departamento_residencia;
    }

    public String getMunicipio_residencia() {
        return municipio_residencia;
    }

    public void setMunicipio_residencia(String municipio_residencia) {
        this.municipio_residencia = municipio_residencia;
    }

    public String getArea_residencial() {
        return area_residencial;
    }

    public void setArea_residencial(String area_residencial) {
        this.area_residencial = area_residencial;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCentro_poblado() {
        return centro_poblado;
    }

    public void setCentro_poblado(String centro_poblado) {
        this.centro_poblado = centro_poblado;
    }

    public String getRural_disperso() {
        return rural_disperso;
    }

    public void setRural_disperso(String rural_disperso) {
        this.rural_disperso = rural_disperso;
    }

    public String getNumero_hijos_nacidos_vivos() {
        return numero_hijos_nacidos_vivos;
    }

    public void setNumero_hijos_nacidos_vivos(String numero_hijos_nacidos_vivos) {
        this.numero_hijos_nacidos_vivos = numero_hijos_nacidos_vivos;
    }

    public String getFecha_anterior_hijo_nacido_vivo() {
        return fecha_anterior_hijo_nacido_vivo;
    }

    public void setFecha_anterior_hijo_nacido_vivo(String fecha_anterior_hijo_nacido_vivo) {
        this.fecha_anterior_hijo_nacido_vivo = fecha_anterior_hijo_nacido_vivo;
    }

    public String getNumero_embarazos() {
        return numero_embarazos;
    }

    public void setNumero_embarazos(String numero_embarazos) {
        this.numero_embarazos = numero_embarazos;
    }

    public String getRegimen_seguridad() {
        return regimen_seguridad;
    }

    public void setRegimen_seguridad(String regimen_seguridad) {
        this.regimen_seguridad = regimen_seguridad;
    }

    public String getTipo_administradora() {
        return tipo_administradora;
    }

    public void setTipo_administradora(String tipo_administradora) {
        this.tipo_administradora = tipo_administradora;
    }

    public String getNombre_administradora() {
        return nombre_administradora;
    }

    public void setNombre_administradora(String nombre_administradora) {
        this.nombre_administradora = nombre_administradora;
    }

    public String getEdad_padre() {
        return edad_padre;
    }

    public void setEdad_padre(String edad_padre) {
        this.edad_padre = edad_padre;
    }

    public String getNivel_educativo_padre() {
        return nivel_educativo_padre;
    }

    public void setNivel_educativo_padre(String nivel_educativo_padre) {
        this.nivel_educativo_padre = nivel_educativo_padre;
    }

    public String getUltimo_año_aprobado_padre() {
        return ultimo_año_aprobado_padre;
    }

    public void setUltimo_año_aprobado_padre(String ultimo_año_aprobado_padre) {
        this.ultimo_año_aprobado_padre = ultimo_año_aprobado_padre;
    }

    public String getNombres_y_apellidos_certificador() {
        return nombres_y_apellidos_certificador;
    }

    public void setNombres_y_apellidos_certificador(String nombres_y_apellidos_certificador) {
        this.nombres_y_apellidos_certificador = nombres_y_apellidos_certificador;
    }

    public String getNumero_documento_certificador() {
        return numero_documento_certificador;
    }

    public void setNumero_documento_certificador(String numero_documento_certificador) {
        this.numero_documento_certificador = numero_documento_certificador;
    }

    public String getTipo_documento_certificador() {
        return tipo_documento_certificador;
    }

    public void setTipo_documento_certificador(String tipo_documento_certificador) {
        this.tipo_documento_certificador = tipo_documento_certificador;
    }

    public String getProfesion_certificador() {
        return profesion_certificador;
    }

    public void setProfesion_certificador(String profesion_certificador) {
        this.profesion_certificador = profesion_certificador;
    }

    public String getRegistro_profesional_certificador() {
        return registro_profesional_certificador;
    }

    public void setRegistro_profesional_certificador(String registro_profesional_certificador) {
        this.registro_profesional_certificador = registro_profesional_certificador;
    }

    public String getDepartamento_expedicion() {
        return departamento_expedicion;
    }

    public void setDepartamento_expedicion(String departamento_expedicion) {
        this.departamento_expedicion = departamento_expedicion;
    }

    public String getMunicipio_expedicion() {
        return municipio_expedicion;
    }

    public void setMunicipio_expedicion(String municipio_expedicion) {
        this.municipio_expedicion = municipio_expedicion;
    }

    public String getFecha_expedicion() {
        return fecha_expedicion;
    }

    public void setFecha_expedicion(String fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    public String getEstado_certificado() {
        return estado_certificado;
    }

    public void setEstado_certificado(String estado_certificado) {
        this.estado_certificado = estado_certificado;
    }
    
    
}
