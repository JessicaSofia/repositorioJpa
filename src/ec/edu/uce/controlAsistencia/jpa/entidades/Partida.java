package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PARTIDA database table.
 * 
 */
@Entity
@NamedQuery(name="Partida.findAll", query="SELECT p FROM Partida p")
public class Partida implements Serializable {
	private static final long serialVersionUID = 1L;
	private long prtId;
	private String prtNumero;
	private List<Distributivo> distributivos;

	public Partida() {
	}


	@Id
	@SequenceGenerator(name="PARTIDA_PRTID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARTIDA_PRTID_GENERATOR")
	@Column(name="PRT_ID")
	public long getPrtId() {
		return this.prtId;
	}

	public void setPrtId(long prtId) {
		this.prtId = prtId;
	}


	@Column(name="PRT_NUMERO")
	public String getPrtNumero() {
		return this.prtNumero;
	}

	public void setPrtNumero(String prtNumero) {
		this.prtNumero = prtNumero;
	}


	//bi-directional many-to-one association to Distributivo
	@OneToMany(mappedBy="partida", fetch=FetchType.EAGER)
	public List<Distributivo> getDistributivos() {
		return this.distributivos;
	}

	public void setDistributivos(List<Distributivo> distributivos) {
		this.distributivos = distributivos;
	}

	public Distributivo addDistributivo(Distributivo distributivo) {
		getDistributivos().add(distributivo);
		distributivo.setPartida(this);

		return distributivo;
	}

	public Distributivo removeDistributivo(Distributivo distributivo) {
		getDistributivos().remove(distributivo);
		distributivo.setPartida(null);

		return distributivo;
	}

}