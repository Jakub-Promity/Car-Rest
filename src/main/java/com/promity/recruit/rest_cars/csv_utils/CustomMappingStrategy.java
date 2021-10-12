package com.promity.recruit.rest_cars.csv_utils;

import com.opencsv.bean.ColumnPositionMappingStrategy;

public class CustomMappingStrategy<T> extends ColumnPositionMappingStrategy<T> {
    private static final String[] HEADER = new String[]{"id", "brand", "purchaseDate", "color"};

    public String[] generateHeader() {
        return HEADER;
    }
}
