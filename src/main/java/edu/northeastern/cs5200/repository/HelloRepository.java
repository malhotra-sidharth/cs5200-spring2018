package edu.northeastern.cs5200.repository;

import edu.northeastern.cs5200.entity.HelloObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<HelloObject, Integer>{
}
