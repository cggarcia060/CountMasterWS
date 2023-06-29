package org.countmasterws.domain.service.rol;

import lombok.RequiredArgsConstructor;
import org.countmasterws.domain.dto.rol.RolDto;
import org.countmasterws.domain.repository.rol.IRolRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class RolServiceImpl implements IRolService{

    private final IRolRepository iRolRepository;

    @Override
    public List<RolDto> getRols() {
        return iRolRepository.getRol();
    }


    @Override
    public List<RolDto> getListByRols(RolDto rolDto) {
        if (rolDto.getCode().equals("ROL_SUPERADMIN")){
            return iRolRepository.getRol();
        }else{
            return  iRolRepository.getRolCodeNot("ROL_SUPERADMIN");
        }
    }

    @Override
    public Optional<RolDto> getById(Integer id) {
        return iRolRepository.getById(id);
    }

    @Override
    public RolDto save(RolDto rolDto) {
        return iRolRepository.save(rolDto);
    }

    @Override
    public boolean delete(Integer id) {
        iRolRepository.delete(id);
        return true;
    }
}
