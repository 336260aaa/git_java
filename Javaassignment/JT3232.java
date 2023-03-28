package Javaassignment;

public class JT3232 {
    public static void main(String[] args) {
        String s1 = "所以说一山还有一山高你何苦上蹿下跳一山还有一山高别自寻烦恼";
        String s2 = "一山";
        int index = s1.indexOf(s2); // 在s1中查找s2第一次出现的索引
        if (index != -1) {
            s1 = s1.substring(0, index) + s1.substring(index + s2.length()); // 截取掉s2出现之后的部分
        }
        s1 = s1.trim(); // 去除首尾空格
        s1 = String.join(" ", s1.split("\\s+")); // 合并多余的空格，使输出s1的结果变成一句话
        System.out.println(s1);
    }
}
