package org.jboss.tools.examples.data;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.jboss.tools.examples.model.CodeMst;

@ApplicationScoped
public class CodeMstRepository {

    @Inject
    private EntityManager em;

    public CodeMst findById(Long id) {
        return em.find(CodeMst.class, id);
    }

    public CodeMst findByEmail(String id) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<CodeMst> criteria = cb.createQuery(CodeMst.class);
        Root<CodeMst> codemst = criteria.from(CodeMst.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(codemst).where(cb.equal(member.get(CodeMst_.name), email));
        criteria.select(codemst).where(cb.equal(codemst.get("id"), id));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<CodeMst> findAllOrderedByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<CodeMst> criteria = cb.createQuery(CodeMst.class);
        Root<CodeMst> codemst = criteria.from(CodeMst.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0        // criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
        criteria.select(codemst).orderBy(cb.asc(codemst.get("codeName")));
        return em.createQuery(criteria).getResultList();
    }
}
