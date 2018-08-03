package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the NIVEL_COMPETENCIA database table.
 * 
 */
@Entity
@Table(name="NIVEL_COMPETENCIA")
@NamedQuery(name="NivelCompetencia.findAll", query="SELECT n FROM NivelCompetencia n")
public class NivelCompetencia implements Serializable {
	private static final long serialVersionUID = 1L;
	private long nvcmId;
	private String nvcmComportamiento;
	private BigDecimal nvcmDescripcion;
	private List<CompetenciaPuesto> competenciaPuestos;
	private Competencia competencia;

	public NivelCompetencia() {
	}


	@Id
	@Column(name="NVCM_ID")
	public long getNvcmId() {
		return this.nvcmId;
	}

	public void setNvcmId(long nvcmId) {
		this.nvcmId = nvcmId;
	}


	@Column(name="NVCM_COMPORTAMIENTO")
	public String getNvcmComportamiento() {
		return this.nvcmComportamiento;
	}

	public void setNvcmComportamiento(String nvcmComportamiento) {
		this.nvcmComportamiento = nvcmComportamiento;
	}


	@Column(name="NVCM_DESCRIPCION")
	public BigDecimal getNvcmDescripcion() {
		return this.nvcmDescripcion;
	}

	public void setNvcmDescripcion(BigDecimal nvcmDescripcion) {
		this.nvcmDescripcion = nvcmDescripcion;
	}


	//bi-directional many-to-one association to CompetenciaPuesto
	@OneToMany(mappedBy="nivelCompetencia", fetch=FetchType.LAZY)
	public List<CompetenciaPuesto> getCompetenciaPuestos() {
		return this.competenciaPuestos;
	}

	public void setCompetenciaPuestos(List<CompetenciaPuesto> competenciaPuestos) {
		this.competenciaPuestos = competenciaPuestos;
	}




	//bi-directional many-to-one association to Competencia
	@ManyToOne
	@JoinColumn(name="CMP_ID")
	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

}