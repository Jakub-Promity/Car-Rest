package com.promity.recruit.rest_cars.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@Builder
public class Car implements Serializable {
//    private static final long serialVersionUID = 1L;

    @Id
    @CsvBindByPosition(position=0)
    private int id;
    @CsvBindByPosition(position=1)
    private String brand;
    @CsvBindByPosition(position=2)
    private String purchaseDate;
    @CsvBindByPosition(position=3)
    private String color;

    public Car(int id, String brand, String purchaseDate, String color) {
        this.id = id;
        this.brand = brand;
        this.purchaseDate = purchaseDate;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car [" +
                "id=" + id +
                ", brand=" + brand +
                ", purchaseDate=" + purchaseDate +
                ", color=" + color +
                ']';
    }
}
