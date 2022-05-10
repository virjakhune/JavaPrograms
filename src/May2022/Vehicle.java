package May2022;

public class Vehicle {
    String vName;
    String vColor="White";
    String vType;

    public Vehicle(){

    }

    public Vehicle(String vName,String vColor,String vType){
        this.vColor = vColor;
        this.vName = vName;
        this.vType = vType;
    }

    public Vehicle(String vName,String vType){
        this.vType = vType;
        this.vName = vName;
    }

    public void displayVehicleDetails(){
        System.out.println("Vehicle Name: "+vName);
        System.out.println("Vehicle Color: "+vColor);
        System.out.println("Vehicle Type: "+vType);
        System.out.println("=========================");
    }
}
