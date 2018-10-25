package com.csc.cassandradata.repo;

import com.csc.cassandradata.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {


}
