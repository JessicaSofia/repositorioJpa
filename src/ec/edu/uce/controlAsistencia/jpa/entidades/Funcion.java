package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FUNCION database table.
 * 
 */
@Entity
@NamedQuery(name="Funcion.findAll", query="SELECT f FROM Funcion f")
public class Funcion implements Serializable {
	private static final long serialVersionUID = 1L;
	private long fncId;
	private String fncCodigoNomina;
	private String fncDescripcion;
	private List<FuncionPuesto> funcionPuestos;

	public Funcion() {
	}


	@Id
	@Column(name="FNC_ID")
	public long getFncId() {
		return this.fncId;
	}

	public void setFncId(long fncId) {
		this.fncId = fncId;
	}


	@Column(name="FNC_CODIGO_NOMINA")
	public String getFncCodigoNomina() {
		return this.fncCodigoNomina;
	}

	public void setFncCodigoNomina(String fncCodigoNomina) {
		this.fncCodigoNomina = fncCodigoNomina;
	}


	@Column(name="FNC_DESCRIPCION")
	public String getFncDescripcion() {
		return this.fncDescripcion;
	}

	public void setFncDescripcion(String fncDescripcion) {
		this.fncDescripcion = fncDescripcion;
	}


	//bi-directional many-to-one association to FuncionPuesto
	@OneToMany(mappedBy="funcion", fetch=FetchType.LAZY)
	public List<FuncionPuesto> getFuncionPuestos() {
		return this.funcionPuestos;
	}

	public void setFuncionPuestos(List<FuncionPuesto> funcionPuestos) {
		this.funcionPuestos = funcionPuestos;
	}

	
}