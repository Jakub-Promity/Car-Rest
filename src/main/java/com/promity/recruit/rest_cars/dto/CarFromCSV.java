package com.promity.recruit.rest_cars.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
public class CarFromCSV implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String brand;
    private String purchaseDate;
    private String color;


    @Override
    public String toString() {
        return "Car [" +
                "id=" + id +
                ", brand='" + brand +
                ", purchaseDate=" + purchaseDate +
                ", color='" + color +
                ']';
    }
}
