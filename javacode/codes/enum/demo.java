
enum lights {
    RED(200),YELLOW(100),GREEN;

    //default constructor
    private lights(){
        fine = 10000;
    }

    //private constructor or maybe parameterized cons
    private int fine;
    private lights(int fine) {
        this.fine = fine;
    }
    public int getFine() {
        return fine;
    }
    public void setFine(int fine) {
        this.fine = fine;
    }


}

public class demo {
    public static void main(String[] args) {
        lights[] signal = lights.values();
    

        for (lights s : signal)
        {
            System.out.println(s.getFine());

        }

        }
    }
    

