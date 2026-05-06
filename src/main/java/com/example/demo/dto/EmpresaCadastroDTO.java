
package com.example.demo.dto;

import jakarta.validation.constraints.*;
import java.time.LocalTime;

public class EmpresaCadastroDTO {

@NotBlank private String nomeFantasia;
@NotBlank private String razaoSocial;
@NotBlank private String cnpj;

@NotBlank private String endereco;
@NotBlank private String emailLogin;
@NotBlank private String senha;

private String contatoWhatsapp;
private String contato1;
private String contato2;

private String instrucoesRetirada;
private String diasFuncionamento;

private LocalTime horarioAbertura;
private LocalTime horarioFechamento;

/* getters setters */

public String getNomeFantasia(){return nomeFantasia;}
public void setNomeFantasia(String v){this.nomeFantasia=v;}

public String getRazaoSocial(){return razaoSocial;}
public void setRazaoSocial(String v){this.razaoSocial=v;}

public String getCnpj(){return cnpj;}
public void setCnpj(String v){this.cnpj=v;}

public String getEndereco(){return endereco;}
public void setEndereco(String v){this.endereco=v;}

public String getEmailLogin(){return emailLogin;}
public void setEmailLogin(String v){this.emailLogin=v;}

public String getSenha(){return senha;}
public void setSenha(String v){this.senha=v;}

public String getContatoWhatsapp(){return contatoWhatsapp;}
public void setContatoWhatsapp(String v){this.contatoWhatsapp=v;}

public String getContato1(){return contato1;}
public void setContato1(String v){this.contato1=v;}

public String getContato2(){return contato2;}
public void setContato2(String v){this.contato2=v;}

public String getInstrucoesRetirada(){return instrucoesRetirada;}
public void setInstrucoesRetirada(String v){this.instrucoesRetirada=v;}

public String getDiasFuncionamento(){return diasFuncionamento;}
public void setDiasFuncionamento(String v){this.diasFuncionamento=v;}

public LocalTime getHorarioAbertura(){return horarioAbertura;}
public void setHorarioAbertura(LocalTime v){this.horarioAbertura=v;}

public LocalTime getHorarioFechamento(){return horarioFechamento;}
public void setHorarioFechamento(LocalTime v){this.horarioFechamento=v;}

}
