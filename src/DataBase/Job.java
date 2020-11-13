package DataBase;

import DataBase.Book;

@Entity
public class Job {
    @Id
    @GeneratedValue
    private Long Id;

    private User User;
    private DataBase.Book Book;
    private Job_Status Job_Status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User User) {
        this.User = User;
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
