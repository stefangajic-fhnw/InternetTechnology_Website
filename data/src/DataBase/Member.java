package DataBase;

@Entity
public class Member {
    // "Member" now standard
    @Id
    @GeneratedValue
    private Long id;

    private List<DataBase.Job> Job;

    private Member_Classification Member_Classification;

    @Email(message = "Please provide a valid e-mail.")
    @NotEmpty(message = "Please provide an e-mail.")
    private String email;

    @org.springframework.data.annotation.Transient //will not be serialized
    private String password;
    @javax.persistence.Transient // will not be stored in DB

    private String Phone_No;



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        String transientPassword = this.password;
        this.password = null;
        return transientPassword;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Member_Classification getMember_Classification() { return Member_Classification; }
    public void Member_Classification(Member_Classification Member_Classification) {
        this.Member_Classification = Member_Classification; }

    public String getPhone_No() { return Phone_No; }
    public void setPhone_No(String Phone_No) {
        this.Phone_No = Phone_No;
    }

    public List<Job> getJob() {
        return Job;
    }
    public void setJob(List<Job> Job) {
        this.Job = Job;
    }
}
