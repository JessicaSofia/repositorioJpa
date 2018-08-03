package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TIPO_ACCION database table.
 * 
 */
@Entity
@Table(name="TIPO_ACCION")
@NamedQuery(name="TipoAccion.findAll", query="SELECT t FROM TipoAccion t")
public class TipoAccion implements Serializable {
	private static final long serialVersionUID = 1L;
	private long tpacId;
	private BigDecimal tpacCategoria;
	private String tpacDescripcion;
	private List<AccionPersonal> accionPersonals;

	public TipoAccion() {
	}


	@Id
	@Column(name="TPAC_ID")
	public long getTpacId() {
		return this.tpacId;
	}

	public void setTpacId(long tpacId) {
		this.tpacId = tpacId;
	}


	@Column(name="TPAC_CATEGORIA")
	public BigDecimal getTpacCategoria() {
		return this.tpacCategoria;
	}

	public void setTpacCategoria(BigDecimal tpacCategoria) {
		this.tpacCategoria = tpacCategoria;
	}


	@Column(name="TPAC_DESCRIPCION")
	public String getTpacDescripcion() {
		return this.tpacDescripcion;
	}

	public void setTpacDescripcion(String tpacDescripcion) {
		this.tpacDescripcion = tpacDescripcion;
	}


	//bi-directional many-to-one association to AccionPersonal
	@OneToMany(mappedBy="tipoAccion", fetch=FetchType.LAZY)
	public List<AccionPersonal> getAccionPersonals() {
		return this.accionPersonals;
	}

	public void setAccionPersonals(List<AccionPersonal> accionPersonals) {
		this.accionPersonals = accionPersonals;
	}


}