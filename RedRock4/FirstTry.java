package imooc.FirstTry;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AJDX3906 on 2016/11/2.
 */
public class FirstTry implements IBaginterface{
    String[] Test = new String[x] ;
    Scanner input = new Scanner(System.in);
    @Override
    public void Add() {

        int b =1;
        int i = 0 ;
        while (b==1){
            System.out.println("请输入添加元素 ");
            String inputid = input.next();
            Test[i] = inputid ;
            i++;
            System.out.println("是否输入完毕 yes / no ");
            String arrd = input.next();
            if("yes".equals(arrd)){
                int l = x - i ;
                Test = Arrays.copyOf(Test , Test.length-l);
                b = 0;
            }

        }

    }

    @Override
    public void Get() {
        if(Test.length == 0){
            System.out.println("兄弟空的，别Get了");
        }
        for (String aTest : Test) {
            System.out.print(aTest + " ");
        }
        System.out.println( );
    }

    @Override
    public void Remove() {

        System.out.println("想要移除第几个元素");
        int inputid = input.nextInt();

        Test[inputid -1] = Test [Test.length -1];
        Test = Arrays.copyOf(Test , Test.length-1);
//        System.out.println(Arrays.toString(Test));
        Get();
    }

    @Override
    public void Search() {
        System.out.println("想要查找哪个元素");
        String inputid = input.next();
//        for (int i = 0 ; i <Test.length; i++){
//            if(inputid.equals(Test[i])){
//                System.out.println("这是第 " + i +"位元素");
//                return;
//            }
//        }
//        System.out.println("没有" );
        int i = 0 ;
        while (!inputid.equals(Test[i])) i++;
        if(i == Test.length) {
            System.out.println("没有" );
            return;
        }
        System.out.println("这是第:" + (i+1) +"位元素");
       }
}
