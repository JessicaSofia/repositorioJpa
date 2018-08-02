package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PARTIDA_INDIVIDUAL database table.
 * 
 */
@Entity
@Table(name="PARTIDA_INDIVIDUAL")
@NamedQuery(name="PartidaIndividual.findAll", query="SELECT p FROM PartidaIndividual p")
public class PartidaIndividual implements Serializable {
	private static final long serialVersionUID = 1L;
	private long pridId;
	private BigDecimal pridEstado;
	private BigDecimal pridEstadoAux;
	private Date pridFecha;
	private Date pridFechaCertificacion;
	private String pridIndividual;
	private String pridOficioCertificacion;
	private String pridPresupuestaria;
	private BigDecimal pridSecuencial;
	private BigDecimal pridTipoPartida;
	private List<DetallePuesto> detallePuestos;
	private Dependencia dependencia;
	private Puesto puesto;
	private TipoPartida tipoPartida;

	public PartidaIndividual() {
	}


	@Id
	@SequenceGenerator(name="PARTIDA_INDIVIDUAL_PRIDID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARTIDA_INDIVIDUAL_PRIDID_GENERATOR")
	@Column(name="PRID_ID")
	public long getPridId() {
		return this.pridId;
	}

	public void setPridId(long pridId) {
		this.pridId = pridId;
	}


	@Column(name="PRID_ESTADO")
	public BigDecimal getPridEstado() {
		return this.pridEstado;
	}

	public void setPridEstado(BigDecimal pridEstado) {
		this.pridEstado = pridEstado;
	}


	@Column(name="PRID_ESTADO_AUX")
	public BigDecimal getPridEstadoAux() {
		return this.pridEstadoAux;
	}

	public void setPridEstadoAux(BigDecimal pridEstadoAux) {
		this.pridEstadoAux = pridEstadoAux;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="PRID_FECHA")
	public Date getPridFecha() {
		return this.pridFecha;
	}

	public void setPridFecha(Date pridFecha) {
		this.pridFecha = pridFecha;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="PRID_FECHA_CERTIFICACION")
	public Date getPridFechaCertificacion() {
		return this.pridFechaCertificacion;
	}

	public void setPridFechaCertificacion(Date pridFechaCertificacion) {
		this.pridFechaCertificacion = pridFechaCertificacion;
	}


	@Column(name="PRID_INDIVIDUAL")
	public String getPridIndividual() {
		return this.pridIndividual;
	}

	public void setPridIndividual(String pridIndividual) {
		this.pridIndividual = pridIndividual;
	}


	@Column(name="PRID_OFICIO_CERTIFICACION")
	public String getPridOficioCertificacion() {
		return this.pridOficioCertificacion;
	}

	public void setPridOficioCertificacion(String pridOficioCertificacion) {
		this.pridOficioCertificacion = pridOficioCertificacion;
	}


	@Column(name="PRID_PRESUPUESTARIA")
	public String getPridPresupuestaria() {
		return this.pridPresupuestaria;
	}

	public void setPridPresupuestaria(String pridPresupuestaria) {
		this.pridPresupuestaria = pridPresupuestaria;
	}


	@Column(name="PRID_SECUENCIAL")
	public BigDecimal getPridSecuencial() {
		return this.pridSecuencial;
	}

	public void setPridSecuencial(BigDecimal pridSecuencial) {
		this.pridSecuencial = pridSecuencial;
	}


	@Column(name="PRID_TIPO_PARTIDA")
	public BigDecimal getPridTipoPartida() {
		return this.pridTipoPartida;
	}

	public void setPridTipoPartida(BigDecimal pridTipoPartida) {
		this.pridTipoPartida = pridTipoPartida;
	}


	//bi-directional many-to-one association to DetallePuesto
	@OneToMany(mappedBy="partidaIndividual", fetch=FetchType.EAGER)
	public List<DetallePuesto> getDetallePuestos() {
		return this.detallePuestos;
	}

	public void setDetallePuestos(List<DetallePuesto> detallePuestos) {
		this.detallePuestos = detallePuestos;
	}

	public DetallePuesto addDetallePuesto(DetallePuesto detallePuesto) {
		getDetallePuestos().add(detallePuesto);
		detallePuesto.setPartidaIndividual(this);

		return detallePuesto;
	}

	public DetallePuesto removeDetallePuesto(DetallePuesto detallePuesto) {
		getDetallePuestos().remove(detallePuesto);
		detallePuesto.setPartidaIndividual(null);

		return detallePuesto;
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


	//bi-directional many-to-one association to Puesto
	@ManyToOne
	@JoinColumn(name="PST_ID")
	public Puesto getPuesto() {
		return this.puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}


	//bi-directional many-to-one association to TipoPartida
	@ManyToOne
	@JoinColumn(name="TPP_ID")
	public TipoPartida getTipoPartida() {
		return this.tipoPartida;
	}

	public void setTipoPartida(TipoPartida tipoPartida) {
		this.tipoPartida = tipoPartida;
	}

}