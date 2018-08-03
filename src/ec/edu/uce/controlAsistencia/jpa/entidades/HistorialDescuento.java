package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the HISTORIAL_DESCUENTO database table.
 * 
 */
@Entity
@Table(name="HISTORIAL_DESCUENTO")
@NamedQuery(name="HistorialDescuento.findAll", query="SELECT h FROM HistorialDescuento h")
public class HistorialDescuento implements Serializable {
	private static final long serialVersionUID = 1L;
	private long hsdsId;
	private String hsdsCodigoFuncionario;
	private BigDecimal hsdsDtpsId;
	private BigDecimal hsdsEstado;
	private Date hsdsFecha;
	private BigDecimal hsdsMonto;
	private String hsdsObservacion;
	private BigDecimal hsdsPorcentaje;
	private BigDecimal hsdsTotal;
	private AcreedorDescuento acreedorDescuento;
	private RolPago rolPago;

	public HistorialDescuento() {
	}


	@Id
	@Column(name="HSDS_ID")
	public long getHsdsId() {
		return this.hsdsId;
	}

	public void setHsdsId(long hsdsId) {
		this.hsdsId = hsdsId;
	}


	@Column(name="HSDS_CODIGO_FUNCIONARIO")
	public String getHsdsCodigoFuncionario() {
		return this.hsdsCodigoFuncionario;
	}

	public void setHsdsCodigoFuncionario(String hsdsCodigoFuncionario) {
		this.hsdsCodigoFuncionario = hsdsCodigoFuncionario;
	}


	@Column(name="HSDS_DTPS_ID")
	public BigDecimal getHsdsDtpsId() {
		return this.hsdsDtpsId;
	}

	public void setHsdsDtpsId(BigDecimal hsdsDtpsId) {
		this.hsdsDtpsId = hsdsDtpsId;
	}


	@Column(name="HSDS_ESTADO")
	public BigDecimal getHsdsEstado() {
		return this.hsdsEstado;
	}

	public void setHsdsEstado(BigDecimal hsdsEstado) {
		this.hsdsEstado = hsdsEstado;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="HSDS_FECHA")
	public Date getHsdsFecha() {
		return this.hsdsFecha;
	}

	public void setHsdsFecha(Date hsdsFecha) {
		this.hsdsFecha = hsdsFecha;
	}


	@Column(name="HSDS_MONTO")
	public BigDecimal getHsdsMonto() {
		return this.hsdsMonto;
	}

	public void setHsdsMonto(BigDecimal hsdsMonto) {
		this.hsdsMonto = hsdsMonto;
	}


	@Column(name="HSDS_OBSERVACION")
	public String getHsdsObservacion() {
		return this.hsdsObservacion;
	}

	public void setHsdsObservacion(String hsdsObservacion) {
		this.hsdsObservacion = hsdsObservacion;
	}


	@Column(name="HSDS_PORCENTAJE")
	public BigDecimal getHsdsPorcentaje() {
		return this.hsdsPorcentaje;
	}

	public void setHsdsPorcentaje(BigDecimal hsdsPorcentaje) {
		this.hsdsPorcentaje = hsdsPorcentaje;
	}


	@Column(name="HSDS_TOTAL")
	public BigDecimal getHsdsTotal() {
		return this.hsdsTotal;
	}

	public void setHsdsTotal(BigDecimal hsdsTotal) {
		this.hsdsTotal = hsdsTotal;
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


	//bi-directional many-to-one association to RolPago
	@ManyToOne
	@JoinColumn(name="ROL_PAG_ID")
	public RolPago getRolPago() {
		return this.rolPago;
	}

	public void setRolPago(RolPago rolPago) {
		this.rolPago = rolPago;
	}

}