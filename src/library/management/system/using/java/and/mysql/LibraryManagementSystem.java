package library.management.system.using.java.and.mysql;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LibraryManagementSystem extends JFrame implements ActionListener {

	JLabel l1;
	JButton b1;

	public LibraryManagementSystem() {
		super("Library Management System");

		setSize(750, 250);
		setLayout(null);
		setLocation(100, 100);

		l1 = new JLabel("");
		b1 = new JButton("Next");

		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/first.jpg"));
		Image i3 = i1.getImage().getScaledInstance(1366, 390, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i3);
		l1 = new JLabel(i2);

		b1.setBounds(350, 150, 120, 60);
		l1.setBounds(0, 0, 750, 250);

		l1.add(b1);
		JLabel l8 = new JLabel("Library Management System ");
		l8.setForeground(Color.YELLOW);
		l8.setFont(new Font("Tahoma", Font.BOLD, 25));
		l8.setBounds(200, 95, 400, 30);
		l1.add(l8);
		add(l1);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		new Login_user().setVisible(true);
		this.setVisible(false);

	}

	public static void main(String[] args) {
		LibraryManagementSystem window = new LibraryManagementSystem();
		window.setVisible(true);
	}
}
