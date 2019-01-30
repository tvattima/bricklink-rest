package com.bricklink.api.rest.model.v1;

import java.util.List;

public class PriceGuide {
    private Item item; // An object representation of the item
    private String new_or_used; // Indicates whether the price guide is for new or used	N: New, U: Used
    private String currency_code; // The currency code of the price
    private Double min_price; // The lowest price of the item (in stock / that was sold for last 6 months )
    private Double max_price; // The highest price of the item (in stock / that was sold for last 6 months )
    private Double avg_price; // The average price of the item (in stock / that was sold for last 6 months )
    private Double qty_avg_price; // The average price of the item (in stock / that was sold for last 6 months ) by quantity
    private Integer unit_quantity; // The number of times the item has been sold for last 6 months; The number of inventories that include the item
    private Integer total_quantity; // The number of items has been sold for last 6 months; The total number of the items in stock
    private List<PriceDetail> price_detail; // A list of objects that represent the detailed information of the price

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getNew_or_used() {
        return new_or_used;
    }

    public void setNew_or_used(String new_or_used) {
        this.new_or_used = new_or_used;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public Double getMin_price() {
        return min_price;
    }

    public void setMin_price(Double min_price) {
        this.min_price = min_price;
    }

    public Double getMax_price() {
        return max_price;
    }

    public void setMax_price(Double max_price) {
        this.max_price = max_price;
    }

    public Double getAvg_price() {
        return avg_price;
    }

    public void setAvg_price(Double avg_price) {
        this.avg_price = avg_price;
    }

    public Double getQty_avg_price() {
        return qty_avg_price;
    }

    public void setQty_avg_price(Double qty_avg_price) {
        this.qty_avg_price = qty_avg_price;
    }

    public Integer getUnit_quantity() {
        return unit_quantity;
    }

    public void setUnit_quantity(Integer unit_quantity) {
        this.unit_quantity = unit_quantity;
    }

    public Integer getTotal_quantity() {
        return total_quantity;
    }

    public void setTotal_quantity(Integer total_quantity) {
        this.total_quantity = total_quantity;
    }

    public List<PriceDetail> getPrice_detail() {
        return price_detail;
    }

    public void setPrice_detail(List<PriceDetail> price_detail) {
        this.price_detail = price_detail;
    }

    @Override
    public String toString() {
        return "PriceGuide{" +
                "item=" + item +
                ", new_or_used='" + new_or_used + '\'' +
                ", currency_code='" + currency_code + '\'' +
                ", min_price=" + min_price +
                ", max_price=" + max_price +
                ", avg_price=" + avg_price +
                ", qty_avg_price=" + qty_avg_price +
                ", unit_quantity=" + unit_quantity +
                ", total_quantity=" + total_quantity +
                ", price_detail=" + price_detail +
                '}';
    }
}
