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
public class FilaEstadisticaVital extends Fila{
    private String index;
    private String numero_certificado;
    private String departamento;
    private String municipio;
    private String area_de_defuncion;
    private String inspeccion_corregimiento_o_caserio_defuncion;
    private String sitio_defuncion;
    private String codigo_institucion;
    private String nombre_institucion;
    private String tipo_defuncion;
    private String fecha_defuncion;
    private String hora_defuncion;
    private String sexo_fallecido;
    private String nombres_fallecido;
    private String apellidos_fallecido;
    private String tipo_documento_fallecido;
    private String numero_documento_fallecido;
    private String fecha_nacimiento_fallecido;
    private String estado_conyugal_fallecido;
    private String edad_fallecido;
    private String nivel_educativo;
    private String ultimo_year_aprovado;
    private String ocupacion;
    private String pertencia_etnica;
    private String grupo_indigena;
    private String pais_residencia;
    private String departamento_residencia;
    private String municipio_residencia;
    private String localidad;
    private String barrio;
    private String direccion;
    private String centro_poblado;
    private String rural_disperso;
    private String regimen_seguridad;
    private String tipo_administradora;
    private String nombre_administradora;
    private String probable_manera_muerte;
    private String relacion_muerte_parto;
    private String tipo_parto;
    private String multiplicidad;
    private String tiempo_gestacion;
    private String peso_feto;
    private String tipo_documento_madre;
    private String numero_documento_madre;
    private String nombre_madre;
    private String apellidos_madre;
    private String edad_madre;
    private String hijos_nacidos_vivos;
    private String hijos_nacidos_muertos;
    private String estado_conyugal_madre;
    private String nivel_educativo_madre;
    private String ultimo_year_aprobado_madre;
    private String embarazada_cuandno_fallecio;
    private String embarazada_ultimas_6_semanas;
    private String embarazada_ultimas_12_meses;
    private String tipo_muerte_violenta;
    private String descripcion_muerte_violenta; 
    private String departamento_muerte_violenta;
    private String municipio_muerte_violenta;
    private String direccion_muerte_violenta;
    private String mecanismo_1;
    private String mecanismo_2;
    private String mecanismo_3;
    private String mecanismo_4;
    private String recibio_asistencia_medica;
    private String causa_directa;
    private String causa_antesedentes_b;
    private String causa_antesedentes_c;
    private String causa_antesedentes_d;
    private String estado_patologico;
    private String causa_basica;
    private String muerte_sin_certificacion_medica;
    private String nombres_y_apellidos_certificador;
    private String numero_documento_certificador;
    private String tipo_profesion;
    private String registro_profesional;
    private String departamento_expedicion;
    private String municipio_expedicion;
    private String fecha_expedicion;
    private String estado_certificado;

