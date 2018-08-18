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
        Bedroom bedroom = new Bedroom("Tim's bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
    }
}

