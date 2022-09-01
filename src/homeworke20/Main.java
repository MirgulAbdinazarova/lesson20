package homeworke20;

import java.io.FileWriter;
import java.io.IOException;
import java.io.UncheckedIOException;

public class Main {
    public static void main(String[] args) {


        try(Car car=new Car()){
            car.drive();
            throw new Exception();
        }catch (Exception e){


        }
    }
}
