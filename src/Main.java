import it.develhope.override.*;
public class Main {
	public static void main(String[] args) {
		//producer prices
		SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 800);
		SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 900);
		//retail prices
		SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 1000);
		SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 1100);
		//smartphone
		Smartphone s1= new Smartphone("Samsung", "S1", 3000, producerPrice1, retailPrice1);
		Smartphone s2= new Smartphone("Huawei", "P1", 3200, producerPrice2, retailPrice2);
		Smartphone s3;
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.modelName + " is equal to "+s2.modelName+"? "+s1.equals(s2));
		try{
			s3=s1.clone();
			System.out.println(s1.modelName + " is equal to "+s3.modelName+"? "+s1.equals(s3));
		}catch (Exception exception){
			exception.printStackTrace();
			System.out.println("Error");
		}

	}
}