package  Javaassignment;
public class GameRole {
    private String name;
    private int career;
    private long point;

    // 无参构造方法
    public GameRole() {
        this("未命名角色", 1, 0);
    }

    // 带所有参数的构造方法
    public GameRole(String name, int career, long point) {
        this.name = name;
        setCareer(career);
        setPoint(point);
    }

    // 只传入名字的构造方法
    public GameRole(String name) {
        this(name, 1, 0);
    }

    // 只传入战斗力的构造方法
    public GameRole(long point) {
        this("未命名角色", 1, point);
    }

    // Getter和Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCareer() {
        return career;
    }

    public void setCareer(int career) {
        if (career < 0 || career > 3) {
            System.out.println("职业取值范围必须在0~3之间，默认设置为战士（1）");
            this.career = 1;
        } else {
            this.career = career;
        }
    }

    public long getPoint() {
        return point;
    }

    public void setPoint(long point) {
        if (point < 0) {
            System.out.println("战斗力不能为负数，默认设置为0");
            this.point = 0;
        } else {
            this.point = point;
        }
    }

    // 输出角色信息
    public String print() {
        String[] careers = {"法师", "战士", "射手", "肉盾"};
        return "名字：" + name + " 职业：" + careers[career] + " 战斗力：" + point;
    }
}