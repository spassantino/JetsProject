package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Jet implements Comparable<Jet>  {
	// attributes
	private String model;
	private float mph;
	private long price;
	private static int range;
	private float ma;
	ArrayList<Jet> fleet = new ArrayList<Jet>();

	// constructors
	public Jet() {

	}

	public Jet(String model, float mph, long price, int range) {
		this.model = model;
		this.mph = mph;
		this.price = price;
		this.range = range;
	}

	public Jet(String model, float mph, long price, int range, float ma) {
		this.model = model;
		this.mph = mph;
		this.price = price;
		this.range = range;
		ma = mph * 760.5583392985f;

	}
	//getters and setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getMph() {
		return mph;
	}

	public void setMph(float mph) {
		this.mph = mph;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public static int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public void convertToMach(float mph) {
		float ma = this.mph * 760.5583392985f;
		
	}
    @Override
    public int compareTo(Jet o) {
		return 0;
         

    }

	//toString
	@Override
	public String toString() {
		return "Jet [model=" + model + ", mph=" + mph + ", price=" + price + ", range=" + range + ", ma=" + ma + "]";
	}
}
