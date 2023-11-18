import javax.swing.*;
import java.awt.*;

public class MatchWindow extends JFrame {
    public MatchWindow()
    {
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints();

        var contentPane = getContentPane();

        constraints.gridy = 0;
        constraints.gridx = 1;
        JLabel scoreLabel = new JLabel();
        scoreLabel.setSize(240, 40);
        contentPane.add(scoreLabel, constraints);

        constraints.gridy = 2;
        constraints.gridx = 1;
        JLabel winnerLabel = new JLabel();
        winnerLabel.setSize(240, 40);
        contentPane.add(winnerLabel, constraints);

        constraints.gridy = 1;
        constraints.gridx = 1;
        JLabel lastScorerLabel = new JLabel();
        lastScorerLabel.setSize(240, 40);
        contentPane.add(lastScorerLabel, constraints);

        constraints.gridy = 1;
        constraints.gridx = 0;
        JButton firstTeamButton = new JButton();
        firstTeamButton.setSize(240, 40);
        contentPane.add(firstTeamButton, constraints);

        constraints.gridy = 1;
        constraints.gridx = 2;
        JButton secondTeamButton = new JButton();
        secondTeamButton.setSize(240, 40);
        contentPane.add(secondTeamButton, constraints);

        MatchView mview = new MatchView(lastScorerLabel, winnerLabel, scoreLabel, firstTeamButton, secondTeamButton);
        mview.StartMatch("AC Milan", "Real Madrid");
        setVisible(true);
    }
}
