abstract class A{

    public abstract void show();
    public abstract void config();
}

public class Demo {
    public static void main(String[] args) {
    
        A obj = new A()
        {
        public void show(){
            System.out.println("In show");
        }

        
        public void config(){
                System.out.println("In config");
            }
    
            };
        obj.config();
    }
    
}
