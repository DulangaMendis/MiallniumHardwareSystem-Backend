package edu.icet.controller;

import edu.icet.model.RentalDetail;
import edu.icet.service.RentalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rental-details")

public class RentalDetailController {

    @Autowired
    private final RentalDetailService rentalDetailService;

    public RentalDetailController(RentalDetailService rentalDetailService) {
        this.rentalDetailService = rentalDetailService;
    }

    @GetMapping
    public List<RentalDetail> getAllRentalDetails() {
        return rentalDetailService.getAllRentalDetails();
    }

    // Add a new rental detail
    @PostMapping
    public RentalDetail addRentalDetail(@RequestBody RentalDetail rentalDetail) {
        return rentalDetailService.addRentalDetail(rentalDetail);
    }

    // Update an existing rental detail
    @PutMapping("/{id}")
    public RentalDetail updateRentalDetail(@PathVariable Long id, @RequestBody RentalDetail updatedDetail) {
        return rentalDetailService.updateRentalDetail(id, updatedDetail);
    }

    // Delete a rental detail by ID
    @DeleteMapping("/{id}")
    public void deleteRentalDetail(@PathVariable Long id) {
        rentalDetailService.deleteRentalDetail(id);


    }
}