    public FilaEstadisticaVital(String index, String numero_certificado, String departamento, String municipio, String area_de_defuncion, String inspeccion_corregimiento_o_caserio_defuncion, String sitio_defuncion, String codigo_institucion, String nombre_institucion, String tipo_defuncion, String fecha_defuncion, String hora_defuncion, String sexo_fallecido, String nombres_fallecido, String apellidos_fallecido, String tipo_documento_fallecido, String numero_documento_fallecido, String fecha_nacimiento_fallecido, String estado_conyugal_fallecido, String edad_fallecido, String nivel_educativo, String ultimo_year_aprovado, String ocupacion, String pertencia_etnica, String grupo_indigena, String pais_residencia, String departamento_residencia, String municipio_residencia, String localidad, String barrio, String direccion, String centro_poblado, String rural_disperso, String regimen_seguridad, String tipo_administradora, String nombre_administradora, String probable_manera_muerte, String relacion_muerte_parto, String tipo_parto, String multiplicidad, String tiempo_gestacion, String peso_feto, String tipo_documento_madre, String numero_documento_madre, String nombre_madre, String apellidos_madre, String edad_madre, String hijos_nacidos_vivos, String hijos_nacidos_muertos, String estado_conyugal_madre, String nivel_educativo_madre, String ultimo_year_aprobado_madre, String embarazada_cuandno_fallecio, String embarazada_ultimas_6_semanas, String embarazada_ultimas_12_meses, String tipo_muerte_violenta, String descripcion_muerte_violenta, String departamento_muerte_violenta, String municipio_muerte_violenta, String direccion_muerte_violenta, String mecanismo_1, String mecanismo_2, String mecanismo_3, String mecanismo_4, String recibio_asistencia_medica, String causa_directa, String causa_antesedentes_b, String causa_antesedentes_c, String causa_antesedentes_d, String estado_patologico, String causa_basica, String muerte_sin_certificacion_medica, String nombres_y_apellidos_certificador, String numero_documento_certificador, String tipo_profesion, String registro_profesional, String departamento_expedicion, String municipio_expedicion, String fecha_expedicion, String estado_certificado) {
        this.index = index;
        this.numero_certificado = numero_certificado;
        this.departamento = departamento;
        this.municipio = municipio;
        this.area_de_defuncion = area_de_defuncion;
        this.inspeccion_corregimiento_o_caserio_defuncion = inspeccion_corregimiento_o_caserio_defuncion;
        this.sitio_defuncion = sitio_defuncion;
        this.codigo_institucion = codigo_institucion;
        this.nombre_institucion = nombre_institucion;
        this.tipo_defuncion = tipo_defuncion;
        this.fecha_defuncion = fecha_defuncion;
        this.hora_defuncion = hora_defuncion;
        this.sexo_fallecido = sexo_fallecido;
        this.nombres_fallecido = nombres_fallecido;
        this.apellidos_fallecido = apellidos_fallecido;
        this.tipo_documento_fallecido = tipo_documento_fallecido;
        this.numero_documento_fallecido = numero_documento_fallecido;
        this.fecha_nacimiento_fallecido = fecha_nacimiento_fallecido;
        this.estado_conyugal_fallecido = estado_conyugal_fallecido;
        this.edad_fallecido = edad_fallecido;
        this.nivel_educativo = nivel_educativo;
        this.ultimo_year_aprovado = ultimo_year_aprovado;
        this.ocupacion = ocupacion;
        this.pertencia_etnica = pertencia_etnica;
        this.grupo_indigena = grupo_indigena;
        this.pais_residencia = pais_residencia;
        this.departamento_residencia = departamento_residencia;
        this.municipio_residencia = municipio_residencia;
        this.localidad = localidad;
        this.barrio = barrio;
        this.direccion = direccion;
        this.centro_poblado = centro_poblado;
        this.rural_disperso = rural_disperso;
        this.regimen_seguridad = regimen_seguridad;
        this.tipo_administradora = tipo_administradora;
        this.nombre_administradora = nombre_administradora;
        this.probable_manera_muerte = probable_manera_muerte;
        this.relacion_muerte_parto = relacion_muerte_parto;
        this.tipo_parto = tipo_parto;
        this.multiplicidad = multiplicidad;
        this.tiempo_gestacion = tiempo_gestacion;
        this.peso_feto = peso_feto;
        this.tipo_documento_madre = tipo_documento_madre;
        this.numero_documento_madre = numero_documento_madre;
        this.nombre_madre = nombre_madre;
        this.apellidos_madre = apellidos_madre;
        this.edad_madre = edad_madre;
        this.hijos_nacidos_vivos = hijos_nacidos_vivos;
        this.hijos_nacidos_muertos = hijos_nacidos_muertos;
        this.estado_conyugal_madre = estado_conyugal_madre;
        this.nivel_educativo_madre = nivel_educativo_madre;
        this.ultimo_year_aprobado_madre = ultimo_year_aprobado_madre;
        this.embarazada_cuandno_fallecio = embarazada_cuandno_fallecio;
        this.embarazada_ultimas_6_semanas = embarazada_ultimas_6_semanas;
        this.embarazada_ultimas_12_meses = embarazada_ultimas_12_meses;
        this.tipo_muerte_violenta = tipo_muerte_violenta;
        this.descripcion_muerte_violenta = descripcion_muerte_violenta;
        this.departamento_muerte_violenta = departamento_muerte_violenta;
        this.municipio_muerte_violenta = municipio_muerte_violenta;
        this.direccion_muerte_violenta = direccion_muerte_violenta;
        this.mecanismo_1 = mecanismo_1;
        this.mecanismo_2 = mecanismo_2;
        this.mecanismo_3 = mecanismo_3;
        this.mecanismo_4 = mecanismo_4;
        this.recibio_asistencia_medica = recibio_asistencia_medica;
        this.causa_directa = causa_directa;
        this.causa_antesedentes_b = causa_antesedentes_b;
        this.causa_antesedentes_c = causa_antesedentes_c;
        this.causa_antesedentes_d = causa_antesedentes_d;
        this.estado_patologico = estado_patologico;
        this.causa_basica = causa_basica;
        this.muerte_sin_certificacion_medica = muerte_sin_certificacion_medica;
        this.nombres_y_apellidos_certificador = nombres_y_apellidos_certificador;
        this.numero_documento_certificador = numero_documento_certificador;
        this.tipo_profesion = tipo_profesion;
        this.registro_profesional = registro_profesional;
        this.departamento_expedicion = departamento_expedicion;
        this.municipio_expedicion = municipio_expedicion;
        this.fecha_expedicion = fecha_expedicion;
        this.estado_certificado = estado_certificado;
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

    public String getArea_de_defuncion() {
        return area_de_defuncion;
    }

    public void setArea_de_defuncion(String area_de_defuncion) {
        this.area_de_defuncion = area_de_defuncion;
    }

    public String getInspeccion_corregimiento_o_caserio_defuncion() {
        return inspeccion_corregimiento_o_caserio_defuncion;
    }

    public void setInspeccion_corregimiento_o_caserio_defuncion(String inspeccion_corregimiento_o_caserio_defuncion) {
        this.inspeccion_corregimiento_o_caserio_defuncion = inspeccion_corregimiento_o_caserio_defuncion;
    }

    public String getSitio_defuncion() {
        return sitio_defuncion;
    }

    public void setSitio_defuncion(String sitio_defuncion) {
        this.sitio_defuncion = sitio_defuncion;
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

    public String getTipo_defuncion() {
        return tipo_defuncion;
    }

    public void setTipo_defuncion(String tipo_defuncion) {
        this.tipo_defuncion = tipo_defuncion;
    }

    public String getFecha_defuncion() {
        return fecha_defuncion;
    }

    public void setFecha_defuncion(String fecha_defuncion) {
        this.fecha_defuncion = fecha_defuncion;
    }

    public String getHora_defuncion() {
        return hora_defuncion;
    }

    public void setHora_defuncion(String hora_defuncion) {
        this.hora_defuncion = hora_defuncion;
    }

    public String getSexo_fallecido() {
        return sexo_fallecido;
    }

    public void setSexo_fallecido(String sexo_fallecido) {
        this.sexo_fallecido = sexo_fallecido;
    }

    public String getNombres_fallecido() {
        return nombres_fallecido;
    }

    public void setNombres_fallecido(String nombres_fallecido) {
        this.nombres_fallecido = nombres_fallecido;
    }

    public String getApellidos_fallecido() {
        return apellidos_fallecido;
    }

    public void setApellidos_fallecido(String apellidos_fallecido) {
        this.apellidos_fallecido = apellidos_fallecido;
    }

    public String getTipo_documento_fallecido() {
        return tipo_documento_fallecido;
    }

    public void setTipo_documento_fallecido(String tipo_documento_fallecido) {
        this.tipo_documento_fallecido = tipo_documento_fallecido;
    }

    public String getNumero_documento_fallecido() {
        return numero_documento_fallecido;
    }

    public void setNumero_documento_fallecido(String numero_documento_fallecido) {
        this.numero_documento_fallecido = numero_documento_fallecido;
    }

    public String getFecha_nacimiento_fallecido() {
        return fecha_nacimiento_fallecido;
    }

    public void setFecha_nacimiento_fallecido(String fecha_nacimiento_fallecido) {
        this.fecha_nacimiento_fallecido = fecha_nacimiento_fallecido;
    }

    public String getEstado_conyugal_fallecido() {
        return estado_conyugal_fallecido;
    }

    public void setEstado_conyugal_fallecido(String estado_conyugal_fallecido) {
        this.estado_conyugal_fallecido = estado_conyugal_fallecido;
    }

    public String getEdad_fallecido() {
        return edad_fallecido;
    }

    public void setEdad_fallecido(String edad_fallecido) {
        this.edad_fallecido = edad_fallecido;
    }

    public String getNivel_educativo() {
        return nivel_educativo;
    }

    public void setNivel_educativo(String nivel_educativo) {
        this.nivel_educativo = nivel_educativo;
    }

    public String getUltimo_year_aprovado() {
        return ultimo_year_aprovado;
    }

    public void setUltimo_year_aprovado(String ultimo_year_aprovado) {
        this.ultimo_year_aprovado = ultimo_year_aprovado;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getPertencia_etnica() {
        return pertencia_etnica;
    }

    public void setPertencia_etnica(String pertencia_etnica) {
        this.pertencia_etnica = pertencia_etnica;
    }

    public String getGrupo_indigena() {
        return grupo_indigena;
    }

    public void setGrupo_indigena(String grupo_indigena) {
        this.grupo_indigena = grupo_indigena;
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

    public String getProbable_manera_muerte() {
        return probable_manera_muerte;
    }

    public void setProbable_manera_muerte(String probable_manera_muerte) {
        this.probable_manera_muerte = probable_manera_muerte;
    }

    public String getRelacion_muerte_parto() {
        return relacion_muerte_parto;
    }

    public void setRelacion_muerte_parto(String relacion_muerte_parto) {
        this.relacion_muerte_parto = relacion_muerte_parto;
    }

    public String getTipo_parto() {
        return tipo_parto;
    }

    public void setTipo_parto(String tipo_parto) {
        this.tipo_parto = tipo_parto;
    }

    public String getMultiplicidad() {
        return multiplicidad;
    }

    public void setMultiplicidad(String multiplicidad) {
        this.multiplicidad = multiplicidad;
    }

    public String getTiempo_gestacion() {
        return tiempo_gestacion;
    }

    public void setTiempo_gestacion(String tiempo_gestacion) {
        this.tiempo_gestacion = tiempo_gestacion;
    }

    public String getPeso_feto() {
        return peso_feto;
    }

    public void setPeso_feto(String peso_feto) {
        this.peso_feto = peso_feto;
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

    public String getEdad_madre() {
        return edad_madre;
    }

    public void setEdad_madre(String edad_madre) {
        this.edad_madre = edad_madre;
    }

    public String getHijos_nacidos_vivos() {
        return hijos_nacidos_vivos;
    }

    public void setHijos_nacidos_vivos(String hijos_nacidos_vivos) {
        this.hijos_nacidos_vivos = hijos_nacidos_vivos;
    }

    public String getHijos_nacidos_muertos() {
        return hijos_nacidos_muertos;
    }

    public void setHijos_nacidos_muertos(String hijos_nacidos_muertos) {
        this.hijos_nacidos_muertos = hijos_nacidos_muertos;
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

    public String getUltimo_year_aprobado_madre() {
        return ultimo_year_aprobado_madre;
    }

    public void setUltimo_year_aprobado_madre(String ultimo_year_aprobado_madre) {
        this.ultimo_year_aprobado_madre = ultimo_year_aprobado_madre;
    }

    public String getEmbarazada_cuandno_fallecio() {
        return embarazada_cuandno_fallecio;
    }

    public void setEmbarazada_cuandno_fallecio(String embarazada_cuandno_fallecio) {
        this.embarazada_cuandno_fallecio = embarazada_cuandno_fallecio;
    }

    public String getEmbarazada_ultimas_6_semanas() {
        return embarazada_ultimas_6_semanas;
    }

    public void setEmbarazada_ultimas_6_semanas(String embarazada_ultimas_6_semanas) {
        this.embarazada_ultimas_6_semanas = embarazada_ultimas_6_semanas;
    }

    public String getEmbarazada_ultimas_12_meses() {
        return embarazada_ultimas_12_meses;
    }

    public void setEmbarazada_ultimas_12_meses(String embarazada_ultimas_12_meses) {
        this.embarazada_ultimas_12_meses = embarazada_ultimas_12_meses;
    }

    public String getTipo_muerte_violenta() {
        return tipo_muerte_violenta;
    }

    public void setTipo_muerte_violenta(String tipo_muerte_violenta) {
        this.tipo_muerte_violenta = tipo_muerte_violenta;
    }

    public String getDescripcion_muerte_violenta() {
        return descripcion_muerte_violenta;
    }

    public void setDescripcion_muerte_violenta(String descripcion_muerte_violenta) {
        this.descripcion_muerte_violenta = descripcion_muerte_violenta;
    }

    public String getDepartamento_muerte_violenta() {
        return departamento_muerte_violenta;
    }

    public void setDepartamento_muerte_violenta(String departamento_muerte_violenta) {
        this.departamento_muerte_violenta = departamento_muerte_violenta;
    }

    public String getMunicipio_muerte_violenta() {
        return municipio_muerte_violenta;
    }

    public void setMunicipio_muerte_violenta(String municipio_muerte_violenta) {
        this.municipio_muerte_violenta = municipio_muerte_violenta;
    }

    public String getDireccion_muerte_violenta() {
        return direccion_muerte_violenta;
    }

    public void setDireccion_muerte_violenta(String direccion_muerte_violenta) {
        this.direccion_muerte_violenta = direccion_muerte_violenta;
    }

    public String getMecanismo_1() {
        return mecanismo_1;
    }

    public void setMecanismo_1(String mecanismo_1) {
        this.mecanismo_1 = mecanismo_1;
    }

    public String getMecanismo_2() {
        return mecanismo_2;
    }

    public void setMecanismo_2(String mecanismo_2) {
        this.mecanismo_2 = mecanismo_2;
    }

    public String getMecanismo_3() {
        return mecanismo_3;
    }

    public void setMecanismo_3(String mecanismo_3) {
        this.mecanismo_3 = mecanismo_3;
    }

    public String getMecanismo_4() {
        return mecanismo_4;
    }

    public void setMecanismo_4(String mecanismo_4) {
        this.mecanismo_4 = mecanismo_4;
    }

    public String getRecibio_asistencia_medica() {
        return recibio_asistencia_medica;
    }

    public void setRecibio_asistencia_medica(String recibio_asistencia_medica) {
        this.recibio_asistencia_medica = recibio_asistencia_medica;
    }

    public String getCausa_directa() {
        return causa_directa;
    }

    public void setCausa_directa(String causa_directa) {
        this.causa_directa = causa_directa;
    }

    public String getCausa_antesedentes_b() {
        return causa_antesedentes_b;
    }

    public void setCausa_antesedentes_b(String causa_antesedentes_b) {
        this.causa_antesedentes_b = causa_antesedentes_b;
    }

    public String getCausa_antesedentes_c() {
        return causa_antesedentes_c;
    }

    public void setCausa_antesedentes_c(String causa_antesedentes_c) {
        this.causa_antesedentes_c = causa_antesedentes_c;
    }

    public String getCausa_antesedentes_d() {
        return causa_antesedentes_d;
    }

    public void setCausa_antesedentes_d(String causa_antesedentes_d) {
        this.causa_antesedentes_d = causa_antesedentes_d;
    }

    public String getEstado_patologico() {
        return estado_patologico;
    }

    public void setEstado_patologico(String estado_patologico) {
        this.estado_patologico = estado_patologico;
    }

    public String getCausa_basica() {
        return causa_basica;
    }

    public void setCausa_basica(String causa_basica) {
        this.causa_basica = causa_basica;
    }

    public String getMuerte_sin_certificacion_medica() {
        return muerte_sin_certificacion_medica;
    }

    public void setMuerte_sin_certificacion_medica(String muerte_sin_certificacion_medica) {
        this.muerte_sin_certificacion_medica = muerte_sin_certificacion_medica;
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

    public String getTipo_profesion() {
        return tipo_profesion;
    }

    public void setTipo_profesion(String tipo_profesion) {
        this.tipo_profesion = tipo_profesion;
    }

    public String getRegistro_profesional() {
        return registro_profesional;
    }

    public void setRegistro_profesional(String registro_profesional) {
        this.registro_profesional = registro_profesional;
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
