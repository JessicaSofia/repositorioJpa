package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the SANCION database table.
 * 
 */
@Entity
@NamedQuery(name="Sancion.findAll", query="SELECT s FROM Sancion s")
public class Sancion implements Serializable {
	private static final long serialVersionUID = 1L;
	private long snId;
	private String snNombre;
	private String snDescripcion;
	private int snDescuento;
	private int snEstado;
	private int snPorcentaje;
	private int snNivel;
	private List<CategoriaFalta> categoriaFaltas;
	private List<DetallePuestoSancion> detallePuestoSancions;
	private TipoSancion tipoSancion;

	public Sancion() {
	}


	@Id
	@SequenceGenerator(name="SANCION_SNID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SANCION_SNID_GENERATOR")
	@Column(name="SN_ID")
	public long getSnId() {
		return this.snId;
	}

	public void setSnId(long snId) {
		this.snId = snId;
	}


	@Column(name="SN__NOMBRE")
	public String getSnNombre() {
		return this.snNombre;
	}

	public void setSnNombre(String snNombre) {
		this.snNombre = snNombre;
	}


	@Column(name="SN_DESCRIPCION")
	public String getSnDescripcion() {
		return this.snDescripcion;
	}

	public void setSnDescripcion(String snDescripcion) {
		this.snDescripcion = snDescripcion;
	}


	@Column(name="SN_DESCUENTO")
	public int getSnDescuento() {
		return this.snDescuento;
	}

	public void setSnDescuento(int snDescuento) {
		this.snDescuento = snDescuento;
	}


	@Column(name="SN_ESTADO")
	public int getSnEstado() {
		return this.snEstado;
	}

	public void setSnEstado(int snEstado) {
		this.snEstado = snEstado;
	}

	
	@Column(name="SN_PORCENTAJE")
	public int getSnPorcentaje() {
		return snPorcentaje;
	}

	public void setSnPorcentaje(int snPorcentaje) {
		this.snPorcentaje = snPorcentaje;
	}


	@Column(name="SN_NIVEL")
	public int getSnNivel() {
		return this.snNivel;
	}

	public void setSnNivel(int snNivel) {
		this.snNivel = snNivel;
	}


	//bi-directional many-to-one association to CategoriaFalta
	@OneToMany(mappedBy="sancion", fetch=FetchType.EAGER)
	public List<CategoriaFalta> getCategoriaFaltas() {
		return this.categoriaFaltas;
	}

	public void setCategoriaFaltas(List<CategoriaFalta> categoriaFaltas) {
		this.categoriaFaltas = categoriaFaltas;
	}

	public CategoriaFalta addCategoriaFalta(CategoriaFalta categoriaFalta) {
		getCategoriaFaltas().add(categoriaFalta);
		categoriaFalta.setSancion(this);

		return categoriaFalta;
	}

	public CategoriaFalta removeCategoriaFalta(CategoriaFalta categoriaFalta) {
		getCategoriaFaltas().remove(categoriaFalta);
		categoriaFalta.setSancion(null);

		return categoriaFalta;
	}


	//bi-directional many-to-one association to DetallePuestoSancion
	@OneToMany(mappedBy="sancion", fetch=FetchType.EAGER)
	public List<DetallePuestoSancion> getDetallePuestoSancions() {
		return this.detallePuestoSancions;
	}

	public void setDetallePuestoSancions(List<DetallePuestoSancion> detallePuestoSancions) {
		this.detallePuestoSancions = detallePuestoSancions;
	}

	public DetallePuestoSancion addDetallePuestoSancion(DetallePuestoSancion detallePuestoSancion) {
		getDetallePuestoSancions().add(detallePuestoSancion);
		detallePuestoSancion.setSancion(this);

		return detallePuestoSancion;
	}

	public DetallePuestoSancion removeDetallePuestoSancion(DetallePuestoSancion detallePuestoSancion) {
		getDetallePuestoSancions().remove(detallePuestoSancion);
		detallePuestoSancion.setSancion(null);

		return detallePuestoSancion;
	}


	//bi-directional many-to-one association to TipoSancion
	@ManyToOne
	@JoinColumn(name="TPSN_ID")
	public TipoSancion getTipoSancion() {
		return this.tipoSancion;
	}

	public void setTipoSancion(TipoSancion tipoSancion) {
		this.tipoSancion = tipoSancion;
	}

}