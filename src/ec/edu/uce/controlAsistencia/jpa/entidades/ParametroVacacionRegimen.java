package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAMETRO_VACACION_REGIMEN database table.
 * 
 */
@Entity
@Table(name="PARAMETRO_VACACION_REGIMEN")
@NamedQuery(name="ParametroVacacionRegimen.findAll", query="SELECT p FROM ParametroVacacionRegimen p")
public class ParametroVacacionRegimen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARAMETRO_VACACION_REGIMEN_PRVCRGID_GENERATOR", sequenceName="S_Parametro_Vacacion_Regimen")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARAMETRO_VACACION_REGIMEN_PRVCRGID_GENERATOR")
	@Column(name="PRVCRG_ID")
	private long prvcrgId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PRVC_ID")
	private ParametroVacaciones parametroVacaciones;

	@Column(name="PRVCRG_VALOR")
	private String prvcrgValor;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "RGM_ID")
	private Regimen regimen;

	public ParametroVacacionRegimen() {
	}

	public long getPrvcrgId() {
		return this.prvcrgId;
	}

	public void setPrvcrgId(long prvcrgId) {
		this.prvcrgId = prvcrgId;
	}

	

	public ParametroVacaciones getParametroVacaciones() {
		return parametroVacaciones;
	}

	public void setParametroVacaciones(ParametroVacaciones parametroVacaciones) {
		this.parametroVacaciones = parametroVacaciones;
	}

	
	public Regimen getRegimen() {
		return regimen;
	}

	public void setRegimen(Regimen regimen) {
		this.regimen = regimen;
	}

	public String getPrvcrgValor() {
		return this.prvcrgValor;
	}

	public void setPrvcrgValor(String prvcrgValor) {
		this.prvcrgValor = prvcrgValor;
	}

	

}