package com.example.bancaapi.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBeneficiario;
    private String nombre;
    private String tipoDocumento;
    private String numeroDocumento;
    private String relacionTitular;
    private Date fechaAutorizacion;

    @ManyToOne
    @JoinColumn(name = "cuenta_numero")
    private Cuenta cuenta;
    public Beneficiario(){

    }
}
