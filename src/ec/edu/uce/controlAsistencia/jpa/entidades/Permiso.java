package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the PERMISO database table.
 * 
 */
@Entity
@NamedQuery(name="Permiso.findAll", query="SELECT p FROM Permiso p")
public class Permiso implements Serializable {
	private static final long serialVersionUID = 1L;
	private int prmId;
	private String prmHorasJustificadas;
	private String prmDescripcionMotivo;
	private Date prmFechaPermiso;
	private Timestamp prmFechaRegistro;
	private String prmHoraInicio;
	private int prmJustificacion;
	private String prmNumHoras;
	private DetallePuesto detallePuesto;
	private int dtpsId;

	public Permiso() {
	}


	@Id
	@SequenceGenerator(name="PERMISO_PRMID_GENERATOR", sequenceName="S_PERMISO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERMISO_PRMID_GENERATOR")
	@Column(name="PRM_ID")
	public int getPrmId() {
		return this.prmId;
	}

	public void setPrmId(int prmId) {
		this.prmId = prmId;
	}

	
	
	@Column(name="PRM_HORAS_JUSTIFICADAS")
	public String getPrmHorasJustificadas() {
		return prmHorasJustificadas;
	}


	public void setPrmHorasJustificadas(String prmHorasJustificadas) {
		this.prmHorasJustificadas = prmHorasJustificadas;
	}


	@Column(name="PRM_DESCRIPCION_MOTIVO")
	public String getPrmDescripcionMotivo() {
		return this.prmDescripcionMotivo;
	}

	public void setPrmDescripcionMotivo(String prmDescripcionMotivo) {
		this.prmDescripcionMotivo = prmDescripcionMotivo;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="PRM_FECHA_PERMISO")
	public Date getPrmFechaPermiso() {
		return this.prmFechaPermiso;
	}

	public void setPrmFechaPermiso(Date prmFechaPermiso) {
		this.prmFechaPermiso = prmFechaPermiso;
	}


	@Column(name="PRM_FECHA_REGISTRO")
	public Timestamp getPrmFechaRegistro() {
		return this.prmFechaRegistro;
	}

	public void setPrmFechaRegistro(Timestamp prmFechaRegistro) {
		this.prmFechaRegistro = prmFechaRegistro;
	}


	@Column(name="PRM_HORA_INICIO")
	public String getPrmHoraInicio() {
		return this.prmHoraInicio;
	}

	public void setPrmHoraInicio(String prmHoraInicio) {
		this.prmHoraInicio = prmHoraInicio;
	}


	@Column(name="PRM_JUSTIFICACION")
	public int getPrmJustificacion() {
		return this.prmJustificacion;
	}

	public void setPrmJustificacion(int prmJustificacion) {
		this.prmJustificacion = prmJustificacion;
	}


	@Column(name="PRM_NUM_HORAS")
	public String getPrmNumHoras() {
		return this.prmNumHoras;
	}

	public void setPrmNumHoras(String prmNumHoras) {
		this.prmNumHoras = prmNumHoras;
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
	
	@Column(name = "DTPS_ID")
	public int getDtpsId() {
		return this.dtpsId;
	}

	public void setDtpsId(int dtpsId) {
		this.dtpsId = dtpsId;
	}

}