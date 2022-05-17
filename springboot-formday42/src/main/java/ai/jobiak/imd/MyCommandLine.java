package ai.jobiak.imd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import ai.jobiak.imd.model.Customer;
import ai.jobiak.imd.repository.CustomerRepo;
@Component
public class MyCommandLine  implements CommandLineRunner {
	@Autowired
	
	CustomerRepo repo;

	@Override
	public void run(String...args)throws Exception {
		Customer cust=new Customer();
		cust.setAcctno(1);
		cust.setName("abc");
		cust.setBalance(200);
		repo.save(cust);
		
		
		
		
		
	/*	Customer c1=new Customer();
		c1.setAcctno(101);
		c1.setName("Xiang");
		c1.setBalance(8000);
		
		 repo.save(c1);
		 
		 Customer c2=new Customer();
		 c2.setAcctno(102);
		 c2.setName("Nobitha");
		 c2.setBalance(3490);
		 
		 repo.save(c2);
		 
		 Customer c3=new Customer();
		 c3.setAcctno(103);
		 c3.setName("Xenen");
		 c3.setBalance(2890);
		 
		 repo.save(c3);
		 Optional<Customer> cust = repo.findById(102L);
			if (cust.isPresent()) {
				System.out.println(cust.get());
			}
			List<Customer> list = repo.findAll();
			for (Customer c : list) {
				System.out.println(c);
			}
*/
		
		
		}
		
	}
@Configuration
class CustomerConfiguration {
	@Bean
	public Customer createCustomer() {
		return new Customer();
	}
	
}
	

