package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the LICENCIA database table.
 * 
 */
@Entity
@NamedQuery(name="Licencia.findAll", query="SELECT l FROM Licencia l")
public class Licencia implements Serializable {
	private static final long serialVersionUID = 1L;
	private long lcnId;
	private int dtpsId;
	private String lcnCopia;
	private int lcnEstado;
	private String lcnExplicacion;
	private Timestamp lcnFechaEmision;
	private Date lcnFechaFin;
	private Date lcnFechaInicio;
	private int lcnNumDias;
	private int lcnNumLicencia;
	private String lcnObservacion;
	private String lcnObservacionEstado;
	private TipoLicencia tipoLicencia;

	public Licencia() {
	}


	@Id
	@SequenceGenerator(name="LICENCIA_LCNID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LICENCIA_LCNID_GENERATOR")
	@Column(name="LCN_ID")
	public long getLcnId() {
		return this.lcnId;
	}

	public void setLcnId(long lcnId) {
		this.lcnId = lcnId;
	}


	@Column(name="DTPS_ID")
	public int getDtpsId() {
		return this.dtpsId;
	}

	public void setDtpsId(int dtpsId) {
		this.dtpsId = dtpsId;
	}


	@Column(name="LCN_COPIA")
	public String getLcnCopia() {
		return this.lcnCopia;
	}

	public void setLcnCopia(String lcnCopia) {
		this.lcnCopia = lcnCopia;
	}


	@Column(name="LCN_ESTADO")
	public int getLcnEstado() {
		return this.lcnEstado;
	}

	public void setLcnEstado(int lcnEstado) {
		this.lcnEstado = lcnEstado;
	}


	@Column(name="LCN_EXPLICACION")
	public String getLcnExplicacion() {
		return this.lcnExplicacion;
	}

	public void setLcnExplicacion(String lcnExplicacion) {
		this.lcnExplicacion = lcnExplicacion;
	}


	@Column(name="LCN_FECHA_EMISION")
	public Timestamp getLcnFechaEmision() {
		return this.lcnFechaEmision;
	}

	public void setLcnFechaEmision(Timestamp lcnFechaEmision) {
		this.lcnFechaEmision = lcnFechaEmision;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="LCN_FECHA_FIN")
	public Date getLcnFechaFin() {
		return this.lcnFechaFin;
	}

	public void setLcnFechaFin(Date lcnFechaFin) {
		this.lcnFechaFin = lcnFechaFin;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="LCN_FECHA_INICIO")
	public Date getLcnFechaInicio() {
		return this.lcnFechaInicio;
	}

	public void setLcnFechaInicio(Date lcnFechaInicio) {
		this.lcnFechaInicio = lcnFechaInicio;
	}


	@Column(name="LCN_NUM_DIAS")
	public int getLcnNumDias() {
		return this.lcnNumDias;
	}

	public void setLcnNumDias(int lcnNumDias) {
		this.lcnNumDias = lcnNumDias;
	}


	@Column(name="LCN_NUM_LICENCIA")
	public int getLcnNumLicencia() {
		return this.lcnNumLicencia;
	}

	public void setLcnNumLicencia(int lcnNumLicencia) {
		this.lcnNumLicencia = lcnNumLicencia;
	}


	@Column(name="LCN_OBSERVACION")
	public String getLcnObservacion() {
		return this.lcnObservacion;
	}

	public void setLcnObservacion(String lcnObservacion) {
		this.lcnObservacion = lcnObservacion;
	}


	@Column(name="LCN_OBSERVACION_ESTADO")
	public String getLcnObservacionEstado() {
		return this.lcnObservacionEstado;
	}

	public void setLcnObservacionEstado(String lcnObservacionEstado) {
		this.lcnObservacionEstado = lcnObservacionEstado;
	}


	//bi-directional many-to-one association to TipoLicencia
	@ManyToOne
	@JoinColumn(name="TPLC_ID")
	public TipoLicencia getTipoLicencia() {
		return this.tipoLicencia;
	}

	public void setTipoLicencia(TipoLicencia tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

}