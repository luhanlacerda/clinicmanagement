package negocios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import classesBasicas.Consulta;
import dados.DAOConsulta;
import dados.DAOFactory;
import util.ValidatorUtils;

public class NegocioConsulta implements INegocioConsulta {

	private static final String ERRO_NUMERO = "Número inválido.";
	private static final String ERRO_HORARIO = "Horário inválido";
	private static final String ERRO_DURACAO = "Duração inválida";
	private static final String ERRO_EXCEDER_OBSERVACAO = "A observação não deve exceder 500 caracteres.";
	private static final String ERRO_MEDICO = "Médico inválido";
	private static final String ERRO_PACIENTE = "Paciente inválido";
	private static final String ERRO_SECRETARIA = "Secretária inválida";

	private DAOConsulta consultaDAO = DAOFactory.getConsultaDAO();

	@Override
	public void insert(Consulta consulta) throws Exception {
		
			if (consulta.getDuracao() < 1) {
				throw new Exception(ERRO_DURACAO);
			}

			if (consulta.getObservacoes().length() > 500) {
				throw new Exception(ERRO_EXCEDER_OBSERVACAO);
			}

			if (consulta.getMedico().equals(null)) {
				throw new Exception(ERRO_MEDICO);
			}

			if (consulta.getPaciente().equals(null)) {
				throw new Exception(ERRO_PACIENTE);
			}
			
			if (consulta.getSecretaria().equals(null)) {
				throw new Exception(ERRO_SECRETARIA);
			}

			/*if (!ValidatorUtils.validate(consulta.getHorario())) {
				throw new Exception(ERRO_HORARIO);
			}*/
			
			consultaDAO.insert(consulta);
	}

	@Override
	public void update(Consulta consulta) throws Exception {
			if (consulta.getDuracao() < 1) {
				throw new Exception(ERRO_DURACAO);
			}

			if (consulta.getObservacoes().length() > 500) {
				throw new Exception(ERRO_EXCEDER_OBSERVACAO);
			}

			if (consulta.getMedico().equals(null)) {
				throw new Exception(ERRO_MEDICO);
			}

			if (consulta.getPaciente().equals(null)) {
				throw new Exception(ERRO_PACIENTE);
			}
			
			if (consulta.getSecretaria().equals(null)) {
				throw new Exception(ERRO_SECRETARIA);
			}
			
			/*if (!ValidatorUtils.validate(consulta.getHorario())) {
				throw new Exception(ERRO_HORARIO);
			}*/
			
			consultaDAO.insert(consulta);
	}

	@Override
	public void remove(Consulta consulta) throws Exception {
			if (consulta.getId() < 0) {
				throw new Exception(ERRO_NUMERO);
			}
			consultaDAO.remove(consulta);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> void insertCollection(ArrayList<T> colecao, Class<T> classType) {
		consultaDAO.insertCollection((Collection<Consulta>) colecao);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T searchByKey(Serializable chave, Class<T> classType) throws Exception {
			if (chave.equals(null)) {
				throw new Exception("Id inválido");
			}
		
		return (T) consultaDAO.searchByKey(chave);
	}

	@Override
	public void refresh(Consulta consulta) throws Exception {
			if (consulta.getDuracao() < 1) {
				throw new Exception(ERRO_DURACAO);
			}

			if (consulta.getObservacoes().length() > 500) {
				throw new Exception(ERRO_EXCEDER_OBSERVACAO);
			}

			if (consulta.getMedico().equals(null)) {
				throw new Exception(ERRO_MEDICO);
			}

			if (consulta.getPaciente().equals(null)) {
				throw new Exception(ERRO_PACIENTE);
			}
			
			if (consulta.getSecretaria().equals(null)) {
				throw new Exception(ERRO_SECRETARIA);
			}

			/*if (!ValidatorUtils.validate(consulta.getHorario())) {
				throw new Exception(ERRO_HORARIO);
			}*/
			
			consultaDAO.refresh(consulta);
	}

	@Override
	public List<Consulta> getAllByCRM(Consulta filtro) throws Exception {
		return consultaDAO.getAllByCRM(filtro);
	}

	@Override
	public List<Consulta> getAllByMedico(Consulta filtro) throws Exception {
		return consultaDAO.getAllByMedico(filtro);
	}

	@Override
	public List<Consulta> getAllBySecretria(Consulta filtro) throws Exception {
		return consultaDAO.getAllBySecretria(filtro);
	}

	@Override
	public List<Consulta> getAllByPaciente(Consulta filtro) throws Exception {
		return consultaDAO.getAllByPaciente(filtro);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getAll(Class<T> classType) throws Exception {
		return (List<T>) consultaDAO.getAll();
	}

}
