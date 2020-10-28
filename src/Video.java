import java.awt.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Video {
    //properties
    private String creator;
    private String songName;
    private String likes;
    private String url;

    public Video(String creator, String songName, String likes, String url) {
        this.creator = creator;
        this.songName = songName;
        this.likes = likes;
        this.url = url;
    }
    //methods
    public String showInfo(){
        return "@"+this.creator+": "+this.songName+" ("+this.likes+")\n";
    }

    public void play() throws MalformedURLException {
        try{
           // System.out.println("Opening video in the web browser.");
            Desktop.getDesktop().browse(new URI(this.url));
        }catch (Exception e){
            System.out.println("ERROR: Cannot open video!");
        }
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
