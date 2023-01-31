package com.example.pagination_test_java_spring_rest.service;

import com.example.pagination_test_java_spring_rest.model.Item;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface ItemService {

    Page<Item> findAll(Pageable pageable);

}
