package com.example.bancaapi.repository;

import com.example.bancaapi.model.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBeneficiarioRepository extends JpaRepository<Beneficiario, Long> {
}
