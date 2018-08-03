package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TIPO_JERARQUICO database table.
 * 
 */
@Entity
@Table(name="TIPO_JERARQUICO")
@NamedQuery(name="TipoJerarquico.findAll", query="SELECT t FROM TipoJerarquico t")
public class TipoJerarquico implements Serializable {
	private static final long serialVersionUID = 1L;
	private long tpjrId;
	private String tpjrDescripcion;
	private BigDecimal tpjrEstado;

	public TipoJerarquico() {
	}


	@Id
	@Column(name="TPJR_ID")
	public long getTpjrId() {
		return this.tpjrId;
	}

	public void setTpjrId(long tpjrId) {
		this.tpjrId = tpjrId;
	}


	@Column(name="TPJR_DESCRIPCION")
	public String getTpjrDescripcion() {
		return this.tpjrDescripcion;
	}

	public void setTpjrDescripcion(String tpjrDescripcion) {
		this.tpjrDescripcion = tpjrDescripcion;
	}


	@Column(name="TPJR_ESTADO")
	public BigDecimal getTpjrEstado() {
		return this.tpjrEstado;
	}

	public void setTpjrEstado(BigDecimal tpjrEstado) {
		this.tpjrEstado = tpjrEstado;
	}

}