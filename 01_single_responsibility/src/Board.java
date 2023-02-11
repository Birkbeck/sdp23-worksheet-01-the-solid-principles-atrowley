import java.util.ArrayList;
import java.util.List;

//test2

public class Board extends BoardTemplate {
    List<String> spots;
    BoardDisplayer bd;

    public Board(BoardDisplayer bd) {
        this.bd = bd;
        this.spots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }
    }

    public Board() {
        this.bd = new ConsoleDisplayer();
        this.spots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }
        super.spots = this.spots;
    }

    public List<String> firstRow() {
        List<String> firstRow = new ArrayList<>();
        firstRow.add(this.spots.get(0));
        firstRow.add(this.spots.get(1));
        firstRow.add(this.spots.get(2));
        return firstRow;
    }

    public List<String> secondRow() {
        List<String> secondRow = new ArrayList<>();
        secondRow.add(this.spots.get(3));
        secondRow.add(this.spots.get(4));
        secondRow.add(this.spots.get(5));
        return secondRow;
    }

    public List<String> thirdRow() {
        List<String> thirdRow = new ArrayList<>();
        thirdRow.add(this.spots.get(6));
        thirdRow.add(this.spots.get(7));
        thirdRow.add(this.spots.get(8));
        return thirdRow;
    }

    public void display() {
        bd.displayTheBoard(this);
    }
}
