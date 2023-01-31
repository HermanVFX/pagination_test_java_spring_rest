package com.example.pagination_test_java_spring_rest.repository;

import com.example.pagination_test_java_spring_rest.model.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.domain.Pageable;

public interface ItemRepository extends CrudRepository<Item, Long> {

}
