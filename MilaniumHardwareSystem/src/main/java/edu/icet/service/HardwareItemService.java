package edu.icet.service;

import edu.icet.Repository.HardwareItemRepository;
import edu.icet.model.HardwareItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HardwareItemService {

    @Autowired
    private HardwareItemRepository hardwareItemRepository;

    public List<HardwareItem> getAllItems() {
        return hardwareItemRepository.findAll();
    }

    public HardwareItem addItem(HardwareItem item) {
        return hardwareItemRepository.save(item);
    }


    public HardwareItem updateItem(Long id, HardwareItem updatedItem) {
        HardwareItem item = hardwareItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hardware item not found"));
        item.setName(updatedItem.getName());
        item.setAvailability(updatedItem.getAvailability());
        item.setFinePerDay(updatedItem.getFinePerDay());
        item.setRentalPerDay(updatedItem.getRentalPerDay());
        return hardwareItemRepository.save(item);
    }

    public void deleteItem(Long id) {
        hardwareItemRepository.deleteById(id);
    }
}
