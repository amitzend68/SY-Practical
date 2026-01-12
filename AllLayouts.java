import javax.swing.*;
import java.awt.*;

class AllLayouts {
    public static void main(String[] args) {

        JFrame f = new JFrame("All Layouts Example");

        // BorderLayout (default for JFrame)
        f.setLayout(new BorderLayout());

        // ------------------- FlowLayout Panel -------------------
        JPanel flowPanel = new JPanel();
        flowPanel.setLayout(new FlowLayout());
        flowPanel.add(new JButton("Flow 1"));
        flowPanel.add(new JButton("Flow 2"));
        flowPanel.add(new JButton("Flow 3"));

        // ------------------- GridLayout Panel -------------------
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(2, 2));
        gridPanel.add(new JButton("Grid 1"));
        gridPanel.add(new JButton("Grid 2"));
        gridPanel.add(new JButton("Grid 3"));
        gridPanel.add(new JButton("Grid 4"));

        // ------------------- BoxLayout Panel -------------------
        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.add(new JButton("Box A"));
        boxPanel.add(new JButton("Box B"));
        boxPanel.add(new JButton("Box C"));

        // ------------------- CardLayout Panel -------------------
        JPanel cardPanel = new JPanel();
        CardLayout cl = new CardLayout();
        cardPanel.setLayout(cl);
        cardPanel.add(new JButton("Card 1"), "c1");
        cardPanel.add(new JButton("Card 2"), "c2");
        cl.show(cardPanel, "c1");

        // ADDING TO FRAME USING BorderLayout
        f.add(flowPanel, BorderLayout.NORTH);
        f.add(gridPanel, BorderLayout.CENTER);
        f.add(boxPanel, BorderLayout.WEST);
        f.add(cardPanel, BorderLayout.SOUTH);

        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
