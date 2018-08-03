package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CATEGORIA_DOCENTE database table.
 * 
 */
@Entity
@Table(name="CATEGORIA_DOCENTE")
@NamedQuery(name="CategoriaDocente.findAll", query="SELECT c FROM CategoriaDocente c")
public class CategoriaDocente implements Serializable {
	private static final long serialVersionUID = 1L;
	private long ctdcId;
	private String ctdcDescripcion;
	private BigDecimal ctdcEstado;
	private List<CategoriaTiempo> categoriaTiempos;

	public CategoriaDocente() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CTDC_ID")
	public long getCtdcId() {
		return this.ctdcId;
	}

	public void setCtdcId(long ctdcId) {
		this.ctdcId = ctdcId;
	}


	@Column(name="CTDC_DESCRIPCION")
	public String getCtdcDescripcion() {
		return this.ctdcDescripcion;
	}

	public void setCtdcDescripcion(String ctdcDescripcion) {
		this.ctdcDescripcion = ctdcDescripcion;
	}


	@Column(name="CTDC_ESTADO")
	public BigDecimal getCtdcEstado() {
		return this.ctdcEstado;
	}

	public void setCtdcEstado(BigDecimal ctdcEstado) {
		this.ctdcEstado = ctdcEstado;
	}


	//bi-directional many-to-one association to CategoriaTiempo
	@OneToMany(mappedBy="categoriaDocente", fetch=FetchType.LAZY)
	public List<CategoriaTiempo> getCategoriaTiempos() {
		return this.categoriaTiempos;
	}

	public void setCategoriaTiempos(List<CategoriaTiempo> categoriaTiempos) {
		this.categoriaTiempos = categoriaTiempos;
	}

	public CategoriaTiempo addCategoriaTiempo(CategoriaTiempo categoriaTiempo) {
		getCategoriaTiempos().add(categoriaTiempo);
		categoriaTiempo.setCategoriaDocente(this);

		return categoriaTiempo;
	}

	public CategoriaTiempo removeCategoriaTiempo(CategoriaTiempo categoriaTiempo) {
		getCategoriaTiempos().remove(categoriaTiempo);
		categoriaTiempo.setCategoriaDocente(null);

		return categoriaTiempo;
	}

}