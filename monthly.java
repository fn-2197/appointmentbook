package peopleinhetirance;

public class monthly extends Appointment{
public void add(int d, String des){	
	for(int iii = 0; iii <501; iii++){
		for(int i = 0; i < 12; i++){
			super.calander[i][d][iii] += "  /  " + des;
}}}}
