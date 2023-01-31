package com.example.pagination_test_java_spring_rest.controller;

import com.example.pagination_test_java_spring_rest.model.Item;
import com.example.pagination_test_java_spring_rest.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pagination")
@Slf4j
public class ItemController {

    private ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @GetMapping( params = { "page", "size" } )
    public ResponseEntity<Page<Item>> getAll(
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Item> pageItems = service.findAll(pageable);
        return new ResponseEntity<>(pageItems, HttpStatus.OK);
    }
}
