package com.bricklink.api.rest.model.v1;

public class SupersetEntryDetail {
    private Item item;
    private Integer quantity;
    private String appear_as;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getAppear_as() {
        return appear_as;
    }

    public void setAppear_as(String appear_as) {
        this.appear_as = appear_as;
    }

    @Override
    public String toString() {
        return "SupersetEntry{" +
                ", item=" + item +
                ", quantity=" + quantity +
                ", appear_as='" + appear_as + '\'' +
                '}';
    }
}
