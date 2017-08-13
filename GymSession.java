import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GymSession extends ExerciseSession{
	private HashMap<String,Length> machines ;

	public GymSession(String type, String place) {
		super(type, place);
		machines = new HashMap<String,Length>(8);
	}
	
	 public void addMachine(String name, Length length){
		 machines.put(name, length);
	 }
	 public static void main(String[] args) {
		List<String> caesar = new ArrayList<String>();
		caesar.add("caesar");
		caesar.add("caesar1");
		caesar.add("caesar2");
		caesar.add("caesar3");
			
			
			for(String str:caesar){
				System.out.println(str);
			}
	}
	@Override
	public String toString() {
		
		String output = "";
		output += super.toString()+"\n";
		output +="Machines:"+"\n";
		for(String str: machines.keySet()){
			output+= str+" "+machines.get(str)+"\n";
		}
		return "GymSession [machines=" + machines + "]";
	}
	
}
