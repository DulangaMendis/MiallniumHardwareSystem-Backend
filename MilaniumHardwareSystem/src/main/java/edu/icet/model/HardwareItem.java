package edu.icet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Table(name = "hardware_item")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HardwareItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private int availability;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal finePerDay;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal rentalPerDay;


}
