package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        // Start movement
        if (e.getKeyCode() == KeyEvent.VK_W) {
            Var.moveup = true;
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            Var.movedown = true;

        } else if (e.getKeyCode() == KeyEvent.VK_I) {
            Var.gegnermoveup = true;
        } else if (e.getKeyCode() == KeyEvent.VK_K) {
            Var.gegnermovedown = true;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        // Stop movement
        if (e.getKeyCode() == KeyEvent.VK_W) {
            Var.moveup = false;
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            Var.movedown = false;
        } else if (e.getKeyCode() == KeyEvent.VK_I) {
            Var.gegnermoveup = false;

        } else if (e.getKeyCode() == KeyEvent.VK_K) {
            Var.gegnermovedown = false;

        }

    }
}
