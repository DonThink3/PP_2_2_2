package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    CarDao carDao;

    @Override
    public List<Car> giveCars(Integer number) {
        return carDao.giveCars(number);
    }
}
