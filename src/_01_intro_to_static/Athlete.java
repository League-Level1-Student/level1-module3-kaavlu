package _01_intro_to_static;

public class Athlete {

    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed, int bibNumber){
        this.name = name;
        this.speed = speed;
        this.bibNumber = bibNumber;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	Athlete athlete1 = new Athlete("John", 10, 1);
    	Athlete athlete2 = new Athlete("Juan", 20, 2);

    	System.out.println(athlete1.name);
    	System.out.println(athlete2.name);
    	System.out.println(athlete1.bibNumber);
    	System.out.println(athlete2.bibNumber);
    	System.out.println(raceLocation);
    }
}