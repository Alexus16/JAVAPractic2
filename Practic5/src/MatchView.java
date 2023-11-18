import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchView {
    private JLabel _lastScorerLabel;
    private JLabel _winnerInfoLabel;
    private JLabel _scoreInfoLabel;
    private JButton _firstTeamScoreButton;
    private JButton _secondTeamScoreButton;

    private MatchScoreController _match;

    private String _firstTeamName;
    private String _secondTeamName;

    public MatchView(JLabel lastScorerLabel,
                     JLabel winnerInfoLabel,
                     JLabel scoreInfoLabel,
                     JButton firstTeamScoreButton,
                     JButton secondTeamScoreButton)
    {
        _firstTeamScoreButton = firstTeamScoreButton;
        _secondTeamScoreButton = secondTeamScoreButton;
        _scoreInfoLabel = scoreInfoLabel;
        _winnerInfoLabel = winnerInfoLabel;
        _lastScorerLabel = lastScorerLabel;
        _match = new MatchScoreController();
    }

    public void StartMatch(String firstTeamName, String secondTeamName)
    {
        _firstTeamName = firstTeamName;
        _secondTeamName = secondTeamName;
        prepareViews();
    }

    private void prepareViews()
    {
        _firstTeamScoreButton.setText(_firstTeamName);
        _secondTeamScoreButton.setText(_secondTeamName);
        bindButtons();
        bindLabels();
        updateWinnerLabel();
        updateScoreLabel();
        updateLastScorerLabel();
    }

    private void updateWinnerLabel()
    {
        String winnerText = "";
        switch (_match.GetWinner())
        {
            case FIRST:
                winnerText = String.format("%s wins", _firstTeamName);
                break;
            case SECOND:
                winnerText = String.format("%s wins", _secondTeamName);
                break;
            case DRAW:
                winnerText = "DRAW";
                break;
        }
        _winnerInfoLabel.setText(winnerText);
    }

    private void updateScoreLabel()
    {
        String scoreText = _match.GetScore();
        _scoreInfoLabel.setText(scoreText);
    }

    private void updateLastScorerLabel()
    {
        String lastScorerText = "";
        if(_match.GetLastScorer() == Winner.FIRST)
        {
            lastScorerText = _firstTeamName;
        }
        else if(_match.GetLastScorer() == Winner.SECOND)
        {
            lastScorerText = _secondTeamName;
        }
        _lastScorerLabel.setText(lastScorerText);
    }

    private void bindLabels()
    {
        _match.AddScoreChangedListener(new EventListener() {
            @Override
            public void OnInvoked() {
                updateScoreLabel();
            }
        });
        _match.AddWinnerChangedListener(new EventListener() {
            @Override
            public void OnInvoked() {
                updateWinnerLabel();
            }
        });
        _match.AddLastScorerChanged(new EventListener() {
            @Override
            public void OnInvoked() {
                updateLastScorerLabel();
            }
        });
    }

    private void bindButtons()
    {
        _firstTeamScoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _match.AddFirstTeamScore();
            }
        });
        _secondTeamScoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _match.AddSecondTeamScore();
            }
        });
    }
}
