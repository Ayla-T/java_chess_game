package simpleChess.Main;

import java.awt.*;
import javax.swing.JPanel; 

public class GamePanel extends JPanel implements Runnable{

    public static final int WIDTH = 1100;
    public static final int HEIGHT = 800;
    final int FPS = 60;
    Thread gameThread;

    public GamePanel(){
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);

    }

    public void launchGame(){
        gameThread =  new Thread(this);
        gameThread.start();

    }

 @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double delta =  0;
        long lastTime = System.nanoTime();
        long currentTime;

        while(gameThread != null){
            currentTime = System.nanoTime();

            delta += (currentTime - lastTime)/drawInterval;
            lastTime = currentTime;

            if(delta >= 1){
                update();
                repaint();
                delta--;

            }



        }

    }

    private void update(){
        
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);


    }

   


}
