package com.testeCitel.testeCitel.infraestructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String cep;

    @Column
    private String endereco;

    @Column
    private int numero;

    @Column
    private String bairro;

    @Column
    private String cidade;

    @Column
    private String estado;

    @OneToMany(mappedBy = "address_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses;
}
