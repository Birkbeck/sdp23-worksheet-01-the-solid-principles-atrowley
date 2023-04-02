import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoardConsolePrinter implements DisplayController{
//    @Override
//    public void displayBoard(BoardTemplate board) {
//        StringBuilder boardString = new StringBuilder();
//        for(int i = 0; i < (board.getBoardWidth() * board.getBoardWidth()); i++){
//            if((i+1) % board.getBoardWidth()==0){
//                boardString.append(board.getSpot(i)).append("\n");
//            } else {
//                boardString.append(board.getSpot(i)).append(" | ");
//            }
//        }
//        // Delete final /n
//        boardString.deleteCharAt(boardString.length()-1);
//        System.out.print(boardString.toString());
//    }

    @Override
    public void displayBoard(BoardTemplate board) {

        String output = IntStream.range(0,board.getSpots().size())
                .mapToObj(i -> ((i+1) % board.getBoardWidth()==0)
                        ? board.getSpots().get(i)+"\n"
                        : board.getSpots().get(i)+" | ")
                .collect(Collectors.joining(""))
                .replaceAll("\n$","");

        System.out.print(output);
    }
}
