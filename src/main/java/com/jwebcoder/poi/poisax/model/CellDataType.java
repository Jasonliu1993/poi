package com.jwebcoder.poi.poisax.model;

public enum CellDataType {
    isString(1,"是字符串"),
    Null(2,"没有填值"),//例如：<c r="K4" s="9"/>
    NonString(3,"空字符串"),//例如：<c r="A6" s="2" t="s"> <v>18</v> </c>
    ;

    private int flag;
    private String desc;

    CellDataType(int flag, String desc) {
        this.flag = flag;
        this.desc = desc;
    }

    public int getFlag() {
        return flag;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "CellDataType{" +
                "flag=" + flag +
                ", desc='" + desc + '\'' +
                '}';
    }
}
