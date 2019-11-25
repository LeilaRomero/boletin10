package bol10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Leila
 */
public class Juego {

    private int numIntroducir, intento, numAdivinar, partida = 0;

    public Juego() {
    }

    public void jugador1() {
        int intentos;
        int numAdivinar1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador número uno.\n introduzca el número a adivinar entre 1 y 50."));
        while (numAdivinar1 < 1 || numAdivinar1 > 50) {
            numAdivinar1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador número uno.\n introduzca el número a adivinar entre 1 y 50."));
        }
        numAdivinar = numAdivinar1;
        intentos = Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador uno.\n Tienes un número limitado de intentos"));
        intento = intentos;
    }

    public void jugador2() {
        int numIntro2, intentos2;
        for (intentos2 = 1; intentos2 <= intento; intentos2++) {
            numIntro2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador dos.\nIntroduzca un númerp."));
            while (numIntro2 < 1 || numIntro2 > 50) {
                numIntro2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador dos.\n Introduzca un número entre 1 y 50."));
            }
            if (numIntro2 > numAdivinar) {
                JOptionPane.showMessageDialog(null, "El número a adivinar es menor.");
            } else if (numIntro2 < numAdivinar) {
                JOptionPane.showMessageDialog(null, "El número a adivinar es mayor.");
            } else {
                JOptionPane.showMessageDialog(null, "Bien hecho acertaste");
                break;
            }
            if (intentos2 >= intento) {
                JOptionPane.showMessageDialog(null, "Lo siento pero perdiste");
            }

        }
    }

    public void partida() {
        while (partida <= 0) {
            jugador1();
            jugador2();
            partida = JOptionPane.showOptionDialog(null, "¿Jugamos otra partida?", "partida", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
        }
    }
}
