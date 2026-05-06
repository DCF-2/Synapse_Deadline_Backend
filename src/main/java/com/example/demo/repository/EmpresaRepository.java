
package com.example.demo.repository;

import com.example.demo.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa,Long> {}
