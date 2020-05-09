package com.example.reservationservice.controller;

import com.example.reservationservice.domain.Reservation;
import com.example.reservationservice.domain.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
public class ReservationRestController {

    private final ReservationRepo reservationRepo;

    @Autowired
    public ReservationRestController(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }

    @RequestMapping(method = RequestMethod.GET , value = "/reservations" )
    public Collection<Reservation> getReservations(){
        return reservationRepo.findAll();
    }

}
