package edu.najah.eng.solid.is.example3;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class App {

    public static void main(String[] args) {
        Player player = new Player();
        Monster monster = new Monster();


        monster.makeNoise();

        callMove(player);
        callMove(monster);

        callNoise(monster);
        //callNoise(player); // the player does not implement Noise maker

        //player.makeNoise();


        Movable movable = () -> {
          System.out.println("new move 1");
        };

        callMove(movable);
        callMove(() -> {
            System.out.println("new move 2");
        });
    }

    public static void callMove(Movable movable){
        movable.move();
    }
    public static void callRender(Renderer renderer){
        renderer.render();
    }
    public static void callNoise(NoiseMaker maker){
        maker.makeNoise();
    }
}
