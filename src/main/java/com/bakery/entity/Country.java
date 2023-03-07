package com.bakery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table (name = "country", schema = "dev")
public class Country {
    @Id
    private Integer id;

    private String code;

    private String name;

}
