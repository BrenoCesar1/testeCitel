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
@Table(name = "blood_information")
public class BloodInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "type_blood")
    private String typeBlood;

    @Column(name = "donate-to")
    private String donateTo;

    @Column(name = "receives-from")
    private String receivesFrom;

    @OneToMany(mappedBy = "bloodType", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DonorInformation> donors;

}
