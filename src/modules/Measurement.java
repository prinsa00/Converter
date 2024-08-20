package modules;

public class Measurement {
    public Integer value;
    public  String siUnit = "meter";

    public Measurement(Integer value){
        this.value = value;
    }

    public int getCm(){
        return value * 100;
    }

    public int getKm(){
        return value / 1000;
    }

    public int getMm(){
        return value / 1000;
    }

    public int getDm(){
        return value * 10;
    }


}


