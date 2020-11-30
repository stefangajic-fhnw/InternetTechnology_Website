package ch.fhnw.internet.portal.UserStories.Stefan;

// The MySQL queries should work, I could not test them since I have no connection to XAMPP DB
// Some UserStories can only be implemented at the end

public class UserStories_Stefan {

    // UC 4.1 --> searches either for matching title, subtitle or ISBN
    public void SearchBook(String s) {
        int digitcounter = 0;
        for (int i = 0; i < 3; i++) {
            char c = s.charAt(i);
            if (c.isDigit()) {
                digitcounter++;
            }
        }
        if (digitcounter == 3) {
            if (s.charAt(3).equals('.') && s.charAt(4).isDigit()) {
                String query = "select id, title, subtitle, isbn from book where isbn like (" s % ");";
            }
        } else {
            String query = "select id, title, subtitle, isbn from book where (title like  s + " % ") " +
                    "or (subtitle like s + " % ");";
        }
    }
    // UC 5.1 --> Accesses book, "display" not implemented yet
    public void AccessBook(Integer idE) {
        String query = "select * from book where id ="+idE+";";

    }
    // UC 6 --> takes attributes that remain the same as null values, id can not be changed!
    public void updateMember (integer idE, string phoneN, sting emailN, role roleN){
            if (role != null) {  // changes only role if different
                String query = "UPDATE member SET role ="+ roleN + " WHERE id ="+ idE+";";
            }
            if (phoneN != null){
                String query = "UPDATE member SET phone ="+ phoneN + " WHERE id ="+ idE+";";
            }
            if(emailN != null){
                String query = "UPDATE member SET email ="+ emailN + " WHERE id ="+ idE+";";
            }
    }
    // UC 8 --> Id needed
    public void deleteMember (integer idE){
        String query = "delete from member where id=" + idE +";";

    }
}
