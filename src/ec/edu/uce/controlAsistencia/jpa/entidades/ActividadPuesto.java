package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ACTIVIDAD_PUESTO database table.
 * 
 */
@Entity
@Table(name="ACTIVIDAD_PUESTO")
@NamedQuery(name="ActividadPuesto.findAll", query="SELECT a FROM ActividadPuesto a")
public class ActividadPuesto implements Serializable {
	private static final long serialVersionUID = 1L;
	private long acpsId;
	private ActividadEsencial actividadEsencial;
	private Puesto puesto;

	public ActividadPuesto() {
	}


	@Id
	@SequenceGenerator(name="ACTIVIDAD_PUESTO_ACPSID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACTIVIDAD_PUESTO_ACPSID_GENERATOR")
	@Column(name="ACPS_ID")
	public long getAcpsId() {
		return this.acpsId;
	}

	public void setAcpsId(long acpsId) {
		this.acpsId = acpsId;
	}


	//bi-directional many-to-one association to ActividadEsencial
	@ManyToOne
	@JoinColumn(name="ACES_ID")
	public ActividadEsencial getActividadEsencial() {
		return this.actividadEsencial;
	}

	public void setActividadEsencial(ActividadEsencial actividadEsencial) {
		this.actividadEsencial = actividadEsencial;
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