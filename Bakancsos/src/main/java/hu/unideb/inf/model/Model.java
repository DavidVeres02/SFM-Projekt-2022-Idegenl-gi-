package hu.unideb.inf.model;

import java.time.LocalDate;

public class Model
{
    private Student student;

    public Model() {
        this.student = new Student("Rob Smith", 55, LocalDate.of(1993, 12, 03));
    }

    public Student getStudent() {
        return student;
    }
}
