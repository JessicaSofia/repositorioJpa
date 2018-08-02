package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TIEMPO_DEDICACION database table.
 * 
 */
@Entity
@Table(name="TIEMPO_DEDICACION")
@NamedQuery(name="TiempoDedicacion.findAll", query="SELECT t FROM TiempoDedicacion t")
public class TiempoDedicacion implements Serializable {
	private static final long serialVersionUID = 1L;
	private long tmddId;
	private String tmddDescripcion;
	private BigDecimal tmddEstado;
	private List<CategoriaTiempo> categoriaTiempos;

	public TiempoDedicacion() {
	}


	@Id
	@SequenceGenerator(name="TIEMPO_DEDICACION_TMDDID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIEMPO_DEDICACION_TMDDID_GENERATOR")
	@Column(name="TMDD_ID")
	public long getTmddId() {
		return this.tmddId;
	}

	public void setTmddId(long tmddId) {
		this.tmddId = tmddId;
	}


	@Column(name="TMDD_DESCRIPCION")
	public String getTmddDescripcion() {
		return this.tmddDescripcion;
	}

	public void setTmddDescripcion(String tmddDescripcion) {
		this.tmddDescripcion = tmddDescripcion;
	}


	@Column(name="TMDD_ESTADO")
	public BigDecimal getTmddEstado() {
		return this.tmddEstado;
	}

	public void setTmddEstado(BigDecimal tmddEstado) {
		this.tmddEstado = tmddEstado;
	}


	//bi-directional many-to-one association to CategoriaTiempo
	@OneToMany(mappedBy="tiempoDedicacion", fetch=FetchType.EAGER)
	public List<CategoriaTiempo> getCategoriaTiempos() {
		return this.categoriaTiempos;
	}

	public void setCategoriaTiempos(List<CategoriaTiempo> categoriaTiempos) {
		this.categoriaTiempos = categoriaTiempos;
	}

	public CategoriaTiempo addCategoriaTiempo(CategoriaTiempo categoriaTiempo) {
		getCategoriaTiempos().add(categoriaTiempo);
		categoriaTiempo.setTiempoDedicacion(this);

		return categoriaTiempo;
	}

	public CategoriaTiempo removeCategoriaTiempo(CategoriaTiempo categoriaTiempo) {
		getCategoriaTiempos().remove(categoriaTiempo);
		categoriaTiempo.setTiempoDedicacion(null);

		return categoriaTiempo;
	}

}