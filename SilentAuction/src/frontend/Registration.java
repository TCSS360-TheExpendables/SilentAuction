package frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration extends JPanel {

	private JTextField nameField;
	private JTextField emailField;
	private JTextField phoneField;
	
	/**
	 * Create the panel.
	 */
	public Registration() {

		setLayout(new BorderLayout(0, 0));
		
		JPanel innerRegPanel = new JPanel();
		add(innerRegPanel, BorderLayout.CENTER);
		
		GridBagLayout gbl_innerRegPanel = new GridBagLayout();
		gbl_innerRegPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_innerRegPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_innerRegPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_innerRegPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		innerRegPanel.setLayout(gbl_innerRegPanel);
		
		JLabel nameLabel = new JLabel("Enter your name:");
		GridBagConstraints gbc_nameLabel = new GridBagConstraints();
		gbc_nameLabel.anchor = GridBagConstraints.WEST;
		gbc_nameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_nameLabel.gridx = 3;
		gbc_nameLabel.gridy = 0;
		innerRegPanel.add(nameLabel, gbc_nameLabel);
		
		nameField = new JTextField();
		GridBagConstraints gbc_nameField = new GridBagConstraints();
		gbc_nameField.insets = new Insets(0, 0, 5, 0);
		gbc_nameField.fill = GridBagConstraints.HORIZONTAL;
		gbc_nameField.gridx = 5;
		gbc_nameField.gridy = 0;
		innerRegPanel.add(nameField, gbc_nameField);
		nameField.setColumns(10);
		
		JLabel label = new JLabel(" ");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 5;
		gbc_label.gridy = 1;
		innerRegPanel.add(label, gbc_label);
		
		JLabel emailLabel = new JLabel("Enter your email:");
		GridBagConstraints gbc_emailLabel = new GridBagConstraints();
		gbc_emailLabel.anchor = GridBagConstraints.WEST;
		gbc_emailLabel.insets = new Insets(0, 0, 5, 5);
		gbc_emailLabel.gridx = 3;
		gbc_emailLabel.gridy = 2;
		innerRegPanel.add(emailLabel, gbc_emailLabel);
		
		emailField = new JTextField();
		GridBagConstraints gbc_emailField = new GridBagConstraints();
		gbc_emailField.fill = GridBagConstraints.HORIZONTAL;
		gbc_emailField.insets = new Insets(0, 0, 5, 0);
		gbc_emailField.gridx = 5;
		gbc_emailField.gridy = 2;
		innerRegPanel.add(emailField, gbc_emailField);
		emailField.setColumns(10);
		
		JLabel label_1 = new JLabel(" ");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 5;
		gbc_label_1.gridy = 3;
		innerRegPanel.add(label_1, gbc_label_1);
		
		JLabel phoneLabel = new JLabel("Enter your phone number:");
		GridBagConstraints gbc_phoneLabel = new GridBagConstraints();
		gbc_phoneLabel.anchor = GridBagConstraints.WEST;
		gbc_phoneLabel.insets = new Insets(0, 0, 5, 5);
		gbc_phoneLabel.gridx = 3;
		gbc_phoneLabel.gridy = 4;
		innerRegPanel.add(phoneLabel, gbc_phoneLabel);
		
		phoneField = new JTextField();
		GridBagConstraints gbc_phoneField = new GridBagConstraints();
		gbc_phoneField.insets = new Insets(0, 0, 5, 0);
		gbc_phoneField.fill = GridBagConstraints.HORIZONTAL;
		gbc_phoneField.gridx = 5;
		gbc_phoneField.gridy = 4;
		innerRegPanel.add(phoneField, gbc_phoneField);
		phoneField.setColumns(10);
		
		JLabel label_2 = new JLabel(" ");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 5;
		gbc_label_2.gridy = 5;
		innerRegPanel.add(label_2, gbc_label_2);
				
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "wow you fell for that?");
				//TODO Create a new user with ID
			}
		});

		GridBagConstraints gbc_btnRegister = new GridBagConstraints();
		gbc_btnRegister.insets = new Insets(0, 0, 5, 0);
		gbc_btnRegister.anchor = GridBagConstraints.EAST;
		gbc_btnRegister.gridx = 5;
		gbc_btnRegister.gridy = 6;
		innerRegPanel.add(btnRegister, gbc_btnRegister);
		
		
	}

}
