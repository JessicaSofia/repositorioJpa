package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ROL database table.
 * 
 */
@Entity
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;
	private long rolId;
	private String rolDescripcion;
	private BigDecimal rolTipo;
	private List<UsuarioRol> usuarioRols;

	public Rol() {
	}


	@Id
	@Column(name="ROL_ID")
	public long getRolId() {
		return this.rolId;
	}

	public void setRolId(long rolId) {
		this.rolId = rolId;
	}


	@Column(name="ROL_DESCRIPCION")
	public String getRolDescripcion() {
		return this.rolDescripcion;
	}

	public void setRolDescripcion(String rolDescripcion) {
		this.rolDescripcion = rolDescripcion;
	}


	@Column(name="ROL_TIPO")
	public BigDecimal getRolTipo() {
		return this.rolTipo;
	}

	public void setRolTipo(BigDecimal rolTipo) {
		this.rolTipo = rolTipo;
	}


	//bi-directional many-to-one association to UsuarioRol
	@OneToMany(mappedBy="rol", fetch=FetchType.EAGER)
	public List<UsuarioRol> getUsuarioRols() {
		return this.usuarioRols;
	}

	public void setUsuarioRols(List<UsuarioRol> usuarioRols) {
		this.usuarioRols = usuarioRols;
	}

	public UsuarioRol addUsuarioRol(UsuarioRol usuarioRol) {
		getUsuarioRols().add(usuarioRol);
		usuarioRol.setRol(this);

		return usuarioRol;
	}

	public UsuarioRol removeUsuarioRol(UsuarioRol usuarioRol) {
		getUsuarioRols().remove(usuarioRol);
		usuarioRol.setRol(null);

		return usuarioRol;
	}

}