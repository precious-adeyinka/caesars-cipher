/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesars.cipher;

/**
 *
 * @author precious adeyinka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message = "how are you doing today";
        int offset = 12;
        CaesarsCipher caesarsCipher = new CaesarsCipher();
        String cipheredMessage = caesarsCipher.cipher(message, offset);
        
        System.out.println("Message: " + message);
        System.out.println("Offset: " + offset);
        System.out.println("Ciphered message: " +  cipheredMessage);
    }
    
}
