package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlappyBird extends JPanel implements ActionListener, KeyListener {
//
//    private static final int WIDTH = 800;
//    private static final int HEIGHT = 600;
//    private static final int BIRD_WIDTH = 40;
//    private static final int BIRD_HEIGHT = 40;
//    private static final int PIPE_WIDTH = 80;
//    private static final int PIPE_GAP = 200;
//    private static final int PIPE_VELOCITY = 3;
//
//    private int birdX = 100, birdY = 300, birdVelocity = 0;
//    private int score = 0;
//
//    private List<Rectangle> pipes;
//    private boolean gameOver = false;
//    private boolean gameStarted = false;
//
//    private Timer timer;
//    private Random rand;
//
//    public FlappyBird() {
//        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
//        this.setBackground(Color.CYAN);
//        this.setFocusable(true);
//        this.addKeyListener(this);
//
//        pipes = new ArrayList<>();
//        rand = new Random();
//
//        timer = new Timer(20, this);  // O'yinni har 20 millisekundda yangilash
//        timer.start();
//    }
//
//    @Override
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        // O'yin tugagan bo'lsa
//        if (gameOver) {
//            g.setColor(Color.RED);
//            g.setFont(new Font("Arial", Font.BOLD, 50));
//            g.drawString("Game Over!", WIDTH / 2 - 150, HEIGHT / 2);
//            g.setFont(new Font("Arial", Font.PLAIN, 30));
//            g.drawString("Press Space to Restart", WIDTH / 2 - 170, HEIGHT / 2 + 50);
//            return;
//        }
//
//        // Quvishni chizish
//        g.setColor(Color.YELLOW);
//        g.fillRect(birdX, birdY, BIRD_WIDTH, BIRD_HEIGHT);
//
//        // Quvishning harakatlanishi
//        birdVelocity += 1;  // Gravitatsiya ta'siri
//        birdY += birdVelocity;
//
//        // To'siqlarni chizish
//        g.setColor(Color.GREEN);
//        for (Rectangle pipe : pipes) {
//            g.fillRect(pipe.x, pipe.y, PIPE_WIDTH, pipe.height);
//        }
//
//        // O'yin boshlanganda
//        if (!gameStarted) {
//            g.setColor(Color.BLACK);
//            g.setFont(new Font("Arial", Font.BOLD, 50));
//            g.drawString("Flappy Bird", WIDTH / 2 - 150, HEIGHT / 2 - 100);
//            g.setFont(new Font("Arial", Font.PLAIN, 30));
//            g.drawString("Press Space to Start", WIDTH / 2 - 170, HEIGHT / 2 - 50);
//        }
//
//        // Ballarni chizish
//        g.setColor(Color.BLACK);
//        g.setFont(new Font("Arial", Font.PLAIN, 30));
//        g.drawString("Score: " + score, 10, 30);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (gameOver) return;
//
//        // To'siqlarni harakatlantirish
//        List<Rectangle> newPipes = new ArrayList<>();
//        for (Rectangle pipe : pipes) {
//            pipe.x -= PIPE_VELOCITY;
//            if (pipe.x + PIPE_WIDTH > 0) {
//                newPipes.add(pipe);
//            }
//        }
//        pipes = newPipes;
//
//        // Yangi to'siq qo'shish
//        if (pipes.isEmpty() || pipes.get(pipes.size() - 1).x < WIDTH - 300) {
//            addPipe();
//        }
//
//        // O'yinchi quvishini tekshirish
//        if (birdY > HEIGHT - BIRD_HEIGHT || birdY < 0) {
//            gameOver = true;
//        }
//
//        // To'siqlarga urilish
//        for (Rectangle pipe : pipes) {
//            if (pipe.intersects(new Rectangle(birdX, birdY, BIRD_WIDTH, BIRD_HEIGHT))) {
//                gameOver = true;
//            }
//        }
//
//        // O'yinchi yuqoriga / pastga harakatlanishi
//        if (gameStarted) {
//            birdY += birdVelocity;
//            birdVelocity += 1;  // Gravitatsiya ta'siri
//        }
//
//        repaint();
//    }
//
//    // Klaviatura orqali boshqaruv
//    @Override
//    public void keyPressed(KeyEvent e) {
//        int key = e.getKeyCode();
//        if (key == KeyEvent.VK_SPACE) {
//            if (gameOver) {
//                resetGame(); // O'yin qayta boshlanishi
//            } else {
//                if (!gameStarted) {
//                    gameStarted = true; // O'yin boshlanishi
//                }
//                birdVelocity = -10;  // Quvishni yuqoriga harakatlantirish
//            }
//        }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {}
//
//    @Override
//    public void keyTyped(KeyEvent e) {}
//
//    private void addPipe() {
//        int space = 150 + rand.nextInt(200);  // To'siq bo'shlig'i
//        int height = 50 + rand.nextInt(300);  // To'siq balandligi
//
//        pipes.add(new Rectangle(WIDTH, 0, PIPE_WIDTH, height)); // Yuqori to'siq
//        pipes.add(new Rectangle(WIDTH, height + space, PIPE_WIDTH, HEIGHT)); // Pastki to'siq
//    }
//
//    private void resetGame() {
//        birdY = 300;
//        birdVelocity = 0;
//        pipes.clear();
//        score = 0;
//        gameOver = false;
//        gameStarted = false;
//    }
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Flappy Bird");
//        FlappyBird gamePanel = new FlappyBird();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(gamePanel);
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
}
