package OpenClosePrinciple;

public class BMW implements Araba {
    public String model ="BMW";
    public int tripKm  ;
    public int dolarPerKM ;
    public void go() {
        System.out.println("BMW gidiyor");
    }

    public void stop() {
        System.out.println("BMW duruyor");
    }


}

