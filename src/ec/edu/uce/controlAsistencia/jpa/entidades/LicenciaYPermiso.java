package ec.edu.uce.controlAsistencia.jpa.entidades;
// Generated 07-mar-2018 22:35:26 by Hibernate Tools 4.3.5.Final

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LicenciaYPermiso generated by hbm2java
 */
@Entity
@Table(name = "LICENCIA_Y_PERMISO", schema = "BDTALENTOHUMANO")
public class LicenciaYPermiso implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int lcprId;
	private DetallePuesto detallePuesto;
	private TipoLicencia tipoLicencia;
	private int lcprNumLicencia;
	private Timestamp lcprFechaEmision;
	private int lcprNumDias;
	private Date lcprFechaInicio;
	private Date lcprFechaFin;
	private Date lcprNumHoras;
	private Date lcprHoraInicio;
	private Date lcprHoraFin;
	private String lcprExplicacion;
	private String lcprObservacion;
	private String lcprCopia;
	private int lcprCargoVacaciones;
	private int tplcEstado;
	private String lcprObservacionEstado;

	public LicenciaYPermiso() {
	}

	public LicenciaYPermiso(int lcprId) {
		this.lcprId = lcprId;
	}

	public LicenciaYPermiso(int lcprId, DetallePuesto detallePuesto, TipoLicencia tipoLicencia,
			int lcprNumLicencia, Timestamp lcprFechaEmision, int lcprNumDias, Date lcprFechaInicio,
			Date lcprFechaFin, Date lcprNumHoras, Date lcprHoraInicio, Date lcprHoraFin, String lcprExplicacion,
			String lcprObservacion, String lcprCopia, int lcprCargoVacaciones, int tplcEstado,
			String lcprObservacionEstado) {
		this.lcprId = lcprId;
		this.detallePuesto = detallePuesto;
		this.tipoLicencia = tipoLicencia;
		this.lcprNumLicencia = lcprNumLicencia;
		this.lcprFechaEmision = lcprFechaEmision;
		this.lcprNumDias = lcprNumDias;
		this.lcprFechaInicio = lcprFechaInicio;
		this.lcprFechaFin = lcprFechaFin;
		this.lcprNumHoras = lcprNumHoras;
		this.lcprHoraInicio = lcprHoraInicio;
		this.lcprHoraFin = lcprHoraFin;
		this.lcprExplicacion = lcprExplicacion;
		this.lcprObservacion = lcprObservacion;
		this.lcprCopia = lcprCopia;
		this.lcprCargoVacaciones = lcprCargoVacaciones;
		this.tplcEstado = tplcEstado;
		this.lcprObservacionEstado = lcprObservacionEstado;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LicenciaIdGenerator")
    @SequenceGenerator(name = "LicenciaIdGenerator", initialValue = 1, allocationSize = 1, sequenceName = "S_LICENCIA_Y_PERMISO")
	@Column(name = "LCPR_ID", unique = true, nullable = false, precision = 6, scale = 0)
	public int getLcprId() {
		return this.lcprId;
	}

	public void setLcprId(int lcprId) {
		this.lcprId = lcprId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DTPS_ID")
	public DetallePuesto getDetallePuesto() {
		return this.detallePuesto;
	}

	public void setDetallePuesto(DetallePuesto detallePuesto) {
		this.detallePuesto = detallePuesto;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "TPLC_ID")
	public TipoLicencia getTipoLicencia() {
		return this.tipoLicencia;
	}

	public void setTipoLicencia(TipoLicencia tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

	@Column(name = "LCPR_NUM_LICENCIA", precision = 22, scale = 0)
	public int getLcprNumLicencia() {
		return this.lcprNumLicencia;
	}

	public void setLcprNumLicencia(int lcprNumLicencia) {
		this.lcprNumLicencia = lcprNumLicencia;
	}

	@Column(name = "LCPR_FECHA_EMISION")
	public Timestamp getLcprFechaEmision() {
		return this.lcprFechaEmision;
	}

	public void setLcprFechaEmision(Timestamp lcprFechaEmision) {
		this.lcprFechaEmision = lcprFechaEmision;
	}

	@Column(name = "LCPR_NUM_DIAS", precision = 22, scale = 0)
	public int getLcprNumDias() {
		return this.lcprNumDias;
	}

	public void setLcprNumDias(int lcprNumDias) {
		this.lcprNumDias = lcprNumDias;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LCPR_FECHA_INICIO", length = 7)
	public Date getLcprFechaInicio() {
		return this.lcprFechaInicio;
	}

	public void setLcprFechaInicio(Date lcprFechaInicio) {
		this.lcprFechaInicio = lcprFechaInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LCPR_FECHA_FIN", length = 7)
	public Date getLcprFechaFin() {
		return this.lcprFechaFin;
	}

	public void setLcprFechaFin(Date lcprFechaFin) {
		this.lcprFechaFin = lcprFechaFin;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LCPR_NUM_HORAS", length = 7)
	public Date getLcprNumHoras() {
		return this.lcprNumHoras;
	}

	public void setLcprNumHoras(Date lcprNumHoras) {
		this.lcprNumHoras = lcprNumHoras;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LCPR_HORA_INICIO", length = 7)
	public Date getLcprHoraInicio() {
		return this.lcprHoraInicio;
	}

	public void setLcprHoraInicio(Date lcprHoraInicio) {
		this.lcprHoraInicio = lcprHoraInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LCPR_HORA_FIN", length = 7)
	public Date getLcprHoraFin() {
		return this.lcprHoraFin;
	}

	public void setLcprHoraFin(Date lcprHoraFin) {
		this.lcprHoraFin = lcprHoraFin;
	}

	@Column(name = "LCPR_EXPLICACION", length = 512)
	public String getLcprExplicacion() {
		return this.lcprExplicacion;
	}

	public void setLcprExplicacion(String lcprExplicacion) {
		this.lcprExplicacion = lcprExplicacion;
	}

	@Column(name = "LCPR_OBSERVACION", length = 512)
	public String getLcprObservacion() {
		return this.lcprObservacion;
	}

	public void setLcprObservacion(String lcprObservacion) {
		this.lcprObservacion = lcprObservacion;
	}

	@Column(name = "LCPR_COPIA", length = 256)
	public String getLcprCopia() {
		return this.lcprCopia;
	}

	public void setLcprCopia(String lcprCopia) {
		this.lcprCopia = lcprCopia;
	}

	@Column(name = "LCPR_CARGO_VACACIONES", precision = 22, scale = 0)
	public int getLcprCargoVacaciones() {
		return this.lcprCargoVacaciones;
	}

	public void setLcprCargoVacaciones(int lcprCargoVacaciones) {
		this.lcprCargoVacaciones = lcprCargoVacaciones;
	}

	@Column(name = "TPLC_ESTADO", precision = 22, scale = 0)
	public int getTplcEstado() {
		return this.tplcEstado;
	}

	public void setTplcEstado(int tplcEstado) {
		this.tplcEstado = tplcEstado;
	}

	@Column(name = "LCPR_OBSERVACION_ESTADO", length = 512)
	public String getLcprObservacionEstado() {
		return this.lcprObservacionEstado;
	}

	public void setLcprObservacionEstado(String lcprObservacionEstado) {
		this.lcprObservacionEstado = lcprObservacionEstado;
	}

}
