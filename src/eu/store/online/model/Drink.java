package eu.store.online.model;

import eu.store.online.model.enumeration.Country;
import eu.store.online.model.enumeration.Producer;
import eu.store.online.model.enumeration.Package;
import java.math.BigDecimal;

public abstract class Drink {

    private String name;
    private BigDecimal price;
    private Float weight;
    private Producer producer;
    private Country country;
    private Package aPackage;

    private String getName(){
        return this.name;
    }

    private void setName(String name){
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }
}
