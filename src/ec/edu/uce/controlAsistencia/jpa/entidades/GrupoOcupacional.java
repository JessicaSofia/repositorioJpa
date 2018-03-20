package ec.edu.uce.controlAsistencia.jpa.entidades;
// Generated 07-mar-2018 22:35:26 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
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
 * GrupoOcupacional generated by hbm2java
 */
@Entity
@Table(name = "GRUPO_OCUPACIONAL", schema = "BDTALENTOHUMANO")
public class GrupoOcupacional implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int grocId;
	private Regimen regimen;
	private String grocDescripcion;
	private BigDecimal grocGrado;
	private BigDecimal grocRmu;
	private Set<Puesto> puestos = new HashSet<Puesto>(0);

	public GrupoOcupacional() {
	}

	public GrupoOcupacional(int grocId) {
		this.grocId = grocId;
	}

	public GrupoOcupacional(int grocId, Regimen regimen, String grocDescripcion, BigDecimal grocGrado,
			BigDecimal grocRmu, Set<Puesto> puestos) {
		this.grocId = grocId;
		this.regimen = regimen;
		this.grocDescripcion = grocDescripcion;
		this.grocGrado = grocGrado;
		this.grocRmu = grocRmu;
		this.puestos = puestos;
	}

	@Id

	@Column(name = "GROC_ID", unique = true, nullable = false, precision = 6, scale = 0)
	public int getGrocId() {
		return this.grocId;
	}

	public void setGrocId(int grocId) {
		this.grocId = grocId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RGM_ID")
	public Regimen getRegimen() {
		return this.regimen;
	}

	public void setRegimen(Regimen regimen) {
		this.regimen = regimen;
	}

	@Column(name = "GROC_DESCRIPCION", length = 128)
	public String getGrocDescripcion() {
		return this.grocDescripcion;
	}

	public void setGrocDescripcion(String grocDescripcion) {
		this.grocDescripcion = grocDescripcion;
	}

	@Column(name = "GROC_GRADO", precision = 22, scale = 0)
	public BigDecimal getGrocGrado() {
		return this.grocGrado;
	}

	public void setGrocGrado(BigDecimal grocGrado) {
		this.grocGrado = grocGrado;
	}

	@Column(name = "GROC_RMU", precision = 6)
	public BigDecimal getGrocRmu() {
		return this.grocRmu;
	}

	public void setGrocRmu(BigDecimal grocRmu) {
		this.grocRmu = grocRmu;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "grupoOcupacional")
	public Set<Puesto> getPuestos() {
		return this.puestos;
	}

	public void setPuestos(Set<Puesto> puestos) {
		this.puestos = puestos;
	}

}
