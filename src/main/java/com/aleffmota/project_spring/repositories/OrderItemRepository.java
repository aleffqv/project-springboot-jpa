package com.aleffmota.project_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.aleffmota.project_spring.entities.OrderItem;
import com.aleffmota.project_spring.entities.pk.OrderItemPK;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
