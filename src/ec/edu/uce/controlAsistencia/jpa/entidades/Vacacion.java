package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the VACACION database table.
 * 
 */
@Entity
@NamedQuery(name="Vacacion.findAll", query="SELECT v FROM Vacacion v")
public class Vacacion implements Serializable {
	private static final long serialVersionUID = 1L;
	private long vccId;
	private String vccCopia;
	private int vccEstado;
	private Timestamp vccFechaEmision;
	private Date vccFechaFin;
	private Date vccFechaInicio;
	private int vccNumAutorizacion;
	private int vccNumDias;
	private String vccObservacion;
	private String vccObservacionEstado;
	private DetallePuesto detallePuesto;
	private int dtpsId;
	private int vccNumDiasDescon;
	

	public Vacacion() {
	}


	@Id
	@SequenceGenerator(name="VACACION_VCCID_GENERATOR", sequenceName="S_VACACION")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VACACION_VCCID_GENERATOR")
	@Column(name="VCC_ID")
	public long getVccId() {
		return this.vccId;
	}

	public void setVccId(long vccId) {
		this.vccId = vccId;
	}


	@Column(name="VCC_COPIA")
	public String getVccCopia() {
		return this.vccCopia;
	}

	public void setVccCopia(String vccCopia) {
		this.vccCopia = vccCopia;
	}


	@Column(name="VCC_ESTADO")
	public int getVccEstado() {
		return this.vccEstado;
	}

	public void setVccEstado(int vccEstado) {
		this.vccEstado = vccEstado;
	}


	@Column(name="VCC_FECHA_EMISION")
	public Timestamp getVccFechaEmision() {
		return this.vccFechaEmision;
	}

	public void setVccFechaEmision(Timestamp vccFechaEmision) {
		this.vccFechaEmision = vccFechaEmision;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="VCC_FECHA_FIN")
	public Date getVccFechaFin() {
		return this.vccFechaFin;
	}

	public void setVccFechaFin(Date vccFechaFin) {
		this.vccFechaFin = vccFechaFin;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="VCC_FECHA_INICIO")
	public Date getVccFechaInicio() {
		return this.vccFechaInicio;
	}

	public void setVccFechaInicio(Date vccFechaInicio) {
		this.vccFechaInicio = vccFechaInicio;
	}


	@Column(name="VCC_NUM_AUTORIZACION")
	public int getVccNumAutorizacion() {
		return this.vccNumAutorizacion;
	}

	public void setVccNumAutorizacion(int vccNumAutorizacion) {
		this.vccNumAutorizacion = vccNumAutorizacion;
	}


	@Column(name="VCC_NUM_DIAS")
	public int getVccNumDias() {
		return this.vccNumDias;
	}

	public void setVccNumDias(int vccNumDias) {
		this.vccNumDias = vccNumDias;
	}


	@Column(name="VCC_OBSERVACION")
	public String getVccObservacion() {
		return this.vccObservacion;
	}

	public void setVccObservacion(String vccObservacion) {
		this.vccObservacion = vccObservacion;
	}


	@Column(name="VCC_OBSERVACION_ESTADO")
	public String getVccObservacionEstado() {
		return this.vccObservacionEstado;
	}

	public void setVccObservacionEstado(String vccObservacionEstado) {
		this.vccObservacionEstado = vccObservacionEstado;
	}

	
	@Column(name = "DTPS_ID")
	public int getDtpsId() {
		return this.dtpsId;
	}

	public void setDtpsId(int dtpsId) {
		this.dtpsId = dtpsId;
	}

	@Column(name="VCC_NUMDIASDESCON")
	public int getVccNumDiasDescon() {
		return vccNumDiasDescon;
	}


	public void setVccNumDiasDescon(int vccNumDiasDescon) {
		this.vccNumDiasDescon = vccNumDiasDescon;
	}
	
	//bi-directional many-to-one association to DetallePuesto
	/*@ManyToOne
	@JoinColumn(name="DTPS_ID")
	public DetallePuesto getDetallePuesto() {
		return this.detallePuesto;
	}

	public void setDetallePuesto(DetallePuesto detallePuesto) {
		this.detallePuesto = detallePuesto;
	}*/

	
}