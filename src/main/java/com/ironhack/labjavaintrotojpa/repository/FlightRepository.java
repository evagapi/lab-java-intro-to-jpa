package com.ironhack.labjavaintrotojpa.repository;

import com.ironhack.labjavaintrotojpa.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {
    Optional<Flight> findByFlightNumber(String flightNumber);
    List<Flight> findByAircraftContaining(String substring);
    List<Flight> findByFlightMileageGreaterThan(int mileage);
}
