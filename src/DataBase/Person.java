package DataBase;

import DataBase.Institute;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    private List<DataBase.Institute> Institute;
    private String Name;
    private String FirstName;
    private String Legal_Notice;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public List<Institute> getInstitute() {
        return Institute;
    }
    public void setInstitute(List<Institute> Institute) {
        this.Institute = Institute;
    }

    public String getName() { return Name; }
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFirstName() { return FirstName; }
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLegal_Notice() { return Legal_Notice; }
    public void setLegal_Notice(String Legal_Notice) {
        this.Legal_Notice = Legal_Notice;
    }


}
