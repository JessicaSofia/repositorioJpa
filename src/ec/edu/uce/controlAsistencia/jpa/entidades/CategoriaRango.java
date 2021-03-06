package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CATEGORIA_RANGO database table.
 * 
 */
@Entity
@Table(name="CATEGORIA_RANGO")
@NamedQuery(name="CategoriaRango.findAll", query="SELECT c FROM CategoriaRango c")
public class CategoriaRango implements Serializable {
	private static final long serialVersionUID = 1L;
	private long ctrnId;
	private BigDecimal ctrnEstado;
	private CategoriaTiempo categoriaTiempo;
	private RangoGradual rangoGradual;
	private List<Puesto> puestos;

	public CategoriaRango() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CTRN_ID")
	public long getCtrnId() {
		return this.ctrnId;
	}

	public void setCtrnId(long ctrnId) {
		this.ctrnId = ctrnId;
	}


	@Column(name="CTRN_ESTADO")
	public BigDecimal getCtrnEstado() {
		return this.ctrnEstado;
	}

	public void setCtrnEstado(BigDecimal ctrnEstado) {
		this.ctrnEstado = ctrnEstado;
	}


	//bi-directional many-to-one association to CategoriaTiempo
	@ManyToOne
	@JoinColumn(name="CTTM_ID")
	public CategoriaTiempo getCategoriaTiempo() {
		return this.categoriaTiempo;
	}

	public void setCategoriaTiempo(CategoriaTiempo categoriaTiempo) {
		this.categoriaTiempo = categoriaTiempo;
	}


	//bi-directional many-to-one association to RangoGradual
	@ManyToOne
	@JoinColumn(name="RNGR_ID")
	public RangoGradual getRangoGradual() {
		return this.rangoGradual;
	}

	public void setRangoGradual(RangoGradual rangoGradual) {
		this.rangoGradual = rangoGradual;
	}


	//bi-directional many-to-one association to Puesto
	@OneToMany(mappedBy="categoriaRango", fetch=FetchType.LAZY)
	public List<Puesto> getPuestos() {
		return this.puestos;
	}

	public void setPuestos(List<Puesto> puestos) {
		this.puestos = puestos;
	}

	

}