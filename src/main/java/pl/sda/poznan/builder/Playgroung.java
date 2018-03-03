package pl.sda.poznan.builder;

import java.time.LocalDate;

public class Playgroung {
    public static void main(String[] args) {
        //   Reservation reservation = new Reservation();
        // reservation.setCity("poznan");
        //reservation.setHeadcount(199);



        Reservation.ReservationBuilder rb = Reservation.builder()
                .city("Poznań")
                .headcount(100)
                .price(99d);



        // odczyt z pliku

        rb.date(LocalDate.parse("2018-01-03"));
        //zaqkoncz proces budowania  zwroc gotowy obiekt
        Reservation build =rb.build();
        System.out.println(build);

        //inny scenariusz- znam wszystkie wartosic od razu

        Reservation wrcław =Reservation.builder()
                .date(LocalDate.parse("2018-03-09"))
                .headcount(200)
                .price(52)
                .city("wroclaw")
                .build();


    }
}
