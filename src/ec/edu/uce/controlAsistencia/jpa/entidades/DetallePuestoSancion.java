package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the DETALLE_PUESTO_SANCION database table.
 * 
 */
@Entity
@Table(name="DETALLE_PUESTO_SANCION")
@NamedQuery(name="DetallePuestoSancion.findAll", query="SELECT d FROM DetallePuestoSancion d")
public class DetallePuestoSancion implements Serializable {
	private static final long serialVersionUID = 1L;
	private long dtpssnId;
	private int dtpssnAno;
	private int dtpssnDescontar;
	private String dtpssnDias;
	private int dtpssnEstado;
	private Timestamp dtpssnFechaEmision;
	private int dtpssnFrecuencia;
	private int dtpssnMes;
	private int dtpssnMinutos;
	private String dtpssnMotivoInsub;
	private int dtpssnNumaccion;
	private String dtpssnObservacion;
	private float dtpssnValor;
	private CategoriaFalta categoriaFalta;
	private int dtpsId;
	private Sancion sancion;

	public DetallePuestoSancion() {
	}


	@Id
	@SequenceGenerator(name="DETALLE_PUESTO_SANCION_DTPSSNID_GENERATOR", sequenceName="S_DETALLE_PUESTO_SANCION",  initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DETALLE_PUESTO_SANCION_DTPSSNID_GENERATOR")
	@Column(name="DTPSSN_ID")
	public long getDtpssnId() {
		return this.dtpssnId;
	}

	public void setDtpssnId(long dtpssnId) {
		this.dtpssnId = dtpssnId;
	}


	@Column(name="DTPSSN_ANO")
	public int getDtpssnAno() {
		return this.dtpssnAno;
	}

	public void setDtpssnAno(int dtpssnAno) {
		this.dtpssnAno = dtpssnAno;
	}


	@Column(name="DTPSSN_DESCONTAR")
	public int getDtpssnDescontar() {
		return this.dtpssnDescontar;
	}

	public void setDtpssnDescontar(int dtpssnDescontar) {
		this.dtpssnDescontar = dtpssnDescontar;
	}


	@Column(name="DTPSSN_DIAS")
	public String getDtpssnDias() {
		return this.dtpssnDias;
	}

	public void setDtpssnDias(String dtpssnDias) {
		this.dtpssnDias = dtpssnDias;
	}


	@Column(name="DTPSSN_ESTADO")
	public int getDtpssnEstado() {
		return this.dtpssnEstado;
	}

	public void setDtpssnEstado(int dtpssnEstado) {
		this.dtpssnEstado = dtpssnEstado;
	}


	@Column(name="DTPSSN_FECHA_EMISION")
	public Timestamp getDtpssnFechaEmision() {
		return this.dtpssnFechaEmision;
	}

	public void setDtpssnFechaEmision(Timestamp dtpssnFechaEmision) {
		this.dtpssnFechaEmision = dtpssnFechaEmision;
	}


	@Column(name="DTPSSN_FRECUENCIA")
	public int getDtpssnFrecuencia() {
		return this.dtpssnFrecuencia;
	}

	public void setDtpssnFrecuencia(int dtpssnFrecuencia) {
		this.dtpssnFrecuencia = dtpssnFrecuencia;
	}


	@Column(name="DTPSSN_MES")
	public int getDtpssnMes() {
		return this.dtpssnMes;
	}

	public void setDtpssnMes(int dtpssnMes) {
		this.dtpssnMes = dtpssnMes;
	}


	@Column(name="DTPSSN_MINUTOS")
	public int getDtpssnMinutos() {
		return this.dtpssnMinutos;
	}

	public void setDtpssnMinutos(int dtpssnMinutos) {
		this.dtpssnMinutos = dtpssnMinutos;
	}


	@Column(name="DTPSSN_MOTIVO_INSUB")
	public String getDtpssnMotivoInsub() {
		return this.dtpssnMotivoInsub;
	}

	public void setDtpssnMotivoInsub(String dtpssnMotivoInsub) {
		this.dtpssnMotivoInsub = dtpssnMotivoInsub;
	}


	@Column(name="DTPSSN_NUMACCION")
	public int getDtpssnNumaccion() {
		return this.dtpssnNumaccion;
	}

	public void setDtpssnNumaccion(int dtpssnNumaccion) {
		this.dtpssnNumaccion = dtpssnNumaccion;
	}


	@Column(name="DTPSSN_OBSERVACION")
	public String getDtpssnObservacion() {
		return this.dtpssnObservacion;
	}

	public void setDtpssnObservacion(String dtpssnObservacion) {
		this.dtpssnObservacion = dtpssnObservacion;
	}


	@Column(name="DTPSSN_VALOR")
	public float getDtpssnValor() {
		return this.dtpssnValor;
	}

	public void setDtpssnValor(float dtpssnValor) {
		this.dtpssnValor = dtpssnValor;
	}


	//bi-directional many-to-one association to CategoriaFalta
	@ManyToOne
	@JoinColumn(name="CTGFL_ID")
	public CategoriaFalta getCategoriaFalta() {
		return this.categoriaFalta;
	}
	

	
	public void setCategoriaFalta(CategoriaFalta categoriaFalta) {
		this.categoriaFalta = categoriaFalta;
	}


	@Column(name="DTPS_ID")
	public int getDtpsId() {
		return this.dtpsId;
	}

	public void setDtpsId(int dtpsId) {
		this.dtpsId = dtpsId;
	}


	//bi-directional many-to-one association to Sancion
	@ManyToOne
	@JoinColumn(name="SN_ID")
	public Sancion getSancion() {
		return this.sancion;
	}

	public void setSancion(Sancion sancion) {
		this.sancion = sancion;
	}

}