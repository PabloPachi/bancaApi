package com.example.bancaapi.repository;

import com.example.bancaapi.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICuentaRepository extends JpaRepository<Cuenta, Long> {
}