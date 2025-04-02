
interface computer{

    void code();
}

class laptop implements computer{

    public void code(){
        System.out.println("run by laptop");
    }
}

class desktop implements computer{

    public void code(){
        System.out.println("run by desktop, faster");
    }
}

class dev{

    public void codeDev(computer obj1)
    {
        obj1.code();
    }
}

public class interface1 {
    public static void main(String[] args) {
        
        computer obj1 = new laptop();
        computer obj3 = new desktop();
        dev obj2 = new dev();

        obj2.codeDev(obj3);

    }
    
}
