import java.util.*;

public class ChordRunner {
  public static void main(String{}args){
    Scanner input = New Scanner (System.in);
    System.out.println("Choose a song to access. Type the name of the song [ex: Here I am to Worship]"); 
    string song = input.next();
    song = song.replaceAll(" ","");
    song = song.toLowerCase();
  
  static{
    try {
      Scanner input = new Scanner(new File("songList.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("This song is not part of the database yet, learn how to add a song here.");
    }

    }
  }

}
    
