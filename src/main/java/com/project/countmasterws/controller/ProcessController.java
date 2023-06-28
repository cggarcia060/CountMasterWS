package com.project.countmasterws.controller;


import com.project.countmasterws.domain.pojo.ProcessPojo;
import com.project.countmasterws.domain.service.IProcessService;
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
    public ResponseEntity<List<ProcessPojo>> getList(){
        return ResponseEntity.ok(iProcessService.getProcess());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<ProcessPojo> getById(@PathVariable("id") Integer id ){
        return ResponseEntity.of(iProcessService.getById(id));
    }

    @PostMapping
    public ResponseEntity<ProcessPojo> save(@RequestBody ProcessPojo processPojo){
        return ResponseEntity.status(HttpStatus.CREATED).body(iProcessService.save(processPojo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Integer id ){
        return ResponseEntity.ok(iProcessService.delete(id));
    }


}
