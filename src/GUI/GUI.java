package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{
    JLabel res = new JLabel("Result: 0 X 0");
    JLabel win = new JLabel("Winner: DRAW");
    JLabel last = new JLabel("Last score: N/A");
    JButton buttonMilan = new JButton("AC Milan");
    JButton buttonMadrid = new JButton("Real Madrid");
    private int Milan = 0;
    private int Madrid = 0;
    public GUI(){
        super("Match");
        setLayout(new BorderLayout());
        setSize(500,400);
        add(buttonMilan, BorderLayout.WEST);
        add(buttonMadrid, BorderLayout.EAST);
        add(res, BorderLayout.CENTER);
        res.setFont(new Font("TimesRoman", Font.PLAIN, 40));
        res.setHorizontalAlignment(SwingConstants.CENTER);
        add(win, BorderLayout.SOUTH);
        win.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        win.setHorizontalAlignment(SwingConstants.CENTER);
        add(last, BorderLayout.NORTH);
        last.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        last.setHorizontalAlignment(SwingConstants.CENTER);
        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Milan++;
                if (Milan > Madrid)
                    win.setText("Winner: AC Milan");
                else if (Milan < Madrid)
                    win.setText("Winner: Real Madrid");
                else
                    win.setText("Winner: DRAW");

                res.setText("Result: " + Milan + " X " + Madrid);
                last.setText("Last score: AC Milan");
            }
        });

        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Madrid++;
                if (Milan > Madrid)
                    win.setText("Winner: AC Milan");
                else if (Milan < Madrid)
                    win.setText("Winner: Real Madrid");
                else
                    win.setText("Winner: DRAW");

                res.setText("Result: " + Milan + " X " + Madrid);
                last.setText("Last score: Real Madrid");
            }
        });
    }
}
