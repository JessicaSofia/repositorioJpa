package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the GRUPO_OCUPACIONAL database table.
 * 
 */
@Entity
@Table(name="GRUPO_OCUPACIONAL")
@NamedQuery(name="GrupoOcupacional.findAll", query="SELECT g FROM GrupoOcupacional g")
public class GrupoOcupacional implements Serializable {
	private static final long serialVersionUID = 1L;
	private long grocId;
	private String grocDescripcion;
	private int grocGrado;
	private int grocRmu;
	private int grocRmuHora;
	private Regimen regimen;
	private List<Puesto> puestos;

	public GrupoOcupacional() {
	}


	@Id
	@SequenceGenerator(name="GRUPO_OCUPACIONAL_GROCID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GRUPO_OCUPACIONAL_GROCID_GENERATOR")
	@Column(name="GROC_ID")
	public long getGrocId() {
		return this.grocId;
	}

	public void setGrocId(long grocId) {
		this.grocId = grocId;
	}


	@Column(name="GROC_DESCRIPCION")
	public String getGrocDescripcion() {
		return this.grocDescripcion;
	}

	public void setGrocDescripcion(String grocDescripcion) {
		this.grocDescripcion = grocDescripcion;
	}


	@Column(name="GROC_GRADO")
	public int getGrocGrado() {
		return this.grocGrado;
	}

	public void setGrocGrado(int grocGrado) {
		this.grocGrado = grocGrado;
	}


	@Column(name="GROC_RMU")
	public int getGrocRmu() {
		return this.grocRmu;
	}

	public void setGrocRmu(int grocRmu) {
		this.grocRmu = grocRmu;
	}


	@Column(name="GROC_RMU_HORA")
	public int getGrocRmuHora() {
		return this.grocRmuHora;
	}

	public void setGrocRmuHora(int grocRmuHora) {
		this.grocRmuHora = grocRmuHora;
	}


	//bi-directional many-to-one association to Regimen
	@ManyToOne
	@JoinColumn(name="RGM_ID")
	public Regimen getRegimen() {
		return this.regimen;
	}

	public void setRegimen(Regimen regimen) {
		this.regimen = regimen;
	}


	//bi-directional many-to-one association to Puesto
	@OneToMany(mappedBy="grupoOcupacional", fetch=FetchType.EAGER)
	public List<Puesto> getPuestos() {
		return this.puestos;
	}

	public void setPuestos(List<Puesto> puestos) {
		this.puestos = puestos;
	}

	public Puesto addPuesto(Puesto puesto) {
		getPuestos().add(puesto);
		puesto.setGrupoOcupacional(this);

		return puesto;
	}

	public Puesto removePuesto(Puesto puesto) {
		getPuestos().remove(puesto);
		puesto.setGrupoOcupacional(null);

		return puesto;
	}

}