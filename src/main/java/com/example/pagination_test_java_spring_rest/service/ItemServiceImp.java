package com.example.pagination_test_java_spring_rest.service;

import com.example.pagination_test_java_spring_rest.exeption.RequestException;
import com.example.pagination_test_java_spring_rest.model.Item;
import com.example.pagination_test_java_spring_rest.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ItemServiceImp implements ItemService{

    private ItemRepository repository;

    public ItemServiceImp(ItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public Page<Item> findAll(Pageable pageable) {

        List<Item> list = (List<Item>) repository.findAll();

        int last = pageable.getPageNumber() * pageable.getPageSize();
        int first = last - pageable.getPageSize();

        if (list.size() < first) {
            throw new RequestException("Items not found");
        } else if (list.size() < last) {
            last = list.size();
        }

        Page<Item> page = new PageImpl<>(list.subList(first, last), pageable, list.size());

        return page;
    }
}
