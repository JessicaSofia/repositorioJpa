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

	@Id
	@SequenceGenerator(name="PERMISO_PRMID_GENERATOR", sequenceName="GENPERMISO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERMISO_PRMID_GENERATOR")
	@Column(name="PRM_ID")
	private long prmId;

	@Column(name="DTPS_ID")
	private BigDecimal dtpsId;

	@Column(name="PRM_CARGO_VACACION")
	private BigDecimal prmCargoVacacion;

	@Temporal(TemporalType.DATE)
	@Column(name="PRM_FECHA_PERMISO")
	private Date prmFechaPermiso;

	@Column(name="PRM_FECHA_REGISTRO")
	private Timestamp prmFechaRegistro;

	@Column(name="PRM_HORA_INICIO")
	private String prmHoraInicio;

	@Column(name="PRM_JUSTIFICACION")
	private BigDecimal prmJustificacion;

	@Column(name="PRM_NUM_DIAS")
	private BigDecimal prmNumDias;

	@Column(name="PRM_NUM_HORAS")
	private BigDecimal prmNumHoras;

	public Permiso() {
	}

	public long getPrmId() {
		return this.prmId;
	}

	public void setPrmId(long prmId) {
		this.prmId = prmId;
	}

	public BigDecimal getDtpsId() {
		return this.dtpsId;
	}

	public void setDtpsId(BigDecimal dtpsId) {
		this.dtpsId = dtpsId;
	}

	public BigDecimal getPrmCargoVacacion() {
		return this.prmCargoVacacion;
	}

	public void setPrmCargoVacacion(BigDecimal prmCargoVacacion) {
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

	public BigDecimal getPrmJustificacion() {
		return this.prmJustificacion;
	}

	public void setPrmJustificacion(BigDecimal prmJustificacion) {
		this.prmJustificacion = prmJustificacion;
	}

	public BigDecimal getPrmNumDias() {
		return this.prmNumDias;
	}

	public void setPrmNumDias(BigDecimal prmNumDias) {
		this.prmNumDias = prmNumDias;
	}

	public BigDecimal getPrmNumHoras() {
		return this.prmNumHoras;
	}

	public void setPrmNumHoras(BigDecimal prmNumHoras) {
		this.prmNumHoras = prmNumHoras;
	}

}