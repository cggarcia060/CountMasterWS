package org.countmasterws.controller;

import lombok.RequiredArgsConstructor;
import org.countmasterws.domain.dto.rol.RolDto;
import org.countmasterws.domain.service.rol.IRolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping( "/rol")
public class RolController {

    private final IRolService iRolService;

    @PostMapping("/list")
    public ResponseEntity<List<RolDto>> getRol(@RequestBody final RolDto rolDto ){
        return ResponseEntity.ok(iRolService.getListByRols(rolDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RolDto> getRolById(@PathVariable("id") final Integer id){
        return ResponseEntity.of(iRolService.getById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<RolDto> save(@RequestBody final RolDto rolDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(iRolService.save(rolDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") final Integer id){
        return  ResponseEntity.ok(iRolService.delete(id));
    }

}
