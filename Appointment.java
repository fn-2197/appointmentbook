package peopleinhetirance;

public class Appointment {
public int type;
public String description;
public String calander[][][] = new String [12][31][5000];
	public Appointment(){

	for(int iii = 0; iii <501; iii++){
		for(int i = 0; i < 12; i++){
			for(int ii = 0; ii < 30; ii++){
				calander[i][ii][iii] = "";
			}
		}
	}
}

}
