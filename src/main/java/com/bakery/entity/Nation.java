package com.bakery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "nation", schema = "PetSafe")
public class Nation {
    @Id
    private Integer id;

    private String code;

    private String name;

}
