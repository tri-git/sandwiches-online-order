package com.bakery.test;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Id
    private int petId;
    private String petName;
    private String petImage;
    private int petAge;
    private String petType;
    private String petBreed;
    private String petWeight;

//    @ManyToMany
//    @JoinColumn(name = "userId", nullable = false)
//    private User user;
//
//    @OneToMany(mappedBy = "Pet")
//    private List<Vaccination> listVaccination;

}
