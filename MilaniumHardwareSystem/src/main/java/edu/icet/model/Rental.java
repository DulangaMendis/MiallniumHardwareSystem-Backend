package edu.icet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "rental")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentalId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(nullable = false)
    private LocalDate rentalDate;

    private LocalDate returnDate;
    private LocalDate dueDate;
    private BigDecimal fine;
    private BigDecimal totalCost;

}
