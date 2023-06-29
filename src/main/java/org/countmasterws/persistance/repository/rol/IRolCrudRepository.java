package org.countmasterws.persistance.repository.rol;

import org.countmasterws.persistance.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRolCrudRepository extends JpaRepository<Rol,Integer> {

    List<Rol> findByCodeNot(String code);
}
