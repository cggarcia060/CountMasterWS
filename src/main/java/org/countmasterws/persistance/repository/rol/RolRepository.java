package org.countmasterws.persistance.repository.rol;

import lombok.RequiredArgsConstructor;
import org.countmasterws.domain.dto.rol.RolDto;
import org.countmasterws.domain.repository.rol.IRolRepository;
import org.countmasterws.persistance.entity.Rol;
import org.countmasterws.persistance.mapper.IRolMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class RolRepository implements IRolRepository {


    private final IRolCrudRepository iRolCrudRepository;

    private  final IRolMapper iRolMapper;
    @Override
    public List<RolDto> getRol() {
            return iRolMapper.toRolDtoList(iRolCrudRepository.findAll());
    }
    @Override
    public List<RolDto> getRolCodeNot(String code) {
        return iRolMapper.toRolDtoList(iRolCrudRepository.findByCodeNot(code));
    }

    @Override
    public Optional<RolDto> getById(Integer id) {
        return iRolCrudRepository.findById(id).map(iRolMapper::toRolDto);
    }

    @Override
    public RolDto save(RolDto rolDto) {
        Rol rol= iRolMapper.toRol(rolDto) ;
        return iRolMapper.toRolDto(iRolCrudRepository.save(rol));
    }

    @Override
    public void delete(Integer id) {
         iRolCrudRepository.deleteById(id);
    }
}
