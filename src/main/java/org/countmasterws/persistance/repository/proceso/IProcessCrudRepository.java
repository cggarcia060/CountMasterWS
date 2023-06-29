package org.countmasterws.persistance.repository.proceso;

import org.countmasterws.persistance.entity.Process;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProcessCrudRepository extends JpaRepository<Process,Integer> {
}
