package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CONOCIMIENTO_PUESTO database table.
 * 
 */
@Entity
@Table(name="CONOCIMIENTO_PUESTO")
@NamedQuery(name="ConocimientoPuesto.findAll", query="SELECT c FROM ConocimientoPuesto c")
public class ConocimientoPuesto implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cnpsId;
	private Conocimiento conocimiento;
	private Puesto puesto;

	public ConocimientoPuesto() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CNPS_ID")
	public long getCnpsId() {
		return this.cnpsId;
	}

	public void setCnpsId(long cnpsId) {
		this.cnpsId = cnpsId;
	}


	//bi-directional many-to-one association to Conocimiento
	@ManyToOne
	@JoinColumn(name="CNC_ID")
	public Conocimiento getConocimiento() {
		return this.conocimiento;
	}

	public void setConocimiento(Conocimiento conocimiento) {
		this.conocimiento = conocimiento;
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