package com.jwebcoder;

import com.jwebcoder.poi.poisax.ExcelReaderUtil;
import com.jwebcoder.poi.IRowReader;
import com.jwebcoder.poi.RowReader;

/**

 */
public class App {
    public static void main(String[] args) throws Exception {
        IRowReader reader = new RowReader();
        //ExcelReaderUtil.readExcel(reader, "F://te2003.xls");
        ExcelReaderUtil.readExcel(reader, "C:\\Files\\Workspace\\CNV - 01 EE2M1.xlsx");
    }

}