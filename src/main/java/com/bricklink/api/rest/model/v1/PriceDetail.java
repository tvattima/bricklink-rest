package com.bricklink.api.rest.model.v1;

public class PriceDetail {
    private Integer quantity; // The number of the items in the inventory
    private Double unit_price; // Point Number	The original price of this item per sale unit
    private String seller_country_code; // The country code of the seller's location	ISO 3166-1 alpha-2 (exception: UK instead of GB)
    private String buyer_country_code; // The country code of the buyer's location	ISO 3166-1 alpha-2 (exception: UK instead of GB)
    private String date_ordered; // The time the order was created

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    public String getSeller_country_code() {
        return seller_country_code;
    }

    public void setSeller_country_code(String seller_country_code) {
        this.seller_country_code = seller_country_code;
    }

    public String getBuyer_country_code() {
        return buyer_country_code;
    }

    public void setBuyer_country_code(String buyer_country_code) {
        this.buyer_country_code = buyer_country_code;
    }

    public String getDate_ordered() {
        return date_ordered;
    }

    public void setDate_ordered(String date_ordered) {
        this.date_ordered = date_ordered;
    }

    @Override
    public String toString() {
        return "PriceDetail{" +
                "quantity=" + quantity +
                ", unit_price=" + unit_price +
                ", seller_country_code='" + seller_country_code + '\'' +
                ", buyer_country_code='" + buyer_country_code + '\'' +
                ", date_ordered='" + date_ordered + '\'' +
                '}';
    }
}
