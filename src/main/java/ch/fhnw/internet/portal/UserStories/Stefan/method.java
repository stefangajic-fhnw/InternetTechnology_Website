package ch.fhnw.internet.portal.UserStories.Stefan;

public class method {
    public void SearchBook(String s){
            int digitcounter =0;
            for (int i = 0; i < 3; i++){
                char c = s.charAt(i);
                if(c.isDigit()){
                    digitcounter++;
                }
            }
            if(digitcounter==3){
                if (s.charAt(3).equals('.')){

                    String query = "select id, title, subtitle, isbn from book where isbn like ("s %")";
                }
            } else{
                String query = "select id, title, subtitle, isbn from book where (title like  s + "%") " +
                        "or (subtitle like s + "%")";
            }

}
