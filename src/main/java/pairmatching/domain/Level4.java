package pairmatching.domain;

import java.util.List;

public class Level4 extends Machine{

    private List<List<String>> improvePair;
    private List<List<String>> distributePair;

    public List<List<String>> getImprovePair () {
        return this.improvePair;
    }

    public List<List<String>> getDistributePair () {
        return this.distributePair;
    }


    public void matchImprovePair (List<String> side) {
        if (this.improvePair == null) {
            this.improvePair = matchCrew(side);
        }

    }

    public void matchDistributePair (List<String> side) {
        if (this.distributePair == null) {
            this.distributePair = matchCrew(side);
        }

    }
}
