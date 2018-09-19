package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the CATEGORIA_FALTA database table.
 * 
 */
@Entity
@Table(name="CATEGORIA_FALTA")
@NamedQuery(name="CategoriaFalta.findAll", query="SELECT c FROM CategoriaFalta c")
public class CategoriaFalta implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ctgflId;
	private int ctgflEstado;
	private int ctgflFrecuenciaMax;
	private int ctgflFrecuenciaMin;
	private int ctgflMinuntosMin;
	private int ctgflMinutosMax;
	private String ctgflObservacion;
	private float ctgflPorcentajeBase;
	private Categoria categoria;
	private Regimen regimen;
	private Falta falta;
	private Sancion sancion;
	private List<DetallePuestoSancion> detallePuestoSancions;

	public CategoriaFalta() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CTGFL_ID")
	public int getCtgflId() {
		return this.ctgflId;
	}

	public void setCtgflId(int ctgflId) {
		this.ctgflId = ctgflId;
	}


	@Column(name="CTGFL_ESTADO")
	public int getCtgflEstado() {
		return this.ctgflEstado;
	}

	public void setCtgflEstado(int ctgflEstado) {
		this.ctgflEstado = ctgflEstado;
	}


	@Column(name="CTGFL_FRECUENCIA_MAX")
	public int getCtgflFrecuenciaMax() {
		return this.ctgflFrecuenciaMax;
	}

	public void setCtgflFrecuenciaMax(int ctgflFrecuenciaMax) {
		this.ctgflFrecuenciaMax = ctgflFrecuenciaMax;
	}

	@Column(name="CTGFL_FRECUENCIA_MIN")
	public int getCtgflFrecuenciaMin() {
		return ctgflFrecuenciaMin;
	}


	public void setCtgflFrecuenciaMin(int ctgflFrecuenciaMin) {
		this.ctgflFrecuenciaMin = ctgflFrecuenciaMin;
	}



	@Column(name="CTGFL_MINUNTOS_MIN")
	public int getCtgflMinuntosMin() {
		return this.ctgflMinuntosMin;
	}

	public void setCtgflMinuntosMin(int ctgflMinuntosMin) {
		this.ctgflMinuntosMin = ctgflMinuntosMin;
	}


	@Column(name="CTGFL_MINUTOS_MAX")
	public int getCtgflMinutosMax() {
		return this.ctgflMinutosMax;
	}

	public void setCtgflMinutosMax(int ctgflMinutosMax) {
		this.ctgflMinutosMax = ctgflMinutosMax;
	}

	


	@Column(name="CTGFL_OBSERVACION")
	public String getCtgflObservacion() {
		return this.ctgflObservacion;
	}

	public void setCtgflObservacion(String ctgflObservacion) {
		this.ctgflObservacion = ctgflObservacion;
	}


	@Column(name="CTGFL_PORCENTAJE__BASE")
	public float getCtgflPorcentajeBase() {
		return this.ctgflPorcentajeBase;
	}

	public void setCtgflPorcentajeBase(float ctgflPorcentajeBase) {
		this.ctgflPorcentajeBase = ctgflPorcentajeBase;
	}


	//bi-directional many-to-one association to Categoria
	@ManyToOne
	@JoinColumn(name="CTG_ID")
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

	@ManyToOne
	@JoinColumn(name="RGM_ID")
	public Regimen getRegimen() {
		return regimen;
	}


	public void setRegimen(Regimen regimen) {
		this.regimen = regimen;
	}


	//bi-directional many-to-one association to Falta
	@ManyToOne
	@JoinColumn(name="FL_ID")
	public Falta getFalta() {
		return this.falta;
	}

	public void setFalta(Falta falta) {
		this.falta = falta;
	}


	//bi-directional many-to-one association to Sancion
	@ManyToOne
	@JoinColumn(name="SN_ID")
	public Sancion getSancion() {
		return this.sancion;
	}

	public void setSancion(Sancion sancion) {
		this.sancion = sancion;
	}


	//bi-directional many-to-one association to DetallePuestoSancion
	@OneToMany(mappedBy="categoriaFalta", fetch=FetchType.LAZY)
	public List<DetallePuestoSancion> getDetallePuestoSancions() {
		return this.detallePuestoSancions;
	}

	public void setDetallePuestoSancions(List<DetallePuestoSancion> detallePuestoSancions) {
		this.detallePuestoSancions = detallePuestoSancions;
	}

	

}