package com.jwebcoder.poi.utilities;

public class HexConversionUtility {

    public static int convertToDecimalSystem(String TwentySixHexadecimal) {
        int rowNum = 0;
        char[] chars = TwentySixHexadecimal.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            rowNum = rowNum + (chars[i] - 64) * getBasicNumber(chars, i);
        }

        return rowNum;
    }

    public static int getBasicNumber(char[] chars, int index) {
        int basicNumber = 1;

        for (int i = chars.length - 1; i > index; i--) {
            basicNumber = basicNumber * 26;
        }

        return basicNumber;
    }

}
