// subclass
package model;

import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean isExpired(){
        LocalDate currentDate = LocalDate.now();
        if(expirationDate.isBefore(currentDate)){
            return true;
        }
        return false;
    }

    // overrides
    @Override
    public String toString() {
        return "StudentAccess{" +
                "studentNumber='" + studentNumber + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StudentAccess that = (StudentAccess) o;
        return Objects.equals(studentNumber, that.studentNumber) && Objects.equals(expirationDate, that.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentNumber, expirationDate);
    }
}