
package com.synapse.deadline.controller;

import com.synapse.deadline.dto.EmpresaCadastroDTO;
import com.synapse.deadline.entity.Empresa;
import com.synapse.deadline.service.EmpresaService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

@Autowired
private EmpresaService service;

@PostMapping
public ResponseEntity<Empresa> cadastrar(@Valid @RequestBody EmpresaCadastroDTO dto){
return ResponseEntity.ok(service.cadastrar(dto));
}
}
