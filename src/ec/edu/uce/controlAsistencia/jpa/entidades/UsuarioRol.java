package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the USUARIO_ROL database table.
 * 
 */
@Entity
@Table(name="USUARIO_ROL")
@NamedQuery(name="UsuarioRol.findAll", query="SELECT u FROM UsuarioRol u")
public class UsuarioRol implements Serializable {
	private static final long serialVersionUID = 1L;
	private long usroId;
	private BigDecimal usroEstado;
	private Rol rol;
	private Usuario usuario;

	public UsuarioRol() {
	}


	@Id
	@SequenceGenerator(name="USUARIO_ROL_USROID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USUARIO_ROL_USROID_GENERATOR")
	@Column(name="USRO_ID")
	public long getUsroId() {
		return this.usroId;
	}

	public void setUsroId(long usroId) {
		this.usroId = usroId;
	}


	@Column(name="USRO_ESTADO")
	public BigDecimal getUsroEstado() {
		return this.usroEstado;
	}

	public void setUsroEstado(BigDecimal usroEstado) {
		this.usroEstado = usroEstado;
	}


	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="ROL_ID")
	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
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

}