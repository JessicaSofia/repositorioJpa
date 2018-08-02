package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FORMATO_CONTRATO database table.
 * 
 */
@Entity
@Table(name="FORMATO_CONTRATO")
@NamedQuery(name="FormatoContrato.findAll", query="SELECT f FROM FormatoContrato f")
public class FormatoContrato implements Serializable {
	private static final long serialVersionUID = 1L;
	private long frcnId;
	private String frcnDescripcon;
	private BigDecimal frcnEstado;
	private BigDecimal tpcnId;

	public FormatoContrato() {
	}


	@Id
	@SequenceGenerator(name="FORMATO_CONTRATO_FRCNID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FORMATO_CONTRATO_FRCNID_GENERATOR")
	@Column(name="FRCN_ID")
	public long getFrcnId() {
		return this.frcnId;
	}

	public void setFrcnId(long frcnId) {
		this.frcnId = frcnId;
	}


	@Column(name="FRCN_DESCRIPCON")
	public String getFrcnDescripcon() {
		return this.frcnDescripcon;
	}

	public void setFrcnDescripcon(String frcnDescripcon) {
		this.frcnDescripcon = frcnDescripcon;
	}


	@Column(name="FRCN_ESTADO")
	public BigDecimal getFrcnEstado() {
		return this.frcnEstado;
	}

	public void setFrcnEstado(BigDecimal frcnEstado) {
		this.frcnEstado = frcnEstado;
	}


	@Column(name="TPCN_ID")
	public BigDecimal getTpcnId() {
		return this.tpcnId;
	}

	public void setTpcnId(BigDecimal tpcnId) {
		this.tpcnId = tpcnId;
	}

}