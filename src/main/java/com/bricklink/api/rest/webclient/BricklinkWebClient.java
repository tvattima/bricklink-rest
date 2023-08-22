package com.bricklink.api.rest.webclient;

import com.bricklink.api.rest.client.BricklinkRestClient;
import com.bricklink.api.rest.model.v1.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Slf4j
public class BricklinkWebClient implements BricklinkRestClient {
    private final WebClient webClient;
    @Override
    public BricklinkResource<Item> getCatalogItem(String type, String no) {
        return null;
    }

    @Override
    public BricklinkResource<PriceGuide> getPriceGuide(String type, String no, Map<String, Object> params) {
        return null;
    }

    @Override
    public BricklinkResource<List<SubsetEntry>> getSubsets(String type, String no, Map<String, Object> params) {
        return null;
    }

    @Override
    public BricklinkResource<List<Inventory>> getInventories(Map<String, Object> params) {
        return null;
    }

    @Override
    public BricklinkResource<List<Order>> getOrders(Map<String, Object> params, Iterable status) {
        return null;
    }

    @Override
    public BricklinkResource<List<Order>> getOrders(Map<String, Object> params) {
        return null;
    }

    @Override
    public BricklinkResource<Order> getOrder(String orderId) {
        return null;
    }

    @Override
    public BricklinkResource<List<List<OrderItem>>> getOrderItems(String orderId) {
        return null;
    }

    @Override
    public BricklinkResource<Inventory> getInventories(Long inventoryId) {
        return null;
    }

    @Override
    public BricklinkResource<Inventory> createInventory(Inventory inventory) {
        return null;
    }

    @Override
    public BricklinkResource<Inventory> updateInventory(Long inventoryId, Inventory inventory) {
        return null;
    }

    @Override
    public BricklinkResource<Order> updateOrder(String orderId, Order order) {
        return null;
    }

    @Override
    public BricklinkResource<Inventory> updateOrderStatus(String orderId, OrderStatus status) {
        return null;
    }

    @Override
    public BricklinkResource<Void> sendDriveThru(String orderId, boolean mailMe) {
        return null;
    }

    @Override
    public BricklinkResource<List<Category>> getCategories() {
        return null;
    }

    @Override
    public BricklinkResource<Category> getCategory(Long categoryId) {
        return null;
    }

    @Override
    public BricklinkResource<List<Color>> getColors() {
        return null;
    }

    @Override
    public BricklinkResource<Color> getColor(Integer colorId) {
        return null;
    }

    @Override
    public BricklinkResource<List<ItemMapping>> getItemMapping(String no, Integer colorId) {
        return null;
    }
}
