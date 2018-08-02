package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NIVEL_INSTRUCCION database table.
 * 
 */
@Entity
@Table(name="NIVEL_INSTRUCCION")
@NamedQuery(name="NivelInstruccion.findAll", query="SELECT n FROM NivelInstruccion n")
public class NivelInstruccion implements Serializable {
	private static final long serialVersionUID = 1L;
	private long nvinId;
	private String nvinDescripcion;
	private List<InstruccionPuesto> instruccionPuestos;

	public NivelInstruccion() {
	}


	@Id
	@SequenceGenerator(name="NIVEL_INSTRUCCION_NVINID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NIVEL_INSTRUCCION_NVINID_GENERATOR")
	@Column(name="NVIN_ID")
	public long getNvinId() {
		return this.nvinId;
	}

	public void setNvinId(long nvinId) {
		this.nvinId = nvinId;
	}


	@Column(name="NVIN_DESCRIPCION")
	public String getNvinDescripcion() {
		return this.nvinDescripcion;
	}

	public void setNvinDescripcion(String nvinDescripcion) {
		this.nvinDescripcion = nvinDescripcion;
	}


	//bi-directional many-to-one association to InstruccionPuesto
	@OneToMany(mappedBy="nivelInstruccion", fetch=FetchType.EAGER)
	public List<InstruccionPuesto> getInstruccionPuestos() {
		return this.instruccionPuestos;
	}

	public void setInstruccionPuestos(List<InstruccionPuesto> instruccionPuestos) {
		this.instruccionPuestos = instruccionPuestos;
	}

	public InstruccionPuesto addInstruccionPuesto(InstruccionPuesto instruccionPuesto) {
		getInstruccionPuestos().add(instruccionPuesto);
		instruccionPuesto.setNivelInstruccion(this);

		return instruccionPuesto;
	}

	public InstruccionPuesto removeInstruccionPuesto(InstruccionPuesto instruccionPuesto) {
		getInstruccionPuestos().remove(instruccionPuesto);
		instruccionPuesto.setNivelInstruccion(null);

		return instruccionPuesto;
	}

}