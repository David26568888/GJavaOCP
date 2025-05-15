package day05;

import java.util.Arrays;

public class CarToy {
	private String name;
	private int price;
	private Wheel[] wheels;
	private Battery battery;
	
	public CarToy(String name, int price, Wheel[] wheels, Battery battery) {
		this.name = name;
		this.price = price+battery.getPrice();
		this.wheels= wheels;
		this.battery = battery;
		
		//加入輪胎的價格
		if(wheels !=null&& wheels.length>0) {
			for(Wheel wheel : wheels) {
				this.price+=wheel.getPrice();
			}
		}
	}
	

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public Battery getBattery() {
		return battery;
	}
	
	public String toString() {
		return String.format("CarToy name:%s price:%d, battery:%s wheels:%s",name,
				price,battery,Arrays.toString(wheels));
	}

	
}
