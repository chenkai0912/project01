package com.atguigu.java;

/**
 * @author Tide
 * @date 2018-11-03-12:41
 */
public class TemplatesTest {

    //main方法
    public static void main(String[] args) {


        int n = 10;

        //输出语句
        System.out.println();
        System.out.println("args = [" + args + "]");

        System.out.println("n = " + n);

        //循环
        String[] arr = new String[]{"zhangsan","hanmeimei","lilei"};
        for (int i = 0; i <arr.length ; i++) {

        }

        for (String s : arr) {
            System.out.println("s = " + s);
        }
        
        

    }


}
