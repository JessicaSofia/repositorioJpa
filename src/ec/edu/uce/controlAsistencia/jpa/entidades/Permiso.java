package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
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

	@Id
	@SequenceGenerator(name="PERMISO_PRMID_GENERATOR", sequenceName="S_PERMISO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERMISO_PRMID_GENERATOR")
	@Column(name="PRM_ID")
	private int prmId;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DTPS_ID")
	private DetallePuesto detallePuesto;

	@Column(name="PRM_CARGO_VACACION")
	private int prmCargoVacacion;

	@Temporal(TemporalType.DATE)
	@Column(name="PRM_FECHA_PERMISO")
	private Date prmFechaPermiso;

	@Column(name="PRM_FECHA_REGISTRO")
	private Timestamp prmFechaRegistro;

	@Column(name="PRM_HORA_INICIO")
	private String prmHoraInicio;

	@Column(name="PRM_JUSTIFICACION")
	private int prmJustificacion;

	@Column(name="PRM_NUM_DIAS")
	private int prmNumDias;

	@Column(name="PRM_NUM_HORAS")
	private int prmNumHoras;

	public Permiso() {
	}

	public int getPrmId() {
		return this.prmId;
	}

	public void setPrmId(int prmId) {
		this.prmId = prmId;
	}

	
	public DetallePuesto getDetallePuesto() {
		return detallePuesto;
	}

	public void setDetallePuesto(DetallePuesto detallePuesto) {
		this.detallePuesto = detallePuesto;
	}

	public int getPrmCargoVacacion() {
		return this.prmCargoVacacion;
	}

	public void setPrmCargoVacacion(int prmCargoVacacion) {
		this.prmCargoVacacion = prmCargoVacacion;
	}

	public Date getPrmFechaPermiso() {
		return this.prmFechaPermiso;
	}

	public void setPrmFechaPermiso(Date prmFechaPermiso) {
		this.prmFechaPermiso = prmFechaPermiso;
	}

	public Timestamp getPrmFechaRegistro() {
		return this.prmFechaRegistro;
	}

	public void setPrmFechaRegistro(Timestamp prmFechaRegistro) {
		this.prmFechaRegistro = prmFechaRegistro;
	}

	public String getPrmHoraInicio() {
		return this.prmHoraInicio;
	}

	public void setPrmHoraInicio(String prmHoraInicio) {
		this.prmHoraInicio = prmHoraInicio;
	}

	public int getPrmJustificacion() {
		return this.prmJustificacion;
	}

	public void setPrmJustificacion(int prmJustificacion) {
		this.prmJustificacion = prmJustificacion;
	}

	public int getPrmNumDias() {
		return this.prmNumDias;
	}

	public void setPrmNumDias(int prmNumDias) {
		this.prmNumDias = prmNumDias;
	}

	public int getPrmNumHoras() {
		return this.prmNumHoras;
	}

	public void setPrmNumHoras(int prmNumHoras) {
		this.prmNumHoras = prmNumHoras;
	}

}