package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the RANGO_GRADUAL database table.
 * 
 */
@Entity
@Table(name="RANGO_GRADUAL")
@NamedQuery(name="RangoGradual.findAll", query="SELECT r FROM RangoGradual r")
public class RangoGradual implements Serializable {
	private static final long serialVersionUID = 1L;
	private long rngrId;
	private String rngrDescripcion;
	private BigDecimal rngrEstado;
	private List<CategoriaRango> categoriaRangos;

	public RangoGradual() {
	}


	@Id
	@SequenceGenerator(name="RANGO_GRADUAL_RNGRID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RANGO_GRADUAL_RNGRID_GENERATOR")
	@Column(name="RNGR_ID")
	public long getRngrId() {
		return this.rngrId;
	}

	public void setRngrId(long rngrId) {
		this.rngrId = rngrId;
	}


	@Column(name="RNGR_DESCRIPCION")
	public String getRngrDescripcion() {
		return this.rngrDescripcion;
	}

	public void setRngrDescripcion(String rngrDescripcion) {
		this.rngrDescripcion = rngrDescripcion;
	}


	@Column(name="RNGR_ESTADO")
	public BigDecimal getRngrEstado() {
		return this.rngrEstado;
	}

	public void setRngrEstado(BigDecimal rngrEstado) {
		this.rngrEstado = rngrEstado;
	}


	//bi-directional many-to-one association to CategoriaRango
	@OneToMany(mappedBy="rangoGradual", fetch=FetchType.EAGER)
	public List<CategoriaRango> getCategoriaRangos() {
		return this.categoriaRangos;
	}

	public void setCategoriaRangos(List<CategoriaRango> categoriaRangos) {
		this.categoriaRangos = categoriaRangos;
	}

	public CategoriaRango addCategoriaRango(CategoriaRango categoriaRango) {
		getCategoriaRangos().add(categoriaRango);
		categoriaRango.setRangoGradual(this);

		return categoriaRango;
	}

	public CategoriaRango removeCategoriaRango(CategoriaRango categoriaRango) {
		getCategoriaRangos().remove(categoriaRango);
		categoriaRango.setRangoGradual(null);

		return categoriaRango;
	}

}