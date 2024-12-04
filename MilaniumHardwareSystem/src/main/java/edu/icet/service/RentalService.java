package edu.icet.service;

import edu.icet.Repository.RentalRepository;
import edu.icet.model.Rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService {
    @Autowired
    private RentalRepository rentalRepository;

    public List<Rental> getAllRentals() {
        return rentalRepository.findAll();
    }

    public Rental addRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    public Rental updateRental(Long id, Rental updatedRental) {
        Rental rental = rentalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rental not found"));
        rental.setRentalDate(updatedRental.getRentalDate());
        rental.setReturnDate(updatedRental.getReturnDate());
        rental.setDueDate(updatedRental.getDueDate());
        rental.setFine(updatedRental.getFine());
        rental.setTotalCost(updatedRental.getTotalCost());
        rental.setCustomer(updatedRental.getCustomer());
        return rentalRepository.save(rental);
    }

    public void deleteRental(Long id) {
        rentalRepository.deleteById(id);
    }

}
