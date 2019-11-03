package br.ufrn.imd.meformando.repositorios;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufrn.imd.meformando.dominio.Formando;
import br.ufrn.imd.meformando.dominio.Turma;

@Stateless
public class TurmaRepositorio {
	
	@PersistenceContext
	private EntityManager em;
	
	public Turma findTurmaByFormando(Formando formando) {
		return formando.getTurma();
	}
}
