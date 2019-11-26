package cz.auto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Auto")
public class Auto {

    @Column(name = "Power")
    private String power;

    @Column(name = "Colour")
    private String colour;

    @Column(name = "Model")
    private String model;

    @Column(name = "Make")
    private String make;

    @Id
    @Column(name = "ID")
    private int id;

    public Auto() {
    }

    public Auto(String make, String model, String colour, String power, int id) {
        this.power = power;
        this.colour = colour;
        this.model = model;
        this.make = make;
        this.id = id;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
