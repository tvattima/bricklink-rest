package com.bricklink.api.rest.model.v1;

import java.util.List;

public class SupersetEntry {
    private Integer color_id;
    private List<SupersetEntryDetail> entries;

    public Integer getColor_id() {
        return color_id;
    }

    public void setColor_id(Integer color_id) {
        this.color_id = color_id;
    }

    public List<SupersetEntryDetail> getEntries() {
        return entries;
    }

    public void setEntries(List<SupersetEntryDetail> entries) {
        this.entries = entries;
    }

    @Override
    public String toString() {
        return "SupersetEntry{" +
                "color_id=" + color_id +
                ", entries=" + entries +
                '}';
    }
}
