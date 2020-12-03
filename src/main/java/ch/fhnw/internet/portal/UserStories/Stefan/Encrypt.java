package ch.fhnw.internet.portal.UserStories.Stefan;


import java.math.*;
import java.security.*;

public class Encrypt {

        public static String MD5(String str) {
            try{
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte [] messageDigest = md.digest(str.getBytes());
                BigInteger num = new BigInteger(1,messageDigest);
                String hashtxt = num.toString(16);
                while (hashtxt.length()<32) {
                    hashtxt = "0" + hashtxt;
                }
                return hashtxt;

            }catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

