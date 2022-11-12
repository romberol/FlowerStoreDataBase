package ua.edu.ucu.apps.demo.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.demo.Item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Entity
@Table
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Flower extends Item {
    @Id @GeneratedValue
    private int id;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flType;

    @Override
    public double price() {
        return this.price;
    }
}
