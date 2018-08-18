package TimsChallengeCode;

public class Main {

    public static void main(String[] args) {
        /* The goal is to create a single room in a house using composition
	think about what should be included in the room
	maybe physical parts of the house but furniture as well
	Add at least one method to access an object via getter and then
	that object public method as you saw in the previous project
	then add at least one method to hide the object i.e. not using a getter
	but to access the object used in composition within the main class
	 */
        //Variables needed for initializing the bedroom
        Wall wall1 = new Wall("Front");
        Wall wall2 = new Wall("Back");
        Wall wall3 = new Wall("Left");
        Wall wall4 = new Wall("Right");
        Ceiling ceiling = new Ceiling(3, 1);
        Bed bed = new Bed("Classic", 3, 1, 1, 1);
        Lamp lamp = new Lamp("Modern", false, 5);
        //finally creating the bedroom
        Bedroom bedroom = new Bedroom("Tim's bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        //same as:
        bedroom.getBed().make();
    }
}

