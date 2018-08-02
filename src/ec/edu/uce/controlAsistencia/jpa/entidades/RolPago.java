package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ROL_PAGO database table.
 * 
 */
@Entity
@Table(name="ROL_PAGO")
@NamedQuery(name="RolPago.findAll", query="SELECT r FROM RolPago r")
public class RolPago implements Serializable {
	private static final long serialVersionUID = 1L;
	private long rolPagId;
	private BigDecimal dtpsId;
	private BigDecimal prsId;
	private BigDecimal rolPagAlimentacion;
	private BigDecimal rolPagAnio;
	private BigDecimal rolPagAnticipos;
	private BigDecimal rolPagAporteIess;
	private BigDecimal rolPagAsocEmpleados;
	private BigDecimal rolPagAsocFacultad;
	private BigDecimal rolPagAsocProfesores;
	private BigDecimal rolPagCargaFamiliar;
	private BigDecimal rolPagCesantia;
	private BigDecimal rolPagCesantiaAdicional;
	private BigDecimal rolPagCoberturaSaludIess;
	private String rolPagCodigoFuncionario;
	private BigDecimal rolPagComisariato;
	private BigDecimal rolPagCoopAhoCredDocent;
	private BigDecimal rolPagDcmCuarto;
	private BigDecimal rolPagDcmCuartoMensual;
	private BigDecimal rolPagDcmTercero;
	private BigDecimal rolPagDcmTerceroMensual;
	private BigDecimal rolPagEstado;
	private String rolPagFacultad;
	private BigDecimal rolPagFomentoDeporte;
	private BigDecimal rolPagFondoJubIndexada;
	private BigDecimal rolPagFondoMortuorio;
	private BigDecimal rolPagFondoReserva;
	private BigDecimal rolPagFondoReservaIess;
	private String rolPagFuncion;
	private BigDecimal rolPagImpuestoRenta;
	private BigDecimal rolPagMes;
	private BigDecimal rolPagMultas;
	private String rolPagPago;
	private BigDecimal rolPagPrestamoIess;
	private BigDecimal rolPagPrestamoSindicato;
	private BigDecimal rolPagRetencionJudicial;
	private BigDecimal rolPagRmu;
	private BigDecimal rolPagRmuFase;
	private BigDecimal rolPagSeguros;
	private BigDecimal rolPagTotalDescuento;
	private BigDecimal rolPagTotalIngreso;
	private BigDecimal rolPagTotalLiquido;
	private BigDecimal rolPagTransporte;
	private BigDecimal rolPagVarios;
	private List<HistorialDescuento> historialDescuentos;
	private ControlPago controlPago;

	public RolPago() {
	}


	@Id
	@SequenceGenerator(name="ROL_PAGO_ROLPAGID_GENERATOR", sequenceName="S_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ROL_PAGO_ROLPAGID_GENERATOR")
	@Column(name="ROL_PAG_ID")
	public long getRolPagId() {
		return this.rolPagId;
	}

	public void setRolPagId(long rolPagId) {
		this.rolPagId = rolPagId;
	}


	@Column(name="DTPS_ID")
	public BigDecimal getDtpsId() {
		return this.dtpsId;
	}

	public void setDtpsId(BigDecimal dtpsId) {
		this.dtpsId = dtpsId;
	}


	@Column(name="PRS_ID")
	public BigDecimal getPrsId() {
		return this.prsId;
	}

	public void setPrsId(BigDecimal prsId) {
		this.prsId = prsId;
	}


	@Column(name="ROL_PAG_ALIMENTACION")
	public BigDecimal getRolPagAlimentacion() {
		return this.rolPagAlimentacion;
	}

	public void setRolPagAlimentacion(BigDecimal rolPagAlimentacion) {
		this.rolPagAlimentacion = rolPagAlimentacion;
	}


	@Column(name="ROL_PAG_ANIO")
	public BigDecimal getRolPagAnio() {
		return this.rolPagAnio;
	}

	public void setRolPagAnio(BigDecimal rolPagAnio) {
		this.rolPagAnio = rolPagAnio;
	}


	@Column(name="ROL_PAG_ANTICIPOS")
	public BigDecimal getRolPagAnticipos() {
		return this.rolPagAnticipos;
	}

	public void setRolPagAnticipos(BigDecimal rolPagAnticipos) {
		this.rolPagAnticipos = rolPagAnticipos;
	}


	@Column(name="ROL_PAG_APORTE_IESS")
	public BigDecimal getRolPagAporteIess() {
		return this.rolPagAporteIess;
	}

