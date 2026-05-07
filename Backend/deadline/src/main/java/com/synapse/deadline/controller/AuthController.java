package com.synapse.deadline.controller;

import com.synapse.deadline.dto.LoginDTO;
import com.synapse.deadline.dto.TokenDTO;
import com.synapse.deadline.service.AuthService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@Tag(name = "Autenticação", description = "Endpoints para gerenciamento de acesso e tokens")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Operation(summary = "Realiza o login da Empresa", description = "Valida e-mail e senha e retorna um Token JWT para uso nas rotas privadas.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Login realizado com sucesso. Token retornado."),
            @ApiResponse(responseCode = "400", description = "Erro de validação (e-mail mal formatado ou campos vazios)."),
            @ApiResponse(responseCode = "401", description = "Credenciais inválidas (e-mail ou senha incorretos).")
    })
    @PostMapping("/login")
    public ResponseEntity<TokenDTO> login(@Valid @RequestBody LoginDTO dto) {
        String token = authService.autenticar(dto);
        return ResponseEntity.ok(new TokenDTO(token));
    }
}