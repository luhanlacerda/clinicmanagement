package testesintegracao;

import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classesBasicas.Consulta;
import classesBasicas.Medico;
import classesBasicas.Paciente;
import classesBasicas.Secretaria;
import classesBasicas.incorporada.EstadoConsulta;
import negocios.INegocioConsulta;
import negocios.NegocioConsulta;

public class ConsultaTest {

	private Consulta consulta;
	private Paciente paciente;
	private Secretaria secretaria;
	private Medico medico;
	private static INegocioConsulta negocioConsulta;

	@BeforeClass
	public static void inicializarNegocioConsulta() {
		negocioConsulta = new NegocioConsulta();
	}

	@Before
	public void inicializarConsulta() {
		this.consulta = new Consulta();
		this.paciente = new Paciente();
		paciente.setNome("paciente");
		this.secretaria = new Secretaria();
		secretaria.setNome("secretaria");
		this.medico = new Medico();
		medico.setNome("medico");
	}

	// INSERT

	@Test(expected = Exception.class)
	public void testarInserirConsultaComDuracaoInvalida() throws Exception {
		consulta.setDuracao(0);
		consulta.setPaciente(paciente);
		consulta.setMedico(medico);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.insert(consulta);
	}

	@Test(expected = Exception.class)
	public void testarInserirConsultaComPacienteInvalido() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(null);
		consulta.setMedico(medico);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.insert(consulta);
	}

	@Test(expected = Exception.class)
	public void testarInserirConsultaComMedicoInvalido() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(null);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.insert(consulta);
	}

	@Test(expected = Exception.class)
	public void testarInserirConsultaComSecretariaInvalida() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(medico);
		consulta.setSecretaria(null);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.insert(consulta);
	}

	@Test(expected = Exception.class)
	public void testarInserirConsultaComEstadoInvalido() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(medico);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(null);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.insert(consulta);
	}

	@Test(expected = Exception.class)
	public void testarInserirConsultaComHorarioInvalido() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(null);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(null);
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.insert(consulta);
	}

	@Test(expected = Exception.class)
	public void testarInserirConsultaComObservacaoMaiorQueEsperado() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(null);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajdrhasiu");
		negocioConsulta.insert(consulta);
	}

	// UPDATE

	@Test(expected = Exception.class)
	public void testarUpdateConsultaComDuracaoInvalida() throws Exception {
		consulta.setDuracao(0);
		consulta.setPaciente(paciente);
		consulta.setMedico(medico);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.update(consulta);
	}

	@Test(expected = Exception.class)
	public void testarUpdateConsultaComPacienteInvalido() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(null);
		consulta.setMedico(medico);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.update(consulta);
	}

	@Test(expected = Exception.class)
	public void testarUpdateConsultaComMedicoInvalido() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(null);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.update(consulta);
	}

	@Test(expected = Exception.class)
	public void testarUpdateConsultaComSecretariaInvalida() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(medico);
		consulta.setSecretaria(null);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.update(consulta);
	}

	@Test(expected = Exception.class)
	public void testarUpdateConsultaComEstadoInvalido() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(medico);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(null);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.update(consulta);
	}

	@Test(expected = Exception.class)
	public void testarUpdateConsultaComHorarioInvalido() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(null);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(null);
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.update(consulta);
	}

	@Test(expected = Exception.class)
	public void testarUpdateConsultaComObservacaoMaiorQueEsperado() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(null);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajdrhasiu");
		negocioConsulta.update(consulta);
	}

	// REFRESH

	@Test(expected = Exception.class)
	public void testarRefreshConsultaComDuracaoInvalida() throws Exception {
		consulta.setDuracao(0);
		consulta.setPaciente(paciente);
		consulta.setMedico(medico);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.refresh(consulta);
	}

	@Test(expected = Exception.class)
	public void testarRefreshConsultaComPacienteInvalido() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(null);
		consulta.setMedico(medico);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.refresh(consulta);
	}

	@Test(expected = Exception.class)
	public void testarRefreshConsultaComMedicoInvalido() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(null);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.refresh(consulta);
	}

	@Test(expected = Exception.class)
	public void testarRefreshConsultaComSecretariaInvalida() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(medico);
		consulta.setSecretaria(null);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.refresh(consulta);
	}

	@Test(expected = Exception.class)
	public void testarRefreshConsultaComEstadoInvalido() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(medico);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(null);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.refresh(consulta);
	}

	@Test(expected = Exception.class)
	public void testarRefreshConsultaComHorarioInvalido() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(null);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(null);
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiu");
		negocioConsulta.refresh(consulta);
	}

	@Test(expected = Exception.class)
	public void testarRefreshConsultaComObservacaoMaiorQueEsperado() throws Exception {
		consulta.setDuracao(1);
		consulta.setPaciente(paciente);
		consulta.setMedico(null);
		consulta.setSecretaria(secretaria);
		consulta.setEstado(EstadoConsulta.MARCADA);
		consulta.setHorario(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2018"));
		consulta.setObservacoes("ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdk"
				+ "ajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdka"
				+ "jrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajr"
				+ "hasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhas"
				+ "iurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhk"
				+ "djrhkjsdfhkjsfhkjsdfhsjkdfhfdkajrhasiurhkdjrhkjsdfhkjsfhkjsdfhsjkdfhfdkajdrhasiu");
		negocioConsulta.refresh(consulta);
	}
	
	// REMOVE

	@Test(expected = Exception.class)
	public void testarRemoverComIdInvalido() throws Exception {
		consulta.getId();
		negocioConsulta.remove(consulta);
	}
}
