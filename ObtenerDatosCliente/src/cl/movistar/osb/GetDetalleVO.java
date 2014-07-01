/**
 * GetDetalleVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.movistar.osb;

public class GetDetalleVO  implements java.io.Serializable {
    private java.lang.String apellido1Usuario;

    private java.lang.String apellido2Usuario;

    private java.lang.String cargoBasico;

    private java.lang.String codCausaBaja;

    private int codCliente;

    private int codClienteDistribuidor;

    private int codCuenta;

    private java.lang.String codModelo;

    private java.lang.String codSituacion;

    private java.lang.String codTecnologia;

    private int codVendedor;

    private int codciclo;

    private java.lang.String codigoPlan;

    private int codigoRetorno;

    private java.lang.String descCausaBaja;

    private java.lang.String descFabricante;

    private java.lang.String descModVenta;

    private java.lang.String descPlan;

    private java.lang.String descTipoContrato;

    private int diaFacturacion;

    private java.lang.String fechaAlta;

    private java.lang.String fechaAltaCentral;

    private java.lang.String fechaBaja;

    private java.lang.String fechaBajaCentral;

    private java.lang.String fechaFinContrato;

    private java.lang.String fechaProrroga;

    private cl.movistar.osb.BolsaAbonadoVO[] listaBolsaAbonado;

    private java.lang.String mensajeRetorno;

    private int mesesContrato;

    private java.lang.String nombreCliente;

    private java.lang.String nombreUsuario;

    private int numAbonado;

    private int numCelular;

    private java.lang.String numIdentidad;

    private int numOrden;

    private int numSerieInt;

    private java.lang.String numSerieStr;

    private java.lang.String primerApellido;

    private java.lang.String segundoApellido;

    private java.lang.String sexo;

    private java.lang.String situacionAbonado;

    private java.lang.String tipoAbonado;

    private java.lang.String tipoIdentidad;

    private java.lang.String tipoPlan;

    private java.lang.String valorCliente;

    public GetDetalleVO() {
    }

    public GetDetalleVO(
           java.lang.String apellido1Usuario,
           java.lang.String apellido2Usuario,
           java.lang.String cargoBasico,
           java.lang.String codCausaBaja,
           int codCliente,
           int codClienteDistribuidor,
           int codCuenta,
           java.lang.String codModelo,
           java.lang.String codSituacion,
           java.lang.String codTecnologia,
           int codVendedor,
           int codciclo,
           java.lang.String codigoPlan,
           int codigoRetorno,
           java.lang.String descCausaBaja,
           java.lang.String descFabricante,
           java.lang.String descModVenta,
           java.lang.String descPlan,
           java.lang.String descTipoContrato,
           int diaFacturacion,
           java.lang.String fechaAlta,
           java.lang.String fechaAltaCentral,
           java.lang.String fechaBaja,
           java.lang.String fechaBajaCentral,
           java.lang.String fechaFinContrato,
           java.lang.String fechaProrroga,
           cl.movistar.osb.BolsaAbonadoVO[] listaBolsaAbonado,
           java.lang.String mensajeRetorno,
           int mesesContrato,
           java.lang.String nombreCliente,
           java.lang.String nombreUsuario,
           int numAbonado,
           int numCelular,
           java.lang.String numIdentidad,
           int numOrden,
           int numSerieInt,
           java.lang.String numSerieStr,
           java.lang.String primerApellido,
           java.lang.String segundoApellido,
           java.lang.String sexo,
           java.lang.String situacionAbonado,
           java.lang.String tipoAbonado,
           java.lang.String tipoIdentidad,
           java.lang.String tipoPlan,
           java.lang.String valorCliente) {
           this.apellido1Usuario = apellido1Usuario;
           this.apellido2Usuario = apellido2Usuario;
           this.cargoBasico = cargoBasico;
           this.codCausaBaja = codCausaBaja;
           this.codCliente = codCliente;
           this.codClienteDistribuidor = codClienteDistribuidor;
           this.codCuenta = codCuenta;
           this.codModelo = codModelo;
           this.codSituacion = codSituacion;
           this.codTecnologia = codTecnologia;
           this.codVendedor = codVendedor;
           this.codciclo = codciclo;
           this.codigoPlan = codigoPlan;
           this.codigoRetorno = codigoRetorno;
           this.descCausaBaja = descCausaBaja;
           this.descFabricante = descFabricante;
           this.descModVenta = descModVenta;
           this.descPlan = descPlan;
           this.descTipoContrato = descTipoContrato;
           this.diaFacturacion = diaFacturacion;
           this.fechaAlta = fechaAlta;
           this.fechaAltaCentral = fechaAltaCentral;
           this.fechaBaja = fechaBaja;
           this.fechaBajaCentral = fechaBajaCentral;
           this.fechaFinContrato = fechaFinContrato;
           this.fechaProrroga = fechaProrroga;
           this.listaBolsaAbonado = listaBolsaAbonado;
           this.mensajeRetorno = mensajeRetorno;
           this.mesesContrato = mesesContrato;
           this.nombreCliente = nombreCliente;
           this.nombreUsuario = nombreUsuario;
           this.numAbonado = numAbonado;
           this.numCelular = numCelular;
           this.numIdentidad = numIdentidad;
           this.numOrden = numOrden;
           this.numSerieInt = numSerieInt;
           this.numSerieStr = numSerieStr;
           this.primerApellido = primerApellido;
           this.segundoApellido = segundoApellido;
           this.sexo = sexo;
           this.situacionAbonado = situacionAbonado;
           this.tipoAbonado = tipoAbonado;
           this.tipoIdentidad = tipoIdentidad;
           this.tipoPlan = tipoPlan;
           this.valorCliente = valorCliente;
    }


    /**
     * Gets the apellido1Usuario value for this GetDetalleVO.
     * 
     * @return apellido1Usuario
     */
    public java.lang.String getApellido1Usuario() {
        return apellido1Usuario;
    }


    /**
     * Sets the apellido1Usuario value for this GetDetalleVO.
     * 
     * @param apellido1Usuario
     */
    public void setApellido1Usuario(java.lang.String apellido1Usuario) {
        this.apellido1Usuario = apellido1Usuario;
    }


    /**
     * Gets the apellido2Usuario value for this GetDetalleVO.
     * 
     * @return apellido2Usuario
     */
    public java.lang.String getApellido2Usuario() {
        return apellido2Usuario;
    }


    /**
     * Sets the apellido2Usuario value for this GetDetalleVO.
     * 
     * @param apellido2Usuario
     */
    public void setApellido2Usuario(java.lang.String apellido2Usuario) {
        this.apellido2Usuario = apellido2Usuario;
    }


    /**
     * Gets the cargoBasico value for this GetDetalleVO.
     * 
     * @return cargoBasico
     */
    public java.lang.String getCargoBasico() {
        return cargoBasico;
    }


    /**
     * Sets the cargoBasico value for this GetDetalleVO.
     * 
     * @param cargoBasico
     */
    public void setCargoBasico(java.lang.String cargoBasico) {
        this.cargoBasico = cargoBasico;
    }


    /**
     * Gets the codCausaBaja value for this GetDetalleVO.
     * 
     * @return codCausaBaja
     */
    public java.lang.String getCodCausaBaja() {
        return codCausaBaja;
    }


    /**
     * Sets the codCausaBaja value for this GetDetalleVO.
     * 
     * @param codCausaBaja
     */
    public void setCodCausaBaja(java.lang.String codCausaBaja) {
        this.codCausaBaja = codCausaBaja;
    }


    /**
     * Gets the codCliente value for this GetDetalleVO.
     * 
     * @return codCliente
     */
    public int getCodCliente() {
        return codCliente;
    }


    /**
     * Sets the codCliente value for this GetDetalleVO.
     * 
     * @param codCliente
     */
    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }


    /**
     * Gets the codClienteDistribuidor value for this GetDetalleVO.
     * 
     * @return codClienteDistribuidor
     */
    public int getCodClienteDistribuidor() {
        return codClienteDistribuidor;
    }


    /**
     * Sets the codClienteDistribuidor value for this GetDetalleVO.
     * 
     * @param codClienteDistribuidor
     */
    public void setCodClienteDistribuidor(int codClienteDistribuidor) {
        this.codClienteDistribuidor = codClienteDistribuidor;
    }


    /**
     * Gets the codCuenta value for this GetDetalleVO.
     * 
     * @return codCuenta
     */
    public int getCodCuenta() {
        return codCuenta;
    }


    /**
     * Sets the codCuenta value for this GetDetalleVO.
     * 
     * @param codCuenta
     */
    public void setCodCuenta(int codCuenta) {
        this.codCuenta = codCuenta;
    }


    /**
     * Gets the codModelo value for this GetDetalleVO.
     * 
     * @return codModelo
     */
    public java.lang.String getCodModelo() {
        return codModelo;
    }


    /**
     * Sets the codModelo value for this GetDetalleVO.
     * 
     * @param codModelo
     */
    public void setCodModelo(java.lang.String codModelo) {
        this.codModelo = codModelo;
    }


    /**
     * Gets the codSituacion value for this GetDetalleVO.
     * 
     * @return codSituacion
     */
    public java.lang.String getCodSituacion() {
        return codSituacion;
    }


    /**
     * Sets the codSituacion value for this GetDetalleVO.
     * 
     * @param codSituacion
     */
    public void setCodSituacion(java.lang.String codSituacion) {
        this.codSituacion = codSituacion;
    }


    /**
     * Gets the codTecnologia value for this GetDetalleVO.
     * 
     * @return codTecnologia
     */
    public java.lang.String getCodTecnologia() {
        return codTecnologia;
    }


    /**
     * Sets the codTecnologia value for this GetDetalleVO.
     * 
     * @param codTecnologia
     */
    public void setCodTecnologia(java.lang.String codTecnologia) {
        this.codTecnologia = codTecnologia;
    }


    /**
     * Gets the codVendedor value for this GetDetalleVO.
     * 
     * @return codVendedor
     */
    public int getCodVendedor() {
        return codVendedor;
    }


    /**
     * Sets the codVendedor value for this GetDetalleVO.
     * 
     * @param codVendedor
     */
    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }


    /**
     * Gets the codciclo value for this GetDetalleVO.
     * 
     * @return codciclo
     */
    public int getCodciclo() {
        return codciclo;
    }


    /**
     * Sets the codciclo value for this GetDetalleVO.
     * 
     * @param codciclo
     */
    public void setCodciclo(int codciclo) {
        this.codciclo = codciclo;
    }


    /**
     * Gets the codigoPlan value for this GetDetalleVO.
     * 
     * @return codigoPlan
     */
    public java.lang.String getCodigoPlan() {
        return codigoPlan;
    }


    /**
     * Sets the codigoPlan value for this GetDetalleVO.
     * 
     * @param codigoPlan
     */
    public void setCodigoPlan(java.lang.String codigoPlan) {
        this.codigoPlan = codigoPlan;
    }


    /**
     * Gets the codigoRetorno value for this GetDetalleVO.
     * 
     * @return codigoRetorno
     */
    public int getCodigoRetorno() {
        return codigoRetorno;
    }


    /**
     * Sets the codigoRetorno value for this GetDetalleVO.
     * 
     * @param codigoRetorno
     */
    public void setCodigoRetorno(int codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }


    /**
     * Gets the descCausaBaja value for this GetDetalleVO.
     * 
     * @return descCausaBaja
     */
    public java.lang.String getDescCausaBaja() {
        return descCausaBaja;
    }


    /**
     * Sets the descCausaBaja value for this GetDetalleVO.
     * 
     * @param descCausaBaja
     */
    public void setDescCausaBaja(java.lang.String descCausaBaja) {
        this.descCausaBaja = descCausaBaja;
    }


    /**
     * Gets the descFabricante value for this GetDetalleVO.
     * 
     * @return descFabricante
     */
    public java.lang.String getDescFabricante() {
        return descFabricante;
    }


    /**
     * Sets the descFabricante value for this GetDetalleVO.
     * 
     * @param descFabricante
     */
    public void setDescFabricante(java.lang.String descFabricante) {
        this.descFabricante = descFabricante;
    }


    /**
     * Gets the descModVenta value for this GetDetalleVO.
     * 
     * @return descModVenta
     */
    public java.lang.String getDescModVenta() {
        return descModVenta;
    }


    /**
     * Sets the descModVenta value for this GetDetalleVO.
     * 
     * @param descModVenta
     */
    public void setDescModVenta(java.lang.String descModVenta) {
        this.descModVenta = descModVenta;
    }


    /**
     * Gets the descPlan value for this GetDetalleVO.
     * 
     * @return descPlan
     */
    public java.lang.String getDescPlan() {
        return descPlan;
    }


    /**
     * Sets the descPlan value for this GetDetalleVO.
     * 
     * @param descPlan
     */
    public void setDescPlan(java.lang.String descPlan) {
        this.descPlan = descPlan;
    }


    /**
     * Gets the descTipoContrato value for this GetDetalleVO.
     * 
     * @return descTipoContrato
     */
    public java.lang.String getDescTipoContrato() {
        return descTipoContrato;
    }


    /**
     * Sets the descTipoContrato value for this GetDetalleVO.
     * 
     * @param descTipoContrato
     */
    public void setDescTipoContrato(java.lang.String descTipoContrato) {
        this.descTipoContrato = descTipoContrato;
    }


    /**
     * Gets the diaFacturacion value for this GetDetalleVO.
     * 
     * @return diaFacturacion
     */
    public int getDiaFacturacion() {
        return diaFacturacion;
    }


    /**
     * Sets the diaFacturacion value for this GetDetalleVO.
     * 
     * @param diaFacturacion
     */
    public void setDiaFacturacion(int diaFacturacion) {
        this.diaFacturacion = diaFacturacion;
    }


    /**
     * Gets the fechaAlta value for this GetDetalleVO.
     * 
     * @return fechaAlta
     */
    public java.lang.String getFechaAlta() {
        return fechaAlta;
    }


    /**
     * Sets the fechaAlta value for this GetDetalleVO.
     * 
     * @param fechaAlta
     */
    public void setFechaAlta(java.lang.String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    /**
     * Gets the fechaAltaCentral value for this GetDetalleVO.
     * 
     * @return fechaAltaCentral
     */
    public java.lang.String getFechaAltaCentral() {
        return fechaAltaCentral;
    }


    /**
     * Sets the fechaAltaCentral value for this GetDetalleVO.
     * 
     * @param fechaAltaCentral
     */
    public void setFechaAltaCentral(java.lang.String fechaAltaCentral) {
        this.fechaAltaCentral = fechaAltaCentral;
    }


    /**
     * Gets the fechaBaja value for this GetDetalleVO.
     * 
     * @return fechaBaja
     */
    public java.lang.String getFechaBaja() {
        return fechaBaja;
    }


    /**
     * Sets the fechaBaja value for this GetDetalleVO.
     * 
     * @param fechaBaja
     */
    public void setFechaBaja(java.lang.String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }


    /**
     * Gets the fechaBajaCentral value for this GetDetalleVO.
     * 
     * @return fechaBajaCentral
     */
    public java.lang.String getFechaBajaCentral() {
        return fechaBajaCentral;
    }


    /**
     * Sets the fechaBajaCentral value for this GetDetalleVO.
     * 
     * @param fechaBajaCentral
     */
    public void setFechaBajaCentral(java.lang.String fechaBajaCentral) {
        this.fechaBajaCentral = fechaBajaCentral;
    }


    /**
     * Gets the fechaFinContrato value for this GetDetalleVO.
     * 
     * @return fechaFinContrato
     */
    public java.lang.String getFechaFinContrato() {
        return fechaFinContrato;
    }


    /**
     * Sets the fechaFinContrato value for this GetDetalleVO.
     * 
     * @param fechaFinContrato
     */
    public void setFechaFinContrato(java.lang.String fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }


    /**
     * Gets the fechaProrroga value for this GetDetalleVO.
     * 
     * @return fechaProrroga
     */
    public java.lang.String getFechaProrroga() {
        return fechaProrroga;
    }


    /**
     * Sets the fechaProrroga value for this GetDetalleVO.
     * 
     * @param fechaProrroga
     */
    public void setFechaProrroga(java.lang.String fechaProrroga) {
        this.fechaProrroga = fechaProrroga;
    }


    /**
     * Gets the listaBolsaAbonado value for this GetDetalleVO.
     * 
     * @return listaBolsaAbonado
     */
    public cl.movistar.osb.BolsaAbonadoVO[] getListaBolsaAbonado() {
        return listaBolsaAbonado;
    }


    /**
     * Sets the listaBolsaAbonado value for this GetDetalleVO.
     * 
     * @param listaBolsaAbonado
     */
    public void setListaBolsaAbonado(cl.movistar.osb.BolsaAbonadoVO[] listaBolsaAbonado) {
        this.listaBolsaAbonado = listaBolsaAbonado;
    }

    public cl.movistar.osb.BolsaAbonadoVO getListaBolsaAbonado(int i) {
        return this.listaBolsaAbonado[i];
    }

    public void setListaBolsaAbonado(int i, cl.movistar.osb.BolsaAbonadoVO _value) {
        this.listaBolsaAbonado[i] = _value;
    }


    /**
     * Gets the mensajeRetorno value for this GetDetalleVO.
     * 
     * @return mensajeRetorno
     */
    public java.lang.String getMensajeRetorno() {
        return mensajeRetorno;
    }


    /**
     * Sets the mensajeRetorno value for this GetDetalleVO.
     * 
     * @param mensajeRetorno
     */
    public void setMensajeRetorno(java.lang.String mensajeRetorno) {
        this.mensajeRetorno = mensajeRetorno;
    }


    /**
     * Gets the mesesContrato value for this GetDetalleVO.
     * 
     * @return mesesContrato
     */
    public int getMesesContrato() {
        return mesesContrato;
    }


    /**
     * Sets the mesesContrato value for this GetDetalleVO.
     * 
     * @param mesesContrato
     */
    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }


    /**
     * Gets the nombreCliente value for this GetDetalleVO.
     * 
     * @return nombreCliente
     */
    public java.lang.String getNombreCliente() {
        return nombreCliente;
    }


    /**
     * Sets the nombreCliente value for this GetDetalleVO.
     * 
     * @param nombreCliente
     */
    public void setNombreCliente(java.lang.String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }


    /**
     * Gets the nombreUsuario value for this GetDetalleVO.
     * 
     * @return nombreUsuario
     */
    public java.lang.String getNombreUsuario() {
        return nombreUsuario;
    }


    /**
     * Sets the nombreUsuario value for this GetDetalleVO.
     * 
     * @param nombreUsuario
     */
    public void setNombreUsuario(java.lang.String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }


    /**
     * Gets the numAbonado value for this GetDetalleVO.
     * 
     * @return numAbonado
     */
    public int getNumAbonado() {
        return numAbonado;
    }


    /**
     * Sets the numAbonado value for this GetDetalleVO.
     * 
     * @param numAbonado
     */
    public void setNumAbonado(int numAbonado) {
        this.numAbonado = numAbonado;
    }


    /**
     * Gets the numCelular value for this GetDetalleVO.
     * 
     * @return numCelular
     */
    public int getNumCelular() {
        return numCelular;
    }


    /**
     * Sets the numCelular value for this GetDetalleVO.
     * 
     * @param numCelular
     */
    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }


    /**
     * Gets the numIdentidad value for this GetDetalleVO.
     * 
     * @return numIdentidad
     */
    public java.lang.String getNumIdentidad() {
        return numIdentidad;
    }


    /**
     * Sets the numIdentidad value for this GetDetalleVO.
     * 
     * @param numIdentidad
     */
    public void setNumIdentidad(java.lang.String numIdentidad) {
        this.numIdentidad = numIdentidad;
    }


    /**
     * Gets the numOrden value for this GetDetalleVO.
     * 
     * @return numOrden
     */
    public int getNumOrden() {
        return numOrden;
    }


    /**
     * Sets the numOrden value for this GetDetalleVO.
     * 
     * @param numOrden
     */
    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }


    /**
     * Gets the numSerieInt value for this GetDetalleVO.
     * 
     * @return numSerieInt
     */
    public int getNumSerieInt() {
        return numSerieInt;
    }


    /**
     * Sets the numSerieInt value for this GetDetalleVO.
     * 
     * @param numSerieInt
     */
    public void setNumSerieInt(int numSerieInt) {
        this.numSerieInt = numSerieInt;
    }


    /**
     * Gets the numSerieStr value for this GetDetalleVO.
     * 
     * @return numSerieStr
     */
    public java.lang.String getNumSerieStr() {
        return numSerieStr;
    }


    /**
     * Sets the numSerieStr value for this GetDetalleVO.
     * 
     * @param numSerieStr
     */
    public void setNumSerieStr(java.lang.String numSerieStr) {
        this.numSerieStr = numSerieStr;
    }


    /**
     * Gets the primerApellido value for this GetDetalleVO.
     * 
     * @return primerApellido
     */
    public java.lang.String getPrimerApellido() {
        return primerApellido;
    }


    /**
     * Sets the primerApellido value for this GetDetalleVO.
     * 
     * @param primerApellido
     */
    public void setPrimerApellido(java.lang.String primerApellido) {
        this.primerApellido = primerApellido;
    }


    /**
     * Gets the segundoApellido value for this GetDetalleVO.
     * 
     * @return segundoApellido
     */
    public java.lang.String getSegundoApellido() {
        return segundoApellido;
    }


    /**
     * Sets the segundoApellido value for this GetDetalleVO.
     * 
     * @param segundoApellido
     */
    public void setSegundoApellido(java.lang.String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }


    /**
     * Gets the sexo value for this GetDetalleVO.
     * 
     * @return sexo
     */
    public java.lang.String getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this GetDetalleVO.
     * 
     * @param sexo
     */
    public void setSexo(java.lang.String sexo) {
        this.sexo = sexo;
    }


    /**
     * Gets the situacionAbonado value for this GetDetalleVO.
     * 
     * @return situacionAbonado
     */
    public java.lang.String getSituacionAbonado() {
        return situacionAbonado;
    }


    /**
     * Sets the situacionAbonado value for this GetDetalleVO.
     * 
     * @param situacionAbonado
     */
    public void setSituacionAbonado(java.lang.String situacionAbonado) {
        this.situacionAbonado = situacionAbonado;
    }


    /**
     * Gets the tipoAbonado value for this GetDetalleVO.
     * 
     * @return tipoAbonado
     */
    public java.lang.String getTipoAbonado() {
        return tipoAbonado;
    }


    /**
     * Sets the tipoAbonado value for this GetDetalleVO.
     * 
     * @param tipoAbonado
     */
    public void setTipoAbonado(java.lang.String tipoAbonado) {
        this.tipoAbonado = tipoAbonado;
    }


    /**
     * Gets the tipoIdentidad value for this GetDetalleVO.
     * 
     * @return tipoIdentidad
     */
    public java.lang.String getTipoIdentidad() {
        return tipoIdentidad;
    }


    /**
     * Sets the tipoIdentidad value for this GetDetalleVO.
     * 
     * @param tipoIdentidad
     */
    public void setTipoIdentidad(java.lang.String tipoIdentidad) {
        this.tipoIdentidad = tipoIdentidad;
    }


    /**
     * Gets the tipoPlan value for this GetDetalleVO.
     * 
     * @return tipoPlan
     */
    public java.lang.String getTipoPlan() {
        return tipoPlan;
    }


    /**
     * Sets the tipoPlan value for this GetDetalleVO.
     * 
     * @param tipoPlan
     */
    public void setTipoPlan(java.lang.String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }


    /**
     * Gets the valorCliente value for this GetDetalleVO.
     * 
     * @return valorCliente
     */
    public java.lang.String getValorCliente() {
        return valorCliente;
    }


    /**
     * Sets the valorCliente value for this GetDetalleVO.
     * 
     * @param valorCliente
     */
    public void setValorCliente(java.lang.String valorCliente) {
        this.valorCliente = valorCliente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDetalleVO)) return false;
        GetDetalleVO other = (GetDetalleVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apellido1Usuario==null && other.getApellido1Usuario()==null) || 
             (this.apellido1Usuario!=null &&
              this.apellido1Usuario.equals(other.getApellido1Usuario()))) &&
            ((this.apellido2Usuario==null && other.getApellido2Usuario()==null) || 
             (this.apellido2Usuario!=null &&
              this.apellido2Usuario.equals(other.getApellido2Usuario()))) &&
            ((this.cargoBasico==null && other.getCargoBasico()==null) || 
             (this.cargoBasico!=null &&
              this.cargoBasico.equals(other.getCargoBasico()))) &&
            ((this.codCausaBaja==null && other.getCodCausaBaja()==null) || 
             (this.codCausaBaja!=null &&
              this.codCausaBaja.equals(other.getCodCausaBaja()))) &&
            this.codCliente == other.getCodCliente() &&
            this.codClienteDistribuidor == other.getCodClienteDistribuidor() &&
            this.codCuenta == other.getCodCuenta() &&
            ((this.codModelo==null && other.getCodModelo()==null) || 
             (this.codModelo!=null &&
              this.codModelo.equals(other.getCodModelo()))) &&
            ((this.codSituacion==null && other.getCodSituacion()==null) || 
             (this.codSituacion!=null &&
              this.codSituacion.equals(other.getCodSituacion()))) &&
            ((this.codTecnologia==null && other.getCodTecnologia()==null) || 
             (this.codTecnologia!=null &&
              this.codTecnologia.equals(other.getCodTecnologia()))) &&
            this.codVendedor == other.getCodVendedor() &&
            this.codciclo == other.getCodciclo() &&
            ((this.codigoPlan==null && other.getCodigoPlan()==null) || 
             (this.codigoPlan!=null &&
              this.codigoPlan.equals(other.getCodigoPlan()))) &&
            this.codigoRetorno == other.getCodigoRetorno() &&
            ((this.descCausaBaja==null && other.getDescCausaBaja()==null) || 
             (this.descCausaBaja!=null &&
              this.descCausaBaja.equals(other.getDescCausaBaja()))) &&
            ((this.descFabricante==null && other.getDescFabricante()==null) || 
             (this.descFabricante!=null &&
              this.descFabricante.equals(other.getDescFabricante()))) &&
            ((this.descModVenta==null && other.getDescModVenta()==null) || 
             (this.descModVenta!=null &&
              this.descModVenta.equals(other.getDescModVenta()))) &&
            ((this.descPlan==null && other.getDescPlan()==null) || 
             (this.descPlan!=null &&
              this.descPlan.equals(other.getDescPlan()))) &&
            ((this.descTipoContrato==null && other.getDescTipoContrato()==null) || 
             (this.descTipoContrato!=null &&
              this.descTipoContrato.equals(other.getDescTipoContrato()))) &&
            this.diaFacturacion == other.getDiaFacturacion() &&
            ((this.fechaAlta==null && other.getFechaAlta()==null) || 
             (this.fechaAlta!=null &&
              this.fechaAlta.equals(other.getFechaAlta()))) &&
            ((this.fechaAltaCentral==null && other.getFechaAltaCentral()==null) || 
             (this.fechaAltaCentral!=null &&
              this.fechaAltaCentral.equals(other.getFechaAltaCentral()))) &&
            ((this.fechaBaja==null && other.getFechaBaja()==null) || 
             (this.fechaBaja!=null &&
              this.fechaBaja.equals(other.getFechaBaja()))) &&
            ((this.fechaBajaCentral==null && other.getFechaBajaCentral()==null) || 
             (this.fechaBajaCentral!=null &&
              this.fechaBajaCentral.equals(other.getFechaBajaCentral()))) &&
            ((this.fechaFinContrato==null && other.getFechaFinContrato()==null) || 
             (this.fechaFinContrato!=null &&
              this.fechaFinContrato.equals(other.getFechaFinContrato()))) &&
            ((this.fechaProrroga==null && other.getFechaProrroga()==null) || 
             (this.fechaProrroga!=null &&
              this.fechaProrroga.equals(other.getFechaProrroga()))) &&
            ((this.listaBolsaAbonado==null && other.getListaBolsaAbonado()==null) || 
             (this.listaBolsaAbonado!=null &&
              java.util.Arrays.equals(this.listaBolsaAbonado, other.getListaBolsaAbonado()))) &&
            ((this.mensajeRetorno==null && other.getMensajeRetorno()==null) || 
             (this.mensajeRetorno!=null &&
              this.mensajeRetorno.equals(other.getMensajeRetorno()))) &&
            this.mesesContrato == other.getMesesContrato() &&
            ((this.nombreCliente==null && other.getNombreCliente()==null) || 
             (this.nombreCliente!=null &&
              this.nombreCliente.equals(other.getNombreCliente()))) &&
            ((this.nombreUsuario==null && other.getNombreUsuario()==null) || 
             (this.nombreUsuario!=null &&
              this.nombreUsuario.equals(other.getNombreUsuario()))) &&
            this.numAbonado == other.getNumAbonado() &&
            this.numCelular == other.getNumCelular() &&
            ((this.numIdentidad==null && other.getNumIdentidad()==null) || 
             (this.numIdentidad!=null &&
              this.numIdentidad.equals(other.getNumIdentidad()))) &&
            this.numOrden == other.getNumOrden() &&
            this.numSerieInt == other.getNumSerieInt() &&
            ((this.numSerieStr==null && other.getNumSerieStr()==null) || 
             (this.numSerieStr!=null &&
              this.numSerieStr.equals(other.getNumSerieStr()))) &&
            ((this.primerApellido==null && other.getPrimerApellido()==null) || 
             (this.primerApellido!=null &&
              this.primerApellido.equals(other.getPrimerApellido()))) &&
            ((this.segundoApellido==null && other.getSegundoApellido()==null) || 
             (this.segundoApellido!=null &&
              this.segundoApellido.equals(other.getSegundoApellido()))) &&
            ((this.sexo==null && other.getSexo()==null) || 
             (this.sexo!=null &&
              this.sexo.equals(other.getSexo()))) &&
            ((this.situacionAbonado==null && other.getSituacionAbonado()==null) || 
             (this.situacionAbonado!=null &&
              this.situacionAbonado.equals(other.getSituacionAbonado()))) &&
            ((this.tipoAbonado==null && other.getTipoAbonado()==null) || 
             (this.tipoAbonado!=null &&
              this.tipoAbonado.equals(other.getTipoAbonado()))) &&
            ((this.tipoIdentidad==null && other.getTipoIdentidad()==null) || 
             (this.tipoIdentidad!=null &&
              this.tipoIdentidad.equals(other.getTipoIdentidad()))) &&
            ((this.tipoPlan==null && other.getTipoPlan()==null) || 
             (this.tipoPlan!=null &&
              this.tipoPlan.equals(other.getTipoPlan()))) &&
            ((this.valorCliente==null && other.getValorCliente()==null) || 
             (this.valorCliente!=null &&
              this.valorCliente.equals(other.getValorCliente())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getApellido1Usuario() != null) {
            _hashCode += getApellido1Usuario().hashCode();
        }
        if (getApellido2Usuario() != null) {
            _hashCode += getApellido2Usuario().hashCode();
        }
        if (getCargoBasico() != null) {
            _hashCode += getCargoBasico().hashCode();
        }
        if (getCodCausaBaja() != null) {
            _hashCode += getCodCausaBaja().hashCode();
        }
        _hashCode += getCodCliente();
        _hashCode += getCodClienteDistribuidor();
        _hashCode += getCodCuenta();
        if (getCodModelo() != null) {
            _hashCode += getCodModelo().hashCode();
        }
        if (getCodSituacion() != null) {
            _hashCode += getCodSituacion().hashCode();
        }
        if (getCodTecnologia() != null) {
            _hashCode += getCodTecnologia().hashCode();
        }
        _hashCode += getCodVendedor();
        _hashCode += getCodciclo();
        if (getCodigoPlan() != null) {
            _hashCode += getCodigoPlan().hashCode();
        }
        _hashCode += getCodigoRetorno();
        if (getDescCausaBaja() != null) {
            _hashCode += getDescCausaBaja().hashCode();
        }
        if (getDescFabricante() != null) {
            _hashCode += getDescFabricante().hashCode();
        }
        if (getDescModVenta() != null) {
            _hashCode += getDescModVenta().hashCode();
        }
        if (getDescPlan() != null) {
            _hashCode += getDescPlan().hashCode();
        }
        if (getDescTipoContrato() != null) {
            _hashCode += getDescTipoContrato().hashCode();
        }
        _hashCode += getDiaFacturacion();
        if (getFechaAlta() != null) {
            _hashCode += getFechaAlta().hashCode();
        }
        if (getFechaAltaCentral() != null) {
            _hashCode += getFechaAltaCentral().hashCode();
        }
        if (getFechaBaja() != null) {
            _hashCode += getFechaBaja().hashCode();
        }
        if (getFechaBajaCentral() != null) {
            _hashCode += getFechaBajaCentral().hashCode();
        }
        if (getFechaFinContrato() != null) {
            _hashCode += getFechaFinContrato().hashCode();
        }
        if (getFechaProrroga() != null) {
            _hashCode += getFechaProrroga().hashCode();
        }
        if (getListaBolsaAbonado() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaBolsaAbonado());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaBolsaAbonado(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMensajeRetorno() != null) {
            _hashCode += getMensajeRetorno().hashCode();
        }
        _hashCode += getMesesContrato();
        if (getNombreCliente() != null) {
            _hashCode += getNombreCliente().hashCode();
        }
        if (getNombreUsuario() != null) {
            _hashCode += getNombreUsuario().hashCode();
        }
        _hashCode += getNumAbonado();
        _hashCode += getNumCelular();
        if (getNumIdentidad() != null) {
            _hashCode += getNumIdentidad().hashCode();
        }
        _hashCode += getNumOrden();
        _hashCode += getNumSerieInt();
        if (getNumSerieStr() != null) {
            _hashCode += getNumSerieStr().hashCode();
        }
        if (getPrimerApellido() != null) {
            _hashCode += getPrimerApellido().hashCode();
        }
        if (getSegundoApellido() != null) {
            _hashCode += getSegundoApellido().hashCode();
        }
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        if (getSituacionAbonado() != null) {
            _hashCode += getSituacionAbonado().hashCode();
        }
        if (getTipoAbonado() != null) {
            _hashCode += getTipoAbonado().hashCode();
        }
        if (getTipoIdentidad() != null) {
            _hashCode += getTipoIdentidad().hashCode();
        }
        if (getTipoPlan() != null) {
            _hashCode += getTipoPlan().hashCode();
        }
        if (getValorCliente() != null) {
            _hashCode += getValorCliente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDetalleVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://osb.movistar.cl/", "getDetalleVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido1Usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellido1Usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido2Usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellido2Usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoBasico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoBasico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCausaBaja");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codCausaBaja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codClienteDistribuidor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codClienteDistribuidor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codModelo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codModelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codSituacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codSituacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codTecnologia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codTecnologia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codVendedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codVendedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codciclo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codciclo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descCausaBaja");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descCausaBaja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descFabricante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descFabricante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descModVenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descModVenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descTipoContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descTipoContrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diaFacturacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diaFacturacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAlta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaAlta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAltaCentral");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaAltaCentral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaBaja");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaBaja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaBajaCentral");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaBajaCentral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaFinContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaFinContrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaProrroga");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaProrroga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaBolsaAbonado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaBolsaAbonado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://osb.movistar.cl/", "bolsaAbonadoVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajeRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensajeRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesesContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mesesContrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numAbonado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numAbonado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCelular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numCelular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numIdentidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numIdentidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOrden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numOrden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSerieInt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numSerieInt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSerieStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numSerieStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primerApellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primerApellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segundoApellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segundoApellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacionAbonado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "situacionAbonado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoAbonado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoAbonado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIdentidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoIdentidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
