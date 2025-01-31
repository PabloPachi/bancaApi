package com.example.bancaapi.repository;

import com.example.bancaapi.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovimientoRepository extends JpaRepository<Movimiento, Long> {
}
