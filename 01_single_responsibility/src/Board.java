import java.util.ArrayList;
import java.util.List;

public class Board implements BoardTemplate {

    DisplayController displayController;
    int boardWidth;
    List<String> spots;

    /**
     * Constructor with no arguments to satisfy original tests
     */
    public Board() {
        this(3, new BoardConsolePrinter());
    }

    /**
     * Constructor which allows different board sizes
     * @param boardWidth width of board (total size will be boardWidth * boardWidth)
     */
    public Board(int boardWidth, DisplayController displayController) {
        this.boardWidth = boardWidth;
        this.displayController = displayController;
        this.spots = new ArrayList<>();
        for (int i = 0; i < (boardWidth * boardWidth); i++) {
            this.spots.add(String.valueOf(i));
        }

    }

    private List<String> getRow(int rowNum) {
        List<String> row = new ArrayList<>();
        int rowStart = boardWidth * (rowNum - 1);
        int rowEnd = (boardWidth * rowNum) - 1;
        for(int i = rowStart; i <= rowEnd; i++){
            row.add(this.spots.get(i));
        }
        return row;
    }

    public List<String> firstRow() {
        return getRow(1);
    }

    public List<String> secondRow() {
        return  getRow(2);
    }

    public List<String> thirdRow() {
        return  getRow(3);
    }

    public String getSpot(int index){
        return this.spots.get(index);
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public List<String> getSpots() {
        return spots;
    }

    // Poor code — can you improve this?
    public void display() {
        this.displayController.displayBoard(this);
    }
}
