package ec.edu.uce.controlAsistencia.jpa.entidades;
// Generated 07-mar-2018 22:35:26 by Hibernate Tools 4.3.5.Final

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vacacion generated by hbm2java
 */
@Entity
@Table(name = "VACACION", schema = "BDTALENTOHUMANO")
public class Vacacion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int vccId;
	private DetallePuesto detallePuesto;
	private BigDecimal vccNumAutorizacion;
	private Serializable vccFechaEmision;
	private BigDecimal vccNumDias;
	private Date vccFechaInicio;
	private Date vccFechaFin;
	private String vccObservacion;
	private String vccCopia;
	private BigDecimal vccEstado;
	private String vccObservacionEstado;

	public Vacacion() {
	}

	public Vacacion(int vccId) {
		this.vccId = vccId;
	}

	public Vacacion(int vccId, DetallePuesto detallePuesto, BigDecimal vccNumAutorizacion, Serializable vccFechaEmision,
			BigDecimal vccNumDias, Date vccFechaInicio, Date vccFechaFin, String vccObservacion, String vccCopia,
			BigDecimal vccEstado, String vccObservacionEstado) {
		this.vccId = vccId;
		this.detallePuesto = detallePuesto;
		this.vccNumAutorizacion = vccNumAutorizacion;
		this.vccFechaEmision = vccFechaEmision;
		this.vccNumDias = vccNumDias;
		this.vccFechaInicio = vccFechaInicio;
		this.vccFechaFin = vccFechaFin;
		this.vccObservacion = vccObservacion;
		this.vccCopia = vccCopia;
		this.vccEstado = vccEstado;
		this.vccObservacionEstado = vccObservacionEstado;
	}

	@Id

	@Column(name = "VCC_ID", unique = true, nullable = false, precision = 6, scale = 0)
	public int getVccId() {
		return this.vccId;
	}

	public void setVccId(int vccId) {
		this.vccId = vccId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DTPS_ID")
	public DetallePuesto getDetallePuesto() {
		return this.detallePuesto;
	}

	public void setDetallePuesto(DetallePuesto detallePuesto) {
		this.detallePuesto = detallePuesto;
	}

	@Column(name = "VCC_NUM_AUTORIZACION", precision = 22, scale = 0)
	public BigDecimal getVccNumAutorizacion() {
		return this.vccNumAutorizacion;
	}

	public void setVccNumAutorizacion(BigDecimal vccNumAutorizacion) {
		this.vccNumAutorizacion = vccNumAutorizacion;
	}

	@Column(name = "VCC_FECHA_EMISION")
	public Serializable getVccFechaEmision() {
		return this.vccFechaEmision;
	}

	public void setVccFechaEmision(Serializable vccFechaEmision) {
		this.vccFechaEmision = vccFechaEmision;
	}

	@Column(name = "VCC_NUM_DIAS", precision = 22, scale = 0)
	public BigDecimal getVccNumDias() {
		return this.vccNumDias;
	}

	public void setVccNumDias(BigDecimal vccNumDias) {
		this.vccNumDias = vccNumDias;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "VCC_FECHA_INICIO", length = 7)
	public Date getVccFechaInicio() {
		return this.vccFechaInicio;
	}

	public void setVccFechaInicio(Date vccFechaInicio) {
		this.vccFechaInicio = vccFechaInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "VCC_FECHA_FIN", length = 7)
	public Date getVccFechaFin() {
		return this.vccFechaFin;
	}

	public void setVccFechaFin(Date vccFechaFin) {
		this.vccFechaFin = vccFechaFin;
	}

	@Column(name = "VCC_OBSERVACION", length = 512)
	public String getVccObservacion() {
		return this.vccObservacion;
	}

	public void setVccObservacion(String vccObservacion) {
		this.vccObservacion = vccObservacion;
	}

	@Column(name = "VCC_COPIA", length = 512)
	public String getVccCopia() {
		return this.vccCopia;
	}

	public void setVccCopia(String vccCopia) {
		this.vccCopia = vccCopia;
	}

	@Column(name = "VCC_ESTADO", precision = 22, scale = 0)
	public BigDecimal getVccEstado() {
		return this.vccEstado;
	}

	public void setVccEstado(BigDecimal vccEstado) {
		this.vccEstado = vccEstado;
	}

	@Column(name = "VCC_OBSERVACION_ESTADO", length = 512)
	public String getVccObservacionEstado() {
		return this.vccObservacionEstado;
	}

	public void setVccObservacionEstado(String vccObservacionEstado) {
		this.vccObservacionEstado = vccObservacionEstado;
	}

}
