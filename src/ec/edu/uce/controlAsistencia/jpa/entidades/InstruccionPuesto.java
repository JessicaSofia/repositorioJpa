package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the INSTRUCCION_PUESTO database table.
 * 
 */
@Entity
@Table(name="INSTRUCCION_PUESTO")
@NamedQuery(name="InstruccionPuesto.findAll", query="SELECT i FROM InstruccionPuesto i")
public class InstruccionPuesto implements Serializable {
	private static final long serialVersionUID = 1L;
	private long inpsId;
	private BigDecimal inpsAnio;
	private BigDecimal inpsMes;
	private NivelInstruccion nivelInstruccion;
	private Puesto puesto;

	public InstruccionPuesto() {
	}


	@Id
	@Column(name="INPS_ID")
	public long getInpsId() {
		return this.inpsId;
	}

	public void setInpsId(long inpsId) {
		this.inpsId = inpsId;
	}


	@Column(name="INPS_ANIO")
	public BigDecimal getInpsAnio() {
		return this.inpsAnio;
	}

	public void setInpsAnio(BigDecimal inpsAnio) {
		this.inpsAnio = inpsAnio;
	}


	@Column(name="INPS_MES")
	public BigDecimal getInpsMes() {
		return this.inpsMes;
	}

	public void setInpsMes(BigDecimal inpsMes) {
		this.inpsMes = inpsMes;
	}


	//bi-directional many-to-one association to NivelInstruccion
	@ManyToOne
	@JoinColumn(name="NVIN_ID")
	public NivelInstruccion getNivelInstruccion() {
		return this.nivelInstruccion;
	}

	public void setNivelInstruccion(NivelInstruccion nivelInstruccion) {
		this.nivelInstruccion = nivelInstruccion;
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