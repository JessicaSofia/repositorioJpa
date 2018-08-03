package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DESTREZA database table.
 * 
 */
@Entity
@NamedQuery(name="Destreza.findAll", query="SELECT d FROM Destreza d")
public class Destreza implements Serializable {
	private static final long serialVersionUID = 1L;
	private long dstId;
	private String dstDescripcion;
	private List<DestrezaPuesto> destrezaPuestos;

	public Destreza() {
	}


	@Id
	@SequenceGenerator(name="DESTREZA_DSTID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DST_ID")
	public long getDstId() {
		return this.dstId;
	}

	public void setDstId(long dstId) {
		this.dstId = dstId;
	}


	@Column(name="DST_DESCRIPCION")
	public String getDstDescripcion() {
		return this.dstDescripcion;
	}

	public void setDstDescripcion(String dstDescripcion) {
		this.dstDescripcion = dstDescripcion;
	}


	//bi-directional many-to-one association to DestrezaPuesto
	@OneToMany(mappedBy="destreza", fetch=FetchType.LAZY)
	public List<DestrezaPuesto> getDestrezaPuestos() {
		return this.destrezaPuestos;
	}

	public void setDestrezaPuestos(List<DestrezaPuesto> destrezaPuestos) {
		this.destrezaPuestos = destrezaPuestos;
	}



}