

class Human
{
    int[] human = {1,2,3,4,5};

    Human()
    {
        for(int i : human){
        System.out.println(i);}
    }
}

class Alien extends Human
{
    Alien(){
        System.out.println("Alien!");
    }
}

public class Hello{
    public static void main(String a[]) {
        
        Alien obj = new Alien();
        
    
    }
}