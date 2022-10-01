package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> giveCars(Integer number) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", "Black", "250_000$"));
        list.add(new Car("Bugatti", "Bright", "1_000_000$"));
        list.add(new Car("Form Mustang", "Green", "550_000$"));
        list.add(new Car("Mercedes", "Silver", "100_000$"));
        list.add(new Car("Kia", "Red", "50_000$"));
        switch (number) {
            case 1:
                return list.stream().limit(1).toList();
            case 2:
                return list.stream().limit(2).toList();
            case 3:
                return list.stream().limit(3).toList();
            case 4:
                return list.stream().limit(4).toList();
            default:
                return list;
        }
    }
}
