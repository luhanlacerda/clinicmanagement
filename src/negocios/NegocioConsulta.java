package negocios;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.apache.commons.validator.routines.CalendarValidator;

import classesBasicas.Consulta;
import dados.DAOConsulta;
import dados.DAOFactory;

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
	public void insert(Consulta consulta) {
		try {
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
			// CORRIGIR
			/*
			 * if (CalendarValidator.getInstance().isValid(consulta.getEstado().toString()))
			 * { throw new Exception(ERRO_HORARIO); }
			 */
			consultaDAO.insert(consulta);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void update(Consulta consulta) {
		try {
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
			// CORRIGIR
			/*
			 * if (CalendarValidator.getInstance().isValid(consulta.getEstado().toString()))
			 * { throw new Exception(ERRO_HORARIO); }
			 */
			consultaDAO.insert(consulta);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void remove(Consulta consulta) {
		try {
			if (consulta.getId() < 0) {
				throw new Exception(ERRO_NUMERO);
			}
			consultaDAO.remove(consulta);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void insertCollection(Collection<Consulta> colecao) {
		consultaDAO.insertCollection(colecao);
	}

	@Override
	public Consulta searchByKey(Serializable chave) {
		try {
			if (chave.equals(null)) {
				throw new Exception("Id inválido");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return consultaDAO.searchByKey(chave);
	}

	@Override
	public void refresh(Consulta consulta) {
		try {
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
			// CORRIGIR
			/*
			 * if (CalendarValidator.getInstance().isValid(consulta.getEstado().toString()))
			 * { throw new Exception(ERRO_HORARIO); }
			 */
			consultaDAO.refresh(consulta);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public List<Consulta> getAllByCRM(Consulta filtro) {
		return consultaDAO.getAllByCRM(filtro);
	}

	@Override
	public List<Consulta> getAllByMedico(Consulta filtro) {
		return consultaDAO.getAllByMedico(filtro);
	}

	@Override
	public List<Consulta> getAllBySecretria(Consulta filtro) {
		return consultaDAO.getAllBySecretria(filtro);
	}

	@Override
	public List<Consulta> getAllByPaciente(Consulta filtro) {
		return consultaDAO.getAllByPaciente(filtro);
	}

}
