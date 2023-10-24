package baseball.domain;
import java.util.ArrayList;
import java.util.List;

public class PlayBaseball {
    private List<Integer> computerNum = new ArrayList<>();
    private List<Integer> userNum = new ArrayList<>();
    private GameLaunch gameLaunch = new GameLaunch();

    public PlayBaseball(){
        this.computerNum = new ComputerNum().getComputerNum();
        this.userNum = new UserNum().getUserNum();
    }
    
}
