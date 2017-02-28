package org.jboss.tools.examples.data;

//import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

@RequestScoped
public class StoredSample01 {

	public  Integer callStored01() {

		// psersistence.xml <persistence-unit name="primary"> のname=の値を引数にする。
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("primary1");
		EntityManager em = emf.createEntityManager();

		System.out.println("-----------callStored01--------------");
		em.getTransaction().begin();

		// ストアドの呼び出し
		StoredProcedureQuery spq = em.createStoredProcedureQuery("GETCOUNT2");
		spq.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		spq.registerStoredProcedureParameter(2, Integer.class, ParameterMode.OUT);

		spq.setParameter(1, "world");// パラメータわたし
		spq.execute();// 実行

		// 戻り値の取得
		Integer result = (Integer) spq.getOutputParameterValue(2);
		System.out.println("result=" + result);

		em.getTransaction().rollback();
		em.close();
		emf.close();
		return result;
	}
}
