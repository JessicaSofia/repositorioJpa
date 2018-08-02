package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DESCUENTO database table.
 * 
 */
@Entity
@NamedQuery(name="Descuento.findAll", query="SELECT d FROM Descuento d")
public class Descuento implements Serializable {
	private static final long serialVersionUID = 1L;
	private long dscId;
	private String dscCodigoInternoNomina;
	private String dscDescripcion;
	private BigDecimal dscEstado;
	private BigDecimal dscMonto;
	private BigDecimal dscPorcentaje;
	private BigDecimal dscPrioridad;
	private BigDecimal dscTemporalidad;
	private BigDecimal dscTipo;
	private Date dscTmpFechaFin;
	private Date dscTmpFechaInicio;
	private List<AcreedorDescuento> acreedorDescuentos;

	public Descuento() {
	}


	@Id
	@SequenceGenerator(name="DESCUENTO_DSCID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DESCUENTO_DSCID_GENERATOR")
	@Column(name="DSC_ID")
	public long getDscId() {
		return this.dscId;
	}

	public void setDscId(long dscId) {
		this.dscId = dscId;
	}


	@Column(name="DSC_CODIGO_INTERNO_NOMINA")
	public String getDscCodigoInternoNomina() {
		return this.dscCodigoInternoNomina;
	}

	public void setDscCodigoInternoNomina(String dscCodigoInternoNomina) {
		this.dscCodigoInternoNomina = dscCodigoInternoNomina;
	}


	@Column(name="DSC_DESCRIPCION")
	public String getDscDescripcion() {
		return this.dscDescripcion;
	}

	public void setDscDescripcion(String dscDescripcion) {
		this.dscDescripcion = dscDescripcion;
	}


	@Column(name="DSC_ESTADO")
	public BigDecimal getDscEstado() {
		return this.dscEstado;
	}

	public void setDscEstado(BigDecimal dscEstado) {
		this.dscEstado = dscEstado;
	}


	@Column(name="DSC_MONTO")
	public BigDecimal getDscMonto() {
		return this.dscMonto;
	}

	public void setDscMonto(BigDecimal dscMonto) {
		this.dscMonto = dscMonto;
	}


	@Column(name="DSC_PORCENTAJE")
	public BigDecimal getDscPorcentaje() {
		return this.dscPorcentaje;
	}

	public void setDscPorcentaje(BigDecimal dscPorcentaje) {
		this.dscPorcentaje = dscPorcentaje;
	}


	@Column(name="DSC_PRIORIDAD")
	public BigDecimal getDscPrioridad() {
		return this.dscPrioridad;
	}

	public void setDscPrioridad(BigDecimal dscPrioridad) {
		this.dscPrioridad = dscPrioridad;
	}


	@Column(name="DSC_TEMPORALIDAD")
	public BigDecimal getDscTemporalidad() {
		return this.dscTemporalidad;
	}

	public void setDscTemporalidad(BigDecimal dscTemporalidad) {
		this.dscTemporalidad = dscTemporalidad;
	}


	@Column(name="DSC_TIPO")
	public BigDecimal getDscTipo() {
		return this.dscTipo;
	}

	public void setDscTipo(BigDecimal dscTipo) {
		this.dscTipo = dscTipo;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="DSC_TMP_FECHA_FIN")
	public Date getDscTmpFechaFin() {
		return this.dscTmpFechaFin;
	}

	public void setDscTmpFechaFin(Date dscTmpFechaFin) {
		this.dscTmpFechaFin = dscTmpFechaFin;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="DSC_TMP_FECHA_INICIO")
	public Date getDscTmpFechaInicio() {
		return this.dscTmpFechaInicio;
	}

	public void setDscTmpFechaInicio(Date dscTmpFechaInicio) {
		this.dscTmpFechaInicio = dscTmpFechaInicio;
	}


	//bi-directional many-to-one association to AcreedorDescuento
	@OneToMany(mappedBy="descuento", fetch=FetchType.EAGER)
	public List<AcreedorDescuento> getAcreedorDescuentos() {
		return this.acreedorDescuentos;
	}

	public void setAcreedorDescuentos(List<AcreedorDescuento> acreedorDescuentos) {
		this.acreedorDescuentos = acreedorDescuentos;
	}

	public AcreedorDescuento addAcreedorDescuento(AcreedorDescuento acreedorDescuento) {
		getAcreedorDescuentos().add(acreedorDescuento);
		acreedorDescuento.setDescuento(this);

		return acreedorDescuento;
	}

	public AcreedorDescuento removeAcreedorDescuento(AcreedorDescuento acreedorDescuento) {
		getAcreedorDescuentos().remove(acreedorDescuento);
		acreedorDescuento.setDescuento(null);

		return acreedorDescuento;
	}

}