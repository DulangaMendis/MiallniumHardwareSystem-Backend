package edu.icet.controller;

import edu.icet.model.Rental;
import edu.icet.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rentals")

public class RentalController {
    @Autowired
    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping
    public List<Rental> getAllRentals() {
        return rentalService.getAllRentals();
    }

    @PostMapping
    public Rental addRental(@RequestBody Rental rental) {
        return rentalService.addRental(rental);
    }


    @PutMapping("/{id}")
    public Rental updateRental(@PathVariable Long id, @RequestBody Rental updatedRental) {
        return rentalService.updateRental(id, updatedRental);
    }

    @DeleteMapping("/{id}")
    public void deleteRental(@PathVariable Long id) {
        rentalService.deleteRental(id);
    }

}
