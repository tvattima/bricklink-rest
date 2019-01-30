package com.bricklink.api.rest.model.v1;

public class SubsetEntryDetail {
    private Item item;
    private Integer color_id; // The ID of the color of the item
    private Integer quantity; // The number of items that are included in
    private Integer extra_quantity; // The number of items that are appear as "extra" item
    private String is_alternate; // Indicates that the item is appear as "alternate" item in this specified item

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getColor_id() {
        return color_id;
    }

    public void setColor_id(Integer color_id) {
        this.color_id = color_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getExtra_quantity() {
        return extra_quantity;
    }

    public void setExtra_quantity(Integer extra_quantity) {
        this.extra_quantity = extra_quantity;
    }

    public String getIs_alternate() {
        return is_alternate;
    }

    public void setIs_alternate(String is_alternate) {
        this.is_alternate = is_alternate;
    }

    @Override
    public String toString() {
        return "SubsetEntryDetail{" +
                "item=" + item +
                ", color_id=" + color_id +
                ", quantity=" + quantity +
                ", extra_quantity=" + extra_quantity +
                ", is_alternate='" + is_alternate + '\'' +
                '}';
    }
}
