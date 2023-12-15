import java.util.*;

public class ChordRunner {
  public static void main(String [] args){
    Scanner input = new Scanner (System.in);
   do{
      System.out.println("Enter a list of notes that you wish to transpose (A B# C D)");
      String song = input.nextLine();
      song = song.toUpperCase();
      System.out.println("Enter increments to transpose the notes? (Half-steps)");
      int inc = input.nextInt();

      System.out.println("Transposed Notes");
      String transposedNotes = transposeSong(song, inc);
      System.out.println(transposedNotes);

      input.nextLine();
      System.out.println("Continue transposing? (Y/N)");
      
      if(input.nextLine().equalsIgnoreCase("N")){
          System.out.println("Thank you for using this Note Transposer");
      }

    } while(input.nextLine().equalsIgnoreCase("Y"));


  }


 public static String transposeNote(String note, int interval){
    String[] Alphabet = {"C","C#","D","D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};

    int noteIndex=-4;
    for(int i = 0; i<Alphabet.length; i++){
      if (Alphabet[i].equals(note)){
        noteIndex = i;
      }
    }

    if (noteIndex != -4){
      int transposed;
      transposed = (noteIndex+interval)% Alphabet.length;
      if (transposed < 0){
        transposed += Alphabet.length;
      }

      return Alphabet[transposed];

        }

    else{
      return note;

    }
    
 }
    
public static String transposeSong (String song, int interval){
    String [] notes = song.split(" ");


    StringBuilder transposedSong = new StringBuilder();
    for (String note : notes){
      transposedSong.append(transposeNote(note, interval)).append(" ");
    }

    return transposedSong.toString().trim();

  }
}

