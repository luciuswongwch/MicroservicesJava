package com.luciuswong.accounts.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
@Getter @Setter @ToString
public class Account {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name="native", strategy="native")
    private long accountNumber;
    @OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL, targetEntity=Customer.class)
    @JoinColumn(name="customer_id", referencedColumnName="customerId", nullable=false)
    private Customer customer;
    private String accountType;
    private String branchAddress;
    private LocalDate createDt;
}
