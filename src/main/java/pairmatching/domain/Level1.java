package pairmatching.domain;

import java.util.List;

public class Level1 extends Machine{

    private List<List<String>> racingPair;
    private List<List<String>> lottoPair;
    private List<List<String>> baseballPair;

    public List<List<String>> getRacingPair () {
        return this.racingPair;
    }

    public List<List<String>> getLottoPair () {
        return this.lottoPair;
    }

    public List<List<String>> getBaseballPair() {
        return this.baseballPair;
    }


    public void matchRacingPair (List<String> side) {
        if (this.racingPair == null) {
            this.racingPair = matchCrew(side);
        }

    }

    public void matchLottoPair (List<String> side) {
        if (this.lottoPair == null) {
            this.lottoPair = matchCrew(side);
        }

    }

    public void matchBaseballPair (List<String> side) {
        if (this.baseballPair == null) {
            this.baseballPair = matchCrew(side);
        }

    }


}
