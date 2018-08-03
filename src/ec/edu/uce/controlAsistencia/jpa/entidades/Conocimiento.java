package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CONOCIMIENTO database table.
 * 
 */
@Entity
@NamedQuery(name="Conocimiento.findAll", query="SELECT c FROM Conocimiento c")
public class Conocimiento implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cncId;
	private String cncDescripcion;
	private List<ConocimientoPuesto> conocimientoPuestos;

	public Conocimiento() {
	}


	@Id
	@SequenceGenerator(name="CONOCIMIENTO_CNCID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONOCIMIENTO_CNCID_GENERATOR")
	@Column(name="CNC_ID")
	public long getCncId() {
		return this.cncId;
	}

	public void setCncId(long cncId) {
		this.cncId = cncId;
	}


	@Column(name="CNC_DESCRIPCION")
	public String getCncDescripcion() {
		return this.cncDescripcion;
	}

	public void setCncDescripcion(String cncDescripcion) {
		this.cncDescripcion = cncDescripcion;
	}


	//bi-directional many-to-one association to ConocimientoPuesto
	@OneToMany(mappedBy="conocimiento", fetch=FetchType.LAZY)
	public List<ConocimientoPuesto> getConocimientoPuestos() {
		return this.conocimientoPuestos;
	}

	public void setConocimientoPuestos(List<ConocimientoPuesto> conocimientoPuestos) {
		this.conocimientoPuestos = conocimientoPuestos;
	}



}