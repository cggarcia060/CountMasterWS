package org.countmasterws.persistance.mapper;


import org.countmasterws.domain.dto.proceso.ProcessDto;
import org.countmasterws.persistance.entity.Process;
import org.mapstruct.Mapper;

import java.util.List;


/**
 * Mapper que tranforma objectos de proceso a pojos o entidades
 */
@Mapper(componentModel = "spring")
public interface IProcessMapper {
    /**
     * convierte una entidad a pojo de proceso
     * @param process objeto a trnsformar
     * @return objeto retornado
     */
    ProcessDto toProcessPojo(Process process);

    /**
     * conviente un pojo a entidad de proceso
     * @param processDto objeto a transformar
     * @return objeto retornado
     */
    Process toProcess(ProcessDto processDto);

    /**
     * retorna una lista de procesos transformado a pojo de una lista de entidades
     * @param process objeto transformado
     * @return objeto retornado
     */
    List<ProcessDto> toProcessPojo(List<Process> process);

}
