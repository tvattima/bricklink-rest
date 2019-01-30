package com.bricklink.api.rest.model.v1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Inventory {
    private Long inventory_id;
    private Item item;
    private Integer color_id;
    private String color_name;
    private Integer quantity;
    private String new_or_used;
    private String completeness;
    private Double unit_price;
    private Integer bind_id;
    private String description;
    private String remarks;
    private Integer bulk;
    private Boolean is_retain;
    private Boolean is_stock_room;
    private String stock_room_id;
    private String date_created;
    private Double my_cost;
    private Integer sale_rate;
    private Integer tier_quantity1;
    private Integer tier_quantity2;
    private Integer tier_quantity3;
    private Double tier_price1;
    private Double tier_price2;
    private Double tier_price3;
    private Double my_weight;
}
