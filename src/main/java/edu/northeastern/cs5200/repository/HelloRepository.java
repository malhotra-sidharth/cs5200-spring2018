package edu.northeastern.cs5200.repository;

import edu.northeastern.cs5200.entity.HelloObject;
import org.springframework.data.jpa.repository.JpaRepository;

// repository for HelloObject
public interface HelloRepository extends JpaRepository<HelloObject, Integer>{
}
