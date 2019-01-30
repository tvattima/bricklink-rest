package com.bricklink.api.rest.support;

public class BricklinkResource<T> {
    private BricklinkMeta meta;
    private T data;

    public BricklinkMeta getMeta() {
        return meta;
    }

    public void setMeta(BricklinkMeta meta) {
        this.meta = meta;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BricklinkResource{" +
                "meta=" + meta +
                ", data=" + data +
                '}';
    }
}
