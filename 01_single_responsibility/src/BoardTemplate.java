import java.util.List;

public interface BoardTemplate {
  public void display();

  public String getSpot(int index);

  public int getBoardWidth();

  public List<String> getSpots();

}
