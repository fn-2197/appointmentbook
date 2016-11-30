package peopleinhetirance;

public class Onetime extends Appointment{
	public int month;
	public int day;
	public int year;
public Onetime(){
	}
public void add(int d, int m, int y, String des){
	super.calander[m][d][y] += "  /  " + des;
}
}
