package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CATEGORIA_TIEMPO database table.
 * 
 */
@Entity
@Table(name="CATEGORIA_TIEMPO")
@NamedQuery(name="CategoriaTiempo.findAll", query="SELECT c FROM CategoriaTiempo c")
public class CategoriaTiempo implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cttmId;
	private BigDecimal cttmEstado;
	private List<CategoriaRango> categoriaRangos;
	private CategoriaDocente categoriaDocente;
	private TiempoDedicacion tiempoDedicacion;

	public CategoriaTiempo() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CTTM_ID")
	public long getCttmId() {
		return this.cttmId;
	}

	public void setCttmId(long cttmId) {
		this.cttmId = cttmId;
	}


	@Column(name="CTTM_ESTADO")
	public BigDecimal getCttmEstado() {
		return this.cttmEstado;
	}

	public void setCttmEstado(BigDecimal cttmEstado) {
		this.cttmEstado = cttmEstado;
	}


	//bi-directional many-to-one association to CategoriaRango
	@OneToMany(mappedBy="categoriaTiempo", fetch=FetchType.LAZY)
	public List<CategoriaRango> getCategoriaRangos() {
		return this.categoriaRangos;
	}

	public void setCategoriaRangos(List<CategoriaRango> categoriaRangos) {
		this.categoriaRangos = categoriaRangos;
	}



	//bi-directional many-to-one association to CategoriaDocente
	@ManyToOne
	@JoinColumn(name="CTDC_ID")
	public CategoriaDocente getCategoriaDocente() {
		return this.categoriaDocente;
	}

	public void setCategoriaDocente(CategoriaDocente categoriaDocente) {
		this.categoriaDocente = categoriaDocente;
	}


	//bi-directional many-to-one association to TiempoDedicacion
	@ManyToOne
	@JoinColumn(name="TMDD_ID")
	public TiempoDedicacion getTiempoDedicacion() {
		return this.tiempoDedicacion;
	}

	public void setTiempoDedicacion(TiempoDedicacion tiempoDedicacion) {
		this.tiempoDedicacion = tiempoDedicacion;
	}

}