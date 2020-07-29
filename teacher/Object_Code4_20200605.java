package teacher;

class Teacher{

    public Teacher(String name){
        this.name = name;
    }
    public Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Teacher(String name, int age, String affiliatedBranch){
        this.name = name;
        this.age = age;
        this.affiliatedBranch = affiliatedBranch;
    }

    public void Cout(){
        System.out.println("name:" + name + "\t" + "age:" + age + "\t" + "affiliatedBranch:" + affiliatedBranch);
    }

    private String name;
    private int age;
    private String affiliatedBranch;
}

public class Object_Code4_20200605 {

    public static void main(String[] args) {
        Teacher testzero = new Teacher("张老师");
        Teacher testone = new Teacher("李老师", 18);
        Teacher testtwo = new Teacher("乐老师", 20, "信息工程学院");
        testzero.Cout();
        testone.Cout();
        testtwo.Cout();
    }

}
