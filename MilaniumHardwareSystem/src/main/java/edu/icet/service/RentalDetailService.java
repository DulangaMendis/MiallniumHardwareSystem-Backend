package edu.icet.service;

import edu.icet.Repository.RentalDetailRepository;
import edu.icet.model.RentalDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalDetailService {
    @Autowired
    private RentalDetailRepository rentalDetailRepository;

    public List<RentalDetail> getAllRentalDetails() {
        return rentalDetailRepository.findAll();
    }

    public RentalDetail addRentalDetail(RentalDetail rentalDetail) {
        return rentalDetailRepository.save(rentalDetail);
    }

    public RentalDetail updateRentalDetail(Long id, RentalDetail updatedDetail) {
        RentalDetail detail = rentalDetailRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rental detail not found"));
        detail.setQty(updatedDetail.getQty());
        detail.setTotalItemCost(updatedDetail.getTotalItemCost());
        detail.setRental(updatedDetail.getRental());
        detail.setHardwareItem(updatedDetail.getHardwareItem());
        return rentalDetailRepository.save(detail);
    }

    public void deleteRentalDetail(Long id) {
        rentalDetailRepository.deleteById(id);
    }

}
