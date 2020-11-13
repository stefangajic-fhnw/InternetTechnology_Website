package DataBase;

@Entity
public class Institute {
    @Id
    @GeneratedValue
    private Long Id;

    private List<Location> Location;
    private Person Head;
    private String Name;
    private String Legal_Notice;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public List<Location> getLocation() {
        return Location;
    }
    public void setLocation(List<Location> Location) {
        this.Location = Location;
    }

    public String getLegal_Notice() {
        return Legal_Notice;
    }
    public void setLegal_Notice(Sting Legal_Notice) {
        this.Legal_Notice = Legal_Notice; }

    public String getName() {
        return Name;
    }
    public void setName(Sting Name) { this.Name = Name; }

    public Person getHead() {
        return Head;
    }
    public void setHead(Person Head) {
        this.Head = Head;
    }

}


