package CRT2025.OOPS.inheritance.MultipleInheritence;

public class main {
    public static void main(String[] args) {

        Player obj = new Player() {

            public void play() {
                System.out.println("Player is playing.");
            }


            public void bat() {
                System.out.println("Anonymous Player is batting.");
            }

            public void bowl() {
                System.out.println("Anonymous Player is bowling.");
            }
        };

        obj.bat();
        obj.bowl();
        obj.play();
    }
}
