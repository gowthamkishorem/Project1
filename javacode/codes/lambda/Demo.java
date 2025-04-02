@FunctionalInterface
interface InnerDemo {

    void show(int i);
    
}
//here java does not create separate afile for the anonymous class and also Demo.java file is quite heavy now.
public class Demo {
    public static void main(String[] args) {

        InnerDemo obj = i -> 
    {
        System.out.println(i);
    };
        obj.show(5); //dont know why but it doesnt output 5 dont waste time here 
    }
}
