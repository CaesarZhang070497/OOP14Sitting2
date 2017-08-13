import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Length {
	private int number;
	private String units;
	public Length() {
		this.number = 0;
		this.units = "km";
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		if(number>0){
		this.number = number;
		}
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		if( units.equals("km")||units.equals("miles")||units.equals("minutes")){
			this.units = units;
		}
	}
	
	public void convert(String newUnits, double rate){
		if( newUnits.equals("km")||newUnits.equals("miles")||newUnits.equals("minutes")){
			number = (int) ((number+0.5)/rate);
		}
	}
	
	public String toString(){
		return number + " "+ units;
	}
	
	public static void main(String[] args) {
		Integer[] a ={1,2,3,4,5};
		List<Integer> a1 =  Arrays.asList(a);
		
	}
}
	 
	
