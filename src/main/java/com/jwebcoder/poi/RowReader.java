package com.jwebcoder.poi;

import com.jwebcoder.poi.poisax.model.CellDataType;
import com.jwebcoder.poi.poisax.model.Cell;

import java.util.List;

public class RowReader implements IRowReader {


    /* 业务逻辑实现方法
     * @see com.eprosun.util.excel.IRowReader#getRows(int, int, java.util.List)
     */
    public void getRows(int sheetIndex, int curRow, List<Cell> rowlist) {
        // TODO Auto-generated method stub
        System.out.print(curRow+" ");
        for (int i = 0; i < rowlist.size(); i++) {
            if (rowlist.get(i).getType().getFlag() == CellDataType.isString.getFlag())
                System.out.print(rowlist.get(i).getValue() + " ");
            else
                System.out.print("NULL");
        }
        System.out.println();
    }

}

