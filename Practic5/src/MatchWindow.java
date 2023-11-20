import javax.swing.*;
import java.awt.*;

public class MatchWindow extends JFrame {
    public MatchWindow()
    {
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridBagLayout layout = new GridBagLayout();
        layout.minimumLayoutSize(this);
        setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints();

        var contentPane = getContentPane();

        constraints.fill = GridBagConstraints.CENTER;
        constraints.ipadx = 50;
        constraints.ipady = 50;
        constraints.gridy = 0;
        constraints.gridx = 1;
        JLabel scoreLabel = new JLabel();
        scoreLabel.setSize(240, 40);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 40));
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scoreLabel.setVerticalAlignment(SwingConstants.CENTER);
        contentPane.add(scoreLabel, constraints);

        constraints.gridy = 1;
        constraints.gridx = 1;
        JLabel winnerLabel = new JLabel();
        winnerLabel.setSize(400, 40);
        winnerLabel.setMinimumSize(new Dimension(400, 40));
        winnerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        winnerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        winnerLabel.setVerticalAlignment(SwingConstants.CENTER);
        contentPane.add(winnerLabel, constraints);

        constraints.gridy = 2;
        constraints.gridx = 1;
        JLabel lastScorerLabel = new JLabel();
        lastScorerLabel.setSize(240, 40);
        lastScorerLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        lastScorerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lastScorerLabel.setVerticalAlignment(SwingConstants.CENTER);
        contentPane.add(lastScorerLabel, constraints);

        constraints.gridy = 1;
        constraints.gridx = 0;
        JButton firstTeamButton = new JButton();
        firstTeamButton.setSize(150, 40);
        contentPane.add(firstTeamButton, constraints);

        constraints.gridy = 1;
        constraints.gridx = 2;
        JButton secondTeamButton = new JButton();
        secondTeamButton.setSize(150, 40);
        contentPane.add(secondTeamButton, constraints);

        MatchView mview = new MatchView(lastScorerLabel, winnerLabel, scoreLabel, firstTeamButton, secondTeamButton);
        mview.StartMatch("AC Milan", "Real Madrid");
        setVisible(true);
    }
}
