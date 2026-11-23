// subclass

import java.time.LocalDate;

public class StudentAccess extends Card {
    // fields
    private String studentNumber;
    private LocalDate expirationDate;

    // constructor
    public StudentAccess(){
        super();
    }

    public StudentAccess(String studentNumber, LocalDate expirationDate){
        this.studentNumber = studentNumber;
        this.expirationDate = expirationDate;
    }

    // getters and setters
    public String getStudentNumber(){
        return this.studentNumber;
    }

    public LocalDate getExpirationDate(){
        return expirationDate;
    }

    @Override
    public String toString() {
        return "StudentAccess{" +
                "studentNumber='" + studentNumber + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}