
// 定义一个String类型的一维数组，大小为5，
// 然后在没有给里面的元素赋值时输出数组内元素，看看值是多少。
// 那之后给给数组元素**一次性**赋值张三、李四、王五、赵六、田七。
// 再使用**增强型for循环**遍历输出里面所有元素。
public class JT3132 {
    public static void main(String[] args) {
        // String[] sc = new String[5];
        String[] sc ={ "张三", "李四", "王五", "赵六" ,"田七"};
        // System.out.println(sc);
        for (String num : sc) {
            System.out.println(num);
        }
    }
}
