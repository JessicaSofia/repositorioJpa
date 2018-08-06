package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the DETALLE_PUESTO database table.
 * 
 */
@Entity
@Table(name="DETALLE_PUESTO")
@NamedQuery(name="DetallePuesto.findAll", query="SELECT d FROM DetallePuesto d")
public class DetallePuesto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int dtpsId;
	private String dtpsDenominacion;
	private BigDecimal dtpsEstado;
	private BigDecimal dtpsRmu;
	private List<AccionPersonal> accionPersonals;
	private Contrato contrato;
	private Dependencia dependencia;
	private FichaEmpleado fichaEmpleado;
	private ModalidadLaboral modalidadLaboral;
	private NivelOcupacional nivelOcupacional;
	private PartidaIndividual partidaIndividual;
	private Puesto puesto;
	private RelacionLaboral relacionLaboral;
	private List<DetallePuestoSancion> detallePuestoSancions;
	private List<Distributivo> distributivos;
	private List<SaldoVacacion> saldoVacacions;
	private List<Vacacion> vacacions;
	private List<Permiso> permisos;

	public DetallePuesto() {
	}


	@Id
	@Column(name="DTPS_ID")
	public int getDtpsId() {
		return this.dtpsId;
	}

	public void setDtpsId(int dtpsId) {
		this.dtpsId = dtpsId;
	}


	@Column(name="DTPS_DENOMINACION")
	public String getDtpsDenominacion() {
		return this.dtpsDenominacion;
	}

	public void setDtpsDenominacion(String dtpsDenominacion) {
		this.dtpsDenominacion = dtpsDenominacion;
	}


	@Column(name="DTPS_ESTADO")
	public BigDecimal getDtpsEstado() {
		return this.dtpsEstado;
	}

	public void setDtpsEstado(BigDecimal dtpsEstado) {
		this.dtpsEstado = dtpsEstado;
	}


	@Column(name="DTPS_RMU")
	public BigDecimal getDtpsRmu() {
		return this.dtpsRmu;
	}

	public void setDtpsRmu(BigDecimal dtpsRmu) {
		this.dtpsRmu = dtpsRmu;
	}


	//bi-directional many-to-one association to AccionPersonal
	@OneToMany(mappedBy="detallePuesto", fetch=FetchType.LAZY)
	public List<AccionPersonal> getAccionPersonals() {
		return this.accionPersonals;
	}

	public void setAccionPersonals(List<AccionPersonal> accionPersonals) {
		this.accionPersonals = accionPersonals;
	}




	//bi-directional many-to-one association to Contrato
	@ManyToOne
	@JoinColumn(name="CNT_ID")
	public Contrato getContrato() {
		return this.contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}


	//bi-directional many-to-one association to Dependencia
	@ManyToOne
	@JoinColumn(name="DPN_ID")
	public Dependencia getDependencia() {
		return this.dependencia;
	}

	public void setDependencia(Dependencia dependencia) {
		this.dependencia = dependencia;
	}


	//bi-directional many-to-one association to FichaEmpleado
	@ManyToOne
	@JoinColumn(name="FCEM_ID")
	public FichaEmpleado getFichaEmpleado() {
		return this.fichaEmpleado;
	}

	public void setFichaEmpleado(FichaEmpleado fichaEmpleado) {
		this.fichaEmpleado = fichaEmpleado;
	}


	//bi-directional many-to-one association to ModalidadLaboral
	@ManyToOne
	@JoinColumn(name="MDLB_ID")
	public ModalidadLaboral getModalidadLaboral() {
		return this.modalidadLaboral;
	}

	public void setModalidadLaboral(ModalidadLaboral modalidadLaboral) {
		this.modalidadLaboral = modalidadLaboral;
	}


	//bi-directional many-to-one association to NivelOcupacional
	@ManyToOne
	@JoinColumn(name="NVOC_ID")
	public NivelOcupacional getNivelOcupacional() {
		return this.nivelOcupacional;
	}

	public void setNivelOcupacional(NivelOcupacional nivelOcupacional) {
		this.nivelOcupacional = nivelOcupacional;
	}


	//bi-directional many-to-one association to PartidaIndividual
	@ManyToOne
	@JoinColumn(name="PRID_ID")
	public PartidaIndividual getPartidaIndividual() {
		return this.partidaIndividual;
	}

	public void setPartidaIndividual(PartidaIndividual partidaIndividual) {
		this.partidaIndividual = partidaIndividual;
	}


	//bi-directional many-to-one association to Puesto
	@ManyToOne
	@JoinColumn(name="PST_ID")
	public Puesto getPuesto() {
		return this.puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}


	//bi-directional many-to-one association to RelacionLaboral
	@ManyToOne
	@JoinColumn(name="RLLB_ID")
	public RelacionLaboral getRelacionLaboral() {
		return this.relacionLaboral;
	}

	public void setRelacionLaboral(RelacionLaboral relacionLaboral) {
		this.relacionLaboral = relacionLaboral;
	}


	//bi-directional many-to-one association to DetallePuestoSancion
	@OneToMany(mappedBy="detallePuesto", fetch=FetchType.LAZY)
	public List<DetallePuestoSancion> getDetallePuestoSancions() {
		return this.detallePuestoSancions;
	}

	public void setDetallePuestoSancions(List<DetallePuestoSancion> detallePuestoSancions) {
		this.detallePuestoSancions = detallePuestoSancions;
	}



	//bi-directional many-to-one association to Distributivo
	@OneToMany(mappedBy="detallePuesto", fetch=FetchType.LAZY)
	public List<Distributivo> getDistributivos() {
		return this.distributivos;
	}

	public void setDistributivos(List<Distributivo> distributivos) {
		this.distributivos = distributivos;
	}

	//bi-directional many-to-one association to SaldoVacacion
	/*@OneToMany(mappedBy="detallePuesto", fetch=FetchType.LAZY)
	public List<SaldoVacacion> getSaldoVacacions() {
		return this.saldoVacacions;
	}

	public void setSaldoVacacions(List<SaldoVacacion> saldoVacacions) {
		this.saldoVacacions = saldoVacacions;
	}*/


	//bi-directional many-to-one association to Vacacion
	/*@OneToMany(mappedBy="detallePuesto", fetch=FetchType.LAZY)
	public List<Vacacion> getVacacions() {
		return this.vacacions;
	}

	public void setVacacions(List<Vacacion> vacacions) {
		this.vacacions = vacacions;
	}*/


	//bi-directional many-to-one association to Permiso
	/*@OneToMany(mappedBy="detallePuesto", fetch=FetchType.LAZY)
	public List<Permiso> getPermisos() {
		return this.permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}*/



}