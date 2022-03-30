package net.idoprogramming.javatest.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void lost_when_dice_is_too_low() {
        //Dice dice = new Dice(6);

        /*
        Mockito simula una clase y el retorno de una operacion en concreto.
         */
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2); // Simulamos que al tirar un dado(dice) este nos retorna 2

        Player player = new Player(dice, 3); // El numero 3 es el numero minimo esperado para ganar

        /*
        Como lo esperado en este test es que el jugador pierda o retorne false este test pasa!
         */
        assertEquals(false, player.play());
    }

    @Test
    public void wins_when_dice_is_too_big() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(5);

        Player player = new Player(dice, 3);
        assertEquals(true, player.play());
    }
}