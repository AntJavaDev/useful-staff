package hello;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO 
{

	private static final Logger log = LoggerFactory.getLogger(TestDAO.class);
	 @Autowired
	 private EntityManager entityManager;
	 

	 @PostConstruct
	 public void test()
	 {
		 
		 
		 log.info(entityManager.toString());
		 System.out.println(entityManager);
	 }
	 
}
