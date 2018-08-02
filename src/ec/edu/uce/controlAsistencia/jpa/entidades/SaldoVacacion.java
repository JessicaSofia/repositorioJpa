package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the SALDO_VACACION database table.
 * 
 */
@Entity
@Table(name="SALDO_VACACION")
@NamedQuery(name="SaldoVacacion.findAll", query="SELECT s FROM SaldoVacacion s")
public class SaldoVacacion implements Serializable {
	private static final long serialVersionUID = 1L;
	private long slvcId;
	private int slvcPeriodo;
	private int slvcDiasAnticipados;
	private int slvcDiasRegistrados;
	private int slvcDiasRestantes;
	private int slvcEstado;
	private int slvcNumfinsemana;
	private int slvcTotalDias;
	private String slvcTotalHoras;
	private DetallePuesto detallePuesto;

	public SaldoVacacion() {
	}


	@Id
	@SequenceGenerator(name="SALDO_VACACION_SLVCID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SALDO_VACACION_SLVCID_GENERATOR")
	@Column(name="SLVC_ID")
	public long getSlvcId() {
		return this.slvcId;
	}

	public void setSlvcId(long slvcId) {
		this.slvcId = slvcId;
	}


	@Column(name="SLVC__PERIODO")
	public int getSlvcPeriodo() {
		return this.slvcPeriodo;
	}

	public void setSlvcPeriodo(int slvcPeriodo) {
		this.slvcPeriodo = slvcPeriodo;
	}


	@Column(name="SLVC_DIAS_ANTICIPADOS")
	public int getSlvcDiasAnticipados() {
		return this.slvcDiasAnticipados;
	}

	public void setSlvcDiasAnticipados(int slvcDiasAnticipados) {
		this.slvcDiasAnticipados = slvcDiasAnticipados;
	}


	@Column(name="SLVC_DIAS_REGISTRADOS")
	public int getSlvcDiasRegistrados() {
		return this.slvcDiasRegistrados;
	}

	public void setSlvcDiasRegistrados(int slvcDiasRegistrados) {
		this.slvcDiasRegistrados = slvcDiasRegistrados;
	}


	@Column(name="SLVC_DIAS_RESTANTES")
	public int getSlvcDiasRestantes() {
		return this.slvcDiasRestantes;
	}

	public void setSlvcDiasRestantes(int slvcDiasRestantes) {
		this.slvcDiasRestantes = slvcDiasRestantes;
	}


	@Column(name="SLVC_ESTADO")
	public int getSlvcEstado() {
		return this.slvcEstado;
	}

	public void setSlvcEstado(int slvcEstado) {
		this.slvcEstado = slvcEstado;
	}


	@Column(name="SLVC_NUMFINSEMANA")
	public int getSlvcNumfinsemana() {
		return this.slvcNumfinsemana;
	}

	public void setSlvcNumfinsemana(int slvcNumfinsemana) {
		this.slvcNumfinsemana = slvcNumfinsemana;
	}


	@Column(name="SLVC_TOTAL_DIAS")
	public int getSlvcTotalDias() {
		return this.slvcTotalDias;
	}

	public void setSlvcTotalDias(int slvcTotalDias) {
		this.slvcTotalDias = slvcTotalDias;
	}


	@Column(name="SLVC_TOTAL_HORAS")
	public String getSlvcTotalHoras() {
		return this.slvcTotalHoras;
	}

	public void setSlvcTotalHoras(String slvcTotalHoras) {
		this.slvcTotalHoras = slvcTotalHoras;
	}


	//bi-directional many-to-one association to DetallePuesto
	@ManyToOne
	@JoinColumn(name="DTPS_ID")
	public DetallePuesto getDetallePuesto() {
		return this.detallePuesto;
	}

	public void setDetallePuesto(DetallePuesto detallePuesto) {
		this.detallePuesto = detallePuesto;
	}

}