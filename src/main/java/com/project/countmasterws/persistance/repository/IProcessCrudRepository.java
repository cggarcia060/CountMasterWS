package com.project.countmasterws.persistance.repository;

import com.project.countmasterws.persistance.entity.Process;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProcessCrudRepository extends JpaRepository<Process,Integer> {
}
