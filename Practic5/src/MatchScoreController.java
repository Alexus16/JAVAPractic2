
public class MatchScoreController {
    private int _firstTeamScore;
    private int _secondTeamScore;
    private Winner _currentWinner;
    private Winner _lastScorer;
    private EventInvoker _matchWinnerChanged;
    private EventInvoker _matchScoreChanged;
    private EventInvoker _lastScorerChanged;

    public MatchScoreController()
    {
        _matchWinnerChanged = new EventInvoker();
        _matchScoreChanged = new EventInvoker();
        _lastScorerChanged = new EventInvoker();
        _firstTeamScore = _secondTeamScore = 0;
        _currentWinner = Winner.DRAW;
        _lastScorer = Winner.DRAW;
    }

    public void AddFirstTeamScore()
    {
        _firstTeamScore++;
        _matchScoreChanged.Invoke();
        handleIfWinnerChanged();
        handleIfScorerChanged(Winner.FIRST);
    }

    public void AddSecondTeamScore()
    {
        _secondTeamScore++;
        _matchScoreChanged.Invoke();
        handleIfWinnerChanged();
        handleIfScorerChanged(Winner.SECOND);
    }

    private void handleIfWinnerChanged()
    {
        if(!checkWinnerChanged()) return;
        _currentWinner = _firstTeamScore > _secondTeamScore ? Winner.FIRST : _firstTeamScore < _secondTeamScore ? Winner.SECOND : Winner.DRAW;
        _matchWinnerChanged.Invoke();
    }

    private void handleIfScorerChanged(Winner scorer)
    {
        if(!checkLastScorerChanged(scorer)) return;
        _lastScorer = scorer;
        _lastScorerChanged.Invoke();
    }

    private boolean checkWinnerChanged()
    {
        if(_currentWinner == Winner.FIRST && _firstTeamScore <= _secondTeamScore)
        {
            return true;
        }
        if(_currentWinner == Winner.DRAW && _firstTeamScore != _secondTeamScore)
        {
            return true;
        }
        if(_currentWinner == Winner.SECOND && _firstTeamScore >= _secondTeamScore)
        {
            return true;
        }
        return false;
    }

    private boolean checkLastScorerChanged(Winner scorer)
    {
        return scorer != _lastScorer;
    }

    public void AddScoreChangedListener(EventListener listener)
    {
        _matchScoreChanged.AddListener(listener);
    }

    public void AddWinnerChangedListener(EventListener listener)
    {
        _matchWinnerChanged.AddListener(listener);
    }

    public void AddLastScorerChanged(EventListener listener)
    {
        _lastScorerChanged.AddListener(listener);
    }

    public Winner GetWinner()
    {
        return _currentWinner;
    }

    public String GetScore()
    {
        return String.format("%dX%d", _firstTeamScore, _secondTeamScore);
    }

    public Winner GetLastScorer()
    {
        return _lastScorer;
    }
}
