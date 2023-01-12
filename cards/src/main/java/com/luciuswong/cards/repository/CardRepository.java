package com.luciuswong.cards.repository;

import com.luciuswong.cards.model.Card;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardRepository extends CrudRepository<Card, Integer> {
    List<Card> findByCustomer(int customerId);
}
