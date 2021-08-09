package com.epam.engx.cleancode.naming.task6;

public class Formatter {

    private static final String LINE_SEPARATOR = "\n";
	private static final String EDGE_SYMBOL = "+";
    private static final String VERTICAL_SYMBOL = "|";
    private static final String HORIZONTAL_SYMBOL = "-";
    private static final String UNDERSCORE = " _ ";


    public String formatKeyValue(String key, String value) {
        String content = key + UNDERSCORE + value;
        String minuses = generateHorizontalBorder(HORIZONTAL_SYMBOL, content.length());
        return EDGE_SYMBOL +  minuses + EDGE_SYMBOL + LINE_SEPARATOR
                + VERTICAL_SYMBOL + content + VERTICAL_SYMBOL + LINE_SEPARATOR
                + EDGE_SYMBOL + HORIZONTAL_SYMBOL + EDGE_SYMBOL + LINE_SEPARATOR;
    }

    private String generateHorizontalBorder(String symbol, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++)
        	result.append(symbol);
        return result.toString();
    }
}
