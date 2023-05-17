package com.example.CustomQueries1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue
    private int id;
    private String description;
    private String fromAirport;
    private String toAirport;
    private enum status{
        ONTIME,
        DELAYED,
        CANCELED
    }
}
