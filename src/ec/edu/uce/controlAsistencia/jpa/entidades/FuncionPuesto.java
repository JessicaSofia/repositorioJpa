package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FUNCION_PUESTO database table.
 * 
 */
@Entity
@Table(name="FUNCION_PUESTO")
@NamedQuery(name="FuncionPuesto.findAll", query="SELECT f FROM FuncionPuesto f")
public class FuncionPuesto implements Serializable {
	private static final long serialVersionUID = 1L;
	private long fnpsId;
	private Funcion funcion;
	private Puesto puesto;

	public FuncionPuesto() {
	}


	@Id
	@Column(name="FNPS_ID")
	public long getFnpsId() {
		return this.fnpsId;
	}

	public void setFnpsId(long fnpsId) {
		this.fnpsId = fnpsId;
	}


	//bi-directional many-to-one association to Funcion
	@ManyToOne
	@JoinColumn(name="FNC_ID")
	public Funcion getFuncion() {
		return this.funcion;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}


	//bi-directional many-to-one association to Puesto
	@ManyToOne
	@JoinColumn(name="PST_ID")
	public Puesto getPuesto() {
		return this.puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

}