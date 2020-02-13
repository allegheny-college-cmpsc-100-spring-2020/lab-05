package labfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Creates a decoder ring for G. Wiz's message.
 *
 * @author Solution Repository
 */
public class DecoderRing {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Create identifiers for input
    File file = null;
    Scanner input = null;
    // Read input from file
    try {
      file = new File("input/code.word");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    String enciphered = input.nextLine();
    
    /*
     * TODO: Set up:
     *       - codeName (empty String to add letters to)
     *       - key (integer to store enciphered length)
     */
    
    // TODO: Shift first letter back by key amount
    
    // TODO: Shift second letter back by key amount
    
    // TODO: Shift third letter back by key amount
    
    // TODO: Shift fourth letter back by key amount
    
    // TODO: Shift fifth letter back by key amount
    
    // TODO: Print club welcome message with decoded codeName
  }
}