package ai.jobiak.imd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ai.jobiak.imd.model.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {

}
