package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CALCULO_IR database table.
 * 
 */
@Entity
@Table(name="CALCULO_IR")
@NamedQuery(name="CalculoIr.findAll", query="SELECT c FROM CalculoIr c")
public class CalculoIr implements Serializable {
	private static final long serialVersionUID = 1L;
	private long clirId;
	private BigDecimal clirAnioAplicacion;
	private BigDecimal clirEstado;
	private BigDecimal clirExcedente;
	private BigDecimal clirExceso;
	private BigDecimal clirFraccionBasica;
	private BigDecimal clirImpuestoFraccionBasica;

	public CalculoIr() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CLIR_ID")
	public long getClirId() {
		return this.clirId;
	}

	public void setClirId(long clirId) {
		this.clirId = clirId;
	}


	@Column(name="CLIR_ANIO_APLICACION")
	public BigDecimal getClirAnioAplicacion() {
		return this.clirAnioAplicacion;
	}

	public void setClirAnioAplicacion(BigDecimal clirAnioAplicacion) {
		this.clirAnioAplicacion = clirAnioAplicacion;
	}


	@Column(name="CLIR_ESTADO")
	public BigDecimal getClirEstado() {
		return this.clirEstado;
	}

	public void setClirEstado(BigDecimal clirEstado) {
		this.clirEstado = clirEstado;
	}


	@Column(name="CLIR_EXCEDENTE")
	public BigDecimal getClirExcedente() {
		return this.clirExcedente;
	}

	public void setClirExcedente(BigDecimal clirExcedente) {
		this.clirExcedente = clirExcedente;
	}


	@Column(name="CLIR_EXCESO")
	public BigDecimal getClirExceso() {
		return this.clirExceso;
	}

	public void setClirExceso(BigDecimal clirExceso) {
		this.clirExceso = clirExceso;
	}


	@Column(name="CLIR_FRACCION_BASICA")
	public BigDecimal getClirFraccionBasica() {
		return this.clirFraccionBasica;
	}

	public void setClirFraccionBasica(BigDecimal clirFraccionBasica) {
		this.clirFraccionBasica = clirFraccionBasica;
	}


	@Column(name="CLIR_IMPUESTO_FRACCION_BASICA")
	public BigDecimal getClirImpuestoFraccionBasica() {
		return this.clirImpuestoFraccionBasica;
	}

	public void setClirImpuestoFraccionBasica(BigDecimal clirImpuestoFraccionBasica) {
		this.clirImpuestoFraccionBasica = clirImpuestoFraccionBasica;
	}

}