package ec.edu.uce.controlAsistencia.jpa.entidades;
// Generated 07-mar-2018 22:35:26 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoSancion generated by hbm2java
 */
@Entity
@Table(name = "TIPO_SANCION", schema = "BDTALENTOHUMANO")
public class TipoSancion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tpsnId;
	private String tpsnNomBre;
	private String tpsnDescripcion;
	private BigDecimal tpsnEstado;
	private Set<Sancion> sancions = new HashSet<Sancion>(0);

	public TipoSancion() {
	}

	public TipoSancion(int tpsnId) {
		this.tpsnId = tpsnId;
	}

	public TipoSancion(int tpsnId, String tpsnNomBre, String tpsnDescripcion, BigDecimal tpsnEstado,
			Set<Sancion> sancions) {
		this.tpsnId = tpsnId;
		this.tpsnNomBre = tpsnNomBre;
		this.tpsnDescripcion = tpsnDescripcion;
		this.tpsnEstado = tpsnEstado;
		this.sancions = sancions;
	}

	@Id

	@Column(name = "TPSN_ID", unique = true, nullable = false, precision = 6, scale = 0)
	public int getTpsnId() {
		return this.tpsnId;
	}

	public void setTpsnId(int tpsnId) {
		this.tpsnId = tpsnId;
	}

	@Column(name = "TPSN_NOM_BRE", length = 200)
	public String getTpsnNomBre() {
		return this.tpsnNomBre;
	}

	public void setTpsnNomBre(String tpsnNomBre) {
		this.tpsnNomBre = tpsnNomBre;
	}

	@Column(name = "TPSN_DESCRIPCION", length = 512)
	public String getTpsnDescripcion() {
		return this.tpsnDescripcion;
	}

	public void setTpsnDescripcion(String tpsnDescripcion) {
		this.tpsnDescripcion = tpsnDescripcion;
	}

	@Column(name = "TPSN_ESTADO", precision = 22, scale = 0)
	public BigDecimal getTpsnEstado() {
		return this.tpsnEstado;
	}

	public void setTpsnEstado(BigDecimal tpsnEstado) {
		this.tpsnEstado = tpsnEstado;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoSancion")
	public Set<Sancion> getSancions() {
		return this.sancions;
	}

	public void setSancions(Set<Sancion> sancions) {
		this.sancions = sancions;
	}

}
