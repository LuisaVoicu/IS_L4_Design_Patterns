package structuralPatterns.adapter.example;

import structuralPatterns.adapter.example.adapter.SquarePegAdapter;
import structuralPatterns.adapter.example.round.RoundHole;
import structuralPatterns.adapter.example.round.RoundPeg;
import structuralPatterns.adapter.example.square.SquarePeg;

public class Demo {
    public static void main(String[] args){
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if(hole.fits(roundPeg)) {
            System.out.println("Round peg with radius 5 fits the hole!");
        }else{
            System.out.println("Round peg with radius 5 does NOT fits the hole!");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        //test it this compile (it should NOT!)
        //hole.fits(smallSquarePeg);

        //Adapter solution
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        if(hole.fits(smallSquarePegAdapter)){
            System.out.println("Square peg with width 2 fits round hole with radius 5.");
        }else{
            System.out.println("Square peg with width 2 does NOT fits round hole with radius 5.");
        }

        if(hole.fits(largeSquarePegAdapter)){
            System.out.println("Square peg with width 20 fits round hole with radius 5.");
        }else{
            System.out.println("Square peg with width 20 does NOT fits round hole with radius 5.");
        }
    }
}
