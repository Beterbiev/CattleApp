package com.example.cattleapp;

import java.io.Serializable;

public class ListElement implements Serializable {
    public String name;
    public String eartag;
    public String herd;

    public ListElement(String name, String eartag, String herd) {
        this.name = name;
        this.eartag = eartag;
        this.herd = herd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEartag() {
        return eartag;
    }

    public void setEartag(String eartag) {
        this.eartag = eartag;
    }

    public String getHerd() {
        return herd;
    }

    public void setHerd(String herd) {
        this.herd = herd;
    }
}
