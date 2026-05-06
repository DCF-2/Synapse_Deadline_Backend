
package com.example.demo.controller;

import com.example.demo.dto.EmpresaCadastroDTO;
import com.example.demo.entity.Empresa;
import com.example.demo.service.EmpresaService;

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
