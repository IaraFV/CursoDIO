package com.example.apirest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonRepository, Long> {
    
}
