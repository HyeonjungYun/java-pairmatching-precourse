package pairmatching.level;

import java.util.Arrays;

public enum Level4 {

    IMPROVE("성능개선"),
    DISTRIBUTE("배포");

    private final String mission;

    Level4 (String mission) {
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
