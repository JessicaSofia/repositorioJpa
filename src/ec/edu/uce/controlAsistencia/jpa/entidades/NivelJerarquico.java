package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NIVEL_JERARQUICO database table.
 * 
 */
@Entity
@Table(name="NIVEL_JERARQUICO")
@NamedQuery(name="NivelJerarquico.findAll", query="SELECT n FROM NivelJerarquico n")
public class NivelJerarquico implements Serializable {
	private static final long serialVersionUID = 1L;
	private long nvjrId;
	private String nvjrDescripcion;
	private BigDecimal nvjrEstado;
	private BigDecimal tpjrId;

	public NivelJerarquico() {
	}


	@Id
	@SequenceGenerator(name="NIVEL_JERARQUICO_NVJRID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NIVEL_JERARQUICO_NVJRID_GENERATOR")
	@Column(name="NVJR_ID")
	public long getNvjrId() {
		return this.nvjrId;
	}

	public void setNvjrId(long nvjrId) {
		this.nvjrId = nvjrId;
	}


	@Column(name="NVJR_DESCRIPCION")
	public String getNvjrDescripcion() {
		return this.nvjrDescripcion;
	}

	public void setNvjrDescripcion(String nvjrDescripcion) {
		this.nvjrDescripcion = nvjrDescripcion;
	}


	@Column(name="NVJR_ESTADO")
	public BigDecimal getNvjrEstado() {
		return this.nvjrEstado;
	}

	public void setNvjrEstado(BigDecimal nvjrEstado) {
		this.nvjrEstado = nvjrEstado;
	}


	@Column(name="TPJR_ID")
	public BigDecimal getTpjrId() {
		return this.tpjrId;
	}

	public void setTpjrId(BigDecimal tpjrId) {
		this.tpjrId = tpjrId;
	}

}