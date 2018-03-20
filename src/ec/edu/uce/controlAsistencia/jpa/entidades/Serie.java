package ec.edu.uce.controlAsistencia.jpa.entidades;
// Generated 07-mar-2018 22:35:26 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Serie generated by hbm2java
 */
@Entity
@Table(name = "SERIE", schema = "BDTALENTOHUMANO")
public class Serie implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int serId;
	private Proceso proceso;
	private String serCodigo;
	private String serDescripcion;
	private Set<Puesto> puestos = new HashSet<Puesto>(0);

	public Serie() {
	}

	public Serie(int serId) {
		this.serId = serId;
	}

	public Serie(int serId, Proceso proceso, String serCodigo, String serDescripcion, Set<Puesto> puestos) {
		this.serId = serId;
		this.proceso = proceso;
		this.serCodigo = serCodigo;
		this.serDescripcion = serDescripcion;
		this.puestos = puestos;
	}

	@Id

	@Column(name = "SER_ID", unique = true, nullable = false, precision = 6, scale = 0)
	public int getSerId() {
		return this.serId;
	}

	public void setSerId(int serId) {
		this.serId = serId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRC_ID")
	public Proceso getProceso() {
		return this.proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}

	@Column(name = "SER_CODIGO", length = 8)
	public String getSerCodigo() {
		return this.serCodigo;
	}

	public void setSerCodigo(String serCodigo) {
		this.serCodigo = serCodigo;
	}

	@Column(name = "SER_DESCRIPCION", length = 256)
	public String getSerDescripcion() {
		return this.serDescripcion;
	}

	public void setSerDescripcion(String serDescripcion) {
		this.serDescripcion = serDescripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "serie")
	public Set<Puesto> getPuestos() {
		return this.puestos;
	}

	public void setPuestos(Set<Puesto> puestos) {
		this.puestos = puestos;
	}

}
