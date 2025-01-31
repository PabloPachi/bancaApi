package com.example.bancaapi.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaccion;
    private String tipoTransaccion;
    private Double monto;
    private Date fechaHora;
    private String descripcion;
    private Long idOrigen;

    @ManyToOne
    @JoinColumn(name = "cuenta_numero")
    private Cuenta cuenta;
    public Movimiento(){

    }
}
