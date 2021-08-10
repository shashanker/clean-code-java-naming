package com.epam.engx.cleancode.naming.task6;

public class Formatter {

    private static final String LINE_SEPARATOR = "\n";
	private static final String EDGE_SYMBOL = "+";
    private static final String VERTICAL_SYMBOL = "|";
    private static final String HORIZONTAL_SYMBOL = "-";
    private static final String DELIMITER = " _ ";


    public String formatKeyValue(String key, String value) {
        String content = key + DELIMITER + value;
        String horizantalBorder = generateHorizontalBorder(content.length());
        return EDGE_SYMBOL +  horizantalBorder + EDGE_SYMBOL + LINE_SEPARATOR
                + VERTICAL_SYMBOL + content + VERTICAL_SYMBOL + LINE_SEPARATOR
                + EDGE_SYMBOL + horizantalBorder + EDGE_SYMBOL + LINE_SEPARATOR;
    }

    private String generateHorizontalBorder(int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
        	result.append(HORIZONTAL_SYMBOL);
        }
        	
        return result.toString();
    }
}
