package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ETNIA database table.
 * 
 */
@Entity
@NamedQuery(name="Etnia.findAll", query="SELECT e FROM Etnia e")
public class Etnia implements Serializable {
	private static final long serialVersionUID = 1L;
	private long etnId;
	private String etnCodigoSniese;
	private String etnDescripcion;
	private List<Persona> personas;

	public Etnia() {
	}


	@Id
	@SequenceGenerator(name="ETNIA_ETNID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ETNIA_ETNID_GENERATOR")
	@Column(name="ETN_ID")
	public long getEtnId() {
		return this.etnId;
	}

	public void setEtnId(long etnId) {
		this.etnId = etnId;
	}


	@Column(name="ETN_CODIGO_SNIESE")
	public String getEtnCodigoSniese() {
		return this.etnCodigoSniese;
	}

	public void setEtnCodigoSniese(String etnCodigoSniese) {
		this.etnCodigoSniese = etnCodigoSniese;
	}


	@Column(name="ETN_DESCRIPCION")
	public String getEtnDescripcion() {
		return this.etnDescripcion;
	}

	public void setEtnDescripcion(String etnDescripcion) {
		this.etnDescripcion = etnDescripcion;
	}


	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="etnia", fetch=FetchType.EAGER)
	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona addPersona(Persona persona) {
		getPersonas().add(persona);
		persona.setEtnia(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setEtnia(null);

		return persona;
	}

}