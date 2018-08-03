package ec.edu.uce.controlAsistencia.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PERSONA database table.
 * 
 */
@Entity
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	private long prsId;
	private String prsCarnetConadis;
	private BigDecimal prsDiscapacidad;
	private BigDecimal prsEstado;
	private Date prsFechaDefuncion;
	private Date prsFechaNacimiento;
	private String prsIdentificacion;
	private String prsMailInstitucional;
	private String prsMailPersonal;
	private String prsNombres;
	private BigDecimal prsPorcDiscapacidad;
	private String prsPrimerApellido;
	private String prsSegundoApellido;
	private BigDecimal prsSexo;
	private BigDecimal prsSexoSniese;
	private String prsTelefono;
	private BigDecimal prsTipoDiscapacidad;
	private BigDecimal prsTipoIdentificacion;
	private BigDecimal prsTipoIdentificacionSniese;
	private List<CodigoNomina> codigoNominas;
	private List<FichaEmpleado> fichaEmpleados;
	private List<HistorialEmpleado> historialEmpleados;
	private List<ImpuestoRenta> impuestoRentas;
	private Etnia etnia;
	private List<Usuario> usuarios;

	public Persona() {
	}

	@Id
	@Column(name="PRS_ID")
	public long getPrsId() {
		return this.prsId;
	}

	public void setPrsId(long prsId) {
		this.prsId = prsId;
	}


	@Column(name="PRS_CARNET_CONADIS")
	public String getPrsCarnetConadis() {
		return this.prsCarnetConadis;
	}

	public void setPrsCarnetConadis(String prsCarnetConadis) {
		this.prsCarnetConadis = prsCarnetConadis;
	}


	@Column(name="PRS_DISCAPACIDAD")
	public BigDecimal getPrsDiscapacidad() {
		return this.prsDiscapacidad;
	}

	public void setPrsDiscapacidad(BigDecimal prsDiscapacidad) {
		this.prsDiscapacidad = prsDiscapacidad;
	}


	@Column(name="PRS_ESTADO")
	public BigDecimal getPrsEstado() {
		return this.prsEstado;
	}

	public void setPrsEstado(BigDecimal prsEstado) {
		this.prsEstado = prsEstado;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="PRS_FECHA_DEFUNCION")
	public Date getPrsFechaDefuncion() {
		return this.prsFechaDefuncion;
	}

	public void setPrsFechaDefuncion(Date prsFechaDefuncion) {
		this.prsFechaDefuncion = prsFechaDefuncion;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="PRS_FECHA_NACIMIENTO")
	public Date getPrsFechaNacimiento() {
		return this.prsFechaNacimiento;
	}

	public void setPrsFechaNacimiento(Date prsFechaNacimiento) {
		this.prsFechaNacimiento = prsFechaNacimiento;
	}


	@Column(name="PRS_IDENTIFICACION")
	public String getPrsIdentificacion() {
		return this.prsIdentificacion;
	}

	public void setPrsIdentificacion(String prsIdentificacion) {
		this.prsIdentificacion = prsIdentificacion;
	}


	@Column(name="PRS_MAIL_INSTITUCIONAL")
	public String getPrsMailInstitucional() {
		return this.prsMailInstitucional;
	}

	public void setPrsMailInstitucional(String prsMailInstitucional) {
		this.prsMailInstitucional = prsMailInstitucional;
	}


	@Column(name="PRS_MAIL_PERSONAL")
	public String getPrsMailPersonal() {
		return this.prsMailPersonal;
	}

	public void setPrsMailPersonal(String prsMailPersonal) {
		this.prsMailPersonal = prsMailPersonal;
	}


	@Column(name="PRS_NOMBRES")
	public String getPrsNombres() {
		return this.prsNombres;
	}

	public void setPrsNombres(String prsNombres) {
		this.prsNombres = prsNombres;
	}


	@Column(name="PRS_PORC_DISCAPACIDAD")
	public BigDecimal getPrsPorcDiscapacidad() {
		return this.prsPorcDiscapacidad;
	}

	public void setPrsPorcDiscapacidad(BigDecimal prsPorcDiscapacidad) {
		this.prsPorcDiscapacidad = prsPorcDiscapacidad;
	}


	@Column(name="PRS_PRIMER_APELLIDO")
	public String getPrsPrimerApellido() {
		return this.prsPrimerApellido;
	}

	public void setPrsPrimerApellido(String prsPrimerApellido) {
		this.prsPrimerApellido = prsPrimerApellido;
	}


	@Column(name="PRS_SEGUNDO_APELLIDO")
	public String getPrsSegundoApellido() {
		return this.prsSegundoApellido;
	}

	public void setPrsSegundoApellido(String prsSegundoApellido) {
		this.prsSegundoApellido = prsSegundoApellido;
	}


	@Column(name="PRS_SEXO")
	public BigDecimal getPrsSexo() {
		return this.prsSexo;
	}

	public void setPrsSexo(BigDecimal prsSexo) {
		this.prsSexo = prsSexo;
	}


	@Column(name="PRS_SEXO_SNIESE")
	public BigDecimal getPrsSexoSniese() {
		return this.prsSexoSniese;
	}

	public void setPrsSexoSniese(BigDecimal prsSexoSniese) {
		this.prsSexoSniese = prsSexoSniese;
	}


	@Column(name="PRS_TELEFONO")
	public String getPrsTelefono() {
		return this.prsTelefono;
	}

	public void setPrsTelefono(String prsTelefono) {
		this.prsTelefono = prsTelefono;
	}


	@Column(name="PRS_TIPO_DISCAPACIDAD")
	public BigDecimal getPrsTipoDiscapacidad() {
		return this.prsTipoDiscapacidad;
	}

	public void setPrsTipoDiscapacidad(BigDecimal prsTipoDiscapacidad) {
		this.prsTipoDiscapacidad = prsTipoDiscapacidad;
	}


	@Column(name="PRS_TIPO_IDENTIFICACION")
	public BigDecimal getPrsTipoIdentificacion() {
		return this.prsTipoIdentificacion;
	}

	public void setPrsTipoIdentificacion(BigDecimal prsTipoIdentificacion) {
		this.prsTipoIdentificacion = prsTipoIdentificacion;
	}


	@Column(name="PRS_TIPO_IDENTIFICACION_SNIESE")
	public BigDecimal getPrsTipoIdentificacionSniese() {
		return this.prsTipoIdentificacionSniese;
	}

	public void setPrsTipoIdentificacionSniese(BigDecimal prsTipoIdentificacionSniese) {
		this.prsTipoIdentificacionSniese = prsTipoIdentificacionSniese;
	}


	//bi-directional many-to-one association to CodigoNomina
	@OneToMany(mappedBy="persona", fetch=FetchType.EAGER)
	public List<CodigoNomina> getCodigoNominas() {
		return this.codigoNominas;
	}

	public void setCodigoNominas(List<CodigoNomina> codigoNominas) {
		this.codigoNominas = codigoNominas;
	}

	public CodigoNomina addCodigoNomina(CodigoNomina codigoNomina) {
		getCodigoNominas().add(codigoNomina);
		codigoNomina.setPersona(this);

		return codigoNomina;
	}

	public CodigoNomina removeCodigoNomina(CodigoNomina codigoNomina) {
		getCodigoNominas().remove(codigoNomina);
		codigoNomina.setPersona(null);

		return codigoNomina;
	}


	//bi-directional many-to-one association to FichaEmpleado
	@OneToMany(mappedBy="persona", fetch=FetchType.EAGER)
	public List<FichaEmpleado> getFichaEmpleados() {
		return this.fichaEmpleados;
	}

	public void setFichaEmpleados(List<FichaEmpleado> fichaEmpleados) {
		this.fichaEmpleados = fichaEmpleados;
	}

	public FichaEmpleado addFichaEmpleado(FichaEmpleado fichaEmpleado) {
		getFichaEmpleados().add(fichaEmpleado);
		fichaEmpleado.setPersona(this);

		return fichaEmpleado;
	}

	public FichaEmpleado removeFichaEmpleado(FichaEmpleado fichaEmpleado) {
		getFichaEmpleados().remove(fichaEmpleado);
		fichaEmpleado.setPersona(null);

		return fichaEmpleado;
	}


	//bi-directional many-to-one association to HistorialEmpleado
	@OneToMany(mappedBy="persona", fetch=FetchType.EAGER)
	public List<HistorialEmpleado> getHistorialEmpleados() {
		return this.historialEmpleados;
	}

	public void setHistorialEmpleados(List<HistorialEmpleado> historialEmpleados) {
		this.historialEmpleados = historialEmpleados;
	}

	public HistorialEmpleado addHistorialEmpleado(HistorialEmpleado historialEmpleado) {
		getHistorialEmpleados().add(historialEmpleado);
		historialEmpleado.setPersona(this);

		return historialEmpleado;
	}

	public HistorialEmpleado removeHistorialEmpleado(HistorialEmpleado historialEmpleado) {
		getHistorialEmpleados().remove(historialEmpleado);
		historialEmpleado.setPersona(null);

		return historialEmpleado;
	}


	//bi-directional many-to-one association to ImpuestoRenta
	@OneToMany(mappedBy="persona", fetch=FetchType.EAGER)
	public List<ImpuestoRenta> getImpuestoRentas() {
		return this.impuestoRentas;
	}

	public void setImpuestoRentas(List<ImpuestoRenta> impuestoRentas) {
		this.impuestoRentas = impuestoRentas;
	}

	public ImpuestoRenta addImpuestoRenta(ImpuestoRenta impuestoRenta) {
		getImpuestoRentas().add(impuestoRenta);
		impuestoRenta.setPersona(this);

		return impuestoRenta;
	}

	public ImpuestoRenta removeImpuestoRenta(ImpuestoRenta impuestoRenta) {
		getImpuestoRentas().remove(impuestoRenta);
		impuestoRenta.setPersona(null);

		return impuestoRenta;
	}


	//bi-directional many-to-one association to Etnia
	@ManyToOne
	@JoinColumn(name="ETN_ID")
	public Etnia getEtnia() {
		return this.etnia;
	}

	public void setEtnia(Etnia etnia) {
		this.etnia = etnia;
	}


	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="persona", fetch=FetchType.LAZY)
	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return "" + prsPrimerApellido + " " + prsSegundoApellido+ "";
	}
	
	public String nombresCompetos() {
		return  prsNombres+" " + prsPrimerApellido+" "+ prsSegundoApellido+ "";
	}
	

}