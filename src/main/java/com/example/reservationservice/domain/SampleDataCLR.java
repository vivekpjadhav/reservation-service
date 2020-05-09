package com.example.reservationservice.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class SampleDataCLR  implements CommandLineRunner {

    private final ReservationRepo reservationRepo;
    @Autowired
    public SampleDataCLR(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("vivek","aray","papa","Dave","Rob","mark","josh").forEach(name->reservationRepo.save(new Reservation(name)));
        reservationRepo.findAll().forEach(System.out::println);
    }
}
