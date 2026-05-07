
package com.synapse.deadline.service;

import com.synapse.deadline.dto.EmpresaCadastroDTO;
import com.synapse.deadline.entity.Empresa;
import com.synapse.deadline.repository.EmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

@Autowired
private EmpresaRepository repository;

public Empresa cadastrar(EmpresaCadastroDTO dto){

Empresa e = new Empresa();

e.setNomeFantasia(dto.getNomeFantasia());
e.setRazaoSocial(dto.getRazaoSocial());
e.setCnpj(dto.getCnpj());
e.setEndereco(dto.getEndereco());
e.setEmailLogin(dto.getEmailLogin());
e.setSenha(dto.getSenha());

e.setContatoWhatsapp(dto.getContatoWhatsapp());
e.setContato1(dto.getContato1());
e.setContato2(dto.getContato2());
e.setInstrucoesRetirada(dto.getInstrucoesRetirada());
e.setDiasFuncionamento(dto.getDiasFuncionamento());
e.setHorarioAbertura(dto.getHorarioAbertura());
e.setHorarioFechamento(dto.getHorarioFechamento());

return repository.save(e);
}
}
