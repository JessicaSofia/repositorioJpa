package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the MODALIDAD_LABORAL database table.
 * 
 */
@Entity
@Table(name="MODALIDAD_LABORAL")
@NamedQuery(name="ModalidadLaboral.findAll", query="SELECT m FROM ModalidadLaboral m")
public class ModalidadLaboral implements Serializable {
	private static final long serialVersionUID = 1L;
	private long mdlbId;
	private String mdlbDescripcion;
	private BigDecimal rgmId;
	private List<DetallePuesto> detallePuestos;

	public ModalidadLaboral() {
	}


	@Id
	@Column(name="MDLB_ID")
	public long getMdlbId() {
		return this.mdlbId;
	}

	public void setMdlbId(long mdlbId) {
		this.mdlbId = mdlbId;
	}


	@Column(name="MDLB_DESCRIPCION")
	public String getMdlbDescripcion() {
		return this.mdlbDescripcion;
	}

	public void setMdlbDescripcion(String mdlbDescripcion) {
		this.mdlbDescripcion = mdlbDescripcion;
	}


	@Column(name="RGM_ID")
	public BigDecimal getRgmId() {
		return this.rgmId;
	}

	public void setRgmId(BigDecimal rgmId) {
		this.rgmId = rgmId;
	}


	//bi-directional many-to-one association to DetallePuesto
	@OneToMany(mappedBy="modalidadLaboral", fetch=FetchType.LAZY)
	public List<DetallePuesto> getDetallePuestos() {
		return this.detallePuestos;
	}

	public void setDetallePuestos(List<DetallePuesto> detallePuestos) {
		this.detallePuestos = detallePuestos;
	}


}