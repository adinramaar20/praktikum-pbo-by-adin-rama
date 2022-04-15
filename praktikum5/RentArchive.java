package praktikum5;

import java.util.List;
import java.util.ArrayList;

public class RentArchive {

    private List<CarRent> rentData = new ArrayList<>();

    public void rent(CarRider rider, Car car, int rentDur){
        if (car.isStatus() == true){
            rentData.add(new CarRent(car, rider, rentDur));
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
        } else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public void listOfCar(){
        System.out.println("-------------------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("-------------------------------");

        for (CarRent car : rentData){
            System.out.println("NAMA PEMINJAM : " + car.getRider().getName());
            System.out.println("TIPE MOBIL    : " + car.getCar().getCarType());
            System.out.println("NO. POLISI    : " + car.getCar().getPolNum());
            System.out.println("LAMA RENTAL   : " + car.getRentDur() + " HARI");
            System.out.println("-------------------------------");
        }
    }
}
