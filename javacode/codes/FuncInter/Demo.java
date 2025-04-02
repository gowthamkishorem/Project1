

@FunctionalInterface
interface InnerDemo {

    void show();
    
    
}

public class Demo {
    public static void main(String[] args) {

        InnerDemo obj = new InnerDemo() {
            public void show(){
                System.out.println("in show");
            }
        };
        obj.show();
    }
    
}
