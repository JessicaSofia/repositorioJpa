package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ACREEDOR database table.
 * 
 */
@Entity
@NamedQuery(name="Acreedor.findAll", query="SELECT a FROM Acreedor a")
public class Acreedor implements Serializable {
	private static final long serialVersionUID = 1L;
	private long acrId;
	private String acrEmail;
	private BigDecimal acrEstado;
	private Timestamp acrFechaCreacion;
	private String acrIdentificacion;
	private String acrNombre;
	private String acrNumeroCuenta;
	private String acrRepresentante;
	private String acrTelefono;
	private BigDecimal acrTipo;
	private BigDecimal acrTipoCuenta;
	private List<AcreedorDescuento> acreedorDescuentos;

	public Acreedor() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ACR_ID")
	public long getAcrId() {
		return this.acrId;
	}

	public void setAcrId(long acrId) {
		this.acrId = acrId;
	}


	@Column(name="ACR_EMAIL")
	public String getAcrEmail() {
		return this.acrEmail;
	}

	public void setAcrEmail(String acrEmail) {
		this.acrEmail = acrEmail;
	}


	@Column(name="ACR_ESTADO")
	public BigDecimal getAcrEstado() {
		return this.acrEstado;
	}

	public void setAcrEstado(BigDecimal acrEstado) {
		this.acrEstado = acrEstado;
	}


	@Column(name="ACR_FECHA_CREACION")
	public Timestamp getAcrFechaCreacion() {
		return this.acrFechaCreacion;
	}

	public void setAcrFechaCreacion(Timestamp acrFechaCreacion) {
		this.acrFechaCreacion = acrFechaCreacion;
	}


	@Column(name="ACR_IDENTIFICACION")
	public String getAcrIdentificacion() {
		return this.acrIdentificacion;
	}

	public void setAcrIdentificacion(String acrIdentificacion) {
		this.acrIdentificacion = acrIdentificacion;
	}


	@Column(name="ACR_NOMBRE")
	public String getAcrNombre() {
		return this.acrNombre;
	}

	public void setAcrNombre(String acrNombre) {
		this.acrNombre = acrNombre;
	}


	@Column(name="ACR_NUMERO_CUENTA")
	public String getAcrNumeroCuenta() {
		return this.acrNumeroCuenta;
	}

	public void setAcrNumeroCuenta(String acrNumeroCuenta) {
		this.acrNumeroCuenta = acrNumeroCuenta;
	}


	@Column(name="ACR_REPRESENTANTE")
	public String getAcrRepresentante() {
		return this.acrRepresentante;
	}

	public void setAcrRepresentante(String acrRepresentante) {
		this.acrRepresentante = acrRepresentante;
	}


	@Column(name="ACR_TELEFONO")
	public String getAcrTelefono() {
		return this.acrTelefono;
	}

	public void setAcrTelefono(String acrTelefono) {
		this.acrTelefono = acrTelefono;
	}


	@Column(name="ACR_TIPO")
	public BigDecimal getAcrTipo() {
		return this.acrTipo;
	}

	public void setAcrTipo(BigDecimal acrTipo) {
		this.acrTipo = acrTipo;
	}


	@Column(name="ACR_TIPO_CUENTA")
	public BigDecimal getAcrTipoCuenta() {
		return this.acrTipoCuenta;
	}

	public void setAcrTipoCuenta(BigDecimal acrTipoCuenta) {
		this.acrTipoCuenta = acrTipoCuenta;
	}


	//bi-directional many-to-one association to AcreedorDescuento
	@OneToMany(mappedBy="acreedor", fetch=FetchType.EAGER)
	public List<AcreedorDescuento> getAcreedorDescuentos() {
		return this.acreedorDescuentos;
	}

	public void setAcreedorDescuentos(List<AcreedorDescuento> acreedorDescuentos) {
		this.acreedorDescuentos = acreedorDescuentos;
	}

	public AcreedorDescuento addAcreedorDescuento(AcreedorDescuento acreedorDescuento) {
		getAcreedorDescuentos().add(acreedorDescuento);
		acreedorDescuento.setAcreedor(this);

		return acreedorDescuento;
	}

	public AcreedorDescuento removeAcreedorDescuento(AcreedorDescuento acreedorDescuento) {
		getAcreedorDescuentos().remove(acreedorDescuento);
		acreedorDescuento.setAcreedor(null);

		return acreedorDescuento;
	}

}