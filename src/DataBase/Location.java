package DataBase;

import DataBase.Book;
import DataBase.Institute;

@Entity
public class Location {
    @Id
    @GeneratedValue
    private Long Id;

    private DataBase.Institute Institute;
    private List<DataBase.Book> Book;
    private String Street;
    private Integer Building_Number;
    private String Comment;
    private Integer ZIP_Code;
    private String City;
    private String Country;
    private Person Correspodence;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Institute getInstitute() {
        return Institute;
    }
    public void setInstitute(Institute Institute) {
        this.Institute = Institute;
    }

    public List<Book> getBook() {
        return Book;
    }
    public void setBook(List<Book> Book) {
        this.Book = Book;
    }

    public String getStreet() {
        return Street;
    }
    public void setStreet(Sting Street) {
        this.Street = Street;
    }

    public Integer getBuilding_Number() {
        return Building_Number;
    }
    public void setBuilding_Number(Integer Building_Number) {
        this.Building_Number = Building_Number;
    }

    public String getComment() {
        return Comment;
    }
    public void setComment(Sting Comment) {
        this.Comment = Comment;
    }

    public Integer getZIP_Code() {
        return ZIP_Code;
    }
    public void setZIP_Code(Integer ZIP_Code) {
        this.ZIP_Code = ZIP_Code;
    }

    public String getCity() {
        return City;
    }
    public void setCity(Sting City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }
    public void setCountry(Sting Country) {
        this.Country = Country;
    }

    public Person getCorrespodence() {
        return Correspodence;
    }

    public void setCorrespodence(Person Correspodence) {
        this.Correspodence = Correspodence;
    }



}
