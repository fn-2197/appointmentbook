package peopleinhetirance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class apointmenttester {
	
	public static void main(String[] args) {
		Appointment o = new Onetime();
		Appointment m = new monthly();
		Appointment a = new Appointment();
		Appointment d = new daily();
		for(boolean c = true; c == true;){
			Scanner kb = new Scanner(System.in);
			System.out.println("Welcome to you calender!  Type \"1\" to add an appointment, \"2\" to check you calender on a day, or \"3\" to exit.");
			int i = kb.nextInt();
			switch(i){
			case 1:
				System.out.println("\"1\" for new one time appointment, \"2\" for new Monthly appointment, \"3\" for new daily appointment.");
				int ii = kb.nextInt();
				switch(ii){
				case 1:
					System.out.println("Type the Date in month day year format, then a brief description of the event.");
					int da = kb.nextInt();
					int mo = kb.nextInt();
					int ye = kb.nextInt();
					String des = kb.next();
					((Onetime) o).add(mo-1, da-1, ye-2016, des);
					break;
			case 2:
				System.out.println("Type the day of the appointment, then a brief description");
				int moi = kb.nextInt();
				String desi = kb.next();
				((monthly) m).add(moi-1, desi);
				break;
			case 3:
				System.out.println("Type a brief description of the event:");
				String desii = kb.next();
				((daily) d).add(desii);
				break;
				
			}
				break;
			case 2:
				System.out.println("Type the day , month, then year");
				int da = kb.nextInt();
				int mo = kb.nextInt();
				int ye = kb.nextInt();
				System.out.println(a.calander[mo-1][da-1][ye-2016] + m.calander[mo-1][da-1][ye-2016] + d.calander[mo-1][da-1][ye-2016] + o.calander[mo-1][da-1][ye-2016]);
				break;
			case 3:
				c = false;
				break;
		}

	}

}
	public void save(String path) throws IOException{
		Appointment a = new Appointment();
		FileWriter fw = new FileWriter(path);
		PrintWriter output = new PrintWriter(fw);
		for(int iii = 0; iii <501; iii++){
			for(int i = 0; i < 12; i++){
				for(int ii = 0; ii < 31; ii++){
		output.println(a.calander[i][ii][iii]);
	}}}
	output.close();
	fw.close();
	
	}
	public void load(String path) throws IOException{
		Appointment a = new Appointment();
		Scanner sf = new Scanner(new File(path));

		for(int iii = 0; iii <501; iii++){
			for(int i = 0; i < 12; i++){
				for(int ii = 0; ii < 31; ii++){
					a.calander[i][ii][iii] = sf.nextLine();
					
	}}}}
}