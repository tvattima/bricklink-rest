package com.bricklink.api.rest.client;

import com.bricklink.api.rest.model.v1.*;
import feign.*;

import java.util.List;
import java.util.Map;

public interface BricklinkRestClient {
    @RequestLine("GET /items/{type}/{no}")
    BricklinkResource<Item> getCatalogItem(@Param("type") String type, @Param("no") String no);

    @RequestLine("GET /items/{type}/{no}/price?color_id={colorId}&guide_type={guideType}&new_or_used={new_or_used}&country_code={country_code}&region={region}&currency_code={currency_code}&vat={vat}")
    BricklinkResource<PriceGuide> getPriceGuide(@Param("type") String type, @Param("no") String no, @QueryMap Map<String, Object> params);

    @RequestLine("GET /items/{type}/{no}/subsets?"+
                    "color_id={colorId}&"+
                    "box={box}&"+
                    "instruction={instruction}&"+
                    "break_minifigs={break_minifigs}&"+
                    "break_subsets={break_subsets}")
    BricklinkResource<List<SubsetEntry>> getSubsets(@Param("type") String type, @Param("no") String no, @QueryMap Map<String, Object> params);

    @RequestLine("GET /inventories?" +
                    "item_type={itemType}&"+
                    "status={status}&"+
                    "category_id={categoryId}&"+
                    "color_id={colorId}")
    BricklinkResource<List<Inventory>> getInventories(@QueryMap Map<String, Object> params);

    @RequestLine("GET /orders?" +
            "direction={direction}&"+
            "status={status}&"+
            "fileid={fileId}")
    BricklinkResource<List<Order>> getOrders(@QueryMap Map<String, Object> params);

    @RequestLine("GET /orders/{order_id}")
    BricklinkResource<Order> getOrder(@Param("order_id") String orderId);

    @RequestLine("GET /orders/{order_id}/items")
    BricklinkResource<List<List<OrderItem>>> getOrderItems(@Param("order_id") String orderId);

    @RequestLine("GET /inventories/{inventory_id}")
    BricklinkResource<Inventory> getInventories(@Param("inventory_id") Long inventoryId);

    @RequestLine("POST /inventories")
    @Headers("Content-Type: application/json")
    BricklinkResource<Inventory> createInventory(Inventory inventory);

    @RequestLine("PUT /inventories/{inventory_id}")
    @Headers("Content-Type: application/json")
    @Body("{inventory}")
    BricklinkResource<Inventory> updateInventory(@Param("inventory_id") Long inventoryId, Inventory inventory);

    @RequestLine("GET /categories")
    BricklinkResource<List<Category>> getCategories();


    @RequestLine("GET /categories/{category_id}")
    BricklinkResource<Category> getCategory(@Param("category_id") Long categoryId);

    @RequestLine("GET /colors")
    BricklinkResource<List<Color>> getColors();

    @RequestLine("GET /colors/{color_id}")
    BricklinkResource<Color> getColor(@Param("color_id") Integer colorId);

    @RequestLine("GET /item_mapping/part/{no}?color_id={color_id}")
    BricklinkResource<List<ItemMapping>> getItemMapping(@Param("no") String no, @Param("color_id") Integer colorId);
}