package edu.icet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "customer")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long customerId;

        @Column(nullable = false, length = 100)
        private String name;

        @Column(nullable = false, length = 15)
        private String contact;

        @Column(length = 100)
        private String city;

    }
