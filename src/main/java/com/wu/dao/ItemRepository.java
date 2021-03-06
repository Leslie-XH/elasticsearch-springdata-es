package com.wu.dao;


import com.wu.domain.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ItemRepository extends ElasticsearchRepository<Item,Long> {


    List<Item> findByPriceBetween(double price1, double price2);

}