package com.example.marvel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private Object data;

    public Quote() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /*@Override
    public String toString() {
        return "Quote{" +
                "data='" + data + '\'' +
                ", value=" + value +
                '}';
    }*/
}