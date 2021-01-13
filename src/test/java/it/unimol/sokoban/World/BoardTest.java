package it.unimol.sokoban.World;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board board = new Board();
    @Test
    public void getBoardWidth() throws Exception {
        int expected = 430;
        int actual = board.getBoardWidth();

        assertEquals(expected,actual);

    }

    @Test
    public void getBoardHeight() throws AssertionError{
        int expected = 250;
        int actual = board.getBoardHeight();

        assertEquals(expected,actual);
    }

    @Test
    public void getName() throws Exception{
        assertEquals("test",board.getName());
    }
}