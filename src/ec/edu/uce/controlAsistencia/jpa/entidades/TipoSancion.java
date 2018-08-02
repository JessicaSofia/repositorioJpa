package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TIPO_SANCION database table.
 * 
 */
@Entity
@Table(name="TIPO_SANCION")
@NamedQuery(name="TipoSancion.findAll", query="SELECT t FROM TipoSancion t")
public class TipoSancion implements Serializable {
	private static final long serialVersionUID = 1L;
	private int tpsnId;
	private String tpsnDescripcion;
	private int tpsnEstado;
	private String tpsnNomBre;
	private List<Sancion> sancions;

	public TipoSancion() {
	}


	@Id
	@SequenceGenerator(name="TIPO_SANCION_TPSNID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPO_SANCION_TPSNID_GENERATOR")
	@Column(name="TPSN_ID")
	public int getTpsnId() {
		return this.tpsnId;
	}

	public void setTpsnId(int tpsnId) {
		this.tpsnId = tpsnId;
	}


	@Column(name="TPSN_DESCRIPCION")
	public String getTpsnDescripcion() {
		return this.tpsnDescripcion;
	}

	public void setTpsnDescripcion(String tpsnDescripcion) {
		this.tpsnDescripcion = tpsnDescripcion;
	}


	@Column(name="TPSN_ESTADO")
	public int getTpsnEstado() {
		return this.tpsnEstado;
	}

	public void setTpsnEstado(int tpsnEstado) {
		this.tpsnEstado = tpsnEstado;
	}


	@Column(name="TPSN_NOM_BRE")
	public String getTpsnNomBre() {
		return this.tpsnNomBre;
	}

	public void setTpsnNomBre(String tpsnNomBre) {
		this.tpsnNomBre = tpsnNomBre;
	}


	//bi-directional many-to-one association to Sancion
	@OneToMany(mappedBy="tipoSancion", fetch=FetchType.EAGER)
	public List<Sancion> getSancions() {
		return this.sancions;
	}

	public void setSancions(List<Sancion> sancions) {
		this.sancions = sancions;
	}

	public Sancion addSancion(Sancion sancion) {
		getSancions().add(sancion);
		sancion.setTipoSancion(this);

		return sancion;
	}

	public Sancion removeSancion(Sancion sancion) {
		getSancions().remove(sancion);
		sancion.setTipoSancion(null);

		return sancion;
	}

}