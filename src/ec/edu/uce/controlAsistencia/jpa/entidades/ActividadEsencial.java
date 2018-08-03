package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ACTIVIDAD_ESENCIAL database table.
 * 
 */
@Entity
@Table(name="ACTIVIDAD_ESENCIAL")
@NamedQuery(name="ActividadEsencial.findAll", query="SELECT a FROM ActividadEsencial a")
public class ActividadEsencial implements Serializable {
	private static final long serialVersionUID = 1L;
	private long acesId;
	private String acesDescripcion;
	private List<ActividadPuesto> actividadPuestos;

	public ActividadEsencial() {
	}


	@Id
	@SequenceGenerator(name="ACTIVIDAD_ESENCIAL_ACESID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACTIVIDAD_ESENCIAL_ACESID_GENERATOR")
	@Column(name="ACES_ID")
	public long getAcesId() {
		return this.acesId;
	}

	public void setAcesId(long acesId) {
		this.acesId = acesId;
	}


	@Column(name="ACES_DESCRIPCION")
	public String getAcesDescripcion() {
		return this.acesDescripcion;
	}

	public void setAcesDescripcion(String acesDescripcion) {
		this.acesDescripcion = acesDescripcion;
	}


	//bi-directional many-to-one association to ActividadPuesto
	@OneToMany(mappedBy="actividadEsencial", fetch=FetchType.LAZY)
	public List<ActividadPuesto> getActividadPuestos() {
		return this.actividadPuestos;
	}

	public void setActividadPuestos(List<ActividadPuesto> actividadPuestos) {
		this.actividadPuestos = actividadPuestos;
	}


}