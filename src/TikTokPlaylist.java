import java.net.MalformedURLException;
import java.util.ArrayList;

public class TikTokPlaylist {
    private ArrayList<Video> videos ;


    public TikTokPlaylist() {
        this.videos = new ArrayList<Video>();
    }

    public void addVideo(int position, String creator, String songName, String likes, String url) {
        /*:creates a new Video object and adds it to the playlist at
        the specified position.
                The parameters of the Video object are provided by the addVideo’s function parameters.
                The method should output a message indicating that the video was successfully added.
        You may assume that the user will only add videos in positions 0, 1, or 2. In other words, you do not need to
        do error checking on the position number.
        Adding a video to an already filled position will overwrite the video in that position.

         */

        if (this.videos.size()<3) {
            this.videos.add(position,new Video(creator, songName, likes, url));
            System.out.println("Video was successfully added at position "+position+".");

        }
        else{
            System.out.println("Error: Playlist is full.\nVideo was could not be added.") ;
        }


    }
          public void  playVideo(int i) throws MalformedURLException {
        /*:Plays the video in your desktop’s
                default
                web browser.
                The method accepts a single integer parameter
                This integer represents the video in the playlist that should be opened in the browser.
                        You must use the Video object’s play () function to open the video.
                        The method should output a message indicating that it is playing the video in the
                specified position.
                You may assume the user will always enter a valid integer in the function parameter.In other words, you
                do not need to perform error checking on whether the integer is valid.

         */
              System.out.println("Playing video number "+i+" on the playlist.");
              this.videos.get(i).play();


            }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }

    public void displayVideos(){
        /*Outputs all the Videos in the playlist to the screen.
        You must use the Video class’ showInfo() method to output the video data
         The expected output should look like this:
            1: @mattchessco: GOOBA - 6ix9ine (1.3Mlikes)
            2: @sonyakisa8: Float on the Sound (Ey) - Tiagz (10.6Mlikes)
            3: @louthechichi: I took a Nap - gunnarolla_ (280.2Klikes)

         */
        System.out.println("===================\n" +
                           "Videos in Playlist\n" +
                           "===================");
        for (int i=0; i<this.videos.size(); i++){
            System.out.println((i+1)+": "+this.videos.get(i).showInfo());
        }

    }


}
