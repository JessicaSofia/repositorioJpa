package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CATEGORIA database table.
 * 
 */
@Entity
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ctgId;
	private String ctgCodigoNomina;
	private String ctgDescripcion;
	private List<CategoriaFalta> categoriaFaltas;
	private List<FichaEmpleado> fichaEmpleados;

	public Categoria() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CTG_ID")
	public int getCtgId() {
		return this.ctgId;
	}

	public void setCtgId(int ctgId) {
		this.ctgId = ctgId;
	}


	@Column(name="CTG_CODIGO_NOMINA")
	public String getCtgCodigoNomina() {
		return this.ctgCodigoNomina;
	}

	public void setCtgCodigoNomina(String ctgCodigoNomina) {
		this.ctgCodigoNomina = ctgCodigoNomina;
	}


	@Column(name="CTG_DESCRIPCION")
	public String getCtgDescripcion() {
		return this.ctgDescripcion;
	}

	public void setCtgDescripcion(String ctgDescripcion) {
		this.ctgDescripcion = ctgDescripcion;
	}


	//bi-directional many-to-one association to CategoriaFalta
	@OneToMany(mappedBy="categoria", fetch=FetchType.LAZY)
	public List<CategoriaFalta> getCategoriaFaltas() {
		return this.categoriaFaltas;
	}

	public void setCategoriaFaltas(List<CategoriaFalta> categoriaFaltas) {
		this.categoriaFaltas = categoriaFaltas;
	}



	//bi-directional many-to-one association to FichaEmpleado
	@OneToMany(mappedBy="categoria", fetch=FetchType.LAZY)
	public List<FichaEmpleado> getFichaEmpleados() {
		return this.fichaEmpleados;
	}

	public void setFichaEmpleados(List<FichaEmpleado> fichaEmpleados) {
		this.fichaEmpleados = fichaEmpleados;
	}

	public FichaEmpleado addFichaEmpleado(FichaEmpleado fichaEmpleado) {
		getFichaEmpleados().add(fichaEmpleado);
		fichaEmpleado.setCategoria(this);

		return fichaEmpleado;
	}

	public FichaEmpleado removeFichaEmpleado(FichaEmpleado fichaEmpleado) {
		getFichaEmpleados().remove(fichaEmpleado);
		fichaEmpleado.setCategoria(null);

		return fichaEmpleado;
	}

}