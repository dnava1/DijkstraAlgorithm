import javax.swing.*;

public class SourceAssignment2{
    public static void main(String[]  args) 
    {
        Graph g = new Graph("graph.txt");
        FrameDisplay frame = new FrameDisplay(g); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
