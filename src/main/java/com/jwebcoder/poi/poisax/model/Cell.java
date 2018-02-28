package com.jwebcoder.poi.poisax.model;

public class Cell {

    private CellDataType type;
    private String value;

    public Cell(CellDataType type, String value) {
        this.type = type;
        this.value = value;
    }

    public CellDataType getType() {
        return type;
    }

    public void setType(CellDataType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "type=" + type.toString() +
                ", value='" + value + '\'' +
                '}';
    }
}
