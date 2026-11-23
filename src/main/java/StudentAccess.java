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

    public StudentAccess(String name, String studentNumber, LocalDate expirationDate){
        super(name);
        this.studentNumber = studentNumber;
        this.expirationDate = expirationDate;
    }

    // getters and setters
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    // helper methods
    public String format(){
        return super.format() + ", Student Number: " + studentNumber + ", ExpirationDate: " + expirationDate;
    }

    // toString
    @Override
    public String toString() {
        return "StudentAccess{" +
                "studentNumber='" + studentNumber + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}