public class PartyAffiliation {
    public static void main(String[] args)
    {
        String party = "d"; //[D,R,I,Other]

        if (party.equalsIgnoreCase("D"))
        {
            System.out.println("You get: A Democratic Donkey!");
        }
        else if (party.equalsIgnoreCase("R"))
        {
            System.out.println("You get: A Republican Elephant!");
        }
        else if (party.equalsIgnoreCase("I"))
        {
            System.out.println("You get: An Independent Person!");
        }
        else //other
        {
            System.out.println("You get: Other.");
        }
    }
}