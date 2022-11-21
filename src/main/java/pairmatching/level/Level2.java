package pairmatching.level;

import java.util.Arrays;

public enum Level2 {

    BASKET("장바구니"),
    PAY("결제"),
    SUBWAY_MAP("지하철노선도");


    private final String mission;

    Level2 (String mission) {
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
