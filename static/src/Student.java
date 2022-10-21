import javax.xml.crypto.Data;
import java.util.Date;

public class Student {
    private String rollNo;
    private String fullName;
    private String dob;

    public String getRollNo() {
        return rollNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    private static int count=1;
    public Student(String fullName,String dob){
        this.fullName=fullName;
        this.dob=dob;
        rollNo = generateRollNo();
    }

    private String generateRollNo() {
        Date d = new Date();

        String rn = "UNIV"+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    }

}
