package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ACREEDOR_DESCUENTO database table.
 * 
 */
@Entity
@Table(name="ACREEDOR_DESCUENTO")
@NamedQuery(name="AcreedorDescuento.findAll", query="SELECT a FROM AcreedorDescuento a")
public class AcreedorDescuento implements Serializable {
	private static final long serialVersionUID = 1L;
	private long acdsId;
	private BigDecimal acdsEstado;
	private String acdsObservacion;
	private Acreedor acreedor;
	private Descuento descuento;
	private List<AcreDescHistorial> acreDescHistorials;
	private List<HistorialDescuento> historialDescuentos;

	public AcreedorDescuento() {
	}


	@Id
	@SequenceGenerator(name="ACREEDOR_DESCUENTO_ACDSID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACREEDOR_DESCUENTO_ACDSID_GENERATOR")
	@Column(name="ACDS_ID")
	public long getAcdsId() {
		return this.acdsId;
	}

	public void setAcdsId(long acdsId) {
		this.acdsId = acdsId;
	}


	@Column(name="ACDS_ESTADO")
	public BigDecimal getAcdsEstado() {
		return this.acdsEstado;
	}

	public void setAcdsEstado(BigDecimal acdsEstado) {
		this.acdsEstado = acdsEstado;
	}


	@Column(name="ACDS_OBSERVACION")
	public String getAcdsObservacion() {
		return this.acdsObservacion;
	}

	public void setAcdsObservacion(String acdsObservacion) {
		this.acdsObservacion = acdsObservacion;
	}


	//bi-directional many-to-one association to Acreedor
	@ManyToOne
	@JoinColumn(name="ACR_ID")
	public Acreedor getAcreedor() {
		return this.acreedor;
	}

	public void setAcreedor(Acreedor acreedor) {
		this.acreedor = acreedor;
	}


	//bi-directional many-to-one association to Descuento
	@ManyToOne
	@JoinColumn(name="DSC_ID")
	public Descuento getDescuento() {
		return this.descuento;
	}

	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}


	//bi-directional many-to-one association to AcreDescHistorial
	@OneToMany(mappedBy="acreedorDescuento", fetch=FetchType.EAGER)
	public List<AcreDescHistorial> getAcreDescHistorials() {
		return this.acreDescHistorials;
	}

	public void setAcreDescHistorials(List<AcreDescHistorial> acreDescHistorials) {
		this.acreDescHistorials = acreDescHistorials;
	}

	public AcreDescHistorial addAcreDescHistorial(AcreDescHistorial acreDescHistorial) {
		getAcreDescHistorials().add(acreDescHistorial);
		acreDescHistorial.setAcreedorDescuento(this);

		return acreDescHistorial;
	}

	public AcreDescHistorial removeAcreDescHistorial(AcreDescHistorial acreDescHistorial) {
		getAcreDescHistorials().remove(acreDescHistorial);
		acreDescHistorial.setAcreedorDescuento(null);

		return acreDescHistorial;
	}


	//bi-directional many-to-one association to HistorialDescuento
	@OneToMany(mappedBy="acreedorDescuento", fetch=FetchType.EAGER)
	public List<HistorialDescuento> getHistorialDescuentos() {
		return this.historialDescuentos;
	}

	public void setHistorialDescuentos(List<HistorialDescuento> historialDescuentos) {
		this.historialDescuentos = historialDescuentos;
	}

	public HistorialDescuento addHistorialDescuento(HistorialDescuento historialDescuento) {
		getHistorialDescuentos().add(historialDescuento);
		historialDescuento.setAcreedorDescuento(this);

		return historialDescuento;
	}

	public HistorialDescuento removeHistorialDescuento(HistorialDescuento historialDescuento) {
		getHistorialDescuentos().remove(historialDescuento);
		historialDescuento.setAcreedorDescuento(null);

		return historialDescuento;
	}

}