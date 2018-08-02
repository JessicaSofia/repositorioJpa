package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the IMPUESTO_RENTA database table.
 * 
 */
@Entity
@Table(name="IMPUESTO_RENTA")
@NamedQuery(name="ImpuestoRenta.findAll", query="SELECT i FROM ImpuestoRenta i")
public class ImpuestoRenta implements Serializable {
	private static final long serialVersionUID = 1L;
	private long imrnId;
	private BigDecimal imrnAlimentacion;
	private BigDecimal imrnAnio;
	private BigDecimal imrnEducacion;
	private BigDecimal imrnEstado;
	private Timestamp imrnFechaCreacion;
	private BigDecimal imrnFraccionBasica;
	private BigDecimal imrnImpuestoFraccionBasica;
	private BigDecimal imrnImpuestoPagar;
	private BigDecimal imrnIngresosAnuales;
	private BigDecimal imrnIngresosMensuales;
	private BigDecimal imrnIngresosOtros;
	private BigDecimal imrnSalud;
	private BigDecimal imrnTotalDeducible;
	private BigDecimal imrnTotalEmpleador;
	private BigDecimal imrnTotalGastos;
	private BigDecimal imrnVestimenta;
	private BigDecimal imrnVivienda;
	private Persona persona;

	public ImpuestoRenta() {
	}


	@Id
	@SequenceGenerator(name="IMPUESTO_RENTA_IMRNID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IMPUESTO_RENTA_IMRNID_GENERATOR")
	@Column(name="IMRN_ID")
	public long getImrnId() {
		return this.imrnId;
	}

	public void setImrnId(long imrnId) {
		this.imrnId = imrnId;
	}


	@Column(name="IMRN_ALIMENTACION")
	public BigDecimal getImrnAlimentacion() {
		return this.imrnAlimentacion;
	}

	public void setImrnAlimentacion(BigDecimal imrnAlimentacion) {
		this.imrnAlimentacion = imrnAlimentacion;
	}


	@Column(name="IMRN_ANIO")
	public BigDecimal getImrnAnio() {
		return this.imrnAnio;
	}

	public void setImrnAnio(BigDecimal imrnAnio) {
		this.imrnAnio = imrnAnio;
	}


	@Column(name="IMRN_EDUCACION")
	public BigDecimal getImrnEducacion() {
		return this.imrnEducacion;
	}

	public void setImrnEducacion(BigDecimal imrnEducacion) {
		this.imrnEducacion = imrnEducacion;
	}


	@Column(name="IMRN_ESTADO")
	public BigDecimal getImrnEstado() {
		return this.imrnEstado;
	}

	public void setImrnEstado(BigDecimal imrnEstado) {
		this.imrnEstado = imrnEstado;
	}


	@Column(name="IMRN_FECHA_CREACION")
	public Timestamp getImrnFechaCreacion() {
		return this.imrnFechaCreacion;
	}

	public void setImrnFechaCreacion(Timestamp imrnFechaCreacion) {
		this.imrnFechaCreacion = imrnFechaCreacion;
	}


	@Column(name="IMRN_FRACCION_BASICA")
	public BigDecimal getImrnFraccionBasica() {
		return this.imrnFraccionBasica;
	}

	public void setImrnFraccionBasica(BigDecimal imrnFraccionBasica) {
		this.imrnFraccionBasica = imrnFraccionBasica;
	}


	@Column(name="IMRN_IMPUESTO_FRACCION_BASICA")
	public BigDecimal getImrnImpuestoFraccionBasica() {
		return this.imrnImpuestoFraccionBasica;
	}

	public void setImrnImpuestoFraccionBasica(BigDecimal imrnImpuestoFraccionBasica) {
		this.imrnImpuestoFraccionBasica = imrnImpuestoFraccionBasica;
	}


	@Column(name="IMRN_IMPUESTO_PAGAR")
	public BigDecimal getImrnImpuestoPagar() {
		return this.imrnImpuestoPagar;
	}

	public void setImrnImpuestoPagar(BigDecimal imrnImpuestoPagar) {
		this.imrnImpuestoPagar = imrnImpuestoPagar;
	}


	@Column(name="IMRN_INGRESOS_ANUALES")
	public BigDecimal getImrnIngresosAnuales() {
		return this.imrnIngresosAnuales;
	}

	public void setImrnIngresosAnuales(BigDecimal imrnIngresosAnuales) {
		this.imrnIngresosAnuales = imrnIngresosAnuales;
	}


	@Column(name="IMRN_INGRESOS_MENSUALES")
	public BigDecimal getImrnIngresosMensuales() {
		return this.imrnIngresosMensuales;
	}

	public void setImrnIngresosMensuales(BigDecimal imrnIngresosMensuales) {
		this.imrnIngresosMensuales = imrnIngresosMensuales;
	}


	@Column(name="IMRN_INGRESOS_OTROS")
	public BigDecimal getImrnIngresosOtros() {
		return this.imrnIngresosOtros;
	}

	public void setImrnIngresosOtros(BigDecimal imrnIngresosOtros) {
		this.imrnIngresosOtros = imrnIngresosOtros;
	}


	@Column(name="IMRN_SALUD")
	public BigDecimal getImrnSalud() {
		return this.imrnSalud;
	}

	public void setImrnSalud(BigDecimal imrnSalud) {
		this.imrnSalud = imrnSalud;
	}


	@Column(name="IMRN_TOTAL_DEDUCIBLE")
	public BigDecimal getImrnTotalDeducible() {
		return this.imrnTotalDeducible;
	}

	public void setImrnTotalDeducible(BigDecimal imrnTotalDeducible) {
		this.imrnTotalDeducible = imrnTotalDeducible;
	}


	@Column(name="IMRN_TOTAL_EMPLEADOR")
	public BigDecimal getImrnTotalEmpleador() {
		return this.imrnTotalEmpleador;
	}

	public void setImrnTotalEmpleador(BigDecimal imrnTotalEmpleador) {
		this.imrnTotalEmpleador = imrnTotalEmpleador;
	}


	@Column(name="IMRN_TOTAL_GASTOS")
	public BigDecimal getImrnTotalGastos() {
		return this.imrnTotalGastos;
	}

	public void setImrnTotalGastos(BigDecimal imrnTotalGastos) {
		this.imrnTotalGastos = imrnTotalGastos;
	}


	@Column(name="IMRN_VESTIMENTA")
	public BigDecimal getImrnVestimenta() {
		return this.imrnVestimenta;
	}

	public void setImrnVestimenta(BigDecimal imrnVestimenta) {
		this.imrnVestimenta = imrnVestimenta;
	}


	@Column(name="IMRN_VIVIENDA")
	public BigDecimal getImrnVivienda() {
		return this.imrnVivienda;
	}

	public void setImrnVivienda(BigDecimal imrnVivienda) {
		this.imrnVivienda = imrnVivienda;
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