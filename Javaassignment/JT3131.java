package  Javaassignment;
// ##### 1.

// 定义一个int类型的一维数组，大小为5，
// 然后在没有给里面的元素赋值时输出数组内元素，看看值是多少。
// 那之后，给数组元素**一次性**赋值1、2、3、4、5。
// 再使用基本的for循环遍历输出里面所有元素。
public class JT3131 {
    public static void main(String[] args) {
        int[] salary = new int[5];
        // int[] salary = {1,2,3,4,5};
        for(int i=0;i<salary.length;i++){
            System.out.print(i+"\t");
        }
    }
    
}
