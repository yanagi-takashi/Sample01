package org.jboss.tools.examples.data;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.jboss.tools.examples.model.CodeMst;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@ApplicationScoped
public class CodeMstRepository {

    @Inject
    private EntityManager em;

    public CodeMst findById(Long id) {
        return em.find(CodeMst.class, id);
    }

    public CodeMst findByCodeName(String name) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<CodeMst> criteria = cb.createQuery(CodeMst.class);
        Root<CodeMst> codemst = criteria.from(CodeMst.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(codemst).where(cb.equal(member.get(CodeMst_.name), email));
        criteria.select(codemst).where(cb.equal(codemst.get("codeName"), name));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<CodeMst> findAllOrderedByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<CodeMst> criteria = cb.createQuery(CodeMst.class);
        Root<CodeMst> codemst = criteria.from(CodeMst.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        criteria.select(codemst).orderBy(cb.asc(codemst.get("codeName")));

        List<CodeMst> hoge = em.createQuery(criteria).getResultList();
        ObjectMapper mapper = new ObjectMapper();
        String json=null;
		try {
			json = mapper.writeValueAsString(hoge);
		} catch (JsonProcessingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
    	System.out.println("-----1------");
    	System.out.println(json);

//    	Query  q = em.createQuery("select CODE_TYPE as codeType,CODE_ID as codeId,CODE_NAME as codeName,AVAILABLE_START_DATE as availableStartDate,AVAILABLE_END_DATE as availableEndDate,DEL_FLG as defFlg,CREATE_DATE as createDate,UDPATE_DATE as updateDate from CODE_MST  c");
    	Query  q = em.createQuery("select c from CodeMst as c",CodeMst.class);
    	System.out.println("-----2------");
    	List<CodeMst> hoge2 = q.getResultList();
		try {
			json = mapper.writeValueAsString(hoge2);
		} catch (JsonProcessingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
   	System.out.println("-----3------");
  	System.out.println(json);

        //return em.createQuery(criteria).getResultList();
        return hoge;
    }
    public List<CodeMst> findAll() {
//    	Query  q = em.createQuery("select CODE_TYPE,CODE_ID,CODE_NAME,AVAILABLE_START_DATE,AVAILABLE_END_DATE,DEL_FLG,CREATE_DATE,UDPATE_DATE from CODE_MST");
    	Query  q = em.createQuery("select c from CodeMst as c",CodeMst.class);
    	return  q.getResultList();

    }
}
