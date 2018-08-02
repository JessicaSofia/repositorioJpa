package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the GRADO database table.
 * 
 */
@Entity
@NamedQuery(name="Grado.findAll", query="SELECT g FROM Grado g")
public class Grado implements Serializable {
	private static final long serialVersionUID = 1L;
	private long grdId;
	private String grdDescripcion;
	private BigDecimal grdEstado;
	private BigDecimal grdRmu;
	private List<Puesto> puestos;

	public Grado() {
	}


	@Id
	@SequenceGenerator(name="GRADO_GRDID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GRADO_GRDID_GENERATOR")
	@Column(name="GRD_ID")
	public long getGrdId() {
		return this.grdId;
	}

	public void setGrdId(long grdId) {
		this.grdId = grdId;
	}


	@Column(name="GRD_DESCRIPCION")
	public String getGrdDescripcion() {
		return this.grdDescripcion;
	}

	public void setGrdDescripcion(String grdDescripcion) {
		this.grdDescripcion = grdDescripcion;
	}


	@Column(name="GRD_ESTADO")
	public BigDecimal getGrdEstado() {
		return this.grdEstado;
	}

	public void setGrdEstado(BigDecimal grdEstado) {
		this.grdEstado = grdEstado;
	}


	@Column(name="GRD_RMU")
	public BigDecimal getGrdRmu() {
		return this.grdRmu;
	}

	public void setGrdRmu(BigDecimal grdRmu) {
		this.grdRmu = grdRmu;
	}


	//bi-directional many-to-one association to Puesto
	@OneToMany(mappedBy="grado", fetch=FetchType.EAGER)
	public List<Puesto> getPuestos() {
		return this.puestos;
	}

	public void setPuestos(List<Puesto> puestos) {
		this.puestos = puestos;
	}

	public Puesto addPuesto(Puesto puesto) {
		getPuestos().add(puesto);
		puesto.setGrado(this);

		return puesto;
	}

	public Puesto removePuesto(Puesto puesto) {
		getPuestos().remove(puesto);
		puesto.setGrado(null);

		return puesto;
	}

}