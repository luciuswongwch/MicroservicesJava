package com.luciuswong.cards.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @ToString
public class Card {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="native")
    @GenericGenerator(name="native", strategy="native")
    private int cardId;
    @OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL, targetEntity=Customer.class)
    @JoinColumn(name="customer_id", referencedColumnName="customerId", nullable=false)
    private Customer customer;
    private String cardNumber;
}
