package ec.edu.puce;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Tablero {	

	private ArrayList<JButton> tablero;
	private int ballNumbers;


	public Tablero(int ballNumbers) {
		this.setBallNumbers(ballNumbers);
		this.tablero = new ArrayList<JButton>();
	}

	public void inittt() {
		int valorBola = 1;
		
		if (ballNumbers == 90) {
			for (int y = 0; y < 9; y++) {
				for (int x = 0; x < 10; x++) {
					JButton bola = new JButton(valorBola + "");
					bola.setBounds(x*65, y*67, 60, 60);
					bola.setBackground(new Color(255, 255, 255));
					bola.setFont(new Font("Segoe UI", Font.BOLD, 14));
					tablero.add(bola);			
					valorBola++;
				}
			}			
		}
		
//		if (ballNumbers == 75) {
//			for (int x = 0; x < 9; x++) {
//				for (int y = 0; y < 10; y++) {
//					JButton bola = new JButton("" + valorBola);
//					
//					tablero.add(bola);			
//					valorBola++;
//				}
//			}			
//		}
	}	

	
	public void setTablero(ArrayList<JButton> tablero) {
		this.tablero = tablero;
	}
	
	
	public ArrayList<JButton> getTablero() {
		return tablero;
	}
	
	
	public void paintBall(JButton bola) {
		bola.setBackground(Color.cyan);
	}
	
	public JButton getBola(int position) {
		return tablero.get(position - 1);
	}
	public int getBallNumbers() {
		return ballNumbers;
	}

	public void setBallNumbers(int ballNumbers) {
		this.ballNumbers = ballNumbers;
	}
	
	public void paintPanel(JPanel panel) {
		for(int i=0; i < tablero.size(); i++) {
			panel.add(this.getBola(i + 1));
			
		}
	}
}
