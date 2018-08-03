package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FICHA_EMPLEADO database table.
 * 
 */
@Entity
@Table(name="FICHA_EMPLEADO")
@NamedQuery(name="FichaEmpleado.findAll", query="SELECT f FROM FichaEmpleado f")
public class FichaEmpleado implements Serializable {
	private static final long serialVersionUID = 1L;
	private int fcemId;
	private int fcemEstado;
	private List<DetallePuesto> detallePuestos;
	private Categoria categoria;
	private Persona persona;
	private TipoEmpleado tipoEmpleado;

	public FichaEmpleado() {
	}


	@Id
	@Column(name="FCEM_ID")
	public int getFcemId() {
		return this.fcemId;
	}

	public void setFcemId(int fcemId) {
		this.fcemId = fcemId;
	}


	@Column(name="FCEM_ESTADO")
	public int getFcemEstado() {
		return this.fcemEstado;
	}

	public void setFcemEstado(int fcemEstado) {
		this.fcemEstado = fcemEstado;
	}


	//bi-directional many-to-one association to DetallePuesto
	@OneToMany(mappedBy="fichaEmpleado", fetch=FetchType.LAZY)
	public List<DetallePuesto> getDetallePuestos() {
		return this.detallePuestos;
	}

	public void setDetallePuestos(List<DetallePuesto> detallePuestos) {
		this.detallePuestos = detallePuestos;
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


	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="PRS_ID")
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	//bi-directional many-to-one association to TipoEmpleado
	@ManyToOne
	@JoinColumn(name="TPEM_ID")
	public TipoEmpleado getTipoEmpleado() {
		return this.tipoEmpleado;
	}

	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

}