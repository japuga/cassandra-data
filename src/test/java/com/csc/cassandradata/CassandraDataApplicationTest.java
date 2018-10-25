package com.csc.cassandradata;

import com.csc.cassandradata.model.Customer;
import com.csc.cassandradata.repo.CustomerRepository;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CassandraDataApplicationTest {

	@Autowired
	CustomerRepository customerRepository;

	/*@Autowired
	Session session;

	@Test
	public void contextLoads() {

		ResultSet resultSet =session.execute("select first_name, last_name from customer");
		resultSet.forEach(row ->{
			System.out.println(row.getString(1));
		});
		session.close();
	}*/

	@Test
	public void saveTest(){
		Customer customer  = new Customer();
		customer.setFirstName("James");
		customer.setLastName("Bond");
		customer.setAge(42);
		customerRepository.save(customer);

		customerRepository.findAll().forEach( c ->
				System.out.println(c.getId() + " " + c.getFirstName() + " " + c.getLastName()));
	}
}
