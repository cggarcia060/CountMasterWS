package com.project.countmasterws.domain.service;

import com.project.countmasterws.domain.pojo.ProcessPojo;
import com.project.countmasterws.domain.repository.IProcessRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio de proceso
 */
@RequiredArgsConstructor
@Service
public class ProcessServiceImpl implements IProcessService{
    /**
     * Repositorio de proceso
     */
    private final IProcessRepository iProcessRepository;

    /**
     * Devuelve lista de proceso
     * @return reportna lista de proceso
     */
    @Override
    public List<ProcessPojo> getProcess() {
        return iProcessRepository.getProcess();
    }

    /**
     * Devuelve un proceso por id
     * @param id parametro de entrada id de proceso
     * @return retorna un proceso por id
     */
    @Override
    public Optional<ProcessPojo> getById(Integer id) {
        return iProcessRepository.getById(id);
    }

    /**
     * Guarda el proceso
     * @param processPojo proceso a guardar
     * @return retorna el proceso guardado
     */
    @Override
    public ProcessPojo save(ProcessPojo processPojo) {
        return iProcessRepository.save(processPojo);
    }

    /**
     * Elimina el proceso por el id
     * @param id parametro de entrada id de proceso
     * @return retorna un true si se guardo correctamente y false si no se guardo
     */
    @Override
    public boolean delete(Integer id) {
        try {
            iProcessRepository.delete(id);
           return true;
        }catch (Exception e){
            return false;

        }
    }
}
