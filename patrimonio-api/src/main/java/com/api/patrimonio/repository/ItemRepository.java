package com.api.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.patrimonio.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
