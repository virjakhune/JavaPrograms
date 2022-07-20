package July2022;

public class Temp {
    @Override
    public String toString() {
        return "temp";
    }
    public void finalize() {
        System.out.println("finalize method called");
    }
}
