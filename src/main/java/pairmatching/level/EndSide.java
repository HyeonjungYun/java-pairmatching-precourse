package pairmatching.level;

import java.util.Arrays;

public enum EndSide {

    FRONT_END("프론트엔드"),
    BACK_END("백엔드");

    private final String side;

    EndSide(String side) {
        this.side = side;
    }

    @Override
    public String toString () {
        return this.side;
    }

    public static boolean findValue (String side) {
        return Arrays.stream(values())
                .anyMatch(el -> el.side.equals(side));
    }
}
