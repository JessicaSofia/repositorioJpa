package ec.edu.uce.controlAsistencia.jpa.entidades;
// Generated 07-mar-2018 22:35:26 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CategoriaFalta generated by hbm2java
 */
@Entity
@Table(name = "CATEGORIA_FALTA", schema = "BDTALENTOHUMANO")
public class CategoriaFalta implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ctgflId;
	private Categoria categoria;
	private Falta falta;
	private BigDecimal ctgflFrecuenciaMax;
	private BigDecimal ctgflMinuntosMin;
	private BigDecimal ctgflMinutosMax;
	private String ctgflObservacion;
	private float ctgflPorcentajeBase;
	private TipoSancion tipoSancion;
	private BigDecimal ctgflEstado;
	private List<DetallePuestoSancion> detallePuestoSancions = new ArrayList<>();
	public CategoriaFalta() {
	}

	public CategoriaFalta(int ctgflId) {
		this.ctgflId = ctgflId;
	}

	public CategoriaFalta(int ctgflId, Categoria categoria, Falta falta, BigDecimal ctgflFrecuenciaMax,
			BigDecimal ctgflMinuntosMin, BigDecimal ctgflMinutosMax, String ctgflObservacion,
			float ctgflPorcentajeBase, BigDecimal ctgflEstado,
			List<DetallePuestoSancion> detallePuestoSancions) {
		this.ctgflId = ctgflId;
		this.categoria = categoria;
		this.falta = falta;
		this.ctgflFrecuenciaMax = ctgflFrecuenciaMax;
		this.ctgflMinuntosMin = ctgflMinuntosMin;
		this.ctgflMinutosMax = ctgflMinutosMax;
		this.ctgflObservacion = ctgflObservacion;
		this.ctgflPorcentajeBase = ctgflPorcentajeBase;
		this.ctgflEstado = ctgflEstado;
		this.detallePuestoSancions = detallePuestoSancions;
	}

	@Id
	@Column(name = "CTGFL_ID", unique = true, nullable = false, precision = 6, scale = 0)
	public int getCtgflId() {
		return this.ctgflId;
	}

	public void setCtgflId(int ctgflId) {
		this.ctgflId = ctgflId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTG_ID")
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FL_ID")
	public Falta getFalta() {
		return this.falta;
	}

	public void setFalta(Falta falta) {
		this.falta = falta;
	}

	@Column(name = "CTGFL_FRECUENCIA_MAX", precision = 22, scale = 0)
	public BigDecimal getCtgflFrecuenciaMax() {
		return this.ctgflFrecuenciaMax;
	}

	public void setCtgflFrecuenciaMax(BigDecimal ctgflFrecuenciaMax) {
		this.ctgflFrecuenciaMax = ctgflFrecuenciaMax;
	}

	@Column(name = "CTGFL_MINUNTOS_MIN", precision = 22, scale = 0)
	public BigDecimal getCtgflMinuntosMin() {
		return this.ctgflMinuntosMin;
	}

	public void setCtgflMinuntosMin(BigDecimal ctgflMinuntosMin) {
		this.ctgflMinuntosMin = ctgflMinuntosMin;
	}

	@Column(name = "CTGFL_MINUTOS_MAX", precision = 22, scale = 0)
	public BigDecimal getCtgflMinutosMax() {
		return this.ctgflMinutosMax;
	}

	public void setCtgflMinutosMax(BigDecimal ctgflMinutosMax) {
		this.ctgflMinutosMax = ctgflMinutosMax;
	}

	@Column(name = "CTGFL_OBSERVACION", length = 512)
	public String getCtgflObservacion() {
		return this.ctgflObservacion;
	}

	public void setCtgflObservacion(String ctgflObservacion) {
		this.ctgflObservacion = ctgflObservacion;
	}

	@Column(name = "CTGFL_PORCENTAJE__BASE")
	public float getCtgflPorcentajeBase() {
		return this.ctgflPorcentajeBase;
	}

	public void setCtgflPorcentajeBase(float ctgflPorcentajeBase) {
		this.ctgflPorcentajeBase = ctgflPorcentajeBase;
	}


	@Column(name = "CTGFL_ESTADO", precision = 22, scale = 0)
	public BigDecimal getCtgflEstado() {
		return this.ctgflEstado;
	}

	public void setCtgflEstado(BigDecimal ctgflEstado) {
		this.ctgflEstado = ctgflEstado;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "categoriaFalta")
	public List<DetallePuestoSancion> getDetallePuestoSancions() {
		return this.detallePuestoSancions;
	}

	public void setDetallePuestoSancions(List<DetallePuestoSancion> detallePuestoSancions) {
		this.detallePuestoSancions = detallePuestoSancions;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "TPSN_ID")
	public TipoSancion getTipoSancion() {
		return tipoSancion;
	}

	public void setTipoSancion(TipoSancion tipoSancion) {
		this.tipoSancion = tipoSancion;
	}
	

}
