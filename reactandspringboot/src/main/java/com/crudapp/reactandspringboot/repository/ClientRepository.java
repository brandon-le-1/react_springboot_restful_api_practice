package com.crudapp.reactandspringboot.repository;

import org.springframework.stereotype.Repository;
import com.crudapp.reactandspringboot.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
