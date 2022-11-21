package pairmatching.level;

import java.util.Arrays;

public enum Level1 {

    RACING("자동차경주"),
    LOTTO("로또"),
    BASEBALL("숫자야구게임");

    private final String mission;

    Level1(String mission) {
        this.mission = mission;
    }

    @Override
    public String toString () {
        return this.mission;
    }

    public static boolean findValue (String mission) {
        return Arrays.stream(values())
                .anyMatch(el -> el.mission.equals(mission));
    }
}
