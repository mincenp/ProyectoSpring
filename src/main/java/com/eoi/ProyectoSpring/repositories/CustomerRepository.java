package com.eoi.ProyectoSpring.repositories;

import com.eoi.ProyectoSpring.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel ="customer",path = "customer")
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findByName(@Param("name")String name);
    List<Customer> findBysecondName(@Param("name")String secondName);



}