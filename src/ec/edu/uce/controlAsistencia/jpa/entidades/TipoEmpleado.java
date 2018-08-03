package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TIPO_EMPLEADO database table.
 * 
 */
@Entity
@Table(name="TIPO_EMPLEADO")
@NamedQuery(name="TipoEmpleado.findAll", query="SELECT t FROM TipoEmpleado t")
public class TipoEmpleado implements Serializable {
	private static final long serialVersionUID = 1L;
	private long tpemId;
	private String tpemDescripcion;
	private BigDecimal tpemEstado;
	private List<FichaEmpleado> fichaEmpleados;

	public TipoEmpleado() {
	}


	@Id
	@Column(name="TPEM_ID")
	public long getTpemId() {
		return this.tpemId;
	}

	public void setTpemId(long tpemId) {
		this.tpemId = tpemId;
	}


	@Column(name="TPEM_DESCRIPCION")
	public String getTpemDescripcion() {
		return this.tpemDescripcion;
	}

	public void setTpemDescripcion(String tpemDescripcion) {
		this.tpemDescripcion = tpemDescripcion;
	}


	@Column(name="TPEM_ESTADO")
	public BigDecimal getTpemEstado() {
		return this.tpemEstado;
	}

	public void setTpemEstado(BigDecimal tpemEstado) {
		this.tpemEstado = tpemEstado;
	}


	//bi-directional many-to-one association to FichaEmpleado
	@OneToMany(mappedBy="tipoEmpleado", fetch=FetchType.EAGER)
	public List<FichaEmpleado> getFichaEmpleados() {
		return this.fichaEmpleados;
	}

	public void setFichaEmpleados(List<FichaEmpleado> fichaEmpleados) {
		this.fichaEmpleados = fichaEmpleados;
	}

	public FichaEmpleado addFichaEmpleado(FichaEmpleado fichaEmpleado) {
		getFichaEmpleados().add(fichaEmpleado);
		fichaEmpleado.setTipoEmpleado(this);

		return fichaEmpleado;
	}

	public FichaEmpleado removeFichaEmpleado(FichaEmpleado fichaEmpleado) {
		getFichaEmpleados().remove(fichaEmpleado);
		fichaEmpleado.setTipoEmpleado(null);

		return fichaEmpleado;
	}

}