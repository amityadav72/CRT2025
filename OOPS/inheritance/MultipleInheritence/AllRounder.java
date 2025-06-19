package CRT2025.OOPS.inheritance.MultipleInheritence;

public class AllRounder implements Bowler, Batsman {

   // @Override
    public void bat() {
        System.out.println("Batting");
    }

    //@Override
    public void bowl() {
        System.out.println("Bowling");
    }
}
