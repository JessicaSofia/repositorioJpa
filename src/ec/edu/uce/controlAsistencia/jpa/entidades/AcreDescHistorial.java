package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ACRE_DESC_HISTORIAL database table.
 * 
 */
@Entity
@Table(name="ACRE_DESC_HISTORIAL")
@NamedQuery(name="AcreDescHistorial.findAll", query="SELECT a FROM AcreDescHistorial a")
public class AcreDescHistorial implements Serializable {
	private static final long serialVersionUID = 1L;
	private long acdshsId;
	private BigDecimal acdshsAnio;
	private String acdshsCargo;
	private BigDecimal acdshsEstado;
	private Timestamp acdshsFechaRegistro;
	private BigDecimal acdshsMes;
	private BigDecimal acdshsMonto;
	private AcreedorDescuento acreedorDescuento;

	public AcreDescHistorial() {
	}


	@Id
	@SequenceGenerator(name="ACRE_DESC_HISTORIAL_ACDSHSID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACRE_DESC_HISTORIAL_ACDSHSID_GENERATOR")
	@Column(name="ACDSHS_ID")
	public long getAcdshsId() {
		return this.acdshsId;
	}

	public void setAcdshsId(long acdshsId) {
		this.acdshsId = acdshsId;
	}


	@Column(name="ACDSHS_ANIO")
	public BigDecimal getAcdshsAnio() {
		return this.acdshsAnio;
	}

	public void setAcdshsAnio(BigDecimal acdshsAnio) {
		this.acdshsAnio = acdshsAnio;
	}


	@Column(name="ACDSHS_CARGO")
	public String getAcdshsCargo() {
		return this.acdshsCargo;
	}

	public void setAcdshsCargo(String acdshsCargo) {
		this.acdshsCargo = acdshsCargo;
	}


	@Column(name="ACDSHS_ESTADO")
	public BigDecimal getAcdshsEstado() {
		return this.acdshsEstado;
	}

	public void setAcdshsEstado(BigDecimal acdshsEstado) {
		this.acdshsEstado = acdshsEstado;
	}


	@Column(name="ACDSHS_FECHA_REGISTRO")
	public Timestamp getAcdshsFechaRegistro() {
		return this.acdshsFechaRegistro;
	}

	public void setAcdshsFechaRegistro(Timestamp acdshsFechaRegistro) {
		this.acdshsFechaRegistro = acdshsFechaRegistro;
	}


	@Column(name="ACDSHS_MES")
	public BigDecimal getAcdshsMes() {
		return this.acdshsMes;
	}

	public void setAcdshsMes(BigDecimal acdshsMes) {
		this.acdshsMes = acdshsMes;
	}


	@Column(name="ACDSHS_MONTO")
	public BigDecimal getAcdshsMonto() {
		return this.acdshsMonto;
	}

	public void setAcdshsMonto(BigDecimal acdshsMonto) {
		this.acdshsMonto = acdshsMonto;
	}


	//bi-directional many-to-one association to AcreedorDescuento
	@ManyToOne
	@JoinColumn(name="ACDS_ID")
	public AcreedorDescuento getAcreedorDescuento() {
		return this.acreedorDescuento;
	}

	public void setAcreedorDescuento(AcreedorDescuento acreedorDescuento) {
		this.acreedorDescuento = acreedorDescuento;
	}

}