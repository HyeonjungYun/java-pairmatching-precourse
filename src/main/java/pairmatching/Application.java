package pairmatching;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

    private final List<String> backendCrew;
    private final List<String> frontendCrew;

    Application () {
        this.backendCrew = callCrewAtBackEnd();
        this.frontendCrew = callCrewAtFrontEnd();
    }

    public static void main(String[] args) {
        // TODO 구현 진행
    }

    private List<String> callCrewAtFrontEnd () {
        Stream<String> getCrew = null;
        try {
            getCrew =
                    Files.lines(Paths.get("src/main/resources/frontend-crew.md"),
                                    StandardCharsets.UTF_8);
        }catch (IOException e) {
            e.printStackTrace();
        }

        return getCrew.collect(Collectors.toList());
    }

    private List<String> callCrewAtBackEnd () {
        Stream<String> getCrew = null;
        try {
            getCrew =
                    Files.lines(Paths.get("src/main/resources/backend-crew.md"),
                                    StandardCharsets.UTF_8);
        }catch (IOException e) {
            e.printStackTrace();
        }

        return getCrew.collect(Collectors.toList());
    }
}
