package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao {

    private  List<Car> cars = Arrays.asList(
            new Car("BMW", 2020, 20000),
            new Car("Lexus", 2024, 30000),
            new Car("KIA", 2015, 9000),
            new Car("VAZ", 1990,1000),
            new Car("Niva", 2000, 1500));

    @Override
    public List<Car> getCars() {
        return this.cars;
    }
}
