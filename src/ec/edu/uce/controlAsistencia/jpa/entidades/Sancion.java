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
 * Sancion generated by hbm2java
 */
@Entity
@Table(name = "SANCION", schema = "BDTALENTOHUMANO")
public class Sancion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int snId;
	private TipoSancion tipoSancion;
	private String snNombre;
	private String snDescripcion;
	private int snNivel;
	private int snEstado;
	private Set<DetallePuestoSancion> detallePuestoSancions = new HashSet<DetallePuestoSancion>(0);

	public Sancion() {
	}

	public Sancion(int snId) {
		this.snId = snId;
	}

	public Sancion(int snId, TipoSancion tipoSancion, String snNombre, String snDescripcion, int snNivel,
			int snEstado, Set<DetallePuestoSancion> detallePuestoSancions) {
		this.snId = snId;
		this.tipoSancion = tipoSancion;
		this.snNombre = snNombre;
		this.snDescripcion = snDescripcion;
		this.snNivel = snNivel;
		this.snEstado = snEstado;
		this.detallePuestoSancions = detallePuestoSancions;
	}

	@Id

	@Column(name = "SN_ID", unique = true, nullable = false, precision = 6, scale = 0)
	public int getSnId() {
		return this.snId;
	}

	public void setSnId(int snId) {
		this.snId = snId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TPSN_ID")
	public TipoSancion getTipoSancion() {
		return this.tipoSancion;
	}

	public void setTipoSancion(TipoSancion tipoSancion) {
		this.tipoSancion = tipoSancion;
	}

	@Column(name = "SN__NOMBRE", length = 512)
	public String getSnNombre() {
		return this.snNombre;
	}

	public void setSnNombre(String snNombre) {
		this.snNombre = snNombre;
	}

	@Column(name = "SN_DESCRIPCION", length = 512)
	public String getSnDescripcion() {
		return this.snDescripcion;
	}

	public void setSnDescripcion(String snDescripcion) {
		this.snDescripcion = snDescripcion;
	}

	@Column(name = "SN_NIVEL", precision = 22, scale = 0)
	public int getSnNivel() {
		return this.snNivel;
	}

	public void setSnNivel(int snNivel) {
		this.snNivel = snNivel;
	}

	@Column(name = "SN_ESTADO", precision = 22, scale = 0)
	public int getSnEstado() {
		return this.snEstado;
	}

	public void setSnEstado(int snEstado) {
		this.snEstado = snEstado;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sancion")
	public Set<DetallePuestoSancion> getDetallePuestoSancions() {
		return this.detallePuestoSancions;
	}

	public void setDetallePuestoSancions(Set<DetallePuestoSancion> detallePuestoSancions) {
		this.detallePuestoSancions = detallePuestoSancions;
	}

}
