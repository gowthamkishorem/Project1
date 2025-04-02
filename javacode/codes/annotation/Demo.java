class A{
    public void meth()
    {
        System.out.println("class A");
    }
}

class B extends A
{
    @Override
    public void meth()
    {
        System.out.println("class B");
    }
}

public class Demo {
    public static void main(String[] args) {

        B obj  = new B();

        obj.meth();
        
    }
}
