package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the COMPETENCIA_PUESTO database table.
 * 
 */
@Entity
@Table(name="COMPETENCIA_PUESTO")
@NamedQuery(name="CompetenciaPuesto.findAll", query="SELECT c FROM CompetenciaPuesto c")
public class CompetenciaPuesto implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cmpsId;
	private NivelCompetencia nivelCompetencia;
	private Puesto puesto;

	public CompetenciaPuesto() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CMPS_ID")
	public long getCmpsId() {
		return this.cmpsId;
	}

	public void setCmpsId(long cmpsId) {
		this.cmpsId = cmpsId;
	}


	//bi-directional many-to-one association to NivelCompetencia
	@ManyToOne
	@JoinColumn(name="NVCM_ID")
	public NivelCompetencia getNivelCompetencia() {
		return this.nivelCompetencia;
	}

	public void setNivelCompetencia(NivelCompetencia nivelCompetencia) {
		this.nivelCompetencia = nivelCompetencia;
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