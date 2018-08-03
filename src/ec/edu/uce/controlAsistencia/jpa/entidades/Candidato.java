package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CANDIDATO database table.
 * 
 */
@Entity
@NamedQuery(name="Candidato.findAll", query="SELECT c FROM Candidato c")
public class Candidato implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cndId;
	private BigDecimal cndEstado;
	private String cndIdentificacion;
	private Tramite tramite;
	private List<Contrato> contratos;

	public Candidato() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CND_ID")
	public long getCndId() {
		return this.cndId;
	}

	public void setCndId(long cndId) {
		this.cndId = cndId;
	}


	@Column(name="CND_ESTADO")
	public BigDecimal getCndEstado() {
		return this.cndEstado;
	}

	public void setCndEstado(BigDecimal cndEstado) {
		this.cndEstado = cndEstado;
	}


	@Column(name="CND_IDENTIFICACION")
	public String getCndIdentificacion() {
		return this.cndIdentificacion;
	}

	public void setCndIdentificacion(String cndIdentificacion) {
		this.cndIdentificacion = cndIdentificacion;
	}


	//bi-directional many-to-one association to Tramite
	@ManyToOne
	@JoinColumn(name="TRM_ID")
	public Tramite getTramite() {
		return this.tramite;
	}

	public void setTramite(Tramite tramite) {
		this.tramite = tramite;
	}


	//bi-directional many-to-one association to Contrato
	@OneToMany(mappedBy="candidato", fetch=FetchType.LAZY)
	public List<Contrato> getContratos() {
		return this.contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}



}