package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PROCESO database table.
 * 
 */
@Entity
@NamedQuery(name="Proceso.findAll", query="SELECT p FROM Proceso p")
public class Proceso implements Serializable {
	private static final long serialVersionUID = 1L;
	private long prcId;
	private String prcDescripcion;
	private List<Serie> series;

	public Proceso() {
	}


	@Id
	@SequenceGenerator(name="PROCESO_PRCID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROCESO_PRCID_GENERATOR")
	@Column(name="PRC_ID")
	public long getPrcId() {
		return this.prcId;
	}

	public void setPrcId(long prcId) {
		this.prcId = prcId;
	}


	@Column(name="PRC_DESCRIPCION")
	public String getPrcDescripcion() {
		return this.prcDescripcion;
	}

	public void setPrcDescripcion(String prcDescripcion) {
		this.prcDescripcion = prcDescripcion;
	}


	//bi-directional many-to-one association to Serie
	@OneToMany(mappedBy="proceso", fetch=FetchType.EAGER)
	public List<Serie> getSeries() {
		return this.series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}

	public Serie addSery(Serie sery) {
		getSeries().add(sery);
		sery.setProceso(this);

		return sery;
	}

	public Serie removeSery(Serie sery) {
		getSeries().remove(sery);
		sery.setProceso(null);

		return sery;
	}

}