package it.develhope.override;

import java.util.Objects;

public class SmartphonePrice implements Cloneable {
	public  String  priceType;
	public double priceInEuros;
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SmartphonePrice that = (SmartphonePrice) o;
		return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(priceType, priceInEuros);
	}

	@Override
	public String toString() {
		return "Price type: "+priceType+" | Price in Euros: "+priceInEuros;
	}

	@Override
	public SmartphonePrice clone() {
		try {
			return (SmartphonePrice) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
	public SmartphonePrice(String type, double price){
		this.priceType=type;
		this.priceInEuros=price;
	}
}
