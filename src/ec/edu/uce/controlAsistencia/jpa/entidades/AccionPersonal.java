package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ACCION_PERSONAL database table.
 * 
 */
@Entity
@Table(name="ACCION_PERSONAL")
@NamedQuery(name="AccionPersonal.findAll", query="SELECT a FROM AccionPersonal a")
public class AccionPersonal implements Serializable {
	private static final long serialVersionUID = 1L;
	private long acprId;
	private String acprActa;
	private BigDecimal acprAutoridad;
	private String acprAutorizacion;
	private BigDecimal acprEstado;
	private BigDecimal acprEstadoAux;
	private String acprExplicacion;
	private Date acprFecha;
	private Date acprFechaActa;
	private Date acprFechaControl;
	private Date acprFechaElaboracion;
	private Date acprFechaOficio;
	private Date acprFechaPosesion;
	private String acprLugarPosesion;
	private String acprLugarTrabajo;
	private String acprNickCreacion;
	private String acprNickPosesion;
	private String acprNota;
	private String acprNumControl;
	private String acprNumeroOficio;
	private String acprObservacion;
	private String acprResolucion;
	private String acprSecuencial;
	private DetallePuesto detallePuesto;
	private TipoAccion tipoAccion;

	public AccionPersonal() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ACPR_ID")
	public long getAcprId() {
		return this.acprId;
	}

	public void setAcprId(long acprId) {
		this.acprId = acprId;
	}


	@Column(name="ACPR_ACTA")
	public String getAcprActa() {
		return this.acprActa;
	}

	public void setAcprActa(String acprActa) {
		this.acprActa = acprActa;
	}


	@Column(name="ACPR_AUTORIDAD")
	public BigDecimal getAcprAutoridad() {
		return this.acprAutoridad;
	}

	public void setAcprAutoridad(BigDecimal acprAutoridad) {
		this.acprAutoridad = acprAutoridad;
	}


	@Column(name="ACPR_AUTORIZACION")
	public String getAcprAutorizacion() {
		return this.acprAutorizacion;
	}

	public void setAcprAutorizacion(String acprAutorizacion) {
		this.acprAutorizacion = acprAutorizacion;
	}


	@Column(name="ACPR_ESTADO")
	public BigDecimal getAcprEstado() {
		return this.acprEstado;
	}

	public void setAcprEstado(BigDecimal acprEstado) {
		this.acprEstado = acprEstado;
	}


	@Column(name="ACPR_ESTADO_AUX")
	public BigDecimal getAcprEstadoAux() {
		return this.acprEstadoAux;
	}

	public void setAcprEstadoAux(BigDecimal acprEstadoAux) {
		this.acprEstadoAux = acprEstadoAux;
	}


	@Column(name="ACPR_EXPLICACION")
	public String getAcprExplicacion() {
		return this.acprExplicacion;
	}

	public void setAcprExplicacion(String acprExplicacion) {
		this.acprExplicacion = acprExplicacion;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="ACPR_FECHA")
	public Date getAcprFecha() {
		return this.acprFecha;
	}

	public void setAcprFecha(Date acprFecha) {
		this.acprFecha = acprFecha;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="ACPR_FECHA_ACTA")
	public Date getAcprFechaActa() {
		return this.acprFechaActa;
	}

	public void setAcprFechaActa(Date acprFechaActa) {
		this.acprFechaActa = acprFechaActa;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="ACPR_FECHA_CONTROL")
	public Date getAcprFechaControl() {
		return this.acprFechaControl;
	}

	public void setAcprFechaControl(Date acprFechaControl) {
		this.acprFechaControl = acprFechaControl;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="ACPR_FECHA_ELABORACION")
	public Date getAcprFechaElaboracion() {
		return this.acprFechaElaboracion;
	}

	public void setAcprFechaElaboracion(Date acprFechaElaboracion) {
		this.acprFechaElaboracion = acprFechaElaboracion;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="ACPR_FECHA_OFICIO")
	public Date getAcprFechaOficio() {
		return this.acprFechaOficio;
	}

	public void setAcprFechaOficio(Date acprFechaOficio) {
		this.acprFechaOficio = acprFechaOficio;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="ACPR_FECHA_POSESION")
	public Date getAcprFechaPosesion() {
		return this.acprFechaPosesion;
	}

	public void setAcprFechaPosesion(Date acprFechaPosesion) {
		this.acprFechaPosesion = acprFechaPosesion;
	}


	@Column(name="ACPR_LUGAR_POSESION")
	public String getAcprLugarPosesion() {
		return this.acprLugarPosesion;
	}

	public void setAcprLugarPosesion(String acprLugarPosesion) {
		this.acprLugarPosesion = acprLugarPosesion;
	}


	@Column(name="ACPR_LUGAR_TRABAJO")
	public String getAcprLugarTrabajo() {
		return this.acprLugarTrabajo;
	}

	public void setAcprLugarTrabajo(String acprLugarTrabajo) {
		this.acprLugarTrabajo = acprLugarTrabajo;
	}


	@Column(name="ACPR_NICK_CREACION")
	public String getAcprNickCreacion() {
		return this.acprNickCreacion;
	}

	public void setAcprNickCreacion(String acprNickCreacion) {
		this.acprNickCreacion = acprNickCreacion;
	}


	@Column(name="ACPR_NICK_POSESION")
	public String getAcprNickPosesion() {
		return this.acprNickPosesion;
	}

	public void setAcprNickPosesion(String acprNickPosesion) {
		this.acprNickPosesion = acprNickPosesion;
	}


	@Column(name="ACPR_NOTA")
	public String getAcprNota() {
		return this.acprNota;
	}

	public void setAcprNota(String acprNota) {
		this.acprNota = acprNota;
	}


	@Column(name="ACPR_NUM_CONTROL")
	public String getAcprNumControl() {
		return this.acprNumControl;
	}

	public void setAcprNumControl(String acprNumControl) {
		this.acprNumControl = acprNumControl;
	}


	@Column(name="ACPR_NUMERO_OFICIO")
	public String getAcprNumeroOficio() {
		return this.acprNumeroOficio;
	}

	public void setAcprNumeroOficio(String acprNumeroOficio) {
		this.acprNumeroOficio = acprNumeroOficio;
	}


	@Column(name="ACPR_OBSERVACION")
	public String getAcprObservacion() {
		return this.acprObservacion;
	}

	public void setAcprObservacion(String acprObservacion) {
		this.acprObservacion = acprObservacion;
	}


	@Column(name="ACPR_RESOLUCION")
	public String getAcprResolucion() {
		return this.acprResolucion;
	}

	public void setAcprResolucion(String acprResolucion) {
		this.acprResolucion = acprResolucion;
	}


	@Column(name="ACPR_SECUENCIAL")
	public String getAcprSecuencial() {
		return this.acprSecuencial;
	}

	public void setAcprSecuencial(String acprSecuencial) {
		this.acprSecuencial = acprSecuencial;
	}


	//bi-directional many-to-one association to DetallePuesto
	@ManyToOne
	@JoinColumn(name="DTPS_ID")
	public DetallePuesto getDetallePuesto() {
		return this.detallePuesto;
	}

	public void setDetallePuesto(DetallePuesto detallePuesto) {
		this.detallePuesto = detallePuesto;
	}


	//bi-directional many-to-one association to TipoAccion
	@ManyToOne
	@JoinColumn(name="TPAC_ID")
	public TipoAccion getTipoAccion() {
		return this.tipoAccion;
	}

	public void setTipoAccion(TipoAccion tipoAccion) {
		this.tipoAccion = tipoAccion;
	}

}