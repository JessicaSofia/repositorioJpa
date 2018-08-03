package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DISTRIBUTIVO database table.
 * 
 */
@Entity
@NamedQuery(name="Distributivo.findAll", query="SELECT d FROM Distributivo d")
public class Distributivo implements Serializable {
	private static final long serialVersionUID = 1L;
	private long distId;
	private BigDecimal distEstado;
	private DetallePuesto detallePuesto;
	private Partida partida;

	public Distributivo() {
	}


	@Id
	@Column(name="DIST_ID")
	public long getDistId() {
		return this.distId;
	}

	public void setDistId(long distId) {
		this.distId = distId;
	}


	@Column(name="DIST_ESTADO")
	public BigDecimal getDistEstado() {
		return this.distEstado;
	}

	public void setDistEstado(BigDecimal distEstado) {
		this.distEstado = distEstado;
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


	//bi-directional many-to-one association to Partida
	@ManyToOne
	@JoinColumn(name="PRT_ID")
	public Partida getPartida() {
		return this.partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

}