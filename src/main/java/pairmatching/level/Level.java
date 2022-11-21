package pairmatching.level;

import java.util.Arrays;

public enum Level {

    LEVEL1("레벨1"),
    LEVEL2("레벨2"),
    LEVEL3("레벨3"),
    LEVEL4("레벨4"),
    LEVEL5("레벨5");

    private final String level;

    Level(String level) {
        this.level = level;
    }

    @Override
    public String toString () {
        return this.level;
    }

    public static boolean findValue (String level) {
        return Arrays.stream(values())
                .anyMatch(el -> el.level.equals(level));
    }
}
