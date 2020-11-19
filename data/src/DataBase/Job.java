package DataBase;

@Entity
public class Job {
    // "Member" now standard
    @Id
    @GeneratedValue
    private Long Id;

    private Member Member;
    private DataBase.Book Book;
    private Job_Status Job_Status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Member getMember() {
        return Member;
    }

    public void setMember(Member Member) {
        this.Member = Member;
    }

    public Book getBook() {
        return Book;
    }

    public void setBook(Book Book) {
        this.Book = Book;
    }

    public Job_Status getJob_Status() {
        return Job_Status;
    }

    public void setJob_Status(Job_Status Job_Status) {
        this.Job_Status = Job_Status;
    }


}