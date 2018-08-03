 package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CODIGO_NOMINA database table.
 * 
 */
@Entity
@Table(name="CODIGO_NOMINA")
@NamedQuery(name="CodigoNomina.findAll", query="SELECT c FROM CodigoNomina c")
public class CodigoNomina implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cdnmId;
	private String cdnmCodigoNomina;
	private String cdnmCodigoPlanilla;
	private String cdnmDependencia;
	private BigDecimal cdnmEstado;
	private BigDecimal cdnmEstadoRevision;
	private BigDecimal cdnmEstadoRol;
	private Date cdnmFechaCreacion;
	private String cdnmFuncion;
	private String cdnmObservacion;
	private BigDecimal cdnmRmu;
	private BigDecimal cdnmSecuencial;
	private Persona persona;

	public CodigoNomina() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CDNM_ID")
	public long getCdnmId() {
		return this.cdnmId;
	}

	public void setCdnmId(long cdnmId) {
		this.cdnmId = cdnmId;
	}


	@Column(name="CDNM_CODIGO_NOMINA")
	public String getCdnmCodigoNomina() {
		return this.cdnmCodigoNomina;
	}

	public void setCdnmCodigoNomina(String cdnmCodigoNomina) {
		this.cdnmCodigoNomina = cdnmCodigoNomina;
	}


	@Column(name="CDNM_CODIGO_PLANILLA")
	public String getCdnmCodigoPlanilla() {
		return this.cdnmCodigoPlanilla;
	}

	public void setCdnmCodigoPlanilla(String cdnmCodigoPlanilla) {
		this.cdnmCodigoPlanilla = cdnmCodigoPlanilla;
	}


	@Column(name="CDNM_DEPENDENCIA")
	public String getCdnmDependencia() {
		return this.cdnmDependencia;
	}

	public void setCdnmDependencia(String cdnmDependencia) {
		this.cdnmDependencia = cdnmDependencia;
	}


	@Column(name="CDNM_ESTADO")
	public BigDecimal getCdnmEstado() {
		return this.cdnmEstado;
	}

	public void setCdnmEstado(BigDecimal cdnmEstado) {
		this.cdnmEstado = cdnmEstado;
	}


	@Column(name="CDNM_ESTADO_REVISION")
	public BigDecimal getCdnmEstadoRevision() {
		return this.cdnmEstadoRevision;
	}

	public void setCdnmEstadoRevision(BigDecimal cdnmEstadoRevision) {
		this.cdnmEstadoRevision = cdnmEstadoRevision;
	}


	@Column(name="CDNM_ESTADO_ROL")
	public BigDecimal getCdnmEstadoRol() {
		return this.cdnmEstadoRol;
	}

	public void setCdnmEstadoRol(BigDecimal cdnmEstadoRol) {
		this.cdnmEstadoRol = cdnmEstadoRol;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="CDNM_FECHA_CREACION")
	public Date getCdnmFechaCreacion() {
		return this.cdnmFechaCreacion;
	}

	public void setCdnmFechaCreacion(Date cdnmFechaCreacion) {
		this.cdnmFechaCreacion = cdnmFechaCreacion;
	}


	@Column(name="CDNM_FUNCION")
	public String getCdnmFuncion() {
		return this.cdnmFuncion;
	}

	public void setCdnmFuncion(String cdnmFuncion) {
		this.cdnmFuncion = cdnmFuncion;
	}


	@Column(name="CDNM_OBSERVACION")
	public String getCdnmObservacion() {
		return this.cdnmObservacion;
	}

	public void setCdnmObservacion(String cdnmObservacion) {
		this.cdnmObservacion = cdnmObservacion;
	}


	@Column(name="CDNM_RMU")
	public BigDecimal getCdnmRmu() {
		return this.cdnmRmu;
	}

	public void setCdnmRmu(BigDecimal cdnmRmu) {
		this.cdnmRmu = cdnmRmu;
	}


	@Column(name="CDNM_SECUENCIAL")
	public BigDecimal getCdnmSecuencial() {
		return this.cdnmSecuencial;
	}

	public void setCdnmSecuencial(BigDecimal cdnmSecuencial) {
		this.cdnmSecuencial = cdnmSecuencial;
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