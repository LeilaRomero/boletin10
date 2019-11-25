package bol10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Leila
 */
public class JuegoContraOrdenador {

    private int intento, numeroAdivinar, partida = 0, resta;

    public JuegoContraOrdenador() {
    }

    public void maquina() {
        numeroAdivinar = (int) (Math.random() * 50) + 1;
    }

    public void jugador() {
        int numeroIntroducir, intentos;
        intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca cuantos intentos tiene el ordenador."));
        for (intentos = 0; intentos <= intento; intentos++) {
            numeroIntroducir = Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador. Introduzce el numero."));
            while (numeroIntroducir < 1 || numeroIntroducir > 50) {
                numeroIntroducir = Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador.Introduce un número entre 1 y 50."));
            }
            resta = Math.abs(numeroAdivinar - numeroIntroducir);
            if (resta > 20) {
                JOptionPane.showMessageDialog(null, "Muy lejos.");
            } else if (resta >= 10 && resta <= 20) {
                JOptionPane.showMessageDialog(null, "Lejos.");
            } else if (resta < 10 && resta > 5) {
                JOptionPane.showMessageDialog(null, "Cerca.");
            } else if (resta <= 5 && resta >= 1) {
                JOptionPane.showMessageDialog(null, "Muy cerca.");
            } else {
                JOptionPane.showMessageDialog(null, "Acertado");
                break;
            }

            if (intentos >= intento) {
                JOptionPane.showMessageDialog(null, "Partida perdida");
            }
        }
    }

    public void partida() {
        while (partida <= 0) {
            maquina();
            jugador();
            partida = JOptionPane.showOptionDialog(null, "Empezar otra partida", "partida", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
        }

    }
}
