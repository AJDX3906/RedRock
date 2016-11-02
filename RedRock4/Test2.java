package RedRock4;

import RedRock2.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by AJDX3906 on 2016/11/2.
 */
public class Test2 {
    List<String> strings =  new ArrayList<>();
    public void testAdd(){

        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        strings.add("F");
        strings.add("G");

    }
    public void testGet(){
        System.out.println("常规访问 ：");
        int size = strings.size();
        for (int i = 0 ; i < size ; i ++){
            System.out.print(strings.get(i));
        }
        System.out.println();
    }
    public void testGet2(){
        System.out.println("通过for each访问：");
        for (Object object : strings){
            System.out.print(object);
        }
        System.out.println();
    }
    public void testGet3(){
        System.out.println("通过迭代器访问：");
        Iterator<String> it = strings.iterator();
        while(it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();
    }

    public static void main(String[] args){
        Test2 it = new Test2();
        it.testAdd();
        it.testGet();
        it.testGet2();
        it.testGet3();
    }
}
