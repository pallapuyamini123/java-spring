package ai.jobiak.imd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ai.jobiak.imd.model.Customer;
import ai.jobiak.imd.repository.CustomerRepo;

@SpringBootApplication
public class SpringbootFormday42Application{
	
	
	

	public static void main(String[] args) {
		System.out.println("application started");
		SpringApplication.run(SpringbootFormday42Application.class, args);
		//System.out.println("");
	}
	
}


