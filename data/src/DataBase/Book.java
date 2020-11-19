package DataBase;

import DataBase.Author;

@Entity
public class Book {
    // "Member" now standard
    @Id
    @GeneratedValue
    private Long Id;

    private Integer ISBN;
    private String Title;
    private String Subtitle;
    private String Comment;
    private List<DataBase.Author> Author;
    private Location Location; // The locations which have the book in stock


    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String setSubtitle() { return Subtitle; }

    public void setSubtitle(String Subtitle) {
        this.Subtitle = Subtitle;
    }

    public String setComment() { return Comment; }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public List<Author> getAuthors() {
        return Author;
    }

    public void setAuthors(List<Author> Authors) {
        this.Author = Author;
    }

    public Location getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
}






