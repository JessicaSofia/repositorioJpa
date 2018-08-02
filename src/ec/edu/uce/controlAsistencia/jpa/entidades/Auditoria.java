package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the AUDITORIA database table.
 * 
 */
@Entity
@NamedQuery(name="Auditoria.findAll", query="SELECT a FROM Auditoria a")
public class Auditoria implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adtId;
	private String adtAccion;
	private BigDecimal adtAccionPersonal;
	private Date adtFecha;
	private String adtUsuario;

	public Auditoria() {
	}


	@Id
	@SequenceGenerator(name="AUDITORIA_ADTID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AUDITORIA_ADTID_GENERATOR")
	@Column(name="ADT_ID")
	public long getAdtId() {
		return this.adtId;
	}

	public void setAdtId(long adtId) {
		this.adtId = adtId;
	}


	@Column(name="ADT_ACCION")
	public String getAdtAccion() {
		return this.adtAccion;
	}

	public void setAdtAccion(String adtAccion) {
		this.adtAccion = adtAccion;
	}


	@Column(name="ADT_ACCION_PERSONAL")
	public BigDecimal getAdtAccionPersonal() {
		return this.adtAccionPersonal;
	}

	public void setAdtAccionPersonal(BigDecimal adtAccionPersonal) {
		this.adtAccionPersonal = adtAccionPersonal;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="ADT_FECHA")
	public Date getAdtFecha() {
		return this.adtFecha;
	}

	public void setAdtFecha(Date adtFecha) {
		this.adtFecha = adtFecha;
	}


	@Column(name="ADT_USUARIO")
	public String getAdtUsuario() {
		return this.adtUsuario;
	}

	public void setAdtUsuario(String adtUsuario) {
		this.adtUsuario = adtUsuario;
	}

}