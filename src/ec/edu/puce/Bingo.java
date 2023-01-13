package ec.edu.puce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;

public class Bingo {
	private Tablero tablero;
	private int ballNumbers;
	private List<Integer> numbers;
	
	public Bingo(int ballNumbers) {
		this.setBallNumbers(ballNumbers);
		this.setTablero(new Tablero(ballNumbers));
		this.numbers = new ArrayList<Integer>(90);
		
		for (int i = 1; i < 91; i++) {
			numbers.add(i); 
		}
		Collections.shuffle(numbers); 
	}

	public int getBallNumbers() {
		return ballNumbers;
	}

	public void setBallNumbers(int ballNumbers) {
		this.ballNumbers = ballNumbers;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}
	
	public JButton getRandomBall() {		
		int value = numbers.get(0);
		numbers.remove(0);
		return tablero.getBola(value - 1);
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
}
