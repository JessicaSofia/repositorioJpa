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
@Table(name = "LICENCIA", schema = "BDTALENTOHUMANO")
public class Licencia implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int lcnId;
	private DetallePuesto detallePuesto;
	private TipoLicencia tipoLicencia;
	private int lcnNumLicencia;
	private Timestamp lcnFechaEmision;
	private int lcnNumDias;
	private Date lcnFechaInicio;
	private Date lcnFechaFin;
	
	private String lcnExplicacion;
	private String lcnObservacion;
	private String lcnCopia;
	private int lcnEstado;
	private String lcnObservacionEstado;

	public Licencia() {
	}

	public Licencia(int lcnId) {
		this.lcnId = lcnId;
	}


	public Licencia(int lcnId, DetallePuesto detallePuesto, TipoLicencia tipoLicencia, int lcnNumLicencia,
			Timestamp lcnFechaEmision, int lcnNumDias, Date lcnFechaInicio, Date lcnFechaFin, String lcnExplicacion,
			String lcnObservacion, String lcnCopia, int lcnEstado, String lcnObservacionEstado) {
		super();
		this.lcnId = lcnId;
		this.detallePuesto = detallePuesto;
		this.tipoLicencia = tipoLicencia;
		this.lcnNumLicencia = lcnNumLicencia;
		this.lcnFechaEmision = lcnFechaEmision;
		this.lcnNumDias = lcnNumDias;
		this.lcnFechaInicio = lcnFechaInicio;
		this.lcnFechaFin = lcnFechaFin;
		this.lcnExplicacion = lcnExplicacion;
		this.lcnObservacion = lcnObservacion;
		this.lcnCopia = lcnCopia;
		this.lcnEstado = lcnEstado;
		this.lcnObservacionEstado = lcnObservacionEstado;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LicenciaIdGenerator")
    @SequenceGenerator(name = "LicenciaIdGenerator", initialValue = 1, allocationSize = 1, sequenceName = "S_LICENCIA")
	@Column(name = "LCN_ID", unique = true, nullable = false, precision = 6, scale = 0)
	public int getLcnId() {
		return this.lcnId;
	}

	public void setLcnId(int lcnId) {
		this.lcnId = lcnId;
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

	@Column(name = "LCN_NUM_LICENCIA", precision = 22, scale = 0)
	public int getLcnNumLicencia() {
		return this.lcnNumLicencia;
	}

	public void setLcnNumLicencia(int lcnNumLicencia) {
		this.lcnNumLicencia = lcnNumLicencia;
	}

	@Column(name = "LCN_FECHA_EMISION")
	public Timestamp getLcnFechaEmision() {
		return this.lcnFechaEmision;
	}

	public void setLcnFechaEmision(Timestamp lcnFechaEmision) {
		this.lcnFechaEmision = lcnFechaEmision;
	}

	@Column(name = "LCN_NUM_DIAS", precision = 22, scale = 0)
	public int getLcnNumDias() {
		return this.lcnNumDias;
	}

	public void setLcnNumDias(int lcnNumDias) {
		this.lcnNumDias = lcnNumDias;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LCN_FECHA_INICIO", length = 7)
	public Date getLcnFechaInicio() {
		return this.lcnFechaInicio;
	}

	public void setLcnFechaInicio(Date lcnFechaInicio) {
		this.lcnFechaInicio = lcnFechaInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LCN_FECHA_FIN", length = 7)
	public Date getLcnFechaFin() {
		return this.lcnFechaFin;
	}

	public void setLcnFechaFin(Date lcnFechaFin) {
		this.lcnFechaFin = lcnFechaFin;
	}


	@Column(name = "LCN_EXPLICACION", length = 512)
	public String getLcnExplicacion() {
		return this.lcnExplicacion;
	}

	public void setLcnExplicacion(String lcnExplicacion) {
		this.lcnExplicacion = lcnExplicacion;
	}

	@Column(name = "LCN_OBSERVACION", length = 512)
	public String getLcnObservacion() {
		return this.lcnObservacion;
	}

	public void setLcnObservacion(String lcnObservacion) {
		this.lcnObservacion = lcnObservacion;
	}

	@Column(name = "LCN_COPIA", length = 256)
	public String getLcnCopia() {
		return this.lcnCopia;
	}

	public void setLcnCopia(String lcnCopia) {
		this.lcnCopia = lcnCopia;
	}


	@Column(name = "LCN_ESTADO", precision = 22, scale = 0)
	public int getLcnEstado() {
		return this.lcnEstado;
	}

	public void setLcnEstado(int tplcEstado) {
		this.lcnEstado = tplcEstado;
	}

	@Column(name = "LCN_OBSERVACION_ESTADO", length = 512)
	public String getLcnObservacionEstado() {
		return this.lcnObservacionEstado;
	}

	public void setLcnObservacionEstado(String lcnObservacionEstado) {
		this.lcnObservacionEstado = lcnObservacionEstado;
	}

}
