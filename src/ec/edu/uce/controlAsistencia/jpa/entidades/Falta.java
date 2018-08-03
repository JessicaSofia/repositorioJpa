package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FALTA database table.
 * 
 */
@Entity
@NamedQuery(name="Falta.findAll", query="SELECT f FROM Falta f")
public class Falta implements Serializable {
	private static final long serialVersionUID = 1L;
	private int flId;
	private String flNombre;
	private String flDescripcion;
	private BigDecimal flEstado;
	private List<CategoriaFalta> categoriaFaltas;

	public Falta() {
	}


	@Id
	@Column(name="FL_ID")
	public int getFlId() {
		return this.flId;
	}

	public void setFlId(int flId) {
		this.flId = flId;
	}


	@Column(name="FL__NOMBRE")
	public String getFlNombre() {
		return this.flNombre;
	}

	public void setFlNombre(String flNombre) {
		this.flNombre = flNombre;
	}


	@Column(name="FL_DESCRIPCION")
	public String getFlDescripcion() {
		return this.flDescripcion;
	}

	public void setFlDescripcion(String flDescripcion) {
		this.flDescripcion = flDescripcion;
	}


	@Column(name="FL_ESTADO")
	public BigDecimal getFlEstado() {
		return this.flEstado;
	}

	public void setFlEstado(BigDecimal flEstado) {
		this.flEstado = flEstado;
	}


	//bi-directional many-to-one association to CategoriaFalta
	@OneToMany(mappedBy="falta", fetch=FetchType.LAZY)
	public List<CategoriaFalta> getCategoriaFaltas() {
		return this.categoriaFaltas;
	}

	public void setCategoriaFaltas(List<CategoriaFalta> categoriaFaltas) {
		this.categoriaFaltas = categoriaFaltas;
	}


}