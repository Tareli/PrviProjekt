package seven;

import seven.animals.Cat;
import seven.animals.Dog;
import seven.animals.Fish;
import seven.animals.Hamster;
import seven.human.Employee;
import seven.human.Person;
import seven.human.Professor;
import seven.human.Student;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalaryAmount(1500);
        System.out.println(employee.getSalaryAmount());

        Professor professor = new Professor();
        professor.setSalaryAmount(1500);
        System.out.println("profesorska plata "+professor.getSalaryAmount());

        Student student = new Student();
        student.setIndexNumber(45);
        System.out.println("broj indeksa "+ student.getIndexNumber());

        Professor professor1 = new Professor();
        Dog dog = new Dog();
        professor1.setAnimal(dog);
        System.out.println("ima psa");
        Cat cat = new Cat();
        professor1.setAnimal(cat);
        System.out.println("ima macku");
        Fish fish = new Fish();
        professor1.setAnimal(fish);
        System.out.println("ima ribu");
        Hamster hamster = new Hamster();
        professor1.setAnimal(hamster);
        System.out.println("ima hrcak");





    }
}
