package frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuItem;

import java.awt.CardLayout;

import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JLabel;

public class Page extends JFrame
{

//Fields	
	
	private JPanel contentPane;
	
	private static Toolkit tk = Toolkit.getDefaultToolkit();
	
	private static Dimension dm = tk.getScreenSize();
	
	private static double screenwidth = dm.getWidth();
	private static double screenheight = dm.getHeight();
	private JTextField nameField;
	private JTextField emailField;
	private JTextField phoneField;
	private JTextField donateNameField;
	private JTextField donateEmailField;
	private JTextField donatePhoneField;
	private JTextField donateCompanyField;
	private JTextField donateItemField;
	private JTextField donateBidField;

//Main
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Page frame = new Page();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
//Constructor	

	/**
	 * Create the frame.
	 */
	public Page()
	{
		setTitle("Silent Auction");
		setBounds(100, 100, 700, 500);
		
		ImageIcon img = new ImageIcon("assets/logo.png");
		setIconImage(img.getImage());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmHome = new JMenuItem("Home");

		menuBar.add(mntmHome);
		
		JMenuItem mntmRegister = new JMenuItem("Register");

		menuBar.add(mntmRegister);
		
		JMenuItem mntmDonate = new JMenuItem("Donate");
		menuBar.add(mntmDonate);
		
		JMenuItem mntmStatistics = new JMenuItem("Statistics");

		menuBar.add(mntmStatistics);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		menuBar.add(mntmHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		//home panel
		JPanel homePanel = new JPanel();
		homePanel.setBackground(Color.BLUE);
		contentPane.add(homePanel);
		
		//registration panel
		
		JPanel registrationPanel = new Registration();
		contentPane.add(registrationPanel);
		

		//donate panel
		JPanel donatePanel = new JPanel();
		donatePanel.setBackground(Color.GREEN);
		contentPane.add(donatePanel);
		donatePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel innerDonPanel = new JPanel();
		donatePanel.add(innerDonPanel, BorderLayout.CENTER);
		GridBagLayout gbl_innerDonPanel = new GridBagLayout();
		gbl_innerDonPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_innerDonPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_innerDonPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_innerDonPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		innerDonPanel.setLayout(gbl_innerDonPanel);
		
		JLabel doanteNameLabel = new JLabel("Enter your name:");
		GridBagConstraints gbc_doanteNameLabel = new GridBagConstraints();
		gbc_doanteNameLabel.anchor = GridBagConstraints.WEST;
		gbc_doanteNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_doanteNameLabel.gridx = 3;
		gbc_doanteNameLabel.gridy = 0;
		innerDonPanel.add(doanteNameLabel, gbc_doanteNameLabel);
		
		donateNameField = new JTextField();
		donateNameField.setColumns(10);
		GridBagConstraints gbc_donateNameField = new GridBagConstraints();
		gbc_donateNameField.fill = GridBagConstraints.HORIZONTAL;
		gbc_donateNameField.insets = new Insets(0, 0, 5, 0);
		gbc_donateNameField.gridx = 5;
		gbc_donateNameField.gridy = 0;
		innerDonPanel.add(donateNameField, gbc_donateNameField);
		
		JLabel space1 = new JLabel(" ");
		GridBagConstraints gbc_space1 = new GridBagConstraints();
		gbc_space1.insets = new Insets(0, 0, 5, 0);
		gbc_space1.gridx = 5;
		gbc_space1.gridy = 1;
		innerDonPanel.add(space1, gbc_space1);
		
		JLabel donateEmailLabel = new JLabel("Enter your email:");
		GridBagConstraints gbc_donateEmailLabel = new GridBagConstraints();
		gbc_donateEmailLabel.anchor = GridBagConstraints.WEST;
		gbc_donateEmailLabel.insets = new Insets(0, 0, 5, 5);
		gbc_donateEmailLabel.gridx = 3;
		gbc_donateEmailLabel.gridy = 2;
		innerDonPanel.add(donateEmailLabel, gbc_donateEmailLabel);
		
		donateEmailField = new JTextField();
		donateEmailField.setColumns(10);
		GridBagConstraints gbc_donateEmailField = new GridBagConstraints();
		gbc_donateEmailField.fill = GridBagConstraints.HORIZONTAL;
		gbc_donateEmailField.insets = new Insets(0, 0, 5, 0);
		gbc_donateEmailField.gridx = 5;
		gbc_donateEmailField.gridy = 2;
		innerDonPanel.add(donateEmailField, gbc_donateEmailField);
		
		JLabel space2 = new JLabel(" ");
		GridBagConstraints gbc_space2 = new GridBagConstraints();
		gbc_space2.insets = new Insets(0, 0, 5, 0);
		gbc_space2.gridx = 5;
		gbc_space2.gridy = 3;
		innerDonPanel.add(space2, gbc_space2);
		
		JLabel donateCompanyLabel = new JLabel("Enter your company:");
		GridBagConstraints gbc_donateCompanyLabel = new GridBagConstraints();
		gbc_donateCompanyLabel.anchor = GridBagConstraints.WEST;
		gbc_donateCompanyLabel.insets = new Insets(0, 0, 5, 5);
		gbc_donateCompanyLabel.gridx = 3;
		gbc_donateCompanyLabel.gridy = 4;
		innerDonPanel.add(donateCompanyLabel, gbc_donateCompanyLabel);
		
		donateCompanyField = new JTextField();
		GridBagConstraints gbc_donateCompanyField = new GridBagConstraints();
		gbc_donateCompanyField.insets = new Insets(0, 0, 5, 0);
		gbc_donateCompanyField.fill = GridBagConstraints.HORIZONTAL;
		gbc_donateCompanyField.gridx = 5;
		gbc_donateCompanyField.gridy = 4;
		innerDonPanel.add(donateCompanyField, gbc_donateCompanyField);
		donateCompanyField.setColumns(10);
		
		JLabel space3 = new JLabel(" ");
		GridBagConstraints gbc_space3 = new GridBagConstraints();
		gbc_space3.insets = new Insets(0, 0, 5, 0);
		gbc_space3.gridx = 5;
		gbc_space3.gridy = 5;
		innerDonPanel.add(space3, gbc_space3);
		
		JLabel donateNumberLabel = new JLabel("Enter your phone number:");
		GridBagConstraints gbc_donateNumberLabel = new GridBagConstraints();
		gbc_donateNumberLabel.anchor = GridBagConstraints.WEST;
		gbc_donateNumberLabel.insets = new Insets(0, 0, 5, 5);
		gbc_donateNumberLabel.gridx = 3;
		gbc_donateNumberLabel.gridy = 6;
		innerDonPanel.add(donateNumberLabel, gbc_donateNumberLabel);
		
		donatePhoneField = new JTextField();
		donatePhoneField.setColumns(10);
		GridBagConstraints gbc_donatePhoneField = new GridBagConstraints();
		gbc_donatePhoneField.fill = GridBagConstraints.HORIZONTAL;
		gbc_donatePhoneField.insets = new Insets(0, 0, 5, 0);
		gbc_donatePhoneField.gridx = 5;
		gbc_donatePhoneField.gridy = 6;
		innerDonPanel.add(donatePhoneField, gbc_donatePhoneField);
		
		JLabel space4 = new JLabel(" ");
		GridBagConstraints gbc_space4 = new GridBagConstraints();
		gbc_space4.insets = new Insets(0, 0, 5, 0);
		gbc_space4.gridx = 5;
		gbc_space4.gridy = 7;
		innerDonPanel.add(space4, gbc_space4);
		
		JLabel donateItemLabel = new JLabel("Enter your item name:");
		GridBagConstraints gbc_donateItemLabel = new GridBagConstraints();
		gbc_donateItemLabel.anchor = GridBagConstraints.WEST;
		gbc_donateItemLabel.insets = new Insets(0, 0, 5, 5);
		gbc_donateItemLabel.gridx = 3;
		gbc_donateItemLabel.gridy = 8;
		innerDonPanel.add(donateItemLabel, gbc_donateItemLabel);
		
		donateItemField = new JTextField();
		GridBagConstraints gbc_donateItemField = new GridBagConstraints();
		gbc_donateItemField.insets = new Insets(0, 0, 5, 0);
		gbc_donateItemField.fill = GridBagConstraints.HORIZONTAL;
		gbc_donateItemField.gridx = 5;
		gbc_donateItemField.gridy = 8;
		innerDonPanel.add(donateItemField, gbc_donateItemField);
		donateItemField.setColumns(10);
		
		JLabel space5 = new JLabel(" ");
		GridBagConstraints gbc_space5 = new GridBagConstraints();
		gbc_space5.insets = new Insets(0, 0, 5, 0);
		gbc_space5.gridx = 5;
		gbc_space5.gridy = 9;
		innerDonPanel.add(space5, gbc_space5);
		
		JLabel donateBidLabel = new JLabel("Enter starting bid:");
		GridBagConstraints gbc_donateBidLabel = new GridBagConstraints();
		gbc_donateBidLabel.anchor = GridBagConstraints.WEST;
		gbc_donateBidLabel.insets = new Insets(0, 0, 5, 5);
		gbc_donateBidLabel.gridx = 3;
		gbc_donateBidLabel.gridy = 10;
		innerDonPanel.add(donateBidLabel, gbc_donateBidLabel);
		
		donateBidField = new JTextField();
		GridBagConstraints gbc_donateBidField = new GridBagConstraints();
		gbc_donateBidField.insets = new Insets(0, 0, 5, 0);
		gbc_donateBidField.fill = GridBagConstraints.HORIZONTAL;
		gbc_donateBidField.gridx = 5;
		gbc_donateBidField.gridy = 10;
		innerDonPanel.add(donateBidField, gbc_donateBidField);
		donateBidField.setColumns(10);
		
		JLabel space6 = new JLabel(" ");
		GridBagConstraints gbc_space6 = new GridBagConstraints();
		gbc_space6.insets = new Insets(0, 0, 5, 0);
		gbc_space6.gridx = 5;
		gbc_space6.gridy = 11;
		innerDonPanel.add(space6, gbc_space6);
		
		JButton donateButton = new JButton("Donate");
		donateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO: create a new donor with the information
				//make sure to do error checking.
			}
		});
		GridBagConstraints gbc_donateButton = new GridBagConstraints();
		gbc_donateButton.anchor = GridBagConstraints.EAST;
		gbc_donateButton.gridx = 5;
		gbc_donateButton.gridy = 12;
		innerDonPanel.add(donateButton, gbc_donateButton);
		
		//general stats panel
		JPanel generalStatsPanel = new JPanel();
		generalStatsPanel.setBackground(Color.ORANGE);
		contentPane.add(generalStatsPanel);
		
		//QR panel
		JPanel QRPanel = new JPanel();
		QRPanel.setBackground(Color.GRAY);
		contentPane.add(QRPanel);
		
		//specific stats panel
		JPanel specificStatsPanel = new JPanel();
		specificStatsPanel.setBackground(Color.MAGENTA);
		contentPane.add(specificStatsPanel);
		
		//item panel
		JPanel itemPanel = new JPanel();
		itemPanel.setBackground(Color.PINK);
		contentPane.add(itemPanel);
		
		//pack();
		setLocation((int)(screenwidth - getWidth()) / 2, (int)(screenheight - getHeight()) / 2);
		
		mntmHome.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				donatePanel.setVisible(false);
				generalStatsPanel.setVisible(false);
				registrationPanel.setVisible(false);
				
				homePanel.setVisible(true);
			}
		});
		
		mntmRegister.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				homePanel.setVisible(false);
				donatePanel.setVisible(false);
				generalStatsPanel.setVisible(false);
				
				registrationPanel.setVisible(true);
				
			}
		});

		mntmDonate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				homePanel.setVisible(false);
				generalStatsPanel.setVisible(false);
				registrationPanel.setVisible(false);
				
				donatePanel.setVisible(true);
			}
		});
		
		mntmStatistics.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				homePanel.setVisible(false);
				donatePanel.setVisible(false);
				registrationPanel.setVisible(false);
				
				generalStatsPanel.setVisible(true);
			}
		});
		
		mntmHelp.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(contentPane, "    Welcome to our Silent Auction "
						+ "software, by The Expendables Software LLC\nHere, you can register "
						+ "and start bidding on items in our silent auction. In this system, "
						+ "you can\nfind items you are interested in and you will see an amount"
						+ " of information about an item, most\nimportantly, the current "
						+ "highest bid. If you decide that you would wish to go for it and bid,"
						+ " you\nmust bid any amount higher than this bid. At the end of the "
						+ "event when the auction closes, the\nwinners will be assembled "
						+ "together and notified. Thank you for participating. -Conner Martin, "
						+ "CEO\n\nIf you would like to bid on an item, click the ‘Home’ "
						+ "button.\n    Remember to register first! (Found by clicking the "
						+ "‘register’ button.)\nIf you would like to donate an item, click the"
						+ " ‘Donate’ button.\nIf you would like to see statistics on this "
						+ "event, click the ‘Statistics’ button.\n    Here, you can find "
						+ "general stats for all items, or select an item and get its specific"
						+ " stats.\nRemember, all of these buttons are available at all times!"
						+ "\n\n   Who we are:\nWe are The Expendables Software LLC. We consist "
						+ "of Christopher Otterson, Conner Martin,\nHannah Silva and Robert "
						+ "Gillis. And we are the MOTHA FUCKIN BEST.\n    Contact us:\nWebsite"
						+ " – https://sites.google.com/site/theexpendablessoftware/\nEmail – "
						+ "theexpendables@u.washington.edu", "Help", JOptionPane.PLAIN_MESSAGE);
			}
		});
	}
}