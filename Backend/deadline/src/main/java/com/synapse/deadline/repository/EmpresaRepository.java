package com.synapse.deadline.repository;

import com.synapse.deadline.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    
    Optional<Empresa> findByEmailLogin(String emailLogin);
    
    boolean existsByEmailLogin(String emailLogin);
    boolean existsByCnpj(String cnpj);
}