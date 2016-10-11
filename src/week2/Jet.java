package week2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Jet implements Comparator<Jet>  {
	// attributes
	private String model;
	private float mph;
	private long price;
	private int range;
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
		this.ma=convertToMach(mph);

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

	public Integer getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public static float convertToMach(float mph) {
		float ma = mph / 760.5583392985f;
		return ma;
    	}  

	//toString
	@Override
	public String toString() {
		return "Jet [model=" + model + ", mph=" + mph + ", price=" + price + ", range=" + range + ", ma=" + ma + "]";
	}

	@Override
	public int compare(Jet o1, Jet o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
