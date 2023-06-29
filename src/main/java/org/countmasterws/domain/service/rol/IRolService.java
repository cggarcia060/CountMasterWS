package org.countmasterws.domain.service.rol;

import org.countmasterws.domain.dto.rol.RolDto;

import java.util.List;
import java.util.Optional;

public interface IRolService {

    /**
     * Devuelve lista de roles
     *
     * @return retorna  lista de roles
     */
    List<RolDto> getRols();

    List<RolDto> getListByRols(RolDto rolDto);

    /**
     * Devuelve un rol por id
     *
     * @param id parametro de entrada id de rol
     * @return retorna un rol
     */
    Optional<RolDto> getById(Integer id);

    /**
     * Guarda un rol
     *
     * @param rolDto rol a guardar
     * @return retorna el rol guardado
     */
    RolDto save(RolDto rolDto);

    /**
     * Elimina marca rol por id
     *
     * @param id parametro de entrada id de rol
     */
    boolean delete(Integer id);
}
