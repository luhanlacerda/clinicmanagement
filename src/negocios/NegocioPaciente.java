package negocios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.validator.routines.EmailValidator;

import classesBasicas.Paciente;
import dados.DAOFactory;
import dados.DAOPaciente;
import util.ValidatorUtils;

public class NegocioPaciente extends RuntimeException implements INegocioPaciente {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4151956612433316973L;
	// Tamanhos Pr�-Definidos
	private static final int CPF_SIZE = 14;
	private static final int NOME_SIZE = 100;
	private static final int RG_SIZE = 20;
	private static final int LOGRADOURO_SIZE = 50;
	private static final int NUMERO_SIZE = 10;
	private static final int COMPLEMENTO_SIZE = 10;
	private static final int BAIRRO_SIZE = 20;
	private static final int CIDADE_SIZE = 50;
	private static final int UF_SIZE = 2;
	private static final int CEP_SIZE = 9;
	private static final int PAIS_SIZE = 30;
	private static final int CONTATO_SIZE = 16;
	// private static final int ESTADO_CIVIL = 12;

	private DAOPaciente pacienteDAO = DAOFactory.getPacienteDAO();

	@Override
	public void insert(Paciente paciente) throws Exception {

		if (paciente.getNome().isEmpty()) {
			throw new Exception("Informar nome");
		}

		if (paciente.getNome().length() > NOME_SIZE) {
			throw new Exception("sdsddsds acima do permitido para o Nome");
		}

		/*
		 * if (!EmailValidator.getInstance().isValid(paciente.getEmail())) { throw new
		 * Exception("E-Mail inv�lido"); }
		 */

		if (paciente.getCpf().trim().equals("   .   .   -  ") || (paciente.getCpf().isEmpty())) {
			throw new Exception("Informar CPF");
		}

		if (paciente.getCpf().length() > CPF_SIZE) {
			throw new Exception("Caracteres acima do permitido para o CPF");
		}

		if (paciente.getRg().isEmpty()) {
			throw new Exception("Informar RG");
		}

		if (paciente.getRg().length() > RG_SIZE) {
			throw new Exception("Caracteres acima do permitido para o RG");
		}

		/*
		 * if (!ValidatorUtils.validate(paciente.getDtNascimento())) { throw new
		 * Exception("Data de Nascimento inv�lida"); }
		 */

		if (paciente.getEndereco().getLogradouro().isEmpty()) {
			throw new Exception("Informar Logradouro");
		}

		if (paciente.getEndereco().getLogradouro().length() > LOGRADOURO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o Logradouro");
		}

		if (paciente.getEndereco().getNumero().isEmpty()) {
			throw new Exception("Informar numero da resid�ncia");
		}

		if (paciente.getEndereco().getNumero().length() > NUMERO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o numero da resid�ncia");
		}

		if (paciente.getEndereco().getComplemento().isEmpty()) {
			throw new Exception("Informar Complemento");
		}

		if (paciente.getEndereco().getComplemento().length() > COMPLEMENTO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o complemento");
		}

		if (paciente.getEndereco().getBairro().isEmpty()) {
			throw new Exception("Informar bairro");
		}

		if (paciente.getEndereco().getBairro().length() > BAIRRO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o bairro");
		}

		if (paciente.getEndereco().getCep().trim().equals("  .   -   ") || (paciente.getEndereco().getCep().isEmpty())) {
			throw new Exception("Informar CEP");
		}

		if (paciente.getEndereco().getCep().length() > CEP_SIZE) {
			throw new Exception("Caracteres acima do permitido para o CEP");
		}

		if (paciente.getEndereco().getCidade().isEmpty()) {
			throw new Exception("Informar cidade");
		}

		if (paciente.getEndereco().getCidade().length() > CIDADE_SIZE) {
			throw new Exception("Caracteres acima do permitido para a cidade");
		}

		if (paciente.getEndereco().getUf().isEmpty()) {
			throw new Exception("Informar UF");
		}

		if (paciente.getEndereco().getUf().length() > UF_SIZE) {
			throw new Exception("Caracteres acima do permitido para a UF");
		}

		if (paciente.getEndereco().getPais().isEmpty()) {
			throw new Exception("Informar pa�s");
		}

		if (paciente.getEndereco().getPais().length() > PAIS_SIZE) {
			throw new Exception("Caracteres acima do permitido para o pa�s");
		}

		if (paciente.getContato().isEmpty()) {
			throw new Exception("Informar contato");
		}

		if (paciente.getContato().length() > CONTATO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o contato");
		}

		if (paciente.getEstadoCivil().equals(null)) {
			throw new Exception("Informar estado civil");
		}

		pacienteDAO.insert(paciente);

	}

	@Override
	public void update(Paciente paciente) throws Exception {
		if (paciente.getNome().isEmpty()) {
			throw new Exception("Informar nome");
		}

		if (paciente.getNome().length() > NOME_SIZE) {
			throw new Exception("Caracteres acima do permitido para o Nome");
		}

		/*
		 * if (!EmailValidator.getInstance().isValid(paciente.getEmail())) { throw new
		 * Exception("E-Mail inv�lido"); }
		 */

		if (paciente.getCpf().trim().equals("   .   .   -  ") || paciente.getCpf().isEmpty()) {
			throw new Exception("Informar  CPF");
		}

		if (paciente.getCpf().length() > CPF_SIZE) {
			throw new Exception("Caracteres acima do permitido para o CPF");
		}

		if (paciente.getRg().isEmpty()) {
			throw new Exception("Informar RG");
		}

		if (paciente.getRg().length() > RG_SIZE) {
			throw new Exception("Caracteres acima do permitido para o RG");
		}

		/*
		 * if (!ValidatorUtils.validate(paciente.getDtNascimento())) { throw new
		 * Exception("Data de Nascimento inv�lida"); }
		 */

		if (paciente.getEndereco().getLogradouro().isEmpty()) {
			throw new Exception("Informar Logradouro");
		}

		if (paciente.getEndereco().getLogradouro().length() > LOGRADOURO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o Logradouro");
		}

		if (paciente.getEndereco().getNumero().isEmpty()) {
			throw new Exception("Informar o numero da resid�ncia");
		}

		if (paciente.getEndereco().getNumero().length() > NUMERO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o numero da residecia");
		}

		if (paciente.getEndereco().getComplemento().isEmpty()) {
			throw new Exception("Informar Complemento");
		}

		if (paciente.getEndereco().getComplemento().length() > COMPLEMENTO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o Complemento");
		}

		if (paciente.getEndereco().getBairro().isEmpty()) {
			throw new Exception("Informar Bairro");
		}

		if (paciente.getEndereco().getBairro().length() > BAIRRO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o Bairro");
		}

		if (paciente.getEndereco().getCep().trim().equals("  .   -   ") || (paciente.getEndereco().getCep().isEmpty())) {
			throw new Exception("Informar CEP");
		}

		if (paciente.getEndereco().getCep().length() > CEP_SIZE) {
			throw new Exception("Caracteres acima do permitido para o CEP");
		}

		if (paciente.getEndereco().getCidade().isEmpty()) {
			throw new Exception("Informar Cidade");
		}

		if (paciente.getEndereco().getCidade().length() > CIDADE_SIZE) {
			throw new Exception("Caracteres acima do permitido para a Cidade");
		}

		if (paciente.getEndereco().getUf().isEmpty()) {
			throw new Exception("Informar UF");
		}

		if (paciente.getEndereco().getUf().length() > UF_SIZE) {
			throw new Exception("Caracteres acima do permitido para a UF");
		}

		if (paciente.getEndereco().getPais().isEmpty()) {
			throw new Exception("Informar pa�s");
		}

		if (paciente.getEndereco().getPais().length() > PAIS_SIZE) {
			throw new Exception("Caracteres acima do permitido para o pa�s");
		}

		if (paciente.getContato().isEmpty()) {
			throw new Exception("Informar contato");
		}

		if (paciente.getContato().length() > CONTATO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o contato");
		}

		if (paciente.getEstadoCivil().equals(null)) {
			throw new Exception("Informar estado civil");
		}

		pacienteDAO.update(paciente);
	}

	@Override
	public void remove(Paciente paciente) throws Exception {
		if (paciente.getId() < 0) {
			throw new Exception("Id inv�lido");
		}
		pacienteDAO.remove(paciente);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> void insertCollection(ArrayList<T> colecao, Class<T> classType) {
		pacienteDAO.insertCollection((Collection<Paciente>) colecao);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T searchByKey(Serializable chave, Class<T> classType) {
		try {
			if (chave.equals(null)) {
				throw new Exception("Id inv�lido");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return (T) pacienteDAO.searchByKey(chave);
	}

	@Override
	public void refresh(Paciente paciente) throws Exception {
		if (paciente.getNome().isEmpty()) {
			throw new Exception("Informar nome");
		}

		if (paciente.getNome().length() > NOME_SIZE) {
			throw new Exception("Caracteres acima do permitido para o Nome");
		}

		if (!EmailValidator.getInstance().isValid(paciente.getEmail())) {
			throw new Exception("E-Mail inv�lido");
		}

		if (paciente.getCpf().trim().equals("   .   .   -  ")) {
			throw new Exception("Informar  CPF");
		}

		if (paciente.getCpf().length() > CPF_SIZE) {
			throw new Exception("Caracteres acima do permitido para o CPF");
		}

		if (paciente.getRg().isEmpty()) {
			throw new Exception("Informar RG");
		}

		if (paciente.getRg().length() > RG_SIZE) {
			throw new Exception("Caracteres acima do permitido para o RG");
		}

		if (!ValidatorUtils.validate(paciente.getDtNascimento())) {
			throw new Exception("Data de Nascimento inv�lida");
		}

		if (paciente.getEndereco().getLogradouro().isEmpty()) {
			throw new Exception("Informar Logradouro");
		}

		if (paciente.getEndereco().getLogradouro().length() > LOGRADOURO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o Logradouro");
		}

		if (paciente.getEndereco().getNumero().isEmpty()) {
			throw new Exception("Informar o numero da resid�ncia");
		}

		if (paciente.getEndereco().getNumero().length() > NUMERO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o numero da residecia");
		}

		if (paciente.getEndereco().getComplemento().isEmpty()) {
			throw new Exception("Informar Complemento");
		}

		if (paciente.getEndereco().getComplemento().length() > COMPLEMENTO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o Complemento");
		}

		if (paciente.getEndereco().getBairro().isEmpty()) {
			throw new Exception("Informar Bairro");
		}

		if (paciente.getEndereco().getBairro().length() > BAIRRO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o Bairro");
		}

		if (paciente.getEndereco().getCep().trim().equals("  .   -   ")) {
			throw new Exception("Informar CEP");
		}

		if (paciente.getEndereco().getCep().length() > CEP_SIZE) {
			throw new Exception("Caracteres acima do permitido para o CEP");
		}

		if (paciente.getEndereco().getCidade().isEmpty()) {
			throw new Exception("Informar Cidade");
		}

		if (paciente.getEndereco().getCidade().length() > CIDADE_SIZE) {
			throw new Exception("Caracteres acima do permitido para a Cidade");
		}

		if (paciente.getEndereco().getUf().isEmpty()) {
			throw new Exception("Informar UF");
		}

		if (paciente.getEndereco().getUf().length() > UF_SIZE) {
			throw new Exception("Caracteres acima do permitido para a UF");
		}

		if (paciente.getEndereco().getPais().isEmpty()) {
			throw new Exception("Informar pa�s");
		}

		if (paciente.getEndereco().getPais().length() > PAIS_SIZE) {
			throw new Exception("Caracteres acima do permitido para o pa�s");
		}

		if (paciente.getContato().isEmpty()) {
			throw new Exception("Informar contato");
		}

		if (paciente.getContato().length() > CONTATO_SIZE) {
			throw new Exception("Caracteres acima do permitido para o contato");
		}

		if (paciente.getEstadoCivil().equals(null)) {
			throw new Exception("Informar estado civil");
		}

		pacienteDAO.refresh(paciente);
	}

	@Override
	public List<Paciente> getAllByName(Paciente filtro) {
		return pacienteDAO.getAllByName(filtro);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getAll(Class<T> classType) {
		return (List<T>) pacienteDAO.getAll();
	}

}
