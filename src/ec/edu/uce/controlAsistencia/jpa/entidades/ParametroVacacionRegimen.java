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
	private long prvcrgId;
	private String prvcrgValor;
	private ParametroVacaciones parametroVacacione;
	private Regimen regimen;

	public ParametroVacacionRegimen() {
	}


	@Id
	@SequenceGenerator(name="PARAMETRO_VACACION_REGIMEN_PRVCRGID_GENERATOR", sequenceName="S_Parametro_Vacacion_Regimen")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARAMETRO_VACACION_REGIMEN_PRVCRGID_GENERATOR")
	@Column(name="PRVCRG_ID")
	public long getPrvcrgId() {
		return this.prvcrgId;
	}

	public void setPrvcrgId(long prvcrgId) {
		this.prvcrgId = prvcrgId;
	}


	@Column(name="PRVCRG_VALOR")
	public String getPrvcrgValor() {
		return this.prvcrgValor;
	}

	public void setPrvcrgValor(String prvcrgValor) {
		this.prvcrgValor = prvcrgValor;
	}


	//bi-directional many-to-one association to ParametroVacacione
	@ManyToOne
	@JoinColumn(name="PRVC_ID")
	public ParametroVacaciones getParametroVacacione() {
		return this.parametroVacacione;
	}

	public void setParametroVacacione(ParametroVacaciones parametroVacacione) {
		this.parametroVacacione = parametroVacacione;
	}


	//bi-directional many-to-one association to Regimen
	@ManyToOne
	@JoinColumn(name="RGM_ID")
	public Regimen getRegimen() {
		return this.regimen;
	}

	public void setRegimen(Regimen regimen) {
		this.regimen = regimen;
	}

}