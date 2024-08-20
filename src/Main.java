import modules.Measurement;

public class Main {
    public static void main(String[] args) {
        Measurement number = new Measurement(1373);
        System.out.println("In cm :" + number.getCm() + " Cm");
        System.out.println("In km :" + number.getKm() + " Km");
        System.out.println("In mm :" + number.getMm() + " Mm");
        System.out.println("In dm :" + number.getDm() + " Dm");
    }
}