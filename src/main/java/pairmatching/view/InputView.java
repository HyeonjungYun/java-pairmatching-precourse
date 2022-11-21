package pairmatching.view;

import pairmatching.level.EndSide;
import pairmatching.level.Level4;
import pairmatching.level.Level2;
import pairmatching.level.Level1;
import pairmatching.level.Level;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {

    public List<String> input () {
        String input = Console.readLine();

        validateInput(input.split(","));

        return new ArrayList<>(Arrays.asList(input.split(",")));
    }

    private void validateInput (String[] arr) {
        validateEndSide(arr[0]);
        validateLevel(arr[1]);
        validateMission(arr[1], arr[2]);
    }

    public void validateMission (String level, String mission) {
        if (level.equals("레벨1")) validateLevel1(mission);
        if (level.equals("레벨2")) validateLevel2(mission);
        if (level.equals("레벨4")) validateLevel4(mission);
    }

    private void validateEndSide (String side) {
        if (!EndSide.findValue(side)) throw new IllegalArgumentException();
    }

    private void validateLevel (String level) {
        if (!Level.findValue(level)) throw new IllegalArgumentException();
    }

    private void validateLevel1 (String mission) {
        if (!Level1.findValue(mission)) throw new IllegalArgumentException();
    }

    private void validateLevel2 (String mission) {
        if (!Level2.findValue(mission)) throw new IllegalArgumentException();
    }

    private void validateLevel4 (String mission) {
        if (!Level4.findValue(mission)) throw new IllegalArgumentException();
    }
}
