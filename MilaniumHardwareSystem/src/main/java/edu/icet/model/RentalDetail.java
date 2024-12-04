package edu.icet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Table(name = "rental_detail")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RentalDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detailId;

    @ManyToOne
    @JoinColumn(name = "rental_id")
    private Rental rental;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private HardwareItem hardwareItem;

    @Column(nullable = false)
    private int qty;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal totalItemCost;

}
