package nl.hu.bdsd;

import java.util.ArrayList;
import java.util.List;


/**
 * Hello world!
 */
public class App {
    public List<Student> createList() {
        List<Student> students = new ArrayList<>();
        // student names generated using
        // https://thestoryshack.com/nl/generatoren/nederlandse-namen-generator/

        // mannelijke studenten
        students.add(new Student(101, "Hein Jonker", 18));
        students.add(new Student(102, "Tobias Bongerd", 19));
        students.add(new Student(103, "Jacco de Cook", 17));
        students.add(new Student(104, "Pieter Ates", 21));
        students.add(new Student(105, "Paulus Otteman", 22));
        students.add(new Student(106, "Ludovicus Wondergem", 18));

        // vrouwelijke studenten
        students.add(new Student(107, "Marjolein Spyker", 19));
        students.add(new Student(108, "Jacqueline Baars", 19));
        students.add(new Student(109, "Aleida Hardeman", 20));
        students.add(new Student(110, "Nina Visscher", 18));
        students.add(new Student(111, "Antonia Nellessen", 23));
        students.add(new Student(112, "Marianne Geen", 19));
        return students;
    }

    double averageAges(List<Student> students) {
        double sum = 0;
        for (Student student : students) {
            sum = sum + student.getAge();
        }
        return (sum / students.size());
    }

    double averageAgesWithMap(List<Student> students) {
        return students.stream().mapToInt(s -> s.getAge()).average().getAsDouble();
    }

    /**
     * Geeft de minimum leeftijd van alle mannelijke of vrouwelijke studenten in de verzameling.
     * @param students
     * @param isFemale true als het resultaat moet gaan over vrouwelijke studenten, anders false.
     * @return
     */
    double minimumAge(List<Student> students, boolean isFemale) {
        return 0;
    }

    /**
     * Geeft het totaal aantal karakters (letters of spaties) van de namen van de gegeven namen.
     * @param students
     * @return aantal karakters.
     */
    int numberOfLettersInNames(List<Student> students) {
        return 0;
    }
    /**
     * Geeft het aantal studenten terug waarvan de naam begint met de gegeven substring.
     * @param students
     * @param beginsWith de substring waarmee de naam dient te beginnen.
     * @return aantal studenten.
     */
    int numberOfStudentsWithNameThatBeginsWith(List <Student> students, String beginsWith) {
        return 0;
    }

    /**
     * Geeft de minimum leeftijd van alle studenten in de verzameling.
     * @param students
     * @return
     */
    double minimumAge(List<Student> students) {
        return 0;
    }


    public static void main(String[] args) {
        App app = new App();
        System.out.println("Gemiddelde leeftijd studenten: " + app.averageAges(app.createList()));
        System.out.println("Gemiddelde leeftijd studenten: " + app.averageAgesWithMap(app.createList()));
    }

    class Student {
        private int studentnummer;
        private String name;
        private int age;

        Student(int studentnummer, String name, int age) {
            this.studentnummer = studentnummer;
            this.name = name;
            this.age = age;
        }

        int getAge() {
            return this.age;
        }
    }
}
