package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.int;
import java.util.List;


/**
 * The persistent class for the TIPO_LICENCIA database table.
 * 
 */
@Entity
@Table(name="TIPO_LICENCIA")
@NamedQuery(name="TipoLicencia.findAll", query="SELECT t FROM TipoLicencia t")
public class TipoLicencia implements Serializable {
	private static final long serialVersionUID = 1L;
	private long tplcId;
	private String tplcDescripcion;
	private int tplcEstado;
	private int tplcMaxDias;
	private int tplcMinDias;
	private String tplcNombre;
	private List<Licencia> licencias;
	private Regimen regimen;
	private TipoLicencia tipoLicencia;
	private List<TipoLicencia> tipoLicencias;

	public TipoLicencia() {
	}


	@Id
	@SequenceGenerator(name="TIPO_LICENCIA_TPLCID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPO_LICENCIA_TPLCID_GENERATOR")
	@Column(name="TPLC_ID")
	public long getTplcId() {
		return this.tplcId;
	}

	public void setTplcId(long tplcId) {
		this.tplcId = tplcId;
	}


	@Column(name="TPLC_DESCRIPCION")
	public String getTplcDescripcion() {
		return this.tplcDescripcion;
	}

	public void setTplcDescripcion(String tplcDescripcion) {
		this.tplcDescripcion = tplcDescripcion;
	}


	@Column(name="TPLC_ESTADO")
	public int getTplcEstado() {
		return this.tplcEstado;
	}

	public void setTplcEstado(int tplcEstado) {
		this.tplcEstado = tplcEstado;
	}


	@Column(name="TPLC_MAX_DIAS")
	public int getTplcMaxDias() {
		return this.tplcMaxDias;
	}

	public void setTplcMaxDias(int tplcMaxDias) {
		this.tplcMaxDias = tplcMaxDias;
	}


	@Column(name="TPLC_MIN_DIAS")
	public int getTplcMinDias() {
		return this.tplcMinDias;
	}

	public void setTplcMinDias(int tplcMinDias) {
		this.tplcMinDias = tplcMinDias;
	}


	@Column(name="TPLC_NOMBRE")
	public String getTplcNombre() {
		return this.tplcNombre;
	}

	public void setTplcNombre(String tplcNombre) {
		this.tplcNombre = tplcNombre;
	}


	//bi-directional many-to-one association to Licencia
	@OneToMany(mappedBy="tipoLicencia", fetch=FetchType.EAGER)
	public List<Licencia> getLicencias() {
		return this.licencias;
	}

	public void setLicencias(List<Licencia> licencias) {
		this.licencias = licencias;
	}

	public Licencia addLicencia(Licencia licencia) {
		getLicencias().add(licencia);
		licencia.setTipoLicencia(this);

		return licencia;
	}

	public Licencia removeLicencia(Licencia licencia) {
		getLicencias().remove(licencia);
		licencia.setTipoLicencia(null);

		return licencia;
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


	//bi-directional many-to-one association to TipoLicencia
	@ManyToOne
	@JoinColumn(name="TPL_TPLC_ID")
	public TipoLicencia getTipoLicencia() {
		return this.tipoLicencia;
	}

	public void setTipoLicencia(TipoLicencia tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}


	//bi-directional many-to-one association to TipoLicencia
	@OneToMany(mappedBy="tipoLicencia", fetch=FetchType.EAGER)
	public List<TipoLicencia> getTipoLicencias() {
		return this.tipoLicencias;
	}

	public void setTipoLicencias(List<TipoLicencia> tipoLicencias) {
		this.tipoLicencias = tipoLicencias;
	}

	public TipoLicencia addTipoLicencia(TipoLicencia tipoLicencia) {
		getTipoLicencias().add(tipoLicencia);
		tipoLicencia.setTipoLicencia(this);

		return tipoLicencia;
	}

	public TipoLicencia removeTipoLicencia(TipoLicencia tipoLicencia) {
		getTipoLicencias().remove(tipoLicencia);
		tipoLicencia.setTipoLicencia(null);

		return tipoLicencia;
	}

}