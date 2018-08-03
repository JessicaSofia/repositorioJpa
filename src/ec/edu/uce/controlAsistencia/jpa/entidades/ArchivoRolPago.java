package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ARCHIVO_ROL_PAGO database table.
 * 
 */
@Entity
@Table(name="ARCHIVO_ROL_PAGO")
@NamedQuery(name="ArchivoRolPago.findAll", query="SELECT a FROM ArchivoRolPago a")
public class ArchivoRolPago implements Serializable {
	private static final long serialVersionUID = 1L;
	private long arropaId;
	private String arropaAlimentacion;
	private String arropaAnio;
	private String arropaAnticipos;
	private String arropaApellido1;
	private String arropaApellido2;
	private String arropaAporteIess;
	private String arropaAsocEmpleados;
	private String arropaAsocFacultad;
	private String arropaAsocProfesores;
	private String arropaCargaFamiliar;
	private String arropaCedula;
	private String arropaCesantia;
	private String arropaCesantiaAdicional;
	private String arropaCoberturaSaludIess;
	private String arropaCodigoFuncionario;
	private String arropaComisariato;
	private String arropaCoopAhoCredDocent;
	private String arropaDcmCuarto;
	private String arropaDcmCuartoMensual;
	private String arropaDcmTercero;
	private String arropaDcmTerceroMensual;
	private String arropaEmail;
	private String arropaFacultad;
	private String arropaFomentoDeporte;
	private String arropaFondoJubIndexada;
	private String arropaFondoMortuorio;
	private String arropaFondoReserva;
	private String arropaFondoReservaIess;
	private String arropaFuncion;
	private String arropaImpuestoRenta;
	private String arropaMes;
	private String arropaMultas;
	private String arropaNombres;
	private String arropaPago;
	private String arropaPrestamoIess;
	private String arropaPrestamoSindicato;
	private String arropaRetencionJudicial;
	private String arropaRmu;
	private String arropaSeguros;
	private String arropaTotalDescuento;
	private String arropaTotalIngreso;
	private String arropaTotalLiquido;
	private String arropaTransporte;
	private String arropaVarios;

	public ArchivoRolPago() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ARROPA_ID")
	public long getArropaId() {
		return this.arropaId;
	}

	public void setArropaId(long arropaId) {
		this.arropaId = arropaId;
	}


	@Column(name="ARROPA_ALIMENTACION")
	public String getArropaAlimentacion() {
		return this.arropaAlimentacion;
	}

	public void setArropaAlimentacion(String arropaAlimentacion) {
		this.arropaAlimentacion = arropaAlimentacion;
	}


	@Column(name="ARROPA_ANIO")
	public String getArropaAnio() {
		return this.arropaAnio;
	}

	public void setArropaAnio(String arropaAnio) {
		this.arropaAnio = arropaAnio;
	}


	@Column(name="ARROPA_ANTICIPOS")
	public String getArropaAnticipos() {
		return this.arropaAnticipos;
	}

	public void setArropaAnticipos(String arropaAnticipos) {
		this.arropaAnticipos = arropaAnticipos;
	}


	@Column(name="ARROPA_APELLIDO1")
	public String getArropaApellido1() {
		return this.arropaApellido1;
	}

	public void setArropaApellido1(String arropaApellido1) {
		this.arropaApellido1 = arropaApellido1;
	}


	@Column(name="ARROPA_APELLIDO2")
	public String getArropaApellido2() {
		return this.arropaApellido2;
	}

	public void setArropaApellido2(String arropaApellido2) {
		this.arropaApellido2 = arropaApellido2;
	}


	@Column(name="ARROPA_APORTE_IESS")
	public String getArropaAporteIess() {
		return this.arropaAporteIess;
	}

	public void setArropaAporteIess(String arropaAporteIess) {
		this.arropaAporteIess = arropaAporteIess;
	}


	@Column(name="ARROPA_ASOC_EMPLEADOS")
	public String getArropaAsocEmpleados() {
		return this.arropaAsocEmpleados;
	}

	public void setArropaAsocEmpleados(String arropaAsocEmpleados) {
		this.arropaAsocEmpleados = arropaAsocEmpleados;
	}


	@Column(name="ARROPA_ASOC_FACULTAD")
	public String getArropaAsocFacultad() {
		return this.arropaAsocFacultad;
	}

	public void setArropaAsocFacultad(String arropaAsocFacultad) {
		this.arropaAsocFacultad = arropaAsocFacultad;
	}


	@Column(name="ARROPA_ASOC_PROFESORES")
	public String getArropaAsocProfesores() {
		return this.arropaAsocProfesores;
	}

	public void setArropaAsocProfesores(String arropaAsocProfesores) {
		this.arropaAsocProfesores = arropaAsocProfesores;
	}


	@Column(name="ARROPA_CARGA_FAMILIAR")
	public String getArropaCargaFamiliar() {
		return this.arropaCargaFamiliar;
	}

	public void setArropaCargaFamiliar(String arropaCargaFamiliar) {
		this.arropaCargaFamiliar = arropaCargaFamiliar;
	}


	@Column(name="ARROPA_CEDULA")
	public String getArropaCedula() {
		return this.arropaCedula;
	}

	public void setArropaCedula(String arropaCedula) {
		this.arropaCedula = arropaCedula;
	}


	@Column(name="ARROPA_CESANTIA")
	public String getArropaCesantia() {
		return this.arropaCesantia;
	}

	public void setArropaCesantia(String arropaCesantia) {
		this.arropaCesantia = arropaCesantia;
	}


	@Column(name="ARROPA_CESANTIA_ADICIONAL")
	public String getArropaCesantiaAdicional() {
		return this.arropaCesantiaAdicional;
	}

	public void setArropaCesantiaAdicional(String arropaCesantiaAdicional) {
		this.arropaCesantiaAdicional = arropaCesantiaAdicional;
	}


	@Column(name="ARROPA_COBERTURA_SALUD_IESS")
	public String getArropaCoberturaSaludIess() {
		return this.arropaCoberturaSaludIess;
	}

	public void setArropaCoberturaSaludIess(String arropaCoberturaSaludIess) {
		this.arropaCoberturaSaludIess = arropaCoberturaSaludIess;
	}


	@Column(name="ARROPA_CODIGO_FUNCIONARIO")
	public String getArropaCodigoFuncionario() {
		return this.arropaCodigoFuncionario;
	}

	public void setArropaCodigoFuncionario(String arropaCodigoFuncionario) {
		this.arropaCodigoFuncionario = arropaCodigoFuncionario;
	}


	@Column(name="ARROPA_COMISARIATO")
	public String getArropaComisariato() {
		return this.arropaComisariato;
	}

	public void setArropaComisariato(String arropaComisariato) {
		this.arropaComisariato = arropaComisariato;
	}


	@Column(name="ARROPA_COOP_AHO_CRED_DOCENT")
	public String getArropaCoopAhoCredDocent() {
		return this.arropaCoopAhoCredDocent;
	}

	public void setArropaCoopAhoCredDocent(String arropaCoopAhoCredDocent) {
		this.arropaCoopAhoCredDocent = arropaCoopAhoCredDocent;
	}


	@Column(name="ARROPA_DCM_CUARTO")
	public String getArropaDcmCuarto() {
		return this.arropaDcmCuarto;
	}

	public void setArropaDcmCuarto(String arropaDcmCuarto) {
		this.arropaDcmCuarto = arropaDcmCuarto;
	}


	@Column(name="ARROPA_DCM_CUARTO_MENSUAL")
	public String getArropaDcmCuartoMensual() {
		return this.arropaDcmCuartoMensual;
	}

	public void setArropaDcmCuartoMensual(String arropaDcmCuartoMensual) {
		this.arropaDcmCuartoMensual = arropaDcmCuartoMensual;
	}


	@Column(name="ARROPA_DCM_TERCERO")
	public String getArropaDcmTercero() {
		return this.arropaDcmTercero;
	}

	public void setArropaDcmTercero(String arropaDcmTercero) {
		this.arropaDcmTercero = arropaDcmTercero;
	}


	@Column(name="ARROPA_DCM_TERCERO_MENSUAL")
	public String getArropaDcmTerceroMensual() {
		return this.arropaDcmTerceroMensual;
	}

	public void setArropaDcmTerceroMensual(String arropaDcmTerceroMensual) {
		this.arropaDcmTerceroMensual = arropaDcmTerceroMensual;
	}


	@Column(name="ARROPA_EMAIL")
	public String getArropaEmail() {
		return this.arropaEmail;
	}

	public void setArropaEmail(String arropaEmail) {
		this.arropaEmail = arropaEmail;
	}


	@Column(name="ARROPA_FACULTAD")
	public String getArropaFacultad() {
		return this.arropaFacultad;
	}

	public void setArropaFacultad(String arropaFacultad) {
		this.arropaFacultad = arropaFacultad;
	}


	@Column(name="ARROPA_FOMENTO_DEPORTE")
	public String getArropaFomentoDeporte() {
		return this.arropaFomentoDeporte;
	}

	public void setArropaFomentoDeporte(String arropaFomentoDeporte) {
		this.arropaFomentoDeporte = arropaFomentoDeporte;
	}


	@Column(name="ARROPA_FONDO_JUB_INDEXADA")
	public String getArropaFondoJubIndexada() {
		return this.arropaFondoJubIndexada;
	}

	public void setArropaFondoJubIndexada(String arropaFondoJubIndexada) {
		this.arropaFondoJubIndexada = arropaFondoJubIndexada;
	}


	@Column(name="ARROPA_FONDO_MORTUORIO")
	public String getArropaFondoMortuorio() {
		return this.arropaFondoMortuorio;
	}

	public void setArropaFondoMortuorio(String arropaFondoMortuorio) {
		this.arropaFondoMortuorio = arropaFondoMortuorio;
	}


	@Column(name="ARROPA_FONDO_RESERVA")
	public String getArropaFondoReserva() {
		return this.arropaFondoReserva;
	}

	public void setArropaFondoReserva(String arropaFondoReserva) {
		this.arropaFondoReserva = arropaFondoReserva;
	}


	@Column(name="ARROPA_FONDO_RESERVA_IESS")
	public String getArropaFondoReservaIess() {
		return this.arropaFondoReservaIess;
	}

	public void setArropaFondoReservaIess(String arropaFondoReservaIess) {
		this.arropaFondoReservaIess = arropaFondoReservaIess;
	}


	@Column(name="ARROPA_FUNCION")
	public String getArropaFuncion() {
		return this.arropaFuncion;
	}

	public void setArropaFuncion(String arropaFuncion) {
		this.arropaFuncion = arropaFuncion;
	}


	@Column(name="ARROPA_IMPUESTO_RENTA")
	public String getArropaImpuestoRenta() {
		return this.arropaImpuestoRenta;
	}

	public void setArropaImpuestoRenta(String arropaImpuestoRenta) {
		this.arropaImpuestoRenta = arropaImpuestoRenta;
	}


	@Column(name="ARROPA_MES")
	public String getArropaMes() {
		return this.arropaMes;
	}

	public void setArropaMes(String arropaMes) {
		this.arropaMes = arropaMes;
	}


	@Column(name="ARROPA_MULTAS")
	public String getArropaMultas() {
		return this.arropaMultas;
	}

	public void setArropaMultas(String arropaMultas) {
		this.arropaMultas = arropaMultas;
	}


	@Column(name="ARROPA_NOMBRES")
	public String getArropaNombres() {
		return this.arropaNombres;
	}

	public void setArropaNombres(String arropaNombres) {
		this.arropaNombres = arropaNombres;
	}


	@Column(name="ARROPA_PAGO")
	public String getArropaPago() {
		return this.arropaPago;
	}

	public void setArropaPago(String arropaPago) {
		this.arropaPago = arropaPago;
	}


	@Column(name="ARROPA_PRESTAMO_IESS")
	public String getArropaPrestamoIess() {
		return this.arropaPrestamoIess;
	}

	public void setArropaPrestamoIess(String arropaPrestamoIess) {
		this.arropaPrestamoIess = arropaPrestamoIess;
	}


	@Column(name="ARROPA_PRESTAMO_SINDICATO")
	public String getArropaPrestamoSindicato() {
		return this.arropaPrestamoSindicato;
	}

	public void setArropaPrestamoSindicato(String arropaPrestamoSindicato) {
		this.arropaPrestamoSindicato = arropaPrestamoSindicato;
	}


	@Column(name="ARROPA_RETENCION_JUDICIAL")
	public String getArropaRetencionJudicial() {
		return this.arropaRetencionJudicial;
	}

	public void setArropaRetencionJudicial(String arropaRetencionJudicial) {
		this.arropaRetencionJudicial = arropaRetencionJudicial;
	}


	@Column(name="ARROPA_RMU")
	public String getArropaRmu() {
		return this.arropaRmu;
	}

	public void setArropaRmu(String arropaRmu) {
		this.arropaRmu = arropaRmu;
	}


	@Column(name="ARROPA_SEGUROS")
	public String getArropaSeguros() {
		return this.arropaSeguros;
	}

	public void setArropaSeguros(String arropaSeguros) {
		this.arropaSeguros = arropaSeguros;
	}


	@Column(name="ARROPA_TOTAL_DESCUENTO")
	public String getArropaTotalDescuento() {
		return this.arropaTotalDescuento;
	}

	public void setArropaTotalDescuento(String arropaTotalDescuento) {
		this.arropaTotalDescuento = arropaTotalDescuento;
	}


	@Column(name="ARROPA_TOTAL_INGRESO")
	public String getArropaTotalIngreso() {
		return this.arropaTotalIngreso;
	}

	public void setArropaTotalIngreso(String arropaTotalIngreso) {
		this.arropaTotalIngreso = arropaTotalIngreso;
	}


	@Column(name="ARROPA_TOTAL_LIQUIDO")
	public String getArropaTotalLiquido() {
		return this.arropaTotalLiquido;
	}

	public void setArropaTotalLiquido(String arropaTotalLiquido) {
		this.arropaTotalLiquido = arropaTotalLiquido;
	}


	@Column(name="ARROPA_TRANSPORTE")
	public String getArropaTransporte() {
		return this.arropaTransporte;
	}

	public void setArropaTransporte(String arropaTransporte) {
		this.arropaTransporte = arropaTransporte;
	}


	@Column(name="ARROPA_VARIOS")
	public String getArropaVarios() {
		return this.arropaVarios;
	}

	public void setArropaVarios(String arropaVarios) {
		this.arropaVarios = arropaVarios;
	}

}