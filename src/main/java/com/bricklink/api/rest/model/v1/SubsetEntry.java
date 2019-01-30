package com.bricklink.api.rest.model.v1;

import java.util.List;

public class SubsetEntry {

    private Integer match_no;
    private List<SubsetEntryDetail> entries;

    public Integer getMatch_no() {
        return match_no;
    }

    public void setMatch_no(Integer match_no) {
        this.match_no = match_no;
    }

    public List<SubsetEntryDetail> getEntries() {
        return entries;
    }

    public void setEntries(List<SubsetEntryDetail> entries) {
        this.entries = entries;
    }

    @Override
    public String toString() {
        return "SubsetEntry{" +
                "match_no=" + match_no +
                ", entries=" + entries +
                '}';
    }
}
