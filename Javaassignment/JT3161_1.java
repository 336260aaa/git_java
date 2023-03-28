package  Javaassignment;
import java.util.Scanner;

public class JT3161_1 {
    static Scanner sc = new Scanner(System.in);
    // 伴随着对象实例存在的二维数组
    double[][] array;

    // 方法input，伴随对象实例存在，无参数，无返回值
    // 控制台输出提示提醒输入二维数组的行数和列数，然后再提示输入所有的数组元素(double类型数组)
    public void input() {
        System.out.println("请输入二维数组的行数：");
        int n = sc.nextInt();
        System.out.println("请输入二维数组的列数：");
        int m = sc.nextInt();

        // 补充代码完成二维数组的初始化，获取二维数组所有元素的值所有的。
        this.array = new double[n][m]; // 初始化二维数组
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("请输入第" + (i + 1) + "行第" + (j + 1) + "列的元素：");
                this.array[i][j] = sc.nextDouble(); // 输入二维数组的各个元素
            }
        }
    }

    // 方法add，将数组中所有的元素翻倍，无参数，无返回值
    public void add() {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                this.array[i][j] *= 2; // 将二维数组中的元素翻倍
            }
        }
    }

    // 方法show，将数组中所有元素以矩形的形式打印到命令行，无参数，无返回值
    public void show() {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                System.out.printf(this.array[i][j] + " "); // 使用格式化输出语句输出二维数组中的元素
            }
            System.out.println(); // 换行
        }
    }

}
