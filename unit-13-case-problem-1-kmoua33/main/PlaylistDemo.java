import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * Name: Kevin Moua
 * Date: 04/16/2022
 * Assignment: Week 13 Lab 1
 * 
 * Purpose (class description): Main class that will be used to get the playlist as a filename.
 * It will read the file and print the file accordingly and returns null or exception if unsuccesful.
 */
public class PlaylistDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Playlist userPlaylist = askForPlaylist(input);
    System.out.println(userPlaylist);

    System.out.println("Attempting to save the playlist");


    if(savePlaylist(userPlaylist) == true)
    {
      System.out.println("Playlist successfully saved");
      System.out.println("Attempting to open playlist");
      if(openPlaylist(userPlaylist) == null)
      {
        System.out.println("Playlist Cannot be open");
      }
      else
      {
        System.out.println("Playlist successfuly opened");
        System.out.println(openPlaylist(userPlaylist));
      }
    }
    else
    {
      System.out.println("Unable to save playlist");
    }


  }

  /**
   * openPlaylist will open a saved file based on the playlist name file.
   * If the file is opened successfully then this method will return a 
   * playlist or else null.
   * @param userPlaylist is passed in parameter as an Object
   * @return userPlaylist or null
   */
  public static Playlist openPlaylist(Playlist userPlaylist) {
    String[] songs;

    String fileName = userPlaylist.getName() + ".txt";
    Path file = Paths.get(fileName);
    String delimiter = "\t";
    String s = "";
    String title, artist;

    try {
      InputStream input = new BufferedInputStream(Files.newInputStream(file));
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      System.out.println();
      s = reader.readLine();
      while(s != null)
      {
        songs = s.split(delimiter);
        title = songs[0];
        artist = songs[1];
        s = reader.readLine();
      }
      reader.close();
    } catch (Exception e) {
      System.out.println("Message: " + e);
    }

    if(Files.isReadable(file) == true)
    {
      return userPlaylist;

    }
    else
    {
      return null;
    }
  }

  /**
   * This method will save the details of the list of songs to a file.  If the 
   * file is successfuly saved then the method will return true.  An unsuccesful
   * save will return true.
   * @param userPlaylist is passed into parameter as an object
   * @return true or false
   */
  public static boolean savePlaylist(Playlist userPlaylist) {
    ArrayList<Song> songs = userPlaylist.getSongs();

    String fileName = userPlaylist.getName() + ".txt";
    Path file = Paths.get(fileName);
    String delimiter = "\t";

    try {
      OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

      for (int i = 0; i < songs.size(); i++) {
        writer.write(songs.get(i).getTitle() + delimiter + songs.get(i).getArtist());
        writer.newLine();
      }
      writer.close();
    } catch (Exception e) {
      System.out.println("Message: " + e);
    }

    return Files.isWritable(file);

  }

  /**
   * Requests information from the user needed to create a playlist. It will
   * construct the
   * playlist based on the user input and return it.
   * 
   * @param input The Scanner to get input from the console
   * @return the playist created based on user input
   */
  public static Playlist askForPlaylist(Scanner input) {
    String name = askForStringValue(input, "Enter playlist name: ");
    ArrayList<Song> songs = askForSongs(input);
    return new Playlist(name, songs);
  }

  /**
   * Requests information from the user needed to create a list of songs. It will
   * continue asking
   * for more information as long as the user wishes to continue. When the user
   * decides to stop
   * adding songs, it will return the list of songs created based on the user.
   * 
   * @param input The Scanner to get input from the console
   * @return the list of songs created based on user input
   */
  public static ArrayList<Song> askForSongs(Scanner input) {
    ArrayList<Song> songs = new ArrayList<Song>();
    boolean isAddingSongs = true;
    do {
      isAddingSongs = askIfAddingSong(input);
      System.out.println();

      if (isAddingSongs) {
        Song song = askForSong(input);
        System.out.println();
        songs.add(song);
      }
    } while (isAddingSongs);
    return songs;
  }

  /**
   * Requests information from the user needed to create a song. Returns the song
   * created
   * based on the user input.
   * 
   * @param input The Scanner to get input from the console
   * @return the song created based on user input
   */
  public static Song askForSong(Scanner input) {
    String title = askForStringValue(input, "Enter the title of the song: ");
    String artist = askForStringValue(input, "Enter the artist of the song: ");
    return new Song(title, artist);
  }

  /**
   * Asks the user if they would like to add another song to the playlist and
   * repeats until a valid
   * response is provided. Returns a boolean representing whether the user would
   * like to add
   * another song to the playlist or not.
   * 
   * @param input The Scanner to get input from the console
   * @return boolean representing whether the user would like to add another song
   *         to the playlist
   *         or not
   */
  public static boolean askIfAddingSong(Scanner input) {
    while (true) {
      String continueResponse = askForStringValue(input, "Would you like to add a song to the playlist (y/n)? ");
      if (continueResponse.equalsIgnoreCase("y")) {
        return true;
      } else if (continueResponse.equalsIgnoreCase("n")) {
        return false;
      } else {
        System.out.println("Invalid response.  Please enter 'y' for YES or 'n' for NO");
      }
    }
  }

  /**
   * Outputs the prompt to the user to request information. Reads in the next line
   * of information
   * and returns it.
   * 
   * @param input  The Scanner to get input from the console
   * @param prompt the prompt to output to the user for the requested information
   * @return the String value entered by the user
   */
  public static String askForStringValue(Scanner input, String prompt) {
    System.out.println(prompt);
    return input.nextLine();
  }

  /**
   * Outputs the prompt to the user to request information. Tries to read in the
   * next integer
   * value. It will provide an error message and repeat the prompt if the next
   * value is
   * not an integer, if it is less than the specified minValue, or if it is
   * greater than
   * the specified maxValue. Returns the valid integer value entered by the user.
   * 
   * @param input    The Scanner to get input from the console
   * @param prompt   the prompt to output to the user for the requested
   *                 information
   * @param minValue the lowest valid integer value
   * @param maxValue the highest valid integer value
   * @return the valid integer value entered by the user
   */
  public static int askForIntBounded(Scanner input, String prompt, int minValue, int maxValue) {
    System.out.println(prompt);
    int answer;
    while (true) {
      try {
        answer = input.nextInt();
        input.nextLine();
        if (answer < minValue) {
          System.out.println("Value must not be less than " + maxValue);
        } else if (answer > maxValue) {
          System.out.println("Value must not exceed " + maxValue);
        } else {
          break;
        }
      } catch (InputMismatchException e) {
        System.out.println("You need to enter a number.");
        input.nextLine();
      }
    }
    return answer;
  }
}
