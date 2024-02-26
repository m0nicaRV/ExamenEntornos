package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {
	RockPaperScissors p1= new RockPaperScissors();
	@Test
	void test1() {
		String ResultadoEsperado="It's a tie!";
		String ResultadoObtenido=p1.checkGame("Rock", "Rock");
		assertEquals(ResultadoObtenido,ResultadoEsperado);
	}
	
	@Test
	void test2() {
		String ResultadoEsperado="You win this round!";
		String ResultadoObtenido=p1.checkGame("Rock", "Scissors");
		assertEquals(ResultadoObtenido,ResultadoEsperado);
	}
	
	@Test
	void test3() {
		String ResultadoEsperado="You win this round!";
		String ResultadoObtenido=p1.checkGame("Paper", "Rock");
		assertEquals(ResultadoObtenido,ResultadoEsperado);
	}
	
	@Test
	void test4() {
		String ResultadoEsperado="You win this round!";
		String ResultadoObtenido=p1.checkGame("Scissors", "Paper");
		assertEquals(ResultadoObtenido,ResultadoEsperado);
	}



}
