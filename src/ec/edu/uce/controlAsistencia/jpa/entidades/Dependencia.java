package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the DEPENDENCIA database table.
 * 
 */
@Entity
@NamedQuery(name="Dependencia.findAll", query="SELECT d FROM Dependencia d")
public class Dependencia implements Serializable {
	private static final long serialVersionUID = 1L;
	private int dpnId;
	private String dpnCodigoNomina;
	private String dpnDescripcion;
	private BigDecimal dpnEstado;
	private BigDecimal dpnJerarquia;
	private Dependencia dependencia;
	private List<Dependencia> dependencias;
	private List<DetallePuesto> detallePuestos;
	private List<PartidaIndividual> partidaIndividuals;

	public Dependencia() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DPN_ID")
	public int getDpnId() {
		return this.dpnId;
	}

	public void setDpnId(int dpnId) {
		this.dpnId = dpnId;
	}


	@Column(name="DPN_CODIGO_NOMINA")
	public String getDpnCodigoNomina() {
		return this.dpnCodigoNomina;
	}

	public void setDpnCodigoNomina(String dpnCodigoNomina) {
		this.dpnCodigoNomina = dpnCodigoNomina;
	}


	@Column(name="DPN_DESCRIPCION")
	public String getDpnDescripcion() {
		return this.dpnDescripcion;
	}

	public void setDpnDescripcion(String dpnDescripcion) {
		this.dpnDescripcion = dpnDescripcion;
	}


	@Column(name="DPN_ESTADO")
	public BigDecimal getDpnEstado() {
		return this.dpnEstado;
	}

	public void setDpnEstado(BigDecimal dpnEstado) {
		this.dpnEstado = dpnEstado;
	}


	@Column(name="DPN_JERARQUIA")
	public BigDecimal getDpnJerarquia() {
		return this.dpnJerarquia;
	}

	public void setDpnJerarquia(BigDecimal dpnJerarquia) {
		this.dpnJerarquia = dpnJerarquia;
	}


	//bi-directional many-to-one association to Dependencia
	@ManyToOne
	@JoinColumn(name="DPN_SUB_ID")
	public Dependencia getDependencia() {
		return this.dependencia;
	}

	public void setDependencia(Dependencia dependencia) {
		this.dependencia = dependencia;
	}


	//bi-directional many-to-one association to Dependencia
	@OneToMany(mappedBy="dependencia", fetch=FetchType.LAZY)
	public List<Dependencia> getDependencias() {
		return this.dependencias;
	}

	public void setDependencias(List<Dependencia> dependencias) {
		this.dependencias = dependencias;
	}




	//bi-directional many-to-one association to DetallePuesto
	@OneToMany(mappedBy="dependencia", fetch=FetchType.LAZY)
	public List<DetallePuesto> getDetallePuestos() {
		return this.detallePuestos;
	}

	public void setDetallePuestos(List<DetallePuesto> detallePuestos) {
		this.detallePuestos = detallePuestos;
	}




	//bi-directional many-to-one association to PartidaIndividual
	@OneToMany(mappedBy="dependencia", fetch=FetchType.LAZY)
	public List<PartidaIndividual> getPartidaIndividuals() {
		return this.partidaIndividuals;
	}

	public void setPartidaIndividuals(List<PartidaIndividual> partidaIndividuals) {
		this.partidaIndividuals = partidaIndividuals;
	}



}