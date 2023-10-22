package structuralPatterns.adapter.example.adapter;

import structuralPatterns.adapter.example.round.RoundPeg;
import structuralPatterns.adapter.example.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }

    @Override
    public double getRadius(){
        double result;
        // minimum circle radius that fit the peg
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
