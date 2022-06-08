package June2022;

public class College {
    static College clg= new College();
    private College(){
        System.out.println("I am from STBCOE college");

    }
    static College getInstance(){
        return clg;
    }
}
