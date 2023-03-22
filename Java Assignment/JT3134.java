
public class JT3134 {

    static int age = 18;
    static String name = "枫原万叶";
    static String sex = "男";

    public static void eat() {
        System.out.println(age + "岁的" + name + "正在吃东西");
    }

    public static void sleep() {
        System.out.println(age + "岁的" + name + "正在睡觉");
    }

    public static void main(String[] args) {
        JT3134.sleep();
        JT3134.eat();
    }
}
