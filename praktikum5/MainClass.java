package praktikum5;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        String nama, hp;
        int umur;

        Scanner scn = new Scanner(System.in);

        nama = scn.next();
        umur = scn.nextInt();
        hp = scn.next();

        CarRider adin = new CarRider("Adin", 28, "08233");
        CarRider rama = new CarRider("Rama", 19, "08582");
        CarRider rani = new CarRider("Rani", 17, "08145");
        CarRider people = new CarRider(nama, umur, hp);

        CarData data = new CarData();
        data.addCar("SEDAN", "AG 156 RAG", "VIOS");
        data.addCar("VAN CAR", "AG 132 RAG", "AVANZA");
        data.addCar("HACK BACK", "AG 187 RAG", "CIVIC");
        data.addCar("TRUCK", "AG 450 RAG", "HINO");
        data.listOfCar();

        RentArchive rental = new RentArchive();
        rental.rent(adin, data.carList.get(0), 9);
        rental.rent(rani, data.carList.get(0), 5);
        rental.rent(rama, data.carList.get(1), 10);
        rental.rent(people, data.carList.get(3), 5);

        System.out.print("\n");
        rental.listOfCar();
    }
}
