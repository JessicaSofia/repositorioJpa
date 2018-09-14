package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
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
	private int cntId;
	private String cntActividad;
	private int cntAutoridadResponsable;
	private String cntCatedras;
	private int cntCategoria;
	private int cntEstado;
	private Date cntFechaElaboracion;
	private Date cntFechaFin;
	private Date cntFechaInicio;
	private Date cntFechaPedido;
	private int cntHorasMes;
	private String cntMotivoSalida;
	private String cntNumeroContrato;
	private String cntObservacion;
	private String cntOficioPedido;
	private int cntRmu;
	private int cntValorHora;
	private Candidato candidato;
	private TipoContrato tipoContrato;
	private List<DetallePuesto> detallePuestos;

	public Contrato() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CNT_ID")
	public int getCntId() {
		return this.cntId;
	}

	public void setCntId(int cntId) {
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
	public int getCntAutoridadResponsable() {
		return this.cntAutoridadResponsable;
	}

	public void setCntAutoridadResponsable(int cntAutoridadResponsable) {
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
	public int getCntCategoria() {
		return this.cntCategoria;
	}

	public void setCntCategoria(int cntCategoria) {
		this.cntCategoria = cntCategoria;
	}


	@Column(name="CNT_ESTADO")
	public int getCntEstado() {
		return this.cntEstado;
	}

	public void setCntEstado(int cntEstado) {
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
	public int getCntHorasMes() {
		return this.cntHorasMes;
	}

	public void setCntHorasMes(int cntHorasMes) {
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
	public int getCntRmu() {
		return this.cntRmu;
	}

	public void setCntRmu(int cntRmu) {
		this.cntRmu = cntRmu;
	}


	@Column(name="CNT_VALOR_HORA")
	public int getCntValorHora() {
		return this.cntValorHora;
	}

	public void setCntValorHora(int cntValorHora) {
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
	@OneToMany(mappedBy="contrato", fetch=FetchType.LAZY)
	public List<DetallePuesto> getDetallePuestos() {
		return this.detallePuestos;
	}

	public void setDetallePuestos(List<DetallePuesto> detallePuestos) {
		this.detallePuestos = detallePuestos;
	}



}