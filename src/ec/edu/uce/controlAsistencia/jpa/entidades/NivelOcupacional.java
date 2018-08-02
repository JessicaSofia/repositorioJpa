package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the NIVEL_OCUPACIONAL database table.
 * 
 */
@Entity
@Table(name="NIVEL_OCUPACIONAL")
@NamedQuery(name="NivelOcupacional.findAll", query="SELECT n FROM NivelOcupacional n")
public class NivelOcupacional implements Serializable {
	private static final long serialVersionUID = 1L;
	private long nvocId;
	private String nvocDescripcion;
	private BigDecimal rgmId;
	private List<DetallePuesto> detallePuestos;

	public NivelOcupacional() {
	}


	@Id
	@SequenceGenerator(name="NIVEL_OCUPACIONAL_NVOCID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NIVEL_OCUPACIONAL_NVOCID_GENERATOR")
	@Column(name="NVOC_ID")
	public long getNvocId() {
		return this.nvocId;
	}

	public void setNvocId(long nvocId) {
		this.nvocId = nvocId;
	}


	@Column(name="NVOC_DESCRIPCION")
	public String getNvocDescripcion() {
		return this.nvocDescripcion;
	}

	public void setNvocDescripcion(String nvocDescripcion) {
		this.nvocDescripcion = nvocDescripcion;
	}


	@Column(name="RGM_ID")
	public BigDecimal getRgmId() {
		return this.rgmId;
	}

	public void setRgmId(BigDecimal rgmId) {
		this.rgmId = rgmId;
	}


	//bi-directional many-to-one association to DetallePuesto
	@OneToMany(mappedBy="nivelOcupacional", fetch=FetchType.EAGER)
	public List<DetallePuesto> getDetallePuestos() {
		return this.detallePuestos;
	}

	public void setDetallePuestos(List<DetallePuesto> detallePuestos) {
		this.detallePuestos = detallePuestos;
	}

	public DetallePuesto addDetallePuesto(DetallePuesto detallePuesto) {
		getDetallePuestos().add(detallePuesto);
		detallePuesto.setNivelOcupacional(this);

		return detallePuesto;
	}

	public DetallePuesto removeDetallePuesto(DetallePuesto detallePuesto) {
		getDetallePuestos().remove(detallePuesto);
		detallePuesto.setNivelOcupacional(null);

		return detallePuesto;
	}

}