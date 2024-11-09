package guzenko.dev.springbootguide;

import guzenko.dev.springbootguide.employees.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@SpringBootApplication
public class SpringBootGuidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGuidApplication.class, args);
    }

    @GetMapping
    public List<Employee> helloWorld() {
        return List.of(new Employee(1L
                ,"Vasya"
                ,"vasya@gmail.com"
                ,LocalDate.of(2000, 1, 10)
                ,24
                ,10000),
        new Employee(2L
                ,"Pasha"
                ,"pasha@gmail.com"
                ,LocalDate.of(2002, 3, 10)
                ,24
                ,20000));
    }

}
