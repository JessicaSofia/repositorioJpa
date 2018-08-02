package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PUESTO_AREA_CONOCIMIENTO database table.
 * 
 */
@Entity
@Table(name="PUESTO_AREA_CONOCIMIENTO")
@NamedQuery(name="PuestoAreaConocimiento.findAll", query="SELECT p FROM PuestoAreaConocimiento p")
public class PuestoAreaConocimiento implements Serializable {
	private static final long serialVersionUID = 1L;
	private long psarcnId;
	private AreaConocimiento areaConocimiento;
	private Puesto puesto;

	public PuestoAreaConocimiento() {
	}


	@Id
	@SequenceGenerator(name="PUESTO_AREA_CONOCIMIENTO_PSARCNID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PUESTO_AREA_CONOCIMIENTO_PSARCNID_GENERATOR")
	@Column(name="PSARCN_ID")
	public long getPsarcnId() {
		return this.psarcnId;
	}

	public void setPsarcnId(long psarcnId) {
		this.psarcnId = psarcnId;
	}


	//bi-directional many-to-one association to AreaConocimiento
	@ManyToOne
	@JoinColumn(name="ARCN_ID")
	public AreaConocimiento getAreaConocimiento() {
		return this.areaConocimiento;
	}

	public void setAreaConocimiento(AreaConocimiento areaConocimiento) {
		this.areaConocimiento = areaConocimiento;
	}


	//bi-directional many-to-one association to Puesto
	@ManyToOne
	@JoinColumn(name="PST_ID")
	public Puesto getPuesto() {
		return this.puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

}