package org.countmasterws.domain.repository.proceso;

import org.countmasterws.domain.dto.proceso.ProcessDto;

import java.util.List;
import java.util.Optional;

public interface IProcessRepository {

    /**
     * Devuelve lista de procesos
     * @return retorna  lista de procesos
     */
    List<ProcessDto> getProcess();


    /**
     * Devuelve un proceso por id
     * @param id parametro de entrada id de proceso
     * @return retorna un proceso
     */
    Optional<ProcessDto> getById(Integer id);

    /**
     * Guarda un proceso
     * @param processDto proceso a guardar
     * @return retorna el proceso guardado
     */
    ProcessDto save(ProcessDto processDto);

    /**
     * Elimina marca proceso por id
     * @param id parametro de entrada id de proceso
     */
    void delete(Integer id);



}
