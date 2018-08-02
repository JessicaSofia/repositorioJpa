package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the AREA_CONOCIMIENTO database table.
 * 
 */
@Entity
@Table(name="AREA_CONOCIMIENTO")
@NamedQuery(name="AreaConocimiento.findAll", query="SELECT a FROM AreaConocimiento a")
public class AreaConocimiento implements Serializable {
	private static final long serialVersionUID = 1L;
	private long arcnId;
	private String arcnCodigo;
	private String arcnDescripcion;
	private BigDecimal arcnJerarquia;
	private AreaConocimiento areaConocimiento;
	private List<AreaConocimiento> areaConocimientos;
	private List<PuestoAreaConocimiento> puestoAreaConocimientos;

	public AreaConocimiento() {
	}


	@Id
	@SequenceGenerator(name="AREA_CONOCIMIENTO_ARCNID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AREA_CONOCIMIENTO_ARCNID_GENERATOR")
	@Column(name="ARCN_ID")
	public long getArcnId() {
		return this.arcnId;
	}

	public void setArcnId(long arcnId) {
		this.arcnId = arcnId;
	}


	@Column(name="ARCN_CODIGO")
	public String getArcnCodigo() {
		return this.arcnCodigo;
	}

	public void setArcnCodigo(String arcnCodigo) {
		this.arcnCodigo = arcnCodigo;
	}


	@Column(name="ARCN_DESCRIPCION")
	public String getArcnDescripcion() {
		return this.arcnDescripcion;
	}

	public void setArcnDescripcion(String arcnDescripcion) {
		this.arcnDescripcion = arcnDescripcion;
	}


	@Column(name="ARCN_JERARQUIA")
	public BigDecimal getArcnJerarquia() {
		return this.arcnJerarquia;
	}

	public void setArcnJerarquia(BigDecimal arcnJerarquia) {
		this.arcnJerarquia = arcnJerarquia;
	}


	//bi-directional many-to-one association to AreaConocimiento
	@ManyToOne
	@JoinColumn(name="ARCN_SUB_ID")
	public AreaConocimiento getAreaConocimiento() {
		return this.areaConocimiento;
	}

	public void setAreaConocimiento(AreaConocimiento areaConocimiento) {
		this.areaConocimiento = areaConocimiento;
	}


	//bi-directional many-to-one association to AreaConocimiento
	@OneToMany(mappedBy="areaConocimiento", fetch=FetchType.EAGER)
	public List<AreaConocimiento> getAreaConocimientos() {
		return this.areaConocimientos;
	}

	public void setAreaConocimientos(List<AreaConocimiento> areaConocimientos) {
		this.areaConocimientos = areaConocimientos;
	}

	public AreaConocimiento addAreaConocimiento(AreaConocimiento areaConocimiento) {
		getAreaConocimientos().add(areaConocimiento);
		areaConocimiento.setAreaConocimiento(this);

		return areaConocimiento;
	}

	public AreaConocimiento removeAreaConocimiento(AreaConocimiento areaConocimiento) {
		getAreaConocimientos().remove(areaConocimiento);
		areaConocimiento.setAreaConocimiento(null);

		return areaConocimiento;
	}


	//bi-directional many-to-one association to PuestoAreaConocimiento
	@OneToMany(mappedBy="areaConocimiento", fetch=FetchType.EAGER)
	public List<PuestoAreaConocimiento> getPuestoAreaConocimientos() {
		return this.puestoAreaConocimientos;
	}

	public void setPuestoAreaConocimientos(List<PuestoAreaConocimiento> puestoAreaConocimientos) {
		this.puestoAreaConocimientos = puestoAreaConocimientos;
	}

	public PuestoAreaConocimiento addPuestoAreaConocimiento(PuestoAreaConocimiento puestoAreaConocimiento) {
		getPuestoAreaConocimientos().add(puestoAreaConocimiento);
		puestoAreaConocimiento.setAreaConocimiento(this);

		return puestoAreaConocimiento;
	}

	public PuestoAreaConocimiento removePuestoAreaConocimiento(PuestoAreaConocimiento puestoAreaConocimiento) {
		getPuestoAreaConocimientos().remove(puestoAreaConocimiento);
		puestoAreaConocimiento.setAreaConocimiento(null);

		return puestoAreaConocimiento;
	}

}