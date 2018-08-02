package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CONTRATO database table.
 * 
 */
@Entity
@NamedQuery(name="Contrato.findAll", query="SELECT c FROM Contrato c")
public class Contrato implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cntId;
	private String cntActividad;
	private BigDecimal cntAutoridadResponsable;
	private String cntCatedras;
	private BigDecimal cntCategoria;
	private BigDecimal cntEstado;
	private Date cntFechaElaboracion;
	private Date cntFechaFin;
	private Date cntFechaInicio;
	private Date cntFechaPedido;
	private BigDecimal cntHorasMes;
	private String cntMotivoSalida;
	private String cntNumeroContrato;
	private String cntObservacion;
	private String cntOficioPedido;
	private BigDecimal cntRmu;
	private BigDecimal cntValorHora;
	private Candidato candidato;
	private TipoContrato tipoContrato;
	private List<DetallePuesto> detallePuestos;

	public Contrato() {
	}


	@Id
	@SequenceGenerator(name="CONTRATO_CNTID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONTRATO_CNTID_GENERATOR")
	@Column(name="CNT_ID")
	public long getCntId() {
		return this.cntId;
	}

	public void setCntId(long cntId) {
		this.cntId = cntId;
	}


	@Column(name="CNT_ACTIVIDAD")
	public String getCntActividad() {
		return this.cntActividad;
	}

	public void setCntActividad(String cntActividad) {
		this.cntActividad = cntActividad;
	}


	@Column(name="CNT_AUTORIDAD_RESPONSABLE")
	public BigDecimal getCntAutoridadResponsable() {
		return this.cntAutoridadResponsable;
	}

	public void setCntAutoridadResponsable(BigDecimal cntAutoridadResponsable) {
		this.cntAutoridadResponsable = cntAutoridadResponsable;
	}


	@Column(name="CNT_CATEDRAS")
	public String getCntCatedras() {
		return this.cntCatedras;
	}

	public void setCntCatedras(String cntCatedras) {
		this.cntCatedras = cntCatedras;
	}


	@Column(name="CNT_CATEGORIA")
	public BigDecimal getCntCategoria() {
		return this.cntCategoria;
	}

	public void setCntCategoria(BigDecimal cntCategoria) {
		this.cntCategoria = cntCategoria;
	}


	@Column(name="CNT_ESTADO")
	public BigDecimal getCntEstado() {
		return this.cntEstado;
	}

	public void setCntEstado(BigDecimal cntEstado) {
		this.cntEstado = cntEstado;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="CNT_FECHA_ELABORACION")
	public Date getCntFechaElaboracion() {
		return this.cntFechaElaboracion;
	}

	public void setCntFechaElaboracion(Date cntFechaElaboracion) {
		this.cntFechaElaboracion = cntFechaElaboracion;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="CNT_FECHA_FIN")
	public Date getCntFechaFin() {
		return this.cntFechaFin;
	}

	public void setCntFechaFin(Date cntFechaFin) {
		this.cntFechaFin = cntFechaFin;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="CNT_FECHA_INICIO")
	public Date getCntFechaInicio() {
		return this.cntFechaInicio;
	}

	public void setCntFechaInicio(Date cntFechaInicio) {
		this.cntFechaInicio = cntFechaInicio;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="CNT_FECHA_PEDIDO")
	public Date getCntFechaPedido() {
		return this.cntFechaPedido;
	}

	public void setCntFechaPedido(Date cntFechaPedido) {
		this.cntFechaPedido = cntFechaPedido;
	}


	@Column(name="CNT_HORAS_MES")
	public BigDecimal getCntHorasMes() {
		return this.cntHorasMes;
	}

	public void setCntHorasMes(BigDecimal cntHorasMes) {
		this.cntHorasMes = cntHorasMes;
	}


	@Column(name="CNT_MOTIVO_SALIDA")
	public String getCntMotivoSalida() {
		return this.cntMotivoSalida;
	}

	public void setCntMotivoSalida(String cntMotivoSalida) {
		this.cntMotivoSalida = cntMotivoSalida;
	}


	@Column(name="CNT_NUMERO_CONTRATO")
	public String getCntNumeroContrato() {
		return this.cntNumeroContrato;
	}

	public void setCntNumeroContrato(String cntNumeroContrato) {
		this.cntNumeroContrato = cntNumeroContrato;
	}


	@Column(name="CNT_OBSERVACION")
	public String getCntObservacion() {
		return this.cntObservacion;
	}

	public void setCntObservacion(String cntObservacion) {
		this.cntObservacion = cntObservacion;
	}


	@Column(name="CNT_OFICIO_PEDIDO")
	public String getCntOficioPedido() {
		return this.cntOficioPedido;
	}

	public void setCntOficioPedido(String cntOficioPedido) {
		this.cntOficioPedido = cntOficioPedido;
	}


	@Column(name="CNT_RMU")
	public BigDecimal getCntRmu() {
		return this.cntRmu;
	}

	public void setCntRmu(BigDecimal cntRmu) {
		this.cntRmu = cntRmu;
	}


	@Column(name="CNT_VALOR_HORA")
	public BigDecimal getCntValorHora() {
		return this.cntValorHora;
	}

	public void setCntValorHora(BigDecimal cntValorHora) {
		this.cntValorHora = cntValorHora;
	}


	//bi-directional many-to-one association to Candidato
	@ManyToOne
	@JoinColumn(name="CND_ID")
	public Candidato getCandidato() {
		return this.candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}


	//bi-directional many-to-one association to TipoContrato
	@ManyToOne
	@JoinColumn(name="TPCN_ID")
	public TipoContrato getTipoContrato() {
		return this.tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}


	//bi-directional many-to-one association to DetallePuesto
	@OneToMany(mappedBy="contrato", fetch=FetchType.EAGER)
	public List<DetallePuesto> getDetallePuestos() {
		return this.detallePuestos;
	}

	public void setDetallePuestos(List<DetallePuesto> detallePuestos) {
		this.detallePuestos = detallePuestos;
	}

	public DetallePuesto addDetallePuesto(DetallePuesto detallePuesto) {
		getDetallePuestos().add(detallePuesto);
		detallePuesto.setContrato(this);

		return detallePuesto;
	}

	public DetallePuesto removeDetallePuesto(DetallePuesto detallePuesto) {
		getDetallePuestos().remove(detallePuesto);
		detallePuesto.setContrato(null);

		return detallePuesto;
	}

}