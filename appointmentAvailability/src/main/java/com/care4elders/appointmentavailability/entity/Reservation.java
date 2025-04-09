package com.care4elders.appointmentavailability.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalTime;
@Data

public class Reservation {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private LocalTime heure;

    // @Enumerated(EnumType.STRING)
    private StatutReservation statut;



    public enum StatutReservation {
        PLANIFIEE, CONFIRMEE, ANNULEE, TERMINEE
    }

}