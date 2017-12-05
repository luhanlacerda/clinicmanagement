package negocios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.validator.routines.EmailValidator;

import classesBasicas.Consulta;
import classesBasicas.Especialidade;
import classesBasicas.Medico;
import dados.DAOFactory;
import dados.DAOMedico;
import util.ValidatorUtils;

public class NegocioMedico implements INegocioMedico {

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

	private DAOMedico medicoDAO = DAOFactory.getMedicoDAO();

	@Override
	public void insert(Medico medico) {
		try {
			if (medico.getNome().isEmpty()) {
				throw new Exception("Informar nome");
			}
			
			if (medico.getNome().length() > NOME_SIZE) {
				throw new Exception("Caracteres acima do permitido para o Nome");
			}
			
			/*if (!EmailValidator.getInstance().isValid(medico.getEmail())) {
				throw new Exception("E-Mail inválido");
			}*/
		
			if (medico.getCpf().trim().equals("   .   .   -  ")) {
				throw new Exception("Informar CPF");
			}
		
			if (medico.getCpf().length() > CPF_SIZE) {
				throw new Exception("Caracteres acima do permitido para o CPF");
			}
		
			if (medico.getCrm().isEmpty()) {
				throw new Exception("Informar CRM");
			}
		
			if (medico.getRg().isEmpty()) {
				throw new Exception("Informar RG");
			}
		
			if (medico.getCpf().length() > RG_SIZE) {
				throw new Exception("Caracteres acima do permitido para o RG");
			}

			/*if (!ValidatorUtils.validate(medico.getDtNascimento())) {
				throw new Exception("Data de Nascimento inválida");
			}*/

			if (medico.getEndereco().getLogradouro().isEmpty()) {
				throw new Exception("Informar Logradouro");
			}
		
			if (medico.getEndereco().getLogradouro().length() > LOGRADOURO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o Logradouro");
			}
		
			if (medico.getEndereco().getNumero().isEmpty()) {
				throw new Exception("Informar numero da residência");
			}
		
			if (medico.getEndereco().getNumero().length() > NUMERO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o numero da residência");
			}

			if (medico.getEndereco().getComplemento().isEmpty()) {
				throw new Exception("Informar Complemento");
			}
		
			if (medico.getEndereco().getComplemento().length() > COMPLEMENTO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o complemento");
			}
		
			if (medico.getEndereco().getBairro().isEmpty()) {
				throw new Exception("Informar bairro");
			}
	
			if (medico.getEndereco().getBairro().length() > BAIRRO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o bairro");
			}
		
			if (medico.getEndereco().getCep().trim().equals("  .   -   ")) {
				throw new Exception("Informar CEP");
			}
	
			if (medico.getEndereco().getCep().length() > CEP_SIZE) {
				throw new Exception("Caracteres acima do permitido para o CEP");
			}
	
			if (medico.getEndereco().getCidade().isEmpty()) {
				throw new Exception("Informar cidade");
			}
	
			if (medico.getEndereco().getCidade().length() > CIDADE_SIZE) {
				throw new Exception("Caracteres acima do permitido para a cidade");
			}
	
			if (medico.getEndereco().getUf().isEmpty()) {
				throw new Exception("Informar UF");
			}
		
			if (medico.getEndereco().getUf().length() > UF_SIZE) {
				throw new Exception("Caracteres acima do permitido para a UF");
			}
	
			if (medico.getEndereco().getPais().isEmpty()) {
				throw new Exception("Informar país");
			}
		
			if (medico.getEndereco().getPais().length() > PAIS_SIZE) {
				throw new Exception("Caracteres acima do permitido para o país");
			}
	
			if (medico.getContato().isEmpty()) {
				throw new Exception("Informar contato");
			}
	
			if (medico.getContato().length() > CONTATO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o contato");
			}
		
			if (medico.getEstadoCivil().equals(null)) {
				throw new Exception("Informar estado civil");
			}
		
			medicoDAO.insert(medico);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void update(Medico medico) {
		try {
			if (medico.getNome().isEmpty()) {
				throw new Exception("Informar nome");
			}
			
			if (medico.getNome().length() > NOME_SIZE) {
				throw new Exception("Caracteres acima do permitido para o Nome");
			}
			
			/*if (!EmailValidator.getInstance().isValid(medico.getEmail())) {
				throw new Exception("E-Mail inválido");
			}*/
			
			if (medico.getCpf().trim().equals("   .   .   -  ")) {
				throw new Exception("Informar CPF");
			}
			
			if (medico.getCpf().length() > CPF_SIZE) {
				throw new Exception("Caracteres acima do permitido para o CPF");
			}
			
			if (medico.getCrm().isEmpty()) {
				throw new Exception("Informar CRM");
			}
			
			if (medico.getRg().isEmpty()) {
				throw new Exception("Informar RG");
			}
			
			if (medico.getCpf().length() > RG_SIZE) {
				throw new Exception("Caracteres acima do permitido para o RG");
			}
			
			/*if (!ValidatorUtils.validate(medico.getDtNascimento())) {
				throw new Exception("Data de Nascimento inválida");
			}*/
			
			if (medico.getEndereco().getLogradouro().isEmpty()) {
				throw new Exception("Informar Logradouro");
			}
			
			if (medico.getEndereco().getLogradouro().length() > LOGRADOURO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o Logradouro");
			}
			
			if (medico.getEndereco().getNumero().isEmpty()) {
				throw new Exception("Informar numero da residência");
			}
			
			if (medico.getEndereco().getNumero().length() > NUMERO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o numero da residência");
			}
			
			if (medico.getEndereco().getComplemento().isEmpty()) {
				throw new Exception("Informar Complemento");
			}
			
			if (medico.getEndereco().getComplemento().length() > COMPLEMENTO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o complemento");
			}
			
			if (medico.getEndereco().getBairro().isEmpty()) {
				throw new Exception("Informar bairro");
			}
			
			if (medico.getEndereco().getBairro().length() > BAIRRO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o bairro");
			}
			
			if (medico.getEndereco().getCep().trim().equals("  .   -   ")) {
				throw new Exception("Informar CEP");
			}
			
			if (medico.getEndereco().getCep().length() > CEP_SIZE) {
				throw new Exception("Caracteres acima do permitido para o CEP");
			}
			
			if (medico.getEndereco().getCidade().isEmpty()) {
				throw new Exception("Informar cidade");
			}
			
			if (medico.getEndereco().getCidade().length() > CIDADE_SIZE) {
				throw new Exception("Caracteres acima do permitido para a cidade");
			}
			
			if (medico.getEndereco().getUf().isEmpty()) {
				throw new Exception("Informar UF");
			}
			
			if (medico.getEndereco().getUf().length() > UF_SIZE) {
				throw new Exception("Caracteres acima do permitido para a UF");
			}
			
			if (medico.getEndereco().getPais().isEmpty()) {
				throw new Exception("Informar país");
			}
			
			if (medico.getEndereco().getPais().length() > PAIS_SIZE) {
				throw new Exception("Caracteres acima do permitido para o país");
			}
			
			if (medico.getContato().isEmpty()) {
				throw new Exception("Informar contato");
			}
			
			if (medico.getContato().length() > CONTATO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o contato");
			}
			
			if (medico.getEstadoCivil().equals(null)) {
				throw new Exception("Informar estado civil");
			}
			
			medicoDAO.update(medico);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void remove(Medico medico) {
		try {
			if (medico.getId() < 0) {
				throw new Exception("Id inválido");
			}
			
			medicoDAO.remove(medico);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> void insertCollection(ArrayList<T> colecao, Class<T> classType) {
		medicoDAO.insertCollection((Collection<Medico>) colecao);
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
		
		return (T) medicoDAO.searchByKey(chave);
	}

	@Override
	public void refresh(Medico medico) {
		try {
			if (medico.getNome().isEmpty()) {
				throw new Exception("Informar nome");
			}
			
			if (medico.getNome().length() > NOME_SIZE) {
				throw new Exception("Caracteres acima do permitido para o Nome");
			}
			
			/*if (!EmailValidator.getInstance().isValid(medico.getEmail())) {
				throw new Exception("E-Mail inválido");
			}*/
			
			if (medico.getCpf().trim().equals("   .   .   -  ")) {
				throw new Exception("Informar CPF");
			}
		
			if (medico.getCpf().length() > CPF_SIZE) {
				throw new Exception("Caracteres acima do permitido para o CPF");
			}
		
			if (medico.getCrm().isEmpty()) {
				throw new Exception("Informar CRM");
			}
		
			if (medico.getRg().isEmpty()) {
				throw new Exception("Informar RG");
			}
			
			if (medico.getCpf().length() > RG_SIZE) {
				throw new Exception("Caracteres acima do permitido para o RG");
			}
			
			/*if (!ValidatorUtils.validate(medico.getDtNascimento())) {
				throw new Exception("Data de Nascimento inválida");
			}*/
			
			if (medico.getEndereco().getLogradouro().isEmpty()) {
				throw new Exception("Informar Logradouro");
			}
	
			if (medico.getEndereco().getLogradouro().length() > LOGRADOURO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o Logradouro");
			}
	
			if (medico.getEndereco().getNumero().isEmpty()) {
				throw new Exception("Informar numero da residência");
			}

			if (medico.getEndereco().getNumero().length() > NUMERO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o numero da residência");
			}
	
			if (medico.getEndereco().getComplemento().isEmpty()) {
				throw new Exception("Informar Complemento");
			}
	
			if (medico.getEndereco().getComplemento().length() > COMPLEMENTO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o complemento");
			}
	
			if (medico.getEndereco().getBairro().isEmpty()) {
				throw new Exception("Informar bairro");
			}
	
			if (medico.getEndereco().getBairro().length() > BAIRRO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o bairro");
			}
		
			if (medico.getEndereco().getCep().trim().equals("  .   -   ")) {
				throw new Exception("Informar CEP");
			}
	
			if (medico.getEndereco().getCep().length() > CEP_SIZE) {
				throw new Exception("Caracteres acima do permitido para o CEP");
			}
		
			if (medico.getEndereco().getCidade().isEmpty()) {
				throw new Exception("Informar cidade");
			}
		
			if (medico.getEndereco().getCidade().length() > CIDADE_SIZE) {
				throw new Exception("Caracteres acima do permitido para a cidade");
			}
		
			if (medico.getEndereco().getUf().isEmpty()) {
				throw new Exception("Informar UF");
			}
		
			if (medico.getEndereco().getUf().length() > UF_SIZE) {
				throw new Exception("Caracteres acima do permitido para a UF");
			}
		
			if (medico.getEndereco().getPais().isEmpty()) {
				throw new Exception("Informar país");
			}
		
			if (medico.getEndereco().getPais().length() > PAIS_SIZE) {
				throw new Exception("Caracteres acima do permitido para o país");
			}
		
			if (medico.getContato().isEmpty()) {
				throw new Exception("Informar contato");
			}
		
			if (medico.getContato().length() > CONTATO_SIZE) {
				throw new Exception("Caracteres acima do permitido para o contato");
			}
		
			if (medico.getEstadoCivil().equals(null)) {
				throw new Exception("Informar estado civil");
			}
		
			medicoDAO.refresh(medico);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public List<Medico> getAllByName(Medico filtro) {
		return medicoDAO.getAllByName(filtro);
	}

	@Override
	public List<Medico> getAllByEspecialidade(Especialidade filtro) {
		return medicoDAO.getAllByEspecialidade(filtro);
	}

	@Override
	public Medico searchByCrm(Medico filtro) {
		return medicoDAO.searchByCrm(filtro);
	}

	@Override
	public Medico searchByConsulta(Consulta filtro) {
		return medicoDAO.searchByConsulta(filtro);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getAll(Class<T> classType) {
		return (List<T>) medicoDAO.getAll();
	}

}
