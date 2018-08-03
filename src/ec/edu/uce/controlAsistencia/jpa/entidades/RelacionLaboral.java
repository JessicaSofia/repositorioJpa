package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the RELACION_LABORAL database table.
 * 
 */
@Entity
@Table(name="RELACION_LABORAL")
@NamedQuery(name="RelacionLaboral.findAll", query="SELECT r FROM RelacionLaboral r")
public class RelacionLaboral implements Serializable {
	private static final long serialVersionUID = 1L;
	private long rllbId;
	private String rllbDescripcion;
	private BigDecimal rllbEstado;
	private List<DetallePuesto> detallePuestos;

	public RelacionLaboral() {
	}


	@Id
	@Column(name="RLLB_ID")
	public long getRllbId() {
		return this.rllbId;
	}

	public void setRllbId(long rllbId) {
		this.rllbId = rllbId;
	}


	@Column(name="RLLB_DESCRIPCION")
	public String getRllbDescripcion() {
		return this.rllbDescripcion;
	}

	public void setRllbDescripcion(String rllbDescripcion) {
		this.rllbDescripcion = rllbDescripcion;
	}


	@Column(name="RLLB_ESTADO")
	public BigDecimal getRllbEstado() {
		return this.rllbEstado;
	}

	public void setRllbEstado(BigDecimal rllbEstado) {
		this.rllbEstado = rllbEstado;
	}


	//bi-directional many-to-one association to DetallePuesto
	@OneToMany(mappedBy="relacionLaboral", fetch=FetchType.LAZY)
	public List<DetallePuesto> getDetallePuestos() {
		return this.detallePuestos;
	}

	public void setDetallePuestos(List<DetallePuesto> detallePuestos) {
		this.detallePuestos = detallePuestos;
	}


}