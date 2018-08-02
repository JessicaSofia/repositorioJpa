package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DESTREZA_PUESTO database table.
 * 
 */
@Entity
@Table(name="DESTREZA_PUESTO")
@NamedQuery(name="DestrezaPuesto.findAll", query="SELECT d FROM DestrezaPuesto d")
public class DestrezaPuesto implements Serializable {
	private static final long serialVersionUID = 1L;
	private long dspsId;
	private Destreza destreza;
	private Puesto puesto;

	public DestrezaPuesto() {
	}


	@Id
	@SequenceGenerator(name="DESTREZA_PUESTO_DSPSID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DESTREZA_PUESTO_DSPSID_GENERATOR")
	@Column(name="DSPS_ID")
	public long getDspsId() {
		return this.dspsId;
	}

	public void setDspsId(long dspsId) {
		this.dspsId = dspsId;
	}


	//bi-directional many-to-one association to Destreza
	@ManyToOne
	@JoinColumn(name="DST_ID")
	public Destreza getDestreza() {
		return this.destreza;
	}

	public void setDestreza(Destreza destreza) {
		this.destreza = destreza;
	}


	//bi-directional many-to-one association to Puesto
	@ManyToOne
	@JoinColumn(name="PST_ID")
	public Puesto getPuesto() {
		return this.puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

}