package com.zjy.springbootemps.utils;

import java.util.List;

public class PageInfo<T> {
    private List<?> data;
    private Integer count;

    public PageInfo(List<?> data, Integer count) {
        this.data = data;
        this.count = count;
    }

    public PageInfo() {
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
