package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the COMPETENCIA database table.
 * 
 */
@Entity
@NamedQuery(name="Competencia.findAll", query="SELECT c FROM Competencia c")
public class Competencia implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cmpId;
	private String cmpDefinicion;
	private String cmpDenominacion;
	private BigDecimal cmpTipo;
	private List<NivelCompetencia> nivelCompetencias;

	public Competencia() {
	}


	@Id
	@SequenceGenerator(name="COMPETENCIA_CMPID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMPETENCIA_CMPID_GENERATOR")
	@Column(name="CMP_ID")
	public long getCmpId() {
		return this.cmpId;
	}

	public void setCmpId(long cmpId) {
		this.cmpId = cmpId;
	}


	@Column(name="CMP_DEFINICION")
	public String getCmpDefinicion() {
		return this.cmpDefinicion;
	}

	public void setCmpDefinicion(String cmpDefinicion) {
		this.cmpDefinicion = cmpDefinicion;
	}


	@Column(name="CMP_DENOMINACION")
	public String getCmpDenominacion() {
		return this.cmpDenominacion;
	}

	public void setCmpDenominacion(String cmpDenominacion) {
		this.cmpDenominacion = cmpDenominacion;
	}


	@Column(name="CMP_TIPO")
	public BigDecimal getCmpTipo() {
		return this.cmpTipo;
	}

	public void setCmpTipo(BigDecimal cmpTipo) {
		this.cmpTipo = cmpTipo;
	}


	//bi-directional many-to-one association to NivelCompetencia
	@OneToMany(mappedBy="competencia", fetch=FetchType.EAGER)
	public List<NivelCompetencia> getNivelCompetencias() {
		return this.nivelCompetencias;
	}

	public void setNivelCompetencias(List<NivelCompetencia> nivelCompetencias) {
		this.nivelCompetencias = nivelCompetencias;
	}

	public NivelCompetencia addNivelCompetencia(NivelCompetencia nivelCompetencia) {
		getNivelCompetencias().add(nivelCompetencia);
		nivelCompetencia.setCompetencia(this);

		return nivelCompetencia;
	}

	public NivelCompetencia removeNivelCompetencia(NivelCompetencia nivelCompetencia) {
		getNivelCompetencias().remove(nivelCompetencia);
		nivelCompetencia.setCompetencia(null);

		return nivelCompetencia;
	}

}