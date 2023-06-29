package org.countmasterws.domain.repository.rol;

import org.countmasterws.domain.dto.rol.RolDto;

import java.util.List;
import java.util.Optional;

public interface IRolRepository {

    /**
     * Devuelve lista de roles
     * @return retorna  lista de rols
     */
    List<RolDto> getRol();

    List<RolDto> getRolCodeNot(String code);

    /**
     * Devuelve un rol por id
     * @param id parametro de entrada id de rol
     * @return retorna un rol
     */
    Optional<RolDto> getById(Integer id);

    /**
     * Guarda un rol
     * @param rolDto rol a guardar
     * @return retorna el rol guardado
     */
    RolDto save(RolDto rolDto);

    /**
     * Elimina marca rol por id
     * @param id parametro de entrada id de rol
     */
    void delete(Integer id);



}
