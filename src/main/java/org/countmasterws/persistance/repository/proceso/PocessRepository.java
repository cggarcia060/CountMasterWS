package org.countmasterws.persistance.repository.proceso;

import org.countmasterws.domain.repository.proceso.IProcessRepository;
import org.countmasterws.persistance.entity.Process;
import org.countmasterws.domain.dto.proceso.ProcessDto;
import org.countmasterws.persistance.mapper.IProcessMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository de proceso
 */

@RequiredArgsConstructor // Crea un constructor con el atributo final
@Repository
public class PocessRepository implements IProcessRepository {

    /**
     * Crud de proceso
     */
    private final IProcessCrudRepository iprocessCrudRepository;
    /**
     * Mapper de proceso
     */
    private final IProcessMapper iProcessMapper;

    /**
     * Devuelve una lista de proceso
     * @return retorna una lista de proceso
     */
    @Override
    public List<ProcessDto> getProcess() {
        return iProcessMapper.toProcessPojo(iprocessCrudRepository.findAll());
    }

    /**
     * Obtiene proceso por id
     * @param id parametro de entrada id de proceso
     * @return retona un proceso mappeado a pojo
     */
    @Override
    public Optional<ProcessDto> getById(Integer id) {
        return iprocessCrudRepository.findById(id).map(iProcessMapper::toProcessPojo);
    }

    /**
     * Guarda un proceso
     * @param processDto proceso a guardar
     * @return Retorna el proceso guardado
     */
    @Override
    public ProcessDto save(ProcessDto processDto) {
        Process process = iProcessMapper.toProcess(processDto);
        return iProcessMapper.toProcessPojo(iprocessCrudRepository.save(process));
    }

    /**
     * Elimina un proceso
     * @param id parametro de entrada id de proceso
     */
    @Override
    public void delete(Integer id) {
        iprocessCrudRepository.deleteById(id);
    }
}
