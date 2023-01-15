package it.develhope.override;

import java.util.Objects;

public class Smartphone implements Cloneable {
	public String brandName;
	public String modelName;
	public int batterymAh;
	public SmartphonePrice producerPrice;
	public SmartphonePrice retailPrice;

	@Override
	public String toString() {
		return "Brand: " + brandName + " | Model: " + modelName + " | " + producerPrice + " | " + retailPrice;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Smartphone that = (Smartphone) o;
		return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public Smartphone clone() {
		try {
			return (Smartphone) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

	public Smartphone(String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP) {
		this.brandName = brand;
		this.modelName = model;
		this.batterymAh = battery;
		this.producerPrice = prodP;
		this.retailPrice = retailP;
	}
}
