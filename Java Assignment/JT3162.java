public class JT3162{
    //方法fun1，伴随着类而存在，参数为两个String，没有返回值，执行后直接在控制台输出
    //如：两个参数字符串"张三" "李四"  输出："张三喜欢李四"
    public static void fun1(String str1, String str2){
        System.out.println(str1 + "喜欢" + str2);
    }
    
    //方法fun2，伴随着类而存在，参数为一个int类型整数，返回值为boolean类型
    //判断三位整数是不是水仙花数，是则返回true，否返回false
    public static boolean fun2(int num){
        int a = num / 100; //获取百位数
        int b = num / 10 % 10; //获取十位数
        int c = num % 10; //获取个位数
        if (num == a * a * a + b * b * b + c * c * c) { //判断是否为水仙花数
            return true;
        } else {
            return false;
        }
    }
    
    //方法fun3，伴随着类而存在，参数为两个int类型整数，返回值为这两个数的最大公约数
    public static int fun3(int num1, int num2){
        int max = num1 > num2 ? num1 : num2; //获取两个数中的最大值
        for (int i = max; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) { //判断是否为最大公约数
                return i;
            }
        }
        return 1; //如果没有找到最大公约数，则返回1
    }
    
    public static void main(String[] args) {
        //调用方法fun1，测试方法fun1是否写对
        fun1("张三", "李四");
        
        //调用方法fun2，测试方法fun2是否写对
        int num1 = 153;
        int num2 = 123;
        if (fun2(num1)) {
            System.out.println(num1 + "是水仙花数");
        } else {
            System.out.println(num1 + "不是水仙花数");
        }
        if (fun2(num2)) {
            System.out.println(num2 + "是水仙花数");
        } else {
            System.out.println(num2 + "不是水仙花数");
        }
        
        //调用方法fun3，测试方法fun3是否写对
        int n1 = 15;
        int n2 = 25;
        int n3 = fun3(n1, n2);
        System.out.println(n1 + "和" + n2 + "的最大公约数是" + n3);
    }
}