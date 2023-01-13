package ec.edu.puce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

public class Bingo90 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bingo90 frame = new Bingo90();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bingo90() {
		Bingo bingo = new Bingo(90);
		setTitle("BINGO 2.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 940);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 239, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ballNumber = new JLabel("");
		ballNumber.setHorizontalAlignment(SwingConstants.CENTER);
		ballNumber.setFont(new Font("Segoe UI", Font.BOLD, 96));
		ballNumber.setOpaque(true);
		ballNumber.setBackground(new Color(255, 255, 255));
		ballNumber.setBounds(52, 61, 220, 198);
		contentPane.add(ballNumber);	
		
		JPanel ballsPanel = new JPanel();
		ballsPanel.setBackground(new Color(238, 193, 74));
		ballsPanel.setBounds(-4, 297, 665, 606);
		ballsPanel.setLayout(null);
		contentPane.add(ballsPanel);		
		
		JButton randomBallBtn = new JButton("Sacar Bola");
		randomBallBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JButton randomBall = bingo.getRandomBall();
				ballNumber.setText(randomBall.getText());
				
				int ballPosition = Integer.parseInt(randomBall.getText());
				JButton bola = (JButton) ballsPanel.getComponent(ballPosition - 1);
				bingo.getTablero().paintBall(bola);
			}
		});
		
		randomBallBtn.setFont(new Font("Segoe UI", Font.BOLD, 32));
		randomBallBtn.setBackground(new Color(0, 255, 128));
		randomBallBtn.setBounds(312, 60, 281, 108);
		contentPane.add(randomBallBtn);
		

		bingo.getTablero().inittt();
		bingo.getTablero().paintPanel(ballsPanel);
		
		
	}
}
