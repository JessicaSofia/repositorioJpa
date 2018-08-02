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
	private long dtpsId;
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
	@SequenceGenerator(name="DETALLE_PUESTO_DTPSID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DETALLE_PUESTO_DTPSID_GENERATOR")
	@Column(name="DTPS_ID")
	public long getDtpsId() {
		return this.dtpsId;
	}

	public void setDtpsId(long dtpsId) {
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
	@OneToMany(mappedBy="detallePuesto", fetch=FetchType.EAGER)
	public List<AccionPersonal> getAccionPersonals() {
		return this.accionPersonals;
	}

	public void setAccionPersonals(List<AccionPersonal> accionPersonals) {
		this.accionPersonals = accionPersonals;
	}

	public AccionPersonal addAccionPersonal(AccionPersonal accionPersonal) {
		getAccionPersonals().add(accionPersonal);
		accionPersonal.setDetallePuesto(this);

		return accionPersonal;
	}

	public AccionPersonal removeAccionPersonal(AccionPersonal accionPersonal) {
		getAccionPersonals().remove(accionPersonal);
		accionPersonal.setDetallePuesto(null);

		return accionPersonal;
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
	@OneToMany(mappedBy="detallePuesto", fetch=FetchType.EAGER)
	public List<DetallePuestoSancion> getDetallePuestoSancions() {
		return this.detallePuestoSancions;
	}

	public void setDetallePuestoSancions(List<DetallePuestoSancion> detallePuestoSancions) {
		this.detallePuestoSancions = detallePuestoSancions;
	}

	public DetallePuestoSancion addDetallePuestoSancion(DetallePuestoSancion detallePuestoSancion) {
		getDetallePuestoSancions().add(detallePuestoSancion);
		detallePuestoSancion.setDetallePuesto(this);

		return detallePuestoSancion;
	}

	public DetallePuestoSancion removeDetallePuestoSancion(DetallePuestoSancion detallePuestoSancion) {
		getDetallePuestoSancions().remove(detallePuestoSancion);
		detallePuestoSancion.setDetallePuesto(null);

		return detallePuestoSancion;
	}


	//bi-directional many-to-one association to Distributivo
	@OneToMany(mappedBy="detallePuesto", fetch=FetchType.EAGER)
	public List<Distributivo> getDistributivos() {
		return this.distributivos;
	}

	public void setDistributivos(List<Distributivo> distributivos) {
		this.distributivos = distributivos;
	}

	public Distributivo addDistributivo(Distributivo distributivo) {
		getDistributivos().add(distributivo);
		distributivo.setDetallePuesto(this);

		return distributivo;
	}

	public Distributivo removeDistributivo(Distributivo distributivo) {
		getDistributivos().remove(distributivo);
		distributivo.setDetallePuesto(null);

		return distributivo;
	}


	//bi-directional many-to-one association to SaldoVacacion
	@OneToMany(mappedBy="detallePuesto", fetch=FetchType.EAGER)
	public List<SaldoVacacion> getSaldoVacacions() {
		return this.saldoVacacions;
	}

	public void setSaldoVacacions(List<SaldoVacacion> saldoVacacions) {
		this.saldoVacacions = saldoVacacions;
	}

	public SaldoVacacion addSaldoVacacion(SaldoVacacion saldoVacacion) {
		getSaldoVacacions().add(saldoVacacion);
		saldoVacacion.setDetallePuesto(this);

		return saldoVacacion;
	}

	public SaldoVacacion removeSaldoVacacion(SaldoVacacion saldoVacacion) {
		getSaldoVacacions().remove(saldoVacacion);
		saldoVacacion.setDetallePuesto(null);

		return saldoVacacion;
	}


	//bi-directional many-to-one association to Vacacion
	@OneToMany(mappedBy="detallePuesto", fetch=FetchType.EAGER)
	public List<Vacacion> getVacacions() {
		return this.vacacions;
	}

	public void setVacacions(List<Vacacion> vacacions) {
		this.vacacions = vacacions;
	}

	public Vacacion addVacacion(Vacacion vacacion) {
		getVacacions().add(vacacion);
		vacacion.setDetallePuesto(this);

		return vacacion;
	}

	public Vacacion removeVacacion(Vacacion vacacion) {
		getVacacions().remove(vacacion);
		vacacion.setDetallePuesto(null);

		return vacacion;
	}


	//bi-directional many-to-one association to Permiso
	@OneToMany(mappedBy="detallePuesto", fetch=FetchType.EAGER)
	public List<Permiso> getPermisos() {
		return this.permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	public Permiso addPermiso(Permiso permiso) {
		getPermisos().add(permiso);
		permiso.setDetallePuesto(this);

		return permiso;
	}

	public Permiso removePermiso(Permiso permiso) {
		getPermisos().remove(permiso);
		permiso.setDetallePuesto(null);

		return permiso;
	}

}