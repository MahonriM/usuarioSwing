import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class usuario__66 extends JFrame {

	private JPanel contentPane;
	private JTextField txtu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usuario__66 frame = new usuario__66();
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
	public usuario__66() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Usuario");
		lbl1.setBounds(24, 54, 46, 14);
		contentPane.add(lbl1);
		
		txtu = new JTextField();
		txtu.setBounds(93, 51, 86, 20);
		contentPane.add(txtu);
		txtu.setColumns(10);
		
		JButton btna = new JButton("Aceptar");
		btna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btna) {
				String teclado=txtu.getText();
				setTitle(teclado);
			}
			}
		});
		btna.setBounds(52, 115, 89, 23);
		contentPane.add(btna);
	}

}
