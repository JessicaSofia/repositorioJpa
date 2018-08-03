package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the SERIE database table.
 * 
 */
@Entity
@NamedQuery(name="Serie.findAll", query="SELECT s FROM Serie s")
public class Serie implements Serializable {
	private static final long serialVersionUID = 1L;
	private long serId;
	private String serCodigo;
	private String serDescripcion;
	private List<Puesto> puestos;
	private Proceso proceso;

	public Serie() {
	}


	@Id
	@Column(name="SER_ID")
	public long getSerId() {
		return this.serId;
	}

	public void setSerId(long serId) {
		this.serId = serId;
	}


	@Column(name="SER_CODIGO")
	public String getSerCodigo() {
		return this.serCodigo;
	}

	public void setSerCodigo(String serCodigo) {
		this.serCodigo = serCodigo;
	}


	@Column(name="SER_DESCRIPCION")
	public String getSerDescripcion() {
		return this.serDescripcion;
	}

	public void setSerDescripcion(String serDescripcion) {
		this.serDescripcion = serDescripcion;
	}


	//bi-directional many-to-one association to Puesto
	@OneToMany(mappedBy="serie", fetch=FetchType.LAZY)
	public List<Puesto> getPuestos() {
		return this.puestos;
	}

	public void setPuestos(List<Puesto> puestos) {
		this.puestos = puestos;
	}



	//bi-directional many-to-one association to Proceso
	@ManyToOne
	@JoinColumn(name="PRC_ID")
	public Proceso getProceso() {
		return this.proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}

}