package pairmatching.domain;

import java.util.List;

public class Level2 extends Machine{

    private List<List<String>> basketPair;
    private List<List<String>> payPair;
    private List<List<String>> subwayPair;

    public List<List<String>> getBasketPair () {
        return this.basketPair;
    }

    public List<List<String>> getPayPair () {
        return this.payPair;
    }

    public List<List<String>> getSubwayPair() {
        return this.subwayPair;
    }


    public void matchBasketPair (List<String> side) {
        if (this.basketPair == null) {
            this.basketPair = matchCrew(side);
        }

    }

    public void matchPayPair (List<String> side) {
        if (this.payPair == null) {
            this.payPair = matchCrew(side);
        }

    }

    public void matchSubwayPair (List<String> side) {
        if (this.subwayPair == null) {
            this.subwayPair = matchCrew(side);
        }

    }
}
