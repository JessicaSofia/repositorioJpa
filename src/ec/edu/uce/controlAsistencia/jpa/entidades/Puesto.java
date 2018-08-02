package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PUESTO database table.
 * 
 */
@Entity
@NamedQuery(name="Puesto.findAll", query="SELECT p FROM Puesto p")
public class Puesto implements Serializable {
	private static final long serialVersionUID = 1L;
	private long pstId;
	private int nvjrId;
	private int pstAmbito;
	private String pstCodigo;
	private String pstDenominacion;
	private String pstDescripcionExperiencia;
	private int pstEstado;
	private Date pstFechaCreacion;
	private String pstInterfaz;
	private String pstMision;
	private int pstNivel;
	private int pstNivelRangoGradual;
	private String pstResponsabilidad;
	private int pstRmuDocente;
	private int pstRmuJerarquico;
	private int pstTipoPuesto;
	private List<ActividadPuesto> actividadPuestos;
	private List<CompetenciaPuesto> competenciaPuestos;
	private List<ConocimientoPuesto> conocimientoPuestos;
	private List<DestrezaPuesto> destrezaPuestos;
	private List<DetallePuesto> detallePuestos;
	private List<FuncionPuesto> funcionPuestos;
	private List<InstruccionPuesto> instruccionPuestos;
	private List<PartidaIndividual> partidaIndividuals;
	private CategoriaRango categoriaRango;
	private Grado grado;
	private GrupoOcupacional grupoOcupacional;
	private Regimen regimen;
	private Serie serie;
	private List<PuestoAreaConocimiento> puestoAreaConocimientos;
	private List<Tramite> tramites;

	public Puesto() {
	}


	@Id
	@SequenceGenerator(name="PUESTO_PSTID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PUESTO_PSTID_GENERATOR")
	@Column(name="PST_ID")
	public long getPstId() {
		return this.pstId;
	}

	public void setPstId(long pstId) {
		this.pstId = pstId;
	}


	@Column(name="NVJR_ID")
	public int getNvjrId() {
		return this.nvjrId;
	}

	public void setNvjrId(int nvjrId) {
		this.nvjrId = nvjrId;
	}


	@Column(name="PST_AMBITO")
	public int getPstAmbito() {
		return this.pstAmbito;
	}

	public void setPstAmbito(int pstAmbito) {
		this.pstAmbito = pstAmbito;
	}


	@Column(name="PST_CODIGO")
	public String getPstCodigo() {
		return this.pstCodigo;
	}

	public void setPstCodigo(String pstCodigo) {
		this.pstCodigo = pstCodigo;
	}


	@Column(name="PST_DENOMINACION")
	public String getPstDenominacion() {
		return this.pstDenominacion;
	}

	public void setPstDenominacion(String pstDenominacion) {
		this.pstDenominacion = pstDenominacion;
	}


	@Column(name="PST_DESCRIPCION_EXPERIENCIA")
	public String getPstDescripcionExperiencia() {
		return this.pstDescripcionExperiencia;
	}

	public void setPstDescripcionExperiencia(String pstDescripcionExperiencia) {
		this.pstDescripcionExperiencia = pstDescripcionExperiencia;
	}


	@Column(name="PST_ESTADO")
	public int getPstEstado() {
		return this.pstEstado;
	}

	public void setPstEstado(int pstEstado) {
		this.pstEstado = pstEstado;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="PST_FECHA_CREACION")
	public Date getPstFechaCreacion() {
		return this.pstFechaCreacion;
	}

	public void setPstFechaCreacion(Date pstFechaCreacion) {
		this.pstFechaCreacion = pstFechaCreacion;
	}


	@Column(name="PST_INTERFAZ")
	public String getPstInterfaz() {
		return this.pstInterfaz;
	}

	public void setPstInterfaz(String pstInterfaz) {
		this.pstInterfaz = pstInterfaz;
	}


	@Column(name="PST_MISION")
	public String getPstMision() {
		return this.pstMision;
	}

