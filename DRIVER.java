package ie.nuigalway.hughcaulfield.Assignment1Driver.A1Driver;

import java.util.ArrayList;
import org.joda.time.*;
import ie.nuigalway.hughcaulfield.Assignment1.*;

public class DRIVER {
	
	public static void main( String[] args )
    {
		
		LocalDate start, end; 
		
		start = new LocalDate (2017, 9, 5);
		end = new LocalDate (2021, 5, 20);
		
		//students
		Student hugh = new Student("Hugh Caulfield", "22", new DateTime(1995, 10, 6,0, 0), "14394336");
		Student mark = new Student("Mark Sheridan", "21", new DateTime(1995, 12, 9,0, 0), "14394336");
		Student brian = new Student("Brian O'Dowd", "22", new DateTime(1995, 2, 15,0, 0), "14394336");
		Student karen = new Student("Karen Ryan", "23", new DateTime(1994, 10, 27,0, 0), "14394336");
		Student paul = new Student("Paul O'Sullivan", "20", new DateTime(1997, 6, 2,0, 0), "14394336");
		Student aidan = new Student("Aidan Geraghty", "19", new DateTime(1998, 3, 3,0, 0), "14394336");
		Student tom = new Student("Tom Byrne", "20", new DateTime(1997, 9, 8,0, 0), "14394336");
		Student ryan = new Student("Ryan Loftus", "21", new DateTime(1996, 4, 1,0, 0), "14394336");
		Student caoimhe = new Student("Caoimhe Traynor", "22", new DateTime(1995, 5, 10,0, 0), "14394336");
		
		
		ArrayList<Student> Software1 = new ArrayList<Student>();
		Software.add(hugh);
		Software.add(mark);
		Software.add(brian);
		
		ArrayList<Student> Physics1 = new ArrayList<Student>();
		Physics.add(karen);
		Physics.add(paul);
		Physics.add(aidan);
		
		ArrayList<Student> French1 = new ArrayList<Student>();
		French.add(tom);
		French.add(ryan);
		French.add(caoimhe);
		
		Module Software = new Module("Software", "CT417", Software1);
		Module Physics = new Module("Physics", "PH123", Physics1);
		Module French = new Module("French", "FR321", French1);
		
		ArrayList<Module> EngMod = new ArrayList<Module>();
		EngMod.add(Software);
		
		ArrayList<Module> SciMod = new ArrayList<Module>();
		SciMod.add(Physics);
		
		ArrayList<Module> ArtsMod = new ArrayList<Module>();
		ArtsMod.add(French);
		
		Course Eng = new Course("Engineering", start, end, EngMod);
		Course Sci = new Course("Science", start, end, SciMod);
		Course Arts = new Course("Arts", start, end, ArtMod);
		
		ArrayList<Courses> course = new ArrayList<Courses>();
		course.add(Eng);
		course.add(Sci);
		course.add(Arts);
    }
	
	public static void StudentInfo(){
		
		for(int i = 0; i < course; i++){
			
			for (int j = 0; j < course.get(i).getStudents; j++){
				
				String details = course.get(i).getStudents;
				System.out.println(details);				
			}
		}
		
		
		
		
		
		
		
		
		
		
    }

}
