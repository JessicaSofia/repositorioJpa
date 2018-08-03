package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the PARAMETRO_VACACIONES database table.
 * 
 */
@Entity
@Table(name="PARAMETRO_VACACIONES")
@NamedQuery(name="ParametroVacaciones.findAll", query="SELECT p FROM ParametroVacaciones p")
public class ParametroVacaciones implements Serializable {
	private static final long serialVersionUID = 1L;
	private long prvcId;
	private BigDecimal prvCEstado;
	private String prvcDescripcion;
	private String prvcNombre;
	private String prvcValor;
	private List<ParametroVacacionRegimen> parametroVacacionRegimens;

	public ParametroVacaciones() {
	}


	@Id
	@SequenceGenerator(name="PARAMETRO_VACACIONES_PRVCID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARAMETRO_VACACIONES_PRVCID_GENERATOR")
	@Column(name="PRVC_ID")
	public long getPrvcId() {
		return this.prvcId;
	}

	public void setPrvcId(long prvcId) {
		this.prvcId = prvcId;
	}


	@Column(name="PRV_C_ESTADO")
	public BigDecimal getPrvCEstado() {
		return this.prvCEstado;
	}

	public void setPrvCEstado(BigDecimal prvCEstado) {
		this.prvCEstado = prvCEstado;
	}


	@Column(name="PRVC_DESCRIPCION")
	public String getPrvcDescripcion() {
		return this.prvcDescripcion;
	}

	public void setPrvcDescripcion(String prvcDescripcion) {
		this.prvcDescripcion = prvcDescripcion;
	}


	@Column(name="PRVC_NOMBRE")
	public String getPrvcNombre() {
		return this.prvcNombre;
	}

	public void setPrvcNombre(String prvcNombre) {
		this.prvcNombre = prvcNombre;
	}


	@Column(name="PRVC_VALOR")
	public String getPrvcValor() {
		return this.prvcValor;
	}

	public void setPrvcValor(String prvcValor) {
		this.prvcValor = prvcValor;
	}


	//bi-directional many-to-one association to ParametroVacacionRegimen
	@OneToMany(mappedBy="parametroVacacione", fetch=FetchType.EAGER)
	public List<ParametroVacacionRegimen> getParametroVacacionRegimens() {
		return this.parametroVacacionRegimens;
	}

	public void setParametroVacacionRegimens(List<ParametroVacacionRegimen> parametroVacacionRegimens) {
		this.parametroVacacionRegimens = parametroVacacionRegimens;
	}

	public ParametroVacacionRegimen addParametroVacacionRegimen(ParametroVacacionRegimen parametroVacacionRegimen) {
		getParametroVacacionRegimens().add(parametroVacacionRegimen);
		parametroVacacionRegimen.setParametroVacacione(this);

		return parametroVacacionRegimen;
	}

	public ParametroVacacionRegimen removeParametroVacacionRegimen(ParametroVacacionRegimen parametroVacacionRegimen) {
		getParametroVacacionRegimens().remove(parametroVacacionRegimen);
		parametroVacacionRegimen.setParametroVacacione(null);

		return parametroVacacionRegimen;
	}

}