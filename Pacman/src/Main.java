import javax.swing.JFrame;





public class Main {
    public static void main(String[] args) {

        int rowCount = 21;
        int columnCount = 19;
        int titleSize =32;
        int boardWidth = columnCount + titleSize ;
        int boardHeight = rowCount + titleSize ;

        JFrame frame = new JFrame("Pacman");
       // frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        frame.setVisible(true);

    }
}