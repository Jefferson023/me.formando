package br.ufrn.imd.meformando.repositorios;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.ufrn.imd.meformando.dominio.Cerimonial;
import br.ufrn.imd.meformando.dominio.EventoComemoracao;
import br.ufrn.imd.meformando.dominio.Formando;
import br.ufrn.imd.meformando.dominio.Turma;

@Stateless
public class CerimonialRepositorio {

	@PersistenceContext
	private EntityManager em;
	
	public Cerimonial adicionar(Cerimonial cerimonial) {
		if(cerimonial.getId() == 0)
			em.persist(cerimonial);
		else
			em.merge(cerimonial);
		return cerimonial;
	}
	
	public Cerimonial alterar(Cerimonial cerimonial) {
		
		return cerimonial;
	}
	
	public void remover(Cerimonial cerimonial) {
		cerimonial = em.find(Cerimonial.class, cerimonial.getId());
		em.remove(cerimonial);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cerimonial> listar() {
		return (List<Cerimonial>) em.createQuery("select c from Cerimonial c").getResultList();
	}

	


}