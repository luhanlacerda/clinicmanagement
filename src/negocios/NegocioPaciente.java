package negocios;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.apache.commons.validator.routines.EmailValidator;

import classesBasicas.Paciente;
import dados.DAOFactory;
import dados.DAOPaciente;
import util.ValidatorUtils;

public class NegocioPaciente implements INegocioPaciente {

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
	public void insert(Paciente paciente) {
		
		try {
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
				throw new Exception("Informar CPF");
			}
			
			if (paciente.getCpf().length() > CPF_SIZE) {
				throw new Exception("Caracteres acima do permitido para o CPF");
			}
			
			if (paciente.getRg().isEmpty()) {
				throw new Exception("Informar RG");
			}
			
			if (paciente.getCpf().length() > RG_SIZE) {
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
			
			if (paciente.getEndereco().getCep().trim().equals("  .   -   ")) {
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
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void update(Paciente paciente) {
		try {
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
			
			pacienteDAO.update(paciente);
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
	}
	
	@Override
	public void remove(Paciente paciente) {
		try {
			if (paciente.getId() < 0) {
				throw new Exception("Id inv�lido");
			}
			
			pacienteDAO.remove(paciente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Override
	public void insertCollection(Collection<Paciente> colecao) {
		pacienteDAO.insertCollection(colecao);
	}
	
	@Override
	public Paciente searchByKey(Serializable chave) {
		try {
			if (chave.equals(null)) {
				throw new Exception("Id inv�lido");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return pacienteDAO.searchByKey(chave);
	}
	
	@Override
	public void refresh(Paciente paciente) {
		try {
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
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
	}
	
	@Override
	public List<Paciente> getAllByName(Paciente filtro) {
		return pacienteDAO.getAllByName(filtro);
	}

}
