package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the TRAMITE database table.
 * 
 */
@Entity
@NamedQuery(name="Tramite.findAll", query="SELECT t FROM Tramite t")
public class Tramite implements Serializable {
	private static final long serialVersionUID = 1L;
	private long trmId;
	private String trmArchivo;
	private BigDecimal trmEstado;
	private Timestamp trmFecha;
	private String trmObservacion;
	private BigDecimal trmUsuario;
	private List<Candidato> candidatos;
	private Puesto puesto;

	public Tramite() {
	}


	@Id
	@SequenceGenerator(name="TRAMITE_TRMID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRAMITE_TRMID_GENERATOR")
	@Column(name="TRM_ID")
	public long getTrmId() {
		return this.trmId;
	}

	public void setTrmId(long trmId) {
		this.trmId = trmId;
	}


	@Column(name="TRM_ARCHIVO")
	public String getTrmArchivo() {
		return this.trmArchivo;
	}

	public void setTrmArchivo(String trmArchivo) {
		this.trmArchivo = trmArchivo;
	}


	@Column(name="TRM_ESTADO")
	public BigDecimal getTrmEstado() {
		return this.trmEstado;
	}

	public void setTrmEstado(BigDecimal trmEstado) {
		this.trmEstado = trmEstado;
	}


	@Column(name="TRM_FECHA")
	public Timestamp getTrmFecha() {
		return this.trmFecha;
	}

	public void setTrmFecha(Timestamp trmFecha) {
		this.trmFecha = trmFecha;
	}


	@Column(name="TRM_OBSERVACION")
	public String getTrmObservacion() {
		return this.trmObservacion;
	}

	public void setTrmObservacion(String trmObservacion) {
		this.trmObservacion = trmObservacion;
	}


	@Column(name="TRM_USUARIO")
	public BigDecimal getTrmUsuario() {
		return this.trmUsuario;
	}

	public void setTrmUsuario(BigDecimal trmUsuario) {
		this.trmUsuario = trmUsuario;
	}


	//bi-directional many-to-one association to Candidato
	@OneToMany(mappedBy="tramite", fetch=FetchType.EAGER)
	public List<Candidato> getCandidatos() {
		return this.candidatos;
	}

	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	public Candidato addCandidato(Candidato candidato) {
		getCandidatos().add(candidato);
		candidato.setTramite(this);

		return candidato;
	}

	public Candidato removeCandidato(Candidato candidato) {
		getCandidatos().remove(candidato);
		candidato.setTramite(null);

		return candidato;
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