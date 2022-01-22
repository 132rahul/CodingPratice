package HakerErth;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;

public class PasswdCheckBase64 {
    // A utility function to check
    // whether a password is valid or not
    public static boolean isValid(String password) {
        // for checking if password length
        // is between 8 and 15
        if (!((password.length() >= 8)
                && (password.length() <= 15))) {
            return false;
        }
        // to check space
        /*if (password.contains(" ")) {
            return false;
        }*/
        if (true) {
            int count = 0;
            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {
                // to convert int to string
                String str1 = Integer.toString(i);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        // for special characters
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("&") || password.contains("*")
        )) {
            return false;
        }

        if (true) {
            int count = 0;
            // checking capital letters
            for (int i = 65; i <= 90; i++) {
                // type casting
                char c = (char) i;
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }

        if (true) {
            int count = 0;
            // checking small letters
            for (int i = 90; i <= 122; i++) {
                // type casting
                char c = (char) i;
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        // if all conditions fails
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, String> m1 = new LinkedHashMap<>();
        int aa = 97;
        for (int i = 0; i < 5; i++) {
            char c = (char) (aa + i);
            String str1 = Character.toString(c);
            m1.put("system-" + str1, br.readLine());
        }
        String chstr = br.readLine();
        for (Map.Entry et : m1.entrySet()) {
            if (isValid((String) et.getValue())) {
                String sample = (String) et.getValue();
                String BasicBase64format
                        = Base64.getEncoder()
                        .encodeToString(sample.getBytes());
                System.out.println("Encoded password for " + et.getKey() + ": " + BasicBase64format);
            } else {
                System.out.println("Wrong input : " + et.getKey());
            }
        }
        for (Map.Entry et1 : m1.entrySet()) {
            if (m1.containsKey(chstr)) {
                System.out.println("Reading Security Password for " + chstr + "....." + et1.getValue());
                break;
            } else {
                System.out.println("Entered system is not available....." + chstr);
                break;
            }
        }
    }
}