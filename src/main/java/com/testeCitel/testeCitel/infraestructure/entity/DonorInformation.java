package com.testeCitel.testeCitel.infraestructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
@Table(name = "donor_information")
public class DonorInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private String rg;

    @Column(nullable = false)
    private Date dtNasc;

    @Column
    private String sexo;

    @Column
    private String mae;

    @Column
    private String pai;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private Double height;

    @Column(nullable = false)
    private Double weight;

    @ManyToOne
    @JoinColumn(name = "type_blood", nullable = false)
    private BloodInformation bloodType;

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

}