	public void setPstMision(String pstMision) {
		this.pstMision = pstMision;
	}


	@Column(name="PST_NIVEL")
	public int getPstNivel() {
		return this.pstNivel;
	}

	public void setPstNivel(int pstNivel) {
		this.pstNivel = pstNivel;
	}


	@Column(name="PST_NIVEL_RANGO_GRADUAL")
	public int getPstNivelRangoGradual() {
		return this.pstNivelRangoGradual;
	}

	public void setPstNivelRangoGradual(int pstNivelRangoGradual) {
		this.pstNivelRangoGradual = pstNivelRangoGradual;
	}


	@Column(name="PST_RESPONSABILIDAD")
	public String getPstResponsabilidad() {
		return this.pstResponsabilidad;
	}

	public void setPstResponsabilidad(String pstResponsabilidad) {
		this.pstResponsabilidad = pstResponsabilidad;
	}


	@Column(name="PST_RMU_DOCENTE")
	public int getPstRmuDocente() {
		return this.pstRmuDocente;
	}

	public void setPstRmuDocente(int pstRmuDocente) {
		this.pstRmuDocente = pstRmuDocente;
	}


	@Column(name="PST_RMU_JERARQUICO")
	public int getPstRmuJerarquico() {
		return this.pstRmuJerarquico;
	}

	public void setPstRmuJerarquico(int pstRmuJerarquico) {
		this.pstRmuJerarquico = pstRmuJerarquico;
	}


	@Column(name="PST_TIPO_PUESTO")
	public int getPstTipoPuesto() {
		return this.pstTipoPuesto;
	}

	public void setPstTipoPuesto(int pstTipoPuesto) {
		this.pstTipoPuesto = pstTipoPuesto;
	}


	//bi-directional many-to-one association to ActividadPuesto
	@OneToMany(mappedBy="puesto", fetch=FetchType.EAGER)
	public List<ActividadPuesto> getActividadPuestos() {
		return this.actividadPuestos;
	}

	public void setActividadPuestos(List<ActividadPuesto> actividadPuestos) {
		this.actividadPuestos = actividadPuestos;
	}

	public ActividadPuesto addActividadPuesto(ActividadPuesto actividadPuesto) {
		getActividadPuestos().add(actividadPuesto);
		actividadPuesto.setPuesto(this);

		return actividadPuesto;
	}

	public ActividadPuesto removeActividadPuesto(ActividadPuesto actividadPuesto) {
		getActividadPuestos().remove(actividadPuesto);
		actividadPuesto.setPuesto(null);

		return actividadPuesto;
	}


	//bi-directional many-to-one association to CompetenciaPuesto
	@OneToMany(mappedBy="puesto", fetch=FetchType.EAGER)
	public List<CompetenciaPuesto> getCompetenciaPuestos() {
		return this.competenciaPuestos;
	}

	public void setCompetenciaPuestos(List<CompetenciaPuesto> competenciaPuestos) {
		this.competenciaPuestos = competenciaPuestos;
	}

	public CompetenciaPuesto addCompetenciaPuesto(CompetenciaPuesto competenciaPuesto) {
		getCompetenciaPuestos().add(competenciaPuesto);
		competenciaPuesto.setPuesto(this);

		return competenciaPuesto;
	}

	public CompetenciaPuesto removeCompetenciaPuesto(CompetenciaPuesto competenciaPuesto) {
		getCompetenciaPuestos().remove(competenciaPuesto);
		competenciaPuesto.setPuesto(null);

		return competenciaPuesto;
	}


	//bi-directional many-to-one association to ConocimientoPuesto
	@OneToMany(mappedBy="puesto", fetch=FetchType.EAGER)
	public List<ConocimientoPuesto> getConocimientoPuestos() {
		return this.conocimientoPuestos;
	}

	public void setConocimientoPuestos(List<ConocimientoPuesto> conocimientoPuestos) {
		this.conocimientoPuestos = conocimientoPuestos;
	}

	public ConocimientoPuesto addConocimientoPuesto(ConocimientoPuesto conocimientoPuesto) {
		getConocimientoPuestos().add(conocimientoPuesto);
		conocimientoPuesto.setPuesto(this);

		return conocimientoPuesto;
	}

	public ConocimientoPuesto removeConocimientoPuesto(ConocimientoPuesto conocimientoPuesto) {
		getConocimientoPuestos().remove(conocimientoPuesto);
		conocimientoPuesto.setPuesto(null);

		return conocimientoPuesto;
	}


	//bi-directional many-to-one association to DestrezaPuesto
	@OneToMany(mappedBy="puesto", fetch=FetchType.EAGER)
	public List<DestrezaPuesto> getDestrezaPuestos() {
		return this.destrezaPuestos;
	}

	public void setDestrezaPuestos(List<DestrezaPuesto> destrezaPuestos) {
		this.destrezaPuestos = destrezaPuestos;
	}

	public DestrezaPuesto addDestrezaPuesto(DestrezaPuesto destrezaPuesto) {
		getDestrezaPuestos().add(destrezaPuesto);
		destrezaPuesto.setPuesto(this);

		return destrezaPuesto;
	}

	public DestrezaPuesto removeDestrezaPuesto(DestrezaPuesto destrezaPuesto) {
		getDestrezaPuestos().remove(destrezaPuesto);
		destrezaPuesto.setPuesto(null);

		return destrezaPuesto;
	}


	//bi-directional many-to-one association to DetallePuesto
	@OneToMany(mappedBy="puesto", fetch=FetchType.EAGER)
	public List<DetallePuesto> getDetallePuestos() {
		return this.detallePuestos;
	}

	public void setDetallePuestos(List<DetallePuesto> detallePuestos) {
		this.detallePuestos = detallePuestos;
	}

	public DetallePuesto addDetallePuesto(DetallePuesto detallePuesto) {
		getDetallePuestos().add(detallePuesto);
		detallePuesto.setPuesto(this);

		return detallePuesto;
	}

	public DetallePuesto removeDetallePuesto(DetallePuesto detallePuesto) {
		getDetallePuestos().remove(detallePuesto);
		detallePuesto.setPuesto(null);

		return detallePuesto;
	}


	//bi-directional many-to-one association to FuncionPuesto
	@OneToMany(mappedBy="puesto", fetch=FetchType.EAGER)
	public List<FuncionPuesto> getFuncionPuestos() {
		return this.funcionPuestos;
	}

	public void setFuncionPuestos(List<FuncionPuesto> funcionPuestos) {
		this.funcionPuestos = funcionPuestos;
	}

	public FuncionPuesto addFuncionPuesto(FuncionPuesto funcionPuesto) {
		getFuncionPuestos().add(funcionPuesto);
		funcionPuesto.setPuesto(this);

		return funcionPuesto;
	}

	public FuncionPuesto removeFuncionPuesto(FuncionPuesto funcionPuesto) {
		getFuncionPuestos().remove(funcionPuesto);
		funcionPuesto.setPuesto(null);

		return funcionPuesto;
	}


	//bi-directional many-to-one association to InstruccionPuesto
	@OneToMany(mappedBy="puesto", fetch=FetchType.EAGER)
	public List<InstruccionPuesto> getInstruccionPuestos() {
		return this.instruccionPuestos;
	}

	public void setInstruccionPuestos(List<InstruccionPuesto> instruccionPuestos) {
		this.instruccionPuestos = instruccionPuestos;
	}

	public InstruccionPuesto addInstruccionPuesto(InstruccionPuesto instruccionPuesto) {
		getInstruccionPuestos().add(instruccionPuesto);
		instruccionPuesto.setPuesto(this);

		return instruccionPuesto;
	}

	public InstruccionPuesto removeInstruccionPuesto(InstruccionPuesto instruccionPuesto) {
		getInstruccionPuestos().remove(instruccionPuesto);
		instruccionPuesto.setPuesto(null);

		return instruccionPuesto;
	}