	public void setRolPagAporteIess(BigDecimal rolPagAporteIess) {
		this.rolPagAporteIess = rolPagAporteIess;
	}


	@Column(name="ROL_PAG_ASOC_EMPLEADOS")
	public BigDecimal getRolPagAsocEmpleados() {
		return this.rolPagAsocEmpleados;
	}

	public void setRolPagAsocEmpleados(BigDecimal rolPagAsocEmpleados) {
		this.rolPagAsocEmpleados = rolPagAsocEmpleados;
	}


	@Column(name="ROL_PAG_ASOC_FACULTAD")
	public BigDecimal getRolPagAsocFacultad() {
		return this.rolPagAsocFacultad;
	}

	public void setRolPagAsocFacultad(BigDecimal rolPagAsocFacultad) {
		this.rolPagAsocFacultad = rolPagAsocFacultad;
	}


	@Column(name="ROL_PAG_ASOC_PROFESORES")
	public BigDecimal getRolPagAsocProfesores() {
		return this.rolPagAsocProfesores;
	}

	public void setRolPagAsocProfesores(BigDecimal rolPagAsocProfesores) {
		this.rolPagAsocProfesores = rolPagAsocProfesores;
	}


	@Column(name="ROL_PAG_CARGA_FAMILIAR")
	public BigDecimal getRolPagCargaFamiliar() {
		return this.rolPagCargaFamiliar;
	}

	public void setRolPagCargaFamiliar(BigDecimal rolPagCargaFamiliar) {
		this.rolPagCargaFamiliar = rolPagCargaFamiliar;
	}


	@Column(name="ROL_PAG_CESANTIA")
	public BigDecimal getRolPagCesantia() {
		return this.rolPagCesantia;
	}

	public void setRolPagCesantia(BigDecimal rolPagCesantia) {
		this.rolPagCesantia = rolPagCesantia;
	}


	@Column(name="ROL_PAG_CESANTIA_ADICIONAL")
	public BigDecimal getRolPagCesantiaAdicional() {
		return this.rolPagCesantiaAdicional;
	}

	public void setRolPagCesantiaAdicional(BigDecimal rolPagCesantiaAdicional) {
		this.rolPagCesantiaAdicional = rolPagCesantiaAdicional;
	}


	@Column(name="ROL_PAG_COBERTURA_SALUD_IESS")
	public BigDecimal getRolPagCoberturaSaludIess() {
		return this.rolPagCoberturaSaludIess;
	}

	public void setRolPagCoberturaSaludIess(BigDecimal rolPagCoberturaSaludIess) {
		this.rolPagCoberturaSaludIess = rolPagCoberturaSaludIess;
	}


	@Column(name="ROL_PAG_CODIGO_FUNCIONARIO")
	public String getRolPagCodigoFuncionario() {
		return this.rolPagCodigoFuncionario;
	}

	public void setRolPagCodigoFuncionario(String rolPagCodigoFuncionario) {
		this.rolPagCodigoFuncionario = rolPagCodigoFuncionario;
	}


	@Column(name="ROL_PAG_COMISARIATO")
	public BigDecimal getRolPagComisariato() {
		return this.rolPagComisariato;
	}

	public void setRolPagComisariato(BigDecimal rolPagComisariato) {
		this.rolPagComisariato = rolPagComisariato;
	}


	@Column(name="ROL_PAG_COOP_AHO_CRED_DOCENT")
	public BigDecimal getRolPagCoopAhoCredDocent() {
		return this.rolPagCoopAhoCredDocent;
	}

	public void setRolPagCoopAhoCredDocent(BigDecimal rolPagCoopAhoCredDocent) {
		this.rolPagCoopAhoCredDocent = rolPagCoopAhoCredDocent;
	}


	@Column(name="ROL_PAG_DCM_CUARTO")
	public BigDecimal getRolPagDcmCuarto() {
		return this.rolPagDcmCuarto;
	}

	public void setRolPagDcmCuarto(BigDecimal rolPagDcmCuarto) {
		this.rolPagDcmCuarto = rolPagDcmCuarto;
	}


	@Column(name="ROL_PAG_DCM_CUARTO_MENSUAL")
	public BigDecimal getRolPagDcmCuartoMensual() {
		return this.rolPagDcmCuartoMensual;
	}

	public void setRolPagDcmCuartoMensual(BigDecimal rolPagDcmCuartoMensual) {
		this.rolPagDcmCuartoMensual = rolPagDcmCuartoMensual;
	}


	@Column(name="ROL_PAG_DCM_TERCERO")
	public BigDecimal getRolPagDcmTercero() {
		return this.rolPagDcmTercero;
	}

	public void setRolPagDcmTercero(BigDecimal rolPagDcmTercero) {
		this.rolPagDcmTercero = rolPagDcmTercero;
	}


	@Column(name="ROL_PAG_DCM_TERCERO_MENSUAL")
	public BigDecimal getRolPagDcmTerceroMensual() {
		return this.rolPagDcmTerceroMensual;
	}

	public void setRolPagDcmTerceroMensual(BigDecimal rolPagDcmTerceroMensual) {
		this.rolPagDcmTerceroMensual = rolPagDcmTerceroMensual;
	}


	@Column(name="ROL_PAG_ESTADO")
	public BigDecimal getRolPagEstado() {
		return this.rolPagEstado;
	}

	public void setRolPagEstado(BigDecimal rolPagEstado) {
		this.rolPagEstado = rolPagEstado;
	}


	@Column(name="ROL_PAG_FACULTAD")
	public String getRolPagFacultad() {
		return this.rolPagFacultad;
	}

	public void setRolPagFacultad(String rolPagFacultad) {
		this.rolPagFacultad = rolPagFacultad;
	}


	@Column(name="ROL_PAG_FOMENTO_DEPORTE")
	public BigDecimal getRolPagFomentoDeporte() {
		return this.rolPagFomentoDeporte;
	}

	public void setRolPagFomentoDeporte(BigDecimal rolPagFomentoDeporte) {
		this.rolPagFomentoDeporte = rolPagFomentoDeporte;
	}


	@Column(name="ROL_PAG_FONDO_JUB_INDEXADA")
	public BigDecimal getRolPagFondoJubIndexada() {
		return this.rolPagFondoJubIndexada;
	}

	public void setRolPagFondoJubIndexada(BigDecimal rolPagFondoJubIndexada) {
		this.rolPagFondoJubIndexada = rolPagFondoJubIndexada;
	}


	@Column(name="ROL_PAG_FONDO_MORTUORIO")
	public BigDecimal getRolPagFondoMortuorio() {
		return this.rolPagFondoMortuorio;
	}

	public void setRolPagFondoMortuorio(BigDecimal rolPagFondoMortuorio) {
		this.rolPagFondoMortuorio = rolPagFondoMortuorio;
	}


	@Column(name="ROL_PAG_FONDO_RESERVA")
	public BigDecimal getRolPagFondoReserva() {
		return this.rolPagFondoReserva;
	}

	public void setRolPagFondoReserva(BigDecimal rolPagFondoReserva) {
		this.rolPagFondoReserva = rolPagFondoReserva;
	}


	@Column(name="ROL_PAG_FONDO_RESERVA_IESS")
	public BigDecimal getRolPagFondoReservaIess() {
		return this.rolPagFondoReservaIess;
	}

	public void setRolPagFondoReservaIess(BigDecimal rolPagFondoReservaIess) {
		this.rolPagFondoReservaIess = rolPagFondoReservaIess;
	}


	@Column(name="ROL_PAG_FUNCION")
	public String getRolPagFuncion() {
		return this.rolPagFuncion;
	}

	public void setRolPagFuncion(String rolPagFuncion) {
		this.rolPagFuncion = rolPagFuncion;
	}


	@Column(name="ROL_PAG_IMPUESTO_RENTA")
	public BigDecimal getRolPagImpuestoRenta() {
		return this.rolPagImpuestoRenta;
	}

	public void setRolPagImpuestoRenta(BigDecimal rolPagImpuestoRenta) {
		this.rolPagImpuestoRenta = rolPagImpuestoRenta;
	}


	@Column(name="ROL_PAG_MES")
	public BigDecimal getRolPagMes() {
		return this.rolPagMes;
	}

	public void setRolPagMes(BigDecimal rolPagMes) {
		this.rolPagMes = rolPagMes;
	}


	@Column(name="ROL_PAG_MULTAS")
	public BigDecimal getRolPagMultas() {
		return this.rolPagMultas;
	}

	public void setRolPagMultas(BigDecimal rolPagMultas) {
		this.rolPagMultas = rolPagMultas;
	}


	@Column(name="ROL_PAG_PAGO")
	public String getRolPagPago() {
		return this.rolPagPago;
	}

	public void setRolPagPago(String rolPagPago) {
		this.rolPagPago = rolPagPago;
	}


	@Column(name="ROL_PAG_PRESTAMO_IESS")
	public BigDecimal getRolPagPrestamoIess() {
		return this.rolPagPrestamoIess;
	}

	public void setRolPagPrestamoIess(BigDecimal rolPagPrestamoIess) {
		this.rolPagPrestamoIess = rolPagPrestamoIess;
	}


	@Column(name="ROL_PAG_PRESTAMO_SINDICATO")
	public BigDecimal getRolPagPrestamoSindicato() {
		return this.rolPagPrestamoSindicato;
	}

	public void setRolPagPrestamoSindicato(BigDecimal rolPagPrestamoSindicato) {
		this.rolPagPrestamoSindicato = rolPagPrestamoSindicato;
	}


	@Column(name="ROL_PAG_RETENCION_JUDICIAL")
	public BigDecimal getRolPagRetencionJudicial() {
		return this.rolPagRetencionJudicial;
	}

	public void setRolPagRetencionJudicial(BigDecimal rolPagRetencionJudicial) {
		this.rolPagRetencionJudicial = rolPagRetencionJudicial;
	}


	@Column(name="ROL_PAG_RMU")
	public BigDecimal getRolPagRmu() {
		return this.rolPagRmu;
	}

	public void setRolPagRmu(BigDecimal rolPagRmu) {
		this.rolPagRmu = rolPagRmu;
	}


	@Column(name="ROL_PAG_RMU_FASE")
	public BigDecimal getRolPagRmuFase() {
		return this.rolPagRmuFase;
	}

	public void setRolPagRmuFase(BigDecimal rolPagRmuFase) {
		this.rolPagRmuFase = rolPagRmuFase;
	}


	@Column(name="ROL_PAG_SEGUROS")
	public BigDecimal getRolPagSeguros() {
		return this.rolPagSeguros;
	}

	public void setRolPagSeguros(BigDecimal rolPagSeguros) {
		this.rolPagSeguros = rolPagSeguros;
	}


	@Column(name="ROL_PAG_TOTAL_DESCUENTO")
	public BigDecimal getRolPagTotalDescuento() {
		return this.rolPagTotalDescuento;
	}

	public void setRolPagTotalDescuento(BigDecimal rolPagTotalDescuento) {
		this.rolPagTotalDescuento = rolPagTotalDescuento;
	}


	@Column(name="ROL_PAG_TOTAL_INGRESO")
	public BigDecimal getRolPagTotalIngreso() {
		return this.rolPagTotalIngreso;
	}

	public void setRolPagTotalIngreso(BigDecimal rolPagTotalIngreso) {
		this.rolPagTotalIngreso = rolPagTotalIngreso;
	}


	@Column(name="ROL_PAG_TOTAL_LIQUIDO")
	public BigDecimal getRolPagTotalLiquido() {
		return this.rolPagTotalLiquido;
	}

	public void setRolPagTotalLiquido(BigDecimal rolPagTotalLiquido) {
		this.rolPagTotalLiquido = rolPagTotalLiquido;
	}


	@Column(name="ROL_PAG_TRANSPORTE")
	public BigDecimal getRolPagTransporte() {
		return this.rolPagTransporte;
	}

	public void setRolPagTransporte(BigDecimal rolPagTransporte) {
		this.rolPagTransporte = rolPagTransporte;
	}


	@Column(name="ROL_PAG_VARIOS")
	public BigDecimal getRolPagVarios() {
		return this.rolPagVarios;
	}

	public void setRolPagVarios(BigDecimal rolPagVarios) {
		this.rolPagVarios = rolPagVarios;
	}


	//bi-directional many-to-one association to HistorialDescuento
	@OneToMany(mappedBy="rolPago", fetch=FetchType.EAGER)
	public List<HistorialDescuento> getHistorialDescuentos() {
		return this.historialDescuentos;
	}

	public void setHistorialDescuentos(List<HistorialDescuento> historialDescuentos) {
		this.historialDescuentos = historialDescuentos;
	}

	public HistorialDescuento addHistorialDescuento(HistorialDescuento historialDescuento) {
		getHistorialDescuentos().add(historialDescuento);
		historialDescuento.setRolPago(this);

		return historialDescuento;
	}

	public HistorialDescuento removeHistorialDescuento(HistorialDescuento historialDescuento) {
		getHistorialDescuentos().remove(historialDescuento);
		historialDescuento.setRolPago(null);

		return historialDescuento;
	}


	//bi-directional many-to-one association to ControlPago
	@ManyToOne
	@JoinColumn(name="CNT_PAG_ID")
	public ControlPago getControlPago() {
		return this.controlPago;
	}

	public void setControlPago(ControlPago controlPago) {
		this.controlPago = controlPago;
	}

}