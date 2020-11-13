package DataBase;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


@Entity
public class Author {

    @Id
    @GeneratedValue
    private  Long Id;

    private List<Integer> Written_Book_ISBN;
    private String Name;
    private String FirstName;
    private String Legal_Notice;
    private List<Institute> Institute;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFistName() {
        return FistName;
    }

    public void setFistName(String FistName) {
        this.FistName = FistName;
    }

    public List<Integer> getWritten_Book_ISBN() { return Written_Book_ISBN; }

    public void setWritten_Book_ISBN(List<Integer> Written_Book_ISBN) {
        this.Written_Book_ISBN = Written_Book_ISBN;
    }

    public List<Institute> getInstitute() {
        return Institute;
    }

    public void setInstitute(List<Institute> Institute) {
        this.Institute = Institute;
    }


}
