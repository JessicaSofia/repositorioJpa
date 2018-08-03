package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
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
	private int dtpsId;
	private int prsId;
	private int rolPagAlimentacion;
	private int rolPagAnio;
	private int rolPagAnticipos;
	private int rolPagAporteIess;
	private int rolPagAsocEmpleados;
	private int rolPagAsocFacultad;
	private int rolPagAsocProfesores;
	private int rolPagCargaFamiliar;
	private int rolPagCesantia;
	private int rolPagCesantiaAdicional;
	private int rolPagCoberturaSaludIess;
	private String rolPagCodigoFuncionario;
	private int rolPagComisariato;
	private int rolPagCoopAhoCredDocent;
	private int rolPagDcmCuarto;
	private int rolPagDcmCuartoMensual;
	private int rolPagDcmTercero;
	private int rolPagDcmTerceroMensual;
	private int rolPagEstado;
	private String rolPagFacultad;
	private int rolPagFomentoDeporte;
	private int rolPagFondoJubIndexada;
	private int rolPagFondoMortuorio;
	private int rolPagFondoReserva;
	private int rolPagFondoReservaIess;
	private String rolPagFuncion;
	private int rolPagImpuestoRenta;
	private int rolPagMes;
	private int rolPagMultas;
	private String rolPagPago;
	private int rolPagPrestamoIess;
	private int rolPagPrestamoSindicato;
	private int rolPagRetencionJudicial;
	private int rolPagRmu;
	private int rolPagRmuFase;
	private int rolPagSeguros;
	private int rolPagTotalDescuento;
	private int rolPagTotalIngreso;
	private int rolPagTotalLiquido;
	private int rolPagTransporte;
	private int rolPagVarios;
	private List<HistorialDescuento> historialDescuentos;
	private ControlPago controlPago;

	public RolPago() {
	}


	@Id
	@Column(name="ROL_PAG_ID")
	public long getRolPagId() {
		return this.rolPagId;
	}

	public void setRolPagId(long rolPagId) {
		this.rolPagId = rolPagId;
	}


	@Column(name="DTPS_ID")
	public int getDtpsId() {
		return this.dtpsId;
	}

	public void setDtpsId(int dtpsId) {
		this.dtpsId = dtpsId;
	}


	@Column(name="PRS_ID")
	public int getPrsId() {
		return this.prsId;
	}

	public void setPrsId(int prsId) {
		this.prsId = prsId;
	}


	@Column(name="ROL_PAG_ALIMENTACION")
	public int getRolPagAlimentacion() {
		return this.rolPagAlimentacion;
	}

	public void setRolPagAlimentacion(int rolPagAlimentacion) {
		this.rolPagAlimentacion = rolPagAlimentacion;
	}


	@Column(name="ROL_PAG_ANIO")
	public int getRolPagAnio() {
		return this.rolPagAnio;
	}

	public void setRolPagAnio(int rolPagAnio) {
		this.rolPagAnio = rolPagAnio;
	}


	@Column(name="ROL_PAG_ANTICIPOS")
	public int getRolPagAnticipos() {
		return this.rolPagAnticipos;
	}

	public void setRolPagAnticipos(int rolPagAnticipos) {
		this.rolPagAnticipos = rolPagAnticipos;
	}


	@Column(name="ROL_PAG_APORTE_IESS")
	public int getRolPagAporteIess() {
		return this.rolPagAporteIess;
	}

	public void setRolPagAporteIess(int rolPagAporteIess) {
		this.rolPagAporteIess = rolPagAporteIess;
	}


	@Column(name="ROL_PAG_ASOC_EMPLEADOS")
	public int getRolPagAsocEmpleados() {
		return this.rolPagAsocEmpleados;
	}

	public void setRolPagAsocEmpleados(int rolPagAsocEmpleados) {
		this.rolPagAsocEmpleados = rolPagAsocEmpleados;
	}


	@Column(name="ROL_PAG_ASOC_FACULTAD")
	public int getRolPagAsocFacultad() {
		return this.rolPagAsocFacultad;
	}

	public void setRolPagAsocFacultad(int rolPagAsocFacultad) {
		this.rolPagAsocFacultad = rolPagAsocFacultad;
	}


	@Column(name="ROL_PAG_ASOC_PROFESORES")
	public int getRolPagAsocProfesores() {
		return this.rolPagAsocProfesores;
	}

	public void setRolPagAsocProfesores(int rolPagAsocProfesores) {
		this.rolPagAsocProfesores = rolPagAsocProfesores;
	}


	@Column(name="ROL_PAG_CARGA_FAMILIAR")
	public int getRolPagCargaFamiliar() {
		return this.rolPagCargaFamiliar;
	}

	public void setRolPagCargaFamiliar(int rolPagCargaFamiliar) {
		this.rolPagCargaFamiliar = rolPagCargaFamiliar;
	}


	@Column(name="ROL_PAG_CESANTIA")
	public int getRolPagCesantia() {
		return this.rolPagCesantia;
	}

	public void setRolPagCesantia(int rolPagCesantia) {
		this.rolPagCesantia = rolPagCesantia;
	}


	@Column(name="ROL_PAG_CESANTIA_ADICIONAL")
	public int getRolPagCesantiaAdicional() {
		return this.rolPagCesantiaAdicional;
	}

	public void setRolPagCesantiaAdicional(int rolPagCesantiaAdicional) {
		this.rolPagCesantiaAdicional = rolPagCesantiaAdicional;
	}


	@Column(name="ROL_PAG_COBERTURA_SALUD_IESS")
	public int getRolPagCoberturaSaludIess() {
		return this.rolPagCoberturaSaludIess;
	}

	public void setRolPagCoberturaSaludIess(int rolPagCoberturaSaludIess) {
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
	public int getRolPagComisariato() {
		return this.rolPagComisariato;
	}

	public void setRolPagComisariato(int rolPagComisariato) {
		this.rolPagComisariato = rolPagComisariato;
	}


	@Column(name="ROL_PAG_COOP_AHO_CRED_DOCENT")
	public int getRolPagCoopAhoCredDocent() {
		return this.rolPagCoopAhoCredDocent;
	}

	public void setRolPagCoopAhoCredDocent(int rolPagCoopAhoCredDocent) {
		this.rolPagCoopAhoCredDocent = rolPagCoopAhoCredDocent;
	}


	@Column(name="ROL_PAG_DCM_CUARTO")
	public int getRolPagDcmCuarto() {
		return this.rolPagDcmCuarto;
	}

	public void setRolPagDcmCuarto(int rolPagDcmCuarto) {
		this.rolPagDcmCuarto = rolPagDcmCuarto;
	}


	@Column(name="ROL_PAG_DCM_CUARTO_MENSUAL")
	public int getRolPagDcmCuartoMensual() {
		return this.rolPagDcmCuartoMensual;
	}

	public void setRolPagDcmCuartoMensual(int rolPagDcmCuartoMensual) {
		this.rolPagDcmCuartoMensual = rolPagDcmCuartoMensual;
	}


	@Column(name="ROL_PAG_DCM_TERCERO")
	public int getRolPagDcmTercero() {
		return this.rolPagDcmTercero;
	}

	public void setRolPagDcmTercero(int rolPagDcmTercero) {
		this.rolPagDcmTercero = rolPagDcmTercero;
	}


	@Column(name="ROL_PAG_DCM_TERCERO_MENSUAL")
	public int getRolPagDcmTerceroMensual() {
		return this.rolPagDcmTerceroMensual;
	}

	public void setRolPagDcmTerceroMensual(int rolPagDcmTerceroMensual) {
		this.rolPagDcmTerceroMensual = rolPagDcmTerceroMensual;
	}


	@Column(name="ROL_PAG_ESTADO")
	public int getRolPagEstado() {
		return this.rolPagEstado;
	}

	public void setRolPagEstado(int rolPagEstado) {
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
	public int getRolPagFomentoDeporte() {
		return this.rolPagFomentoDeporte;
	}

	public void setRolPagFomentoDeporte(int rolPagFomentoDeporte) {
		this.rolPagFomentoDeporte = rolPagFomentoDeporte;
	}


	@Column(name="ROL_PAG_FONDO_JUB_INDEXADA")
	public int getRolPagFondoJubIndexada() {
		return this.rolPagFondoJubIndexada;
	}

	public void setRolPagFondoJubIndexada(int rolPagFondoJubIndexada) {
		this.rolPagFondoJubIndexada = rolPagFondoJubIndexada;
	}


	@Column(name="ROL_PAG_FONDO_MORTUORIO")
	public int getRolPagFondoMortuorio() {
		return this.rolPagFondoMortuorio;
	}

	public void setRolPagFondoMortuorio(int rolPagFondoMortuorio) {
		this.rolPagFondoMortuorio = rolPagFondoMortuorio;
	}


	@Column(name="ROL_PAG_FONDO_RESERVA")
	public int getRolPagFondoReserva() {
		return this.rolPagFondoReserva;
	}

	public void setRolPagFondoReserva(int rolPagFondoReserva) {
		this.rolPagFondoReserva = rolPagFondoReserva;
	}


	@Column(name="ROL_PAG_FONDO_RESERVA_IESS")
	public int getRolPagFondoReservaIess() {
		return this.rolPagFondoReservaIess;
	}

	public void setRolPagFondoReservaIess(int rolPagFondoReservaIess) {
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
	public int getRolPagImpuestoRenta() {
		return this.rolPagImpuestoRenta;
	}

	public void setRolPagImpuestoRenta(int rolPagImpuestoRenta) {
		this.rolPagImpuestoRenta = rolPagImpuestoRenta;
	}


	@Column(name="ROL_PAG_MES")
	public int getRolPagMes() {
		return this.rolPagMes;
	}

	public void setRolPagMes(int rolPagMes) {
		this.rolPagMes = rolPagMes;
	}


	@Column(name="ROL_PAG_MULTAS")
	public int getRolPagMultas() {
		return this.rolPagMultas;
	}

	public void setRolPagMultas(int rolPagMultas) {
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
	public int getRolPagPrestamoIess() {
		return this.rolPagPrestamoIess;
	}

	public void setRolPagPrestamoIess(int rolPagPrestamoIess) {
		this.rolPagPrestamoIess = rolPagPrestamoIess;
	}


	@Column(name="ROL_PAG_PRESTAMO_SINDICATO")
	public int getRolPagPrestamoSindicato() {
		return this.rolPagPrestamoSindicato;
	}

	public void setRolPagPrestamoSindicato(int rolPagPrestamoSindicato) {
		this.rolPagPrestamoSindicato = rolPagPrestamoSindicato;
	}


	@Column(name="ROL_PAG_RETENCION_JUDICIAL")
	public int getRolPagRetencionJudicial() {
		return this.rolPagRetencionJudicial;
	}

	public void setRolPagRetencionJudicial(int rolPagRetencionJudicial) {
		this.rolPagRetencionJudicial = rolPagRetencionJudicial;
	}


	@Column(name="ROL_PAG_RMU")
	public int getRolPagRmu() {
		return this.rolPagRmu;
	}

	public void setRolPagRmu(int rolPagRmu) {
		this.rolPagRmu = rolPagRmu;
	}


	@Column(name="ROL_PAG_RMU_FASE")
	public int getRolPagRmuFase() {
		return this.rolPagRmuFase;
	}

	public void setRolPagRmuFase(int rolPagRmuFase) {
		this.rolPagRmuFase = rolPagRmuFase;
	}


	@Column(name="ROL_PAG_SEGUROS")
	public int getRolPagSeguros() {
		return this.rolPagSeguros;
	}

	public void setRolPagSeguros(int rolPagSeguros) {
		this.rolPagSeguros = rolPagSeguros;
	}


	@Column(name="ROL_PAG_TOTAL_DESCUENTO")
	public int getRolPagTotalDescuento() {
		return this.rolPagTotalDescuento;
	}

	public void setRolPagTotalDescuento(int rolPagTotalDescuento) {
		this.rolPagTotalDescuento = rolPagTotalDescuento;
	}


	@Column(name="ROL_PAG_TOTAL_INGRESO")
	public int getRolPagTotalIngreso() {
		return this.rolPagTotalIngreso;
	}

	public void setRolPagTotalIngreso(int rolPagTotalIngreso) {
		this.rolPagTotalIngreso = rolPagTotalIngreso;
	}


	@Column(name="ROL_PAG_TOTAL_LIQUIDO")
	public int getRolPagTotalLiquido() {
		return this.rolPagTotalLiquido;
	}

	public void setRolPagTotalLiquido(int rolPagTotalLiquido) {
		this.rolPagTotalLiquido = rolPagTotalLiquido;
	}


	@Column(name="ROL_PAG_TRANSPORTE")
	public int getRolPagTransporte() {
		return this.rolPagTransporte;
	}

	public void setRolPagTransporte(int rolPagTransporte) {
		this.rolPagTransporte = rolPagTransporte;
	}


	@Column(name="ROL_PAG_VARIOS")
	public int getRolPagVarios() {
		return this.rolPagVarios;
	}

	public void setRolPagVarios(int rolPagVarios) {
		this.rolPagVarios = rolPagVarios;
	}


	//bi-directional many-to-one association to HistorialDescuento
	@OneToMany(mappedBy="rolPago", fetch=FetchType.LAZY)
	public List<HistorialDescuento> getHistorialDescuentos() {
		return this.historialDescuentos;
	}

	public void setHistorialDescuentos(List<HistorialDescuento> historialDescuentos) {
		this.historialDescuentos = historialDescuentos;
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