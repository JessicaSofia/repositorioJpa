package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the REGIMEN database table.
 * 
 */
@Entity
@NamedQuery(name="Regimen.findAll", query="SELECT r FROM Regimen r")
public class Regimen implements Serializable {
	private static final long serialVersionUID = 1L;
	private long rgmId;
	private String rgmCodigo;
	private String rgmDescripcion;
	private BigDecimal rgmJerarquia;
	private List<GrupoOcupacional> grupoOcupacionals;
	private List<ParametroVacacionRegimen> parametroVacacionRegimens;
	private List<Puesto> puestos;
	private List<TipoLicencia> tipoLicencias;

	public Regimen() {
	}


	@Id
	@SequenceGenerator(name="REGIMEN_RGMID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REGIMEN_RGMID_GENERATOR")
	@Column(name="RGM_ID")
	public long getRgmId() {
		return this.rgmId;
	}

	public void setRgmId(long rgmId) {
		this.rgmId = rgmId;
	}


	@Column(name="RGM_CODIGO")
	public String getRgmCodigo() {
		return this.rgmCodigo;
	}

	public void setRgmCodigo(String rgmCodigo) {
		this.rgmCodigo = rgmCodigo;
	}


	@Column(name="RGM_DESCRIPCION")
	public String getRgmDescripcion() {
		return this.rgmDescripcion;
	}

	public void setRgmDescripcion(String rgmDescripcion) {
		this.rgmDescripcion = rgmDescripcion;
	}


	@Column(name="RGM_JERARQUIA")
	public BigDecimal getRgmJerarquia() {
		return this.rgmJerarquia;
	}

	public void setRgmJerarquia(BigDecimal rgmJerarquia) {
		this.rgmJerarquia = rgmJerarquia;
	}


	//bi-directional many-to-one association to GrupoOcupacional
	@OneToMany(mappedBy="regimen", fetch=FetchType.EAGER)
	public List<GrupoOcupacional> getGrupoOcupacionals() {
		return this.grupoOcupacionals;
	}

	public void setGrupoOcupacionals(List<GrupoOcupacional> grupoOcupacionals) {
		this.grupoOcupacionals = grupoOcupacionals;
	}

	public GrupoOcupacional addGrupoOcupacional(GrupoOcupacional grupoOcupacional) {
		getGrupoOcupacionals().add(grupoOcupacional);
		grupoOcupacional.setRegimen(this);

		return grupoOcupacional;
	}

	public GrupoOcupacional removeGrupoOcupacional(GrupoOcupacional grupoOcupacional) {
		getGrupoOcupacionals().remove(grupoOcupacional);
		grupoOcupacional.setRegimen(null);

		return grupoOcupacional;
	}


	//bi-directional many-to-one association to ParametroVacacionRegimen
	@OneToMany(mappedBy="regimen", fetch=FetchType.EAGER)
	public List<ParametroVacacionRegimen> getParametroVacacionRegimens() {
		return this.parametroVacacionRegimens;
	}

	public void setParametroVacacionRegimens(List<ParametroVacacionRegimen> parametroVacacionRegimens) {
		this.parametroVacacionRegimens = parametroVacacionRegimens;
	}

	public ParametroVacacionRegimen addParametroVacacionRegimen(ParametroVacacionRegimen parametroVacacionRegimen) {
		getParametroVacacionRegimens().add(parametroVacacionRegimen);
		parametroVacacionRegimen.setRegimen(this);

		return parametroVacacionRegimen;
	}

	public ParametroVacacionRegimen removeParametroVacacionRegimen(ParametroVacacionRegimen parametroVacacionRegimen) {
		getParametroVacacionRegimens().remove(parametroVacacionRegimen);
		parametroVacacionRegimen.setRegimen(null);

		return parametroVacacionRegimen;
	}


	//bi-directional many-to-one association to Puesto
	@OneToMany(mappedBy="regimen", fetch=FetchType.EAGER)
	public List<Puesto> getPuestos() {
		return this.puestos;
	}

	public void setPuestos(List<Puesto> puestos) {
		this.puestos = puestos;
	}

	public Puesto addPuesto(Puesto puesto) {
		getPuestos().add(puesto);
		puesto.setRegimen(this);

		return puesto;
	}

	public Puesto removePuesto(Puesto puesto) {
		getPuestos().remove(puesto);
		puesto.setRegimen(null);

		return puesto;
	}


	//bi-directional many-to-one association to TipoLicencia
	@OneToMany(mappedBy="regimen", fetch=FetchType.EAGER)
	public List<TipoLicencia> getTipoLicencias() {
		return this.tipoLicencias;
	}

	public void setTipoLicencias(List<TipoLicencia> tipoLicencias) {
		this.tipoLicencias = tipoLicencias;
	}

	public TipoLicencia addTipoLicencia(TipoLicencia tipoLicencia) {
		getTipoLicencias().add(tipoLicencia);
		tipoLicencia.setRegimen(this);

		return tipoLicencia;
	}

	public TipoLicencia removeTipoLicencia(TipoLicencia tipoLicencia) {
		getTipoLicencias().remove(tipoLicencia);
		tipoLicencia.setRegimen(null);

		return tipoLicencia;
	}

}