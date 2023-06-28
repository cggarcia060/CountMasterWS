package com.project.countmasterws.domain.service;

import com.project.countmasterws.domain.pojo.ProcessPojo;

import java.util.List;
import java.util.Optional;

public interface IProcessService {
    /**
     * Devuelve lista de procesos
     * @return retorna  lista de procesos
     */
    List<ProcessPojo> getProcess();


    /**
     * Devuelve un proceso por id
     * @param id parametro de entrada id de proceso
     * @return retorna un proceso
     */
    Optional<ProcessPojo> getById(Integer id);

    /**
     * Guarda un proceso
     * @param processPojo proceso a guardar
     * @return retorna el proceso guardado
     */
    ProcessPojo save(ProcessPojo processPojo);

    /**
     * Elimina marca proceso por id
     * @param id parametro de entrada id de proceso
     */
    boolean delete(Integer id);

}
