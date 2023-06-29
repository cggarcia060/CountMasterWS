package org.countmasterws.controller;


import org.countmasterws.domain.dto.proceso.ProcessDto;
import org.countmasterws.domain.service.proceso.IProcessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/process")
public class ProcessController {

    private final IProcessService iProcessService;
    @GetMapping
    public ResponseEntity<List<ProcessDto>> getList(){
        return ResponseEntity.ok(iProcessService.getProcess());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<ProcessDto> getById(@PathVariable("id") Integer id ){
        return ResponseEntity.of(iProcessService.getById(id));
    }

    @PostMapping
    public ResponseEntity<ProcessDto> save(@RequestBody ProcessDto processDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(iProcessService.save(processDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Integer id ){
        return ResponseEntity.ok(iProcessService.delete(id));
    }


}
