package negocios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.validator.routines.EmailValidator;

import classesBasicas.Secretaria;
import dados.DAOFactory;
import dados.DAOSecretaria;
import util.ValidatorUtils;

public class NegocioSecretaria implements INegocioSecretaria {

	// Tamanhos Pré-Definidos
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
	// private static final int ESTADO_CIVIL_SIZE = 11;

	private DAOSecretaria secretariaDAO = DAOFactory.getSecretariaDAO();

	@Override
	public void insert(Secretaria secretaria) {
		try {
			if (secretaria.getNome().isEmpty()) {
				throw new Exception("Informar nome");
			}
			
			if (secretaria.getNome().length() > NOME_SIZE) {
				throw new Exception("Caracteres acima do permitido para o Nome");
			}
			
			/*if (!EmailValidator.getInstance().isValid(secretaria.getEmail())) {
				throw new Exception("E-Mail inválido");
			}*/
			
			if (secretaria.getCpf().trim().equals("   .   .   -  ")) {
				throw new Exception("Informar CPF");
			}
			
			if (secretaria.getCpf().length() > CPF_SIZE) {
				throw new Exception("Caracteres acima do permitido para o CPF");
			}
			
			if (secretaria.getRg().isEmpty()) {
				throw new Exception("Informar RG");
			}
			
			if (secretaria.getCpf().length() > RG_SIZE) {
				throw new Exception("Caracteres acima do permitido para o RG");
			}
			
			/*if (!ValidatorUtils.validate(secretaria.getDtNascimento())) {
				throw new Exception("Data de Nascimento inválida");
			}*/
			
			if (secretaria.getEndereco().getLogradouro().isEmpty()) {
				throw new Exception("Informar Logradouro");
			}
			
			if (secretaria.getEndereco().getLogradouro().length() > LOGRADOURO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o Logradouro");
			}
			
			if (secretaria.getEndereco().getNumero().isEmpty()) {
				throw new Exception("Informar numero da residência");
			}
			
			if (secretaria.getEndereco().getNumero().length() > NUMERO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o numero da residência");
			}
			
			if (secretaria.getEndereco().getComplemento().isEmpty()) {
				throw new Exception("Informar Complemento");
			}
			
			if (secretaria.getEndereco().getComplemento().length() > COMPLEMENTO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o complemento");
			}
			
			if (secretaria.getEndereco().getBairro().isEmpty()) {
				throw new Exception("Informar bairro");
			}
			
			if (secretaria.getEndereco().getBairro().length() > BAIRRO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o bairro");
			}
			
			if (secretaria.getEndereco().getCep().trim().equals("  .   -   ")) {
				throw new Exception("Informar CEP");
			}
			
			if (secretaria.getEndereco().getCep().length() > CEP_SIZE) {
				throw new Exception("Caracteres acima do permitido para o CEP");
			}
			
			if (secretaria.getEndereco().getCidade().isEmpty()) {
				throw new Exception("Informar cidade");
			}
			
			if (secretaria.getEndereco().getCidade().length() > CIDADE_SIZE) {
				throw new Exception("Caracteres acima do permitido para a cidade");
			}
			
			if (secretaria.getEndereco().getUf().isEmpty()) {
				throw new Exception("Informar UF");
			}
			
			if (secretaria.getEndereco().getUf().length() > UF_SIZE) {
				throw new Exception("Caracteres acima do permitido para a UF");
			}
			
			if (secretaria.getEndereco().getPais().isEmpty()) {
				throw new Exception("Informar país");
			}
			
			if (secretaria.getEndereco().getPais().length() > PAIS_SIZE) {
				throw new Exception("Caracteres acima do permitido para o país");
			}
			
			if (secretaria.getContato().isEmpty()) {
				throw new Exception("Informar contato");
			}
			
			if (secretaria.getContato().length() > CONTATO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o contato");
			}
			
			if (secretaria.getEstadoCivil().equals(null)) {
				throw new Exception("Informar estado civil");
			}
			
			secretariaDAO.insert(secretaria);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void update(Secretaria secretaria) {
		try {
			if (secretaria.getNome().isEmpty()) {
				throw new Exception("Informar nome");
			}
			
			if (secretaria.getNome().length() > NOME_SIZE) {
				throw new Exception("Caracteres acima do permitido para o Nome");
			}
			
			/*if (!EmailValidator.getInstance().isValid(secretaria.getEmail())) {
				throw new Exception("E-Mail inválido");
			}*/
			
			if (secretaria.getCpf().trim().equals("   .   .   -  ")) {
				throw new Exception("Informar CPF");
			}
			
			if (secretaria.getCpf().length() > CPF_SIZE) {
				throw new Exception("Caracteres acima do permitido para o CPF");
			}
			
			if (secretaria.getRg().isEmpty()) {
				throw new Exception("Informar RG");
			}
			
			if (secretaria.getCpf().length() > RG_SIZE) {
				throw new Exception("Caracteres acima do permitido para o RG");
			}
			
			/*if (!ValidatorUtils.validate(secretaria.getDtNascimento())) {
				throw new Exception("Data de Nascimento inválida");
			}*/
			
			if (secretaria.getEndereco().getLogradouro().isEmpty()) {
				throw new Exception("Informar Logradouro");
			}
			
			if (secretaria.getEndereco().getLogradouro().length() > LOGRADOURO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o Logradouro");
			}
			
			if (secretaria.getEndereco().getNumero().isEmpty()) {
				throw new Exception("Informar numero da residência");
			}
			
			if (secretaria.getEndereco().getNumero().length() > NUMERO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o numero da residência");
			}
			
			if (secretaria.getEndereco().getComplemento().isEmpty()) {
				throw new Exception("Informar Complemento");
			}
			
			if (secretaria.getEndereco().getComplemento().length() > COMPLEMENTO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o complemento");
			}
			
			if (secretaria.getEndereco().getBairro().isEmpty()) {
				throw new Exception("Informar bairro");
			}
			
			if (secretaria.getEndereco().getBairro().length() > BAIRRO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o bairro");
			}
			
			if (secretaria.getEndereco().getCep().trim().equals("  .   -   ")) {
				throw new Exception("Informar CEP");
			}
		
			if (secretaria.getEndereco().getCep().length() > CEP_SIZE) {
				throw new Exception("Caracteres acima do permitido para o CEP");
			}
		
			if (secretaria.getEndereco().getCidade().isEmpty()) {
				throw new Exception("Informar cidade");
			}
		
			if (secretaria.getEndereco().getCidade().length() > CIDADE_SIZE) {
				throw new Exception("Caracteres acima do permitido para a cidade");
			}
		
			if (secretaria.getEndereco().getUf().isEmpty()) {
				throw new Exception("Informar UF");
			}
		
			if (secretaria.getEndereco().getUf().length() > UF_SIZE) {
				throw new Exception("Caracteres acima do permitido para a UF");
			}
		
			if (secretaria.getEndereco().getPais().isEmpty()) {
				throw new Exception("Informar país");
			}
		
			if (secretaria.getEndereco().getPais().length() > PAIS_SIZE) {
				throw new Exception("Caracteres acima do permitido para o país");
			}
		
			if (secretaria.getContato().isEmpty()) {
				throw new Exception("Informar contato");
			}
		
			if (secretaria.getContato().length() > CONTATO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o contato");
			}
		
			if (secretaria.getEstadoCivil().equals(null)) {
				throw new Exception("Informar estado civil");
			}
		
			secretariaDAO.update(secretaria);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void remove(Secretaria secretaria) {
		try {
			if (secretaria.getId() < 0) {
				throw new Exception("Id inválido");
			}
			
			secretariaDAO.remove(secretaria);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> void insertCollection(ArrayList<T> colecao, Class<T> classType) {
		secretariaDAO.insertCollection((Collection<Secretaria>) colecao);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T searchByKey(Serializable chave, Class<T> classType) {
		try {
			if (chave.equals(null)) {
				throw new Exception("Id inválido");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return (T) secretariaDAO.searchByKey(chave);
	}

	@Override
	public void refresh(Secretaria secretaria) {
		try {
			if (secretaria.getNome().isEmpty()) {
				throw new Exception("Informar nome");
			}
		
			if (secretaria.getNome().length() > NOME_SIZE) {
				throw new Exception("Caracteres acima do permitido para o Nome");
			}
		
			if (!EmailValidator.getInstance().isValid(secretaria.getEmail())) {
				throw new Exception("E-Mail inválido");
			}
		
			if (secretaria.getCpf().trim().equals("   .   .   -  ")) {
				throw new Exception("Informar CPF");
			}
		
			if (secretaria.getCpf().length() > CPF_SIZE) {
				throw new Exception("Caracteres acima do permitido para o CPF");
			}
		
			if (secretaria.getRg().isEmpty()) {
				throw new Exception("Informar RG");
			}
		
			if (secretaria.getCpf().length() > RG_SIZE) {
				throw new Exception("Caracteres acima do permitido para o RG");
			}
			
			if (!ValidatorUtils.validate(secretaria.getDtNascimento())) {
				throw new Exception("Data de Nascimento inválida");
			}
		
			if (secretaria.getEndereco().getLogradouro().isEmpty()) {
				throw new Exception("Informar Logradouro");
			}
		
			if (secretaria.getEndereco().getLogradouro().length() > LOGRADOURO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o Logradouro");
			}
		
			if (secretaria.getEndereco().getNumero().isEmpty()) {
				throw new Exception("Informar numero da residência");
			}
		
			if (secretaria.getEndereco().getNumero().length() > NUMERO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o numero da residência");
			}
		
			if (secretaria.getEndereco().getComplemento().isEmpty()) {
				throw new Exception("Informar Complemento");
			}
		
			if (secretaria.getEndereco().getComplemento().length() > COMPLEMENTO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o complemento");
			}
			
			if (secretaria.getEndereco().getBairro().isEmpty()) {
				throw new Exception("Informar bairro");
			}
			
			if (secretaria.getEndereco().getBairro().length() > BAIRRO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o bairro");
			}
		
			if (secretaria.getEndereco().getCep().trim().equals("  .   -   ")) {
				throw new Exception("Informar CEP");
			}
		
			if (secretaria.getEndereco().getCep().length() > CEP_SIZE) {
				throw new Exception("Caracteres acima do permitido para o CEP");
			}
			
			if (secretaria.getEndereco().getCidade().isEmpty()) {
				throw new Exception("Informar cidade");
			}
			
			if (secretaria.getEndereco().getCidade().length() > CIDADE_SIZE) {
				throw new Exception("Caracteres acima do permitido para a cidade");
			}
			
			if (secretaria.getEndereco().getUf().isEmpty()) {
				throw new Exception("Informar UF");
			}
			
			if (secretaria.getEndereco().getUf().length() > UF_SIZE) {
				throw new Exception("Caracteres acima do permitido para a UF");
			}
		
			if (secretaria.getEndereco().getPais().isEmpty()) {
				throw new Exception("Informar país");
			}
		
			if (secretaria.getEndereco().getPais().length() > PAIS_SIZE) {
				throw new Exception("Caracteres acima do permitido para o país");
			}
		
			if (secretaria.getContato().isEmpty()) {
				throw new Exception("Informar contato");
			}
		
			if (secretaria.getContato().length() > CONTATO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o contato");
			}
		
			if (secretaria.getEstadoCivil().equals(null)) {
				throw new Exception("Informar estado civil");
			}
			
			secretariaDAO.refresh(secretaria);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public List<Secretaria> getAllByName(Secretaria filtro) {
		return secretariaDAO.getAllByName(filtro);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getAll(Class<T> classType) {
		return (List<T>) secretariaDAO.getAll();
	}
	
}
