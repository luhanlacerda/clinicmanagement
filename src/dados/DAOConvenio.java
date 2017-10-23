package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import classesBasicas.Convenio;

public class DAOConvenio extends DAOGenerico<Convenio> {

	public DAOConvenio(EntityManagerFactory emf) {
		super(emf);
	}

	@SuppressWarnings("unchecked")
	public List<Convenio> getAllByDescricao(Convenio filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Convenio> listaConvenio = null;
		String consulta = "FROM Convenio c WHERE c.descricao LIKE :Descricao";
		try {
			Query query = em.createQuery(consulta, Convenio.class);
			query.setParameter("Descricao", "%" + filtro.getDescricao() + "%");
			listaConvenio = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaConvenio;
	}

}
