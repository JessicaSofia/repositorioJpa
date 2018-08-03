package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the USUARIO database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	private long usrId;
	private BigDecimal usrActiveDirectory;
	private BigDecimal usrEstSesion;
	private BigDecimal usrEstado;
	private Date usrFechaCadPass;
	private Date usrFechaCaducidad;
	private Timestamp usrFechaCreacion;
	private String usrIdentificacion;
	private String usrNick;
	private String usrPassword;
	private List<ControlPago> controlPagos;
	private Persona persona;
	private List<UsuarioRol> usuarioRols;

	public Usuario() {
	}


	@Id
	@Column(name="USR_ID")
	public long getUsrId() {
		return this.usrId;
	}

	public void setUsrId(long usrId) {
		this.usrId = usrId;
	}


	@Column(name="USR_ACTIVE_DIRECTORY")
	public BigDecimal getUsrActiveDirectory() {
		return this.usrActiveDirectory;
	}

	public void setUsrActiveDirectory(BigDecimal usrActiveDirectory) {
		this.usrActiveDirectory = usrActiveDirectory;
	}


	@Column(name="USR_EST_SESION")
	public BigDecimal getUsrEstSesion() {
		return this.usrEstSesion;
	}

	public void setUsrEstSesion(BigDecimal usrEstSesion) {
		this.usrEstSesion = usrEstSesion;
	}


	@Column(name="USR_ESTADO")
	public BigDecimal getUsrEstado() {
		return this.usrEstado;
	}

	public void setUsrEstado(BigDecimal usrEstado) {
		this.usrEstado = usrEstado;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="USR_FECHA_CAD_PASS")
	public Date getUsrFechaCadPass() {
		return this.usrFechaCadPass;
	}

	public void setUsrFechaCadPass(Date usrFechaCadPass) {
		this.usrFechaCadPass = usrFechaCadPass;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="USR_FECHA_CADUCIDAD")
	public Date getUsrFechaCaducidad() {
		return this.usrFechaCaducidad;
	}

	public void setUsrFechaCaducidad(Date usrFechaCaducidad) {
		this.usrFechaCaducidad = usrFechaCaducidad;
	}


	@Column(name="USR_FECHA_CREACION")
	public Timestamp getUsrFechaCreacion() {
		return this.usrFechaCreacion;
	}

	public void setUsrFechaCreacion(Timestamp usrFechaCreacion) {
		this.usrFechaCreacion = usrFechaCreacion;
	}


	@Column(name="USR_IDENTIFICACION")
	public String getUsrIdentificacion() {
		return this.usrIdentificacion;
	}

	public void setUsrIdentificacion(String usrIdentificacion) {
		this.usrIdentificacion = usrIdentificacion;
	}


	@Column(name="USR_NICK")
	public String getUsrNick() {
		return this.usrNick;
	}

	public void setUsrNick(String usrNick) {
		this.usrNick = usrNick;
	}


	@Column(name="USR_PASSWORD")
	public String getUsrPassword() {
		return this.usrPassword;
	}

	public void setUsrPassword(String usrPassword) {
		this.usrPassword = usrPassword;
	}


	//bi-directional many-to-one association to ControlPago
	@OneToMany(mappedBy="usuario", fetch=FetchType.LAZY)
	public List<ControlPago> getControlPagos() {
		return this.controlPagos;
	}

	public void setControlPagos(List<ControlPago> controlPagos) {
		this.controlPagos = controlPagos;
	}




	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="PRS_ID")
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	//bi-directional many-to-one association to UsuarioRol
	@OneToMany(mappedBy="usuario", fetch=FetchType.LAZY)
	public List<UsuarioRol> getUsuarioRols() {
		return this.usuarioRols;
	}

	public void setUsuarioRols(List<UsuarioRol> usuarioRols) {
		this.usuarioRols = usuarioRols;
	}

	
}