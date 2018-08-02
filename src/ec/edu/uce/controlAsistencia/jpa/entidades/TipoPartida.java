package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TIPO_PARTIDA database table.
 * 
 */
@Entity
@Table(name="TIPO_PARTIDA")
@NamedQuery(name="TipoPartida.findAll", query="SELECT t FROM TipoPartida t")
public class TipoPartida implements Serializable {
	private static final long serialVersionUID = 1L;
	private long tppId;
	private String tppDescripcion;
	private String tppModalidad;
	private List<PartidaIndividual> partidaIndividuals;

	public TipoPartida() {
	}


	@Id
	@SequenceGenerator(name="TIPO_PARTIDA_TPPID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPO_PARTIDA_TPPID_GENERATOR")
	@Column(name="TPP_ID")
	public long getTppId() {
		return this.tppId;
	}

	public void setTppId(long tppId) {
		this.tppId = tppId;
	}


	@Column(name="TPP_DESCRIPCION")
	public String getTppDescripcion() {
		return this.tppDescripcion;
	}

	public void setTppDescripcion(String tppDescripcion) {
		this.tppDescripcion = tppDescripcion;
	}


	@Column(name="TPP_MODALIDAD")
	public String getTppModalidad() {
		return this.tppModalidad;
	}

	public void setTppModalidad(String tppModalidad) {
		this.tppModalidad = tppModalidad;
	}


	//bi-directional many-to-one association to PartidaIndividual
	@OneToMany(mappedBy="tipoPartida", fetch=FetchType.EAGER)
	public List<PartidaIndividual> getPartidaIndividuals() {
		return this.partidaIndividuals;
	}

	public void setPartidaIndividuals(List<PartidaIndividual> partidaIndividuals) {
		this.partidaIndividuals = partidaIndividuals;
	}

	public PartidaIndividual addPartidaIndividual(PartidaIndividual partidaIndividual) {
		getPartidaIndividuals().add(partidaIndividual);
		partidaIndividual.setTipoPartida(this);

		return partidaIndividual;
	}

	public PartidaIndividual removePartidaIndividual(PartidaIndividual partidaIndividual) {
		getPartidaIndividuals().remove(partidaIndividual);
		partidaIndividual.setTipoPartida(null);

		return partidaIndividual;
	}

}