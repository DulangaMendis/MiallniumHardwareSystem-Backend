package edu.icet.controller;

import edu.icet.model.HardwareItem;
import edu.icet.service.HardwareItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class HardwareItemController {

    @Autowired
    private HardwareItemService hardwareItemService;

    @GetMapping
    public List<HardwareItem> getAllItems() {
        return hardwareItemService.getAllItems();
    }


    @PostMapping
    public HardwareItem addItem(@RequestBody HardwareItem item) {
        return hardwareItemService.addItem(item);
    }

    @PutMapping("/{id}")
    public HardwareItem updateItem(@PathVariable Long id, @RequestBody HardwareItem updatedItem) {
        return hardwareItemService.updateItem(id, updatedItem);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        hardwareItemService.deleteItem(id);
    }

}
