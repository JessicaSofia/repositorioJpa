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
	@OneToMany(mappedBy="proceso", fetch=FetchType.LAZY)
	public List<Serie> getSeries() {
		return this.series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}



}