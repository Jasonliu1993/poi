package com.jwebcoder.poi;

import com.jwebcoder.poi.poisax.model.Cell;

import java.util.List;

public interface IRowReader {

    /**业务逻辑实现方法
     * @param sheetIndex
     * @param curRow
     * @param rowlist
     */
    public  void getRows(int sheetIndex,int curRow, List<Cell> rowlist);
}