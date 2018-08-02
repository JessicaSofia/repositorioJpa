package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the HISTORIAL_EMPLEADO database table.
 * 
 */
@Entity
@Table(name="HISTORIAL_EMPLEADO")
@NamedQuery(name="HistorialEmpleado.findAll", query="SELECT h FROM HistorialEmpleado h")
public class HistorialEmpleado implements Serializable {
	private static final long serialVersionUID = 1L;
	private long hsemId;
	private String hsemCntActividad;
	private String hsemCntCatedra;
	private String hsemCntCopia;
	private Date hsemCntFechaElaboracion;
	private Date hsemCntFechaFin;
	private Date hsemCntFechaInicio;
	private Date hsemCntFechaPedido;
	private String hsemCntNumeroContrato;
	private String hsemCntObservacion;
	private String hsemCntRefencia;
	private BigDecimal hsemCntRmu;
	private String hsemDetalle;
	private String hsemDpnDescripcion;
	private BigDecimal hsemDpnId;
	private BigDecimal hsemDtpsId;
	private Date hsemFechaVigencia;
	private BigDecimal hsemPridId;
	private String hsemPridIndividual;
	private String hsemPridPresupuestaria;
	private BigDecimal hsemPridSecuencial;
	private String hsemPstDenominacion;
	private BigDecimal hsemPstId;
	private String hsemResolucion;
	private String hsemTpcnDescripcion;
	private BigDecimal hsemTpcnId;
	private BigDecimal hsemTpcnTipo;
	private Persona persona;

	public HistorialEmpleado() {
	}


	@Id
	@SequenceGenerator(name="HISTORIAL_EMPLEADO_HSEMID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HISTORIAL_EMPLEADO_HSEMID_GENERATOR")
	@Column(name="HSEM_ID")
	public long getHsemId() {
		return this.hsemId;
	}

	public void setHsemId(long hsemId) {
		this.hsemId = hsemId;
	}


	@Column(name="HSEM_CNT_ACTIVIDAD")
	public String getHsemCntActividad() {
		return this.hsemCntActividad;
	}

	public void setHsemCntActividad(String hsemCntActividad) {
		this.hsemCntActividad = hsemCntActividad;
	}


	@Column(name="HSEM_CNT_CATEDRA")
	public String getHsemCntCatedra() {
		return this.hsemCntCatedra;
	}

	public void setHsemCntCatedra(String hsemCntCatedra) {
		this.hsemCntCatedra = hsemCntCatedra;
	}


	@Column(name="HSEM_CNT_COPIA")
	public String getHsemCntCopia() {
		return this.hsemCntCopia;
	}

	public void setHsemCntCopia(String hsemCntCopia) {
		this.hsemCntCopia = hsemCntCopia;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="HSEM_CNT_FECHA_ELABORACION")
	public Date getHsemCntFechaElaboracion() {
		return this.hsemCntFechaElaboracion;
	}

	public void setHsemCntFechaElaboracion(Date hsemCntFechaElaboracion) {
		this.hsemCntFechaElaboracion = hsemCntFechaElaboracion;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="HSEM_CNT_FECHA_FIN")
	public Date getHsemCntFechaFin() {
		return this.hsemCntFechaFin;
	}

	public void setHsemCntFechaFin(Date hsemCntFechaFin) {
		this.hsemCntFechaFin = hsemCntFechaFin;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="HSEM_CNT_FECHA_INICIO")
	public Date getHsemCntFechaInicio() {
		return this.hsemCntFechaInicio;
	}

	public void setHsemCntFechaInicio(Date hsemCntFechaInicio) {
		this.hsemCntFechaInicio = hsemCntFechaInicio;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="HSEM_CNT_FECHA_PEDIDO")
	public Date getHsemCntFechaPedido() {
		return this.hsemCntFechaPedido;
	}

	public void setHsemCntFechaPedido(Date hsemCntFechaPedido) {
		this.hsemCntFechaPedido = hsemCntFechaPedido;
	}


	@Column(name="HSEM_CNT_NUMERO_CONTRATO")
	public String getHsemCntNumeroContrato() {
		return this.hsemCntNumeroContrato;
	}

	public void setHsemCntNumeroContrato(String hsemCntNumeroContrato) {
		this.hsemCntNumeroContrato = hsemCntNumeroContrato;
	}


	@Column(name="HSEM_CNT_OBSERVACION")
	public String getHsemCntObservacion() {
		return this.hsemCntObservacion;
	}

	public void setHsemCntObservacion(String hsemCntObservacion) {
		this.hsemCntObservacion = hsemCntObservacion;
	}


	@Column(name="HSEM_CNT_REFENCIA")
	public String getHsemCntRefencia() {
		return this.hsemCntRefencia;
	}

