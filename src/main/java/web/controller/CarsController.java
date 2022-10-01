package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Objects;

@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer number, Model model) {
        model.addAttribute("cars", carService.giveCars(Objects.requireNonNullElse(number, 5)));
        return "pages/cars";
    }
}
