package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import classesBasicas.Pessoa;

public abstract class DAOPessoa<Entity> extends DAOGenerico<Entity> {

	public DAOPessoa(EntityManagerFactory emf) {
		super(emf);
	}

	@SuppressWarnings("unchecked")
	public List<Entity> getAllByName(Entity filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Entity> lista = null;
		String consulta = "FROM " + getTableName(filtro) + " WHERE nome LIKE :Nome";
		try {
			Query query = em.createQuery(consulta, filtro.getClass());
			query.setParameter("Nome", "%" + ((Pessoa) filtro).getNome() + "%");
			lista = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public Entity searchByRg(Entity filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		Entity result = null;
		String consulta = "FROM " + getTableName(filtro) + " WHERE rg = :Rg";
		try {
			Query query = em.createQuery(consulta, filtro.getClass());
			query.setParameter("Rg", ((Pessoa) filtro).getRg());
			result = (Entity) query.getSingleResult();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return result;
	}

	@SuppressWarnings("unchecked")
	public Entity searchByCpf(Entity filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		Entity result = null;
		String consulta = "FROM " + getTableName(filtro) + " WHERE cpf = :Cpf";
		try {
			Query query = em.createQuery(consulta, filtro.getClass());
			query.setParameter("Cpf", ((Pessoa) filtro).getCpf());
			result = (Entity) query.getSingleResult();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return result;
	}
	
}