	//bi-directional many-to-one association to PartidaIndividual
	@OneToMany(mappedBy="puesto", fetch=FetchType.EAGER)
	public List<PartidaIndividual> getPartidaIndividuals() {
		return this.partidaIndividuals;
	}

	public void setPartidaIndividuals(List<PartidaIndividual> partidaIndividuals) {
		this.partidaIndividuals = partidaIndividuals;
	}

	public PartidaIndividual addPartidaIndividual(PartidaIndividual partidaIndividual) {
		getPartidaIndividuals().add(partidaIndividual);
		partidaIndividual.setPuesto(this);

		return partidaIndividual;
	}

	public PartidaIndividual removePartidaIndividual(PartidaIndividual partidaIndividual) {
		getPartidaIndividuals().remove(partidaIndividual);
		partidaIndividual.setPuesto(null);

		return partidaIndividual;
	}


	//bi-directional many-to-one association to CategoriaRango
	@ManyToOne
	@JoinColumn(name="CTRN_ID")
	public CategoriaRango getCategoriaRango() {
		return this.categoriaRango;
	}

	public void setCategoriaRango(CategoriaRango categoriaRango) {
		this.categoriaRango = categoriaRango;
	}


	//bi-directional many-to-one association to Grado
	@ManyToOne
	@JoinColumn(name="GRD_ID")
	public Grado getGrado() {
		return this.grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}


	//bi-directional many-to-one association to GrupoOcupacional
	@ManyToOne
	@JoinColumn(name="GROC_ID")
	public GrupoOcupacional getGrupoOcupacional() {
		return this.grupoOcupacional;
	}

	public void setGrupoOcupacional(GrupoOcupacional grupoOcupacional) {
		this.grupoOcupacional = grupoOcupacional;
	}


	//bi-directional many-to-one association to Regimen
	@ManyToOne
	@JoinColumn(name="RGM_ID")
	public Regimen getRegimen() {
		return this.regimen;
	}

	public void setRegimen(Regimen regimen) {
		this.regimen = regimen;
	}


	//bi-directional many-to-one association to Serie
	@ManyToOne
	@JoinColumn(name="SER_ID")
	public Serie getSerie() {
		return this.serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}


	//bi-directional many-to-one association to PuestoAreaConocimiento
	@OneToMany(mappedBy="puesto", fetch=FetchType.EAGER)
	public List<PuestoAreaConocimiento> getPuestoAreaConocimientos() {
		return this.puestoAreaConocimientos;
	}

	public void setPuestoAreaConocimientos(List<PuestoAreaConocimiento> puestoAreaConocimientos) {
		this.puestoAreaConocimientos = puestoAreaConocimientos;
	}

	public PuestoAreaConocimiento addPuestoAreaConocimiento(PuestoAreaConocimiento puestoAreaConocimiento) {
		getPuestoAreaConocimientos().add(puestoAreaConocimiento);
		puestoAreaConocimiento.setPuesto(this);

		return puestoAreaConocimiento;
	}

	public PuestoAreaConocimiento removePuestoAreaConocimiento(PuestoAreaConocimiento puestoAreaConocimiento) {
		getPuestoAreaConocimientos().remove(puestoAreaConocimiento);
		puestoAreaConocimiento.setPuesto(null);

		return puestoAreaConocimiento;
	}


	//bi-directional many-to-one association to Tramite
	@OneToMany(mappedBy="puesto", fetch=FetchType.EAGER)
	public List<Tramite> getTramites() {
		return this.tramites;
	}

	public void setTramites(List<Tramite> tramites) {
		this.tramites = tramites;
	}

	public Tramite addTramite(Tramite tramite) {
		getTramites().add(tramite);
		tramite.setPuesto(this);

		return tramite;
	}

	public Tramite removeTramite(Tramite tramite) {
		getTramites().remove(tramite);
		tramite.setPuesto(null);

		return tramite;
	}

}