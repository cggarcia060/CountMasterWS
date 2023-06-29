package org.countmasterws.persistance.mapper;

import org.countmasterws.domain.dto.rol.RolDto;
import org.countmasterws.persistance.entity.Rol;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper que tranforma objectos de rol a rolDto
 */

@Mapper(componentModel = "spring")
public interface IRolMapper {
    /**
     * convierte una entidad a dto de rol
     * @param rol objeto a trnsformar
     * @return objeto retornado
     */
    RolDto toRolDto(Rol rol);

    /**
     * conviente un dto a entidad de rol
     * @param rolDto objeto a transformar
     * @return objeto retornado
     */
    Rol toRol(RolDto rolDto);

    /**
     * retorna una lista de procesos transformado a dto de una lista de entidades
     * @param rol objeto transformado
     * @return objeto retornado
     */
    List<RolDto> toRolDtoList(List<Rol> rol);

}