	public void setHsemCntRefencia(String hsemCntRefencia) {
		this.hsemCntRefencia = hsemCntRefencia;
	}


	@Column(name="HSEM_CNT_RMU")
	public BigDecimal getHsemCntRmu() {
		return this.hsemCntRmu;
	}

	public void setHsemCntRmu(BigDecimal hsemCntRmu) {
		this.hsemCntRmu = hsemCntRmu;
	}


	@Column(name="HSEM_DETALLE")
	public String getHsemDetalle() {
		return this.hsemDetalle;
	}

	public void setHsemDetalle(String hsemDetalle) {
		this.hsemDetalle = hsemDetalle;
	}


	@Column(name="HSEM_DPN_DESCRIPCION")
	public String getHsemDpnDescripcion() {
		return this.hsemDpnDescripcion;
	}

	public void setHsemDpnDescripcion(String hsemDpnDescripcion) {
		this.hsemDpnDescripcion = hsemDpnDescripcion;
	}


	@Column(name="HSEM_DPN_ID")
	public BigDecimal getHsemDpnId() {
		return this.hsemDpnId;
	}

	public void setHsemDpnId(BigDecimal hsemDpnId) {
		this.hsemDpnId = hsemDpnId;
	}


	@Column(name="HSEM_DTPS_ID")
	public BigDecimal getHsemDtpsId() {
		return this.hsemDtpsId;
	}

	public void setHsemDtpsId(BigDecimal hsemDtpsId) {
		this.hsemDtpsId = hsemDtpsId;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="HSEM_FECHA_VIGENCIA")
	public Date getHsemFechaVigencia() {
		return this.hsemFechaVigencia;
	}

	public void setHsemFechaVigencia(Date hsemFechaVigencia) {
		this.hsemFechaVigencia = hsemFechaVigencia;
	}


	@Column(name="HSEM_PRID_ID")
	public BigDecimal getHsemPridId() {
		return this.hsemPridId;
	}

	public void setHsemPridId(BigDecimal hsemPridId) {
		this.hsemPridId = hsemPridId;
	}


	@Column(name="HSEM_PRID_INDIVIDUAL")
	public String getHsemPridIndividual() {
		return this.hsemPridIndividual;
	}

	public void setHsemPridIndividual(String hsemPridIndividual) {
		this.hsemPridIndividual = hsemPridIndividual;
	}


	@Column(name="HSEM_PRID_PRESUPUESTARIA")
	public String getHsemPridPresupuestaria() {
		return this.hsemPridPresupuestaria;
	}

	public void setHsemPridPresupuestaria(String hsemPridPresupuestaria) {
		this.hsemPridPresupuestaria = hsemPridPresupuestaria;
	}


	@Column(name="HSEM_PRID_SECUENCIAL")
	public BigDecimal getHsemPridSecuencial() {
		return this.hsemPridSecuencial;
	}

	public void setHsemPridSecuencial(BigDecimal hsemPridSecuencial) {
		this.hsemPridSecuencial = hsemPridSecuencial;
	}


	@Column(name="HSEM_PST_DENOMINACION")
	public String getHsemPstDenominacion() {
		return this.hsemPstDenominacion;
	}

	public void setHsemPstDenominacion(String hsemPstDenominacion) {
		this.hsemPstDenominacion = hsemPstDenominacion;
	}


	@Column(name="HSEM_PST_ID")
	public BigDecimal getHsemPstId() {
		return this.hsemPstId;
	}

	public void setHsemPstId(BigDecimal hsemPstId) {
		this.hsemPstId = hsemPstId;
	}


	@Column(name="HSEM_RESOLUCION")
	public String getHsemResolucion() {
		return this.hsemResolucion;
	}

	public void setHsemResolucion(String hsemResolucion) {
		this.hsemResolucion = hsemResolucion;
	}


	@Column(name="HSEM_TPCN_DESCRIPCION")
	public String getHsemTpcnDescripcion() {
		return this.hsemTpcnDescripcion;
	}

	public void setHsemTpcnDescripcion(String hsemTpcnDescripcion) {
		this.hsemTpcnDescripcion = hsemTpcnDescripcion;
	}


	@Column(name="HSEM_TPCN_ID")
	public BigDecimal getHsemTpcnId() {
		return this.hsemTpcnId;
	}

	public void setHsemTpcnId(BigDecimal hsemTpcnId) {
		this.hsemTpcnId = hsemTpcnId;
	}


	@Column(name="HSEM_TPCN_TIPO")
	public BigDecimal getHsemTpcnTipo() {
		return this.hsemTpcnTipo;
	}

	public void setHsemTpcnTipo(BigDecimal hsemTpcnTipo) {
		this.hsemTpcnTipo = hsemTpcnTipo;
	}


	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="PRS_ID")
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}