package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TIPO_CONTRATO database table.
 * 
 */
@Entity
@Table(name="TIPO_CONTRATO")
@NamedQuery(name="TipoContrato.findAll", query="SELECT t FROM TipoContrato t")
public class TipoContrato implements Serializable {
	private static final long serialVersionUID = 1L;
	private long tpcnId;
	private String tpcnCategoria;
	private String tpcnDescripcion;
	private BigDecimal tpcnTipo;
	private List<Contrato> contratos;

	public TipoContrato() {
	}


	@Id
	@Column(name="TPCN_ID")
	public long getTpcnId() {
		return this.tpcnId;
	}

	public void setTpcnId(long tpcnId) {
		this.tpcnId = tpcnId;
	}


	@Column(name="TPCN_CATEGORIA")
	public String getTpcnCategoria() {
		return this.tpcnCategoria;
	}

	public void setTpcnCategoria(String tpcnCategoria) {
		this.tpcnCategoria = tpcnCategoria;
	}


	@Column(name="TPCN_DESCRIPCION")
	public String getTpcnDescripcion() {
		return this.tpcnDescripcion;
	}

	public void setTpcnDescripcion(String tpcnDescripcion) {
		this.tpcnDescripcion = tpcnDescripcion;
	}


	@Column(name="TPCN_TIPO")
	public BigDecimal getTpcnTipo() {
		return this.tpcnTipo;
	}

	public void setTpcnTipo(BigDecimal tpcnTipo) {
		this.tpcnTipo = tpcnTipo;
	}


	//bi-directional many-to-one association to Contrato
	@OneToMany(mappedBy="tipoContrato", fetch=FetchType.EAGER)
	public List<Contrato> getContratos() {
		return this.contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

	public Contrato addContrato(Contrato contrato) {
		getContratos().add(contrato);
		contrato.setTipoContrato(this);

		return contrato;
	}

	public Contrato removeContrato(Contrato contrato) {
		getContratos().remove(contrato);
		contrato.setTipoContrato(null);

		return contrato;
	}

}