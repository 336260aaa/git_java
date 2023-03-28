package Javaassignment;

public class TestGameRole {
    public static void main(String[] args) {
        GameRole g1 = new GameRole();
        GameRole g2 = new GameRole("张飞");
        GameRole g3 = new GameRole(9000000000000L);
        GameRole g4 = new GameRole("诸葛亮", 0, 6666666);

        System.out.println(g1.print());
        System.out.println(g2.print());
        System.out.println(g3.print());
        System.out.println(g4.print());
    }
}