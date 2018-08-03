package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the CONTROL_PAGO database table.
 * 
 */
@Entity
@Table(name="CONTROL_PAGO")
@NamedQuery(name="ControlPago.findAll", query="SELECT c FROM ControlPago c")
public class ControlPago implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cntPagId;
	private BigDecimal cntPagAnio;
	private Timestamp cntPagFecha;
	private BigDecimal cntPagMes;
	private BigDecimal cntPagTransaccion;
	private Usuario usuario;
	private List<RolPago> rolPagos;

	public ControlPago() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CNT_PAG_ID")
	public long getCntPagId() {
		return this.cntPagId;
	}

	public void setCntPagId(long cntPagId) {
		this.cntPagId = cntPagId;
	}


	@Column(name="CNT_PAG_ANIO")
	public BigDecimal getCntPagAnio() {
		return this.cntPagAnio;
	}

	public void setCntPagAnio(BigDecimal cntPagAnio) {
		this.cntPagAnio = cntPagAnio;
	}


	@Column(name="CNT_PAG_FECHA")
	public Timestamp getCntPagFecha() {
		return this.cntPagFecha;
	}

	public void setCntPagFecha(Timestamp cntPagFecha) {
		this.cntPagFecha = cntPagFecha;
	}


	@Column(name="CNT_PAG_MES")
	public BigDecimal getCntPagMes() {
		return this.cntPagMes;
	}

	public void setCntPagMes(BigDecimal cntPagMes) {
		this.cntPagMes = cntPagMes;
	}


	@Column(name="CNT_PAG_TRANSACCION")
	public BigDecimal getCntPagTransaccion() {
		return this.cntPagTransaccion;
	}

	public void setCntPagTransaccion(BigDecimal cntPagTransaccion) {
		this.cntPagTransaccion = cntPagTransaccion;
	}


	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="USR_ID")
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	//bi-directional many-to-one association to RolPago
	@OneToMany(mappedBy="controlPago", fetch=FetchType.LAZY)
	public List<RolPago> getRolPagos() {
		return this.rolPagos;
	}

	public void setRolPagos(List<RolPago> rolPagos) {
		this.rolPagos = rolPagos;
	}


}