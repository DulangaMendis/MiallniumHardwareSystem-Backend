package edu.icet.Repository;

import edu.icet.model.HardwareItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HardwareItemRepository extends JpaRepository<HardwareItem,Long> {
}
