package cc.codegym.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        CeasarCypher cypher1 = new CeasarCypher(3);
        String originalMessage = "Watch out, Lorenzo is coming!";
        String encryptedMessage = cypher1.cypher(originalMessage);
        String decryptedMessage = cypher1.decypher(encryptedMessage);

        List<String> list = Arrays.asList(originalMessage, encryptedMessage, decryptedMessage);
        list.forEach(System.out::println);
    }


}
