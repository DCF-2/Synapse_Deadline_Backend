package com.example.demo;

import com.example.demo.dto.EmpresaCadastroDTO;
import com.example.demo.entity.Empresa;
import com.example.demo.repository.EmpresaRepository;
import com.example.demo.service.EmpresaService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class EmpresaServiceTest {

    @Mock
    private EmpresaRepository repository;

    @InjectMocks
    private EmpresaService service;

    @Test
    void deveCadastrarEmpresa(){

        EmpresaCadastroDTO dto =
                new EmpresaCadastroDTO();

        dto.setNomeFantasia("Farmacia");
        dto.setRazaoSocial("Farmacia LTDA");
        dto.setCnpj("123");
        dto.setEndereco("Rua A");
        dto.setEmailLogin("teste@email.com");
        dto.setSenha("123");

        when(repository.save(any()))
                .thenAnswer(i -> i.getArgument(0));

        Empresa empresa = service.cadastrar(dto);

        assertNotNull(empresa);

        assertEquals(
                "Farmacia",
                empresa.getNomeFantasia()
        );

        verify(repository, times(1))
                .save(any(Empresa.class));
    }
}
