package pairmatching.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Machine {

    public static List<List<String>> matchCrew (List<String> side) {
        List<String> shuffledCrew = Randoms.shuffle(new ArrayList<>(side));
        List<List<String>> pairingCrew = new ArrayList<>();

        for (int i = 0; i < shuffledCrew.size()/2 - 1; i++) {
            pairingCrew.add(new ArrayList<>(shuffledCrew.subList(i*2, i*2 +2)));
        }
        if (shuffledCrew.size() % 2 == 0) {
            pairingCrew.add(new ArrayList<>(shuffledCrew.subList(shuffledCrew.size()-2, shuffledCrew.size())));
        }

        if (shuffledCrew.size() % 2 == 1) {
            pairingCrew.add(new ArrayList<>(shuffledCrew.subList(shuffledCrew.size()-3, shuffledCrew.size())));
        }

        return pairingCrew;
    }
}
