package task1;
import java.util.ArrayList;
public class Movie {
    private String title;
    private String directorName;
    private int duration;
    private ArrayList<CastMember> list;

    public Movie(String title, String directorName, int duration, ArrayList<CastMember> list) {
        this.title = title;
        this.directorName = directorName;
        this.duration = duration;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", directorName='" + directorName + '\'' +
                ", duration=" + duration +
                ", list=" + list +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<CastMember> getList() {
        return list;
    }

    public void setList(ArrayList<CastMember> list) {
        this.list = list;
    }
}
