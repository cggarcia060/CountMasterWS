package com.project.countmasterws.persistance.mapper;


import com.project.countmasterws.domain.pojo.ProcessPojo;
import com.project.countmasterws.persistance.entity.Process;
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
    ProcessPojo toProcesoPojo(Process process);

    /**
     * conviente un pojo a entidad de proceso
     * @param processPojo objeto a transformar
     * @return objeto retornado
     */
    Process toProceso(ProcessPojo processPojo);

    /**
     * retorna una lista de procesos transformado a pojo de una lista de entidades
     * @param process objeto transformado
     * @return objeto retornado
     */
    List<ProcessPojo> toProcesosPojo(List<Process> process);

}
