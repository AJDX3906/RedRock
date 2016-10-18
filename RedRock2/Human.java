package RedRock2;

/**
 * Created by AJDX3906 on 2016/10/17.
 */
public class Human {
    private String name;
    private int age;
    private String sex;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return 18;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        if(sex.equals("girl"))
            this.sex=sex;
        else if(sex.equals("boy"))
            this.sex=sex;
        else
            System.out.println("ERROR: error sex input Must: girl / boy");
    }
    public void introduce(){
        System.out.println("My name is "+getName() );
        System.out.println("I am " + getAge() + " years old" + ". Forever Young");
        System.out.println("I am a "+getSex());
    }
}
