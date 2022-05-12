package com.devskiller.dao;

import com.devskiller.model.Item;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class ItemRepository {

  @PersistenceContext
  EntityManager entityManager;

  public Page<Item> findItems(PageRequest pageRequest) {
    // TODO: Implement me
    return new Page<>(new ArrayList<>(), 0, 0);
  }

  public List<Item> findItemsWithAverageRatingLowerThan(Integer rating) {
    // TODO: Implement me
    return new ArrayList<>();
  }

}
