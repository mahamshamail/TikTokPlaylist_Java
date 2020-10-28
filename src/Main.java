import java.net.MalformedURLException;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) throws MalformedURLException, InterruptedException {

        TikTokPlaylist playlist = new TikTokPlaylist();

        playlist.addVideo(0,"toothstudents",
                "Lets Link - WhoHeem",
                "585.3K",
                "https://www.tiktok.com/@toothstudents/video/6870637432337878274");
        playlist.addVideo(1,"nathan630pm",
                "original sound - Nathan630pm",
                "122 (sadness)",
                "https://www.tiktok.com/@nathan630pm/video/6859123016429767941");
        playlist.addVideo(2,"nathan630pm",
                "Crystal Dolphin - Engelwood",
                "80.5K",
                "http://vm.tiktok.com/ZSmFRK9A");
        playlist.addVideo(3,"nathan630pm",
                "original sound - Nathan630pm",
                "182",
                "https://www.tiktok.com/@nathan630pm/video/6818335663050558726");
        playlist.displayVideos();
        Thread.sleep(5000);
        for (int i = 0; i<playlist.getVideos().size(); i++){
            playlist.playVideo(i);
            Thread.sleep(2000);
        }






    }
}
