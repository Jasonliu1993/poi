package com.jwebcoder;

import com.jwebcoder.poi.poisax.Excel2007Reader;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {

    @Test
    public void testApp() {
        Excel2007Reader excel2007Reader = new Excel2007Reader();
        System.out.println(excel2007Reader.getCurRow("AA56"));
        System.out.println(excel2007Reader.getCurColumn("ABA123"));



    }
}
