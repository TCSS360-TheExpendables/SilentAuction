package frontend;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JMenuBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuItem;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JPasswordField;

import backend.Auction;

import javax.swing.AbstractListModel;

/**
 * This class is the main frame for our silent auction software for TCSS 360.
 * 
 * @author The Expendables
 * @version 0.0.0.1
 * @since 20.05.2015
 */
public class Page extends JFrame
{

//Fields	
	
	//Holds the different panes that we use as windows.
	private JPanel contentPane;
	
	//Toolkit to center the application.
	private static Toolkit tk = Toolkit.getDefaultToolkit();
	
	//The size of the screen for centering.
	private static Dimension dm = tk.getScreenSize();
	
	//Width and Height of the screen to keep it centered.
	private static double screenwidth = dm.getWidth();
	private static double screenheight = dm.getHeight();
	private JTextField textField;

//Main
	
	/**
	 * Launch the application.
	 * 
	 * @param args is the command line required array of arguments in order to run.
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
	 * Create the frame. This creates the entire JFrame in addition to the menu and all of the
	 * individual pages and puts them all together so a user can switch between different pages.
	 */
	@SuppressWarnings("unchecked")
	public Page()
	{
		basicSetup();
		
	/** Start menu */
		//the menu bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//home button
		JMenuItem mntmHome = new JMenuItem("Home");
		menuBar.add(mntmHome);
		
		//register button
		JMenuItem mntmRegister = new JMenuItem("Register");
		menuBar.add(mntmRegister);
		
		//donate button
		JMenuItem mntmDonate = new JMenuItem("Donate");
		menuBar.add(mntmDonate);
		
		//stats button
		JMenuItem mntmStatistics = new JMenuItem("Statistics");
		menuBar.add(mntmStatistics);
		
		//help button
		JMenuItem mntmHelp = new JMenuItem("Help");
		menuBar.add(mntmHelp);
	/** End menu */
		
		//the content pane the pages rest in.
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
	/** Start 'pages' */
		//home panel
		JPanel homePanel = new JPanel();
		homePanel.setBackground(Color.BLUE);
		contentPane.add(homePanel);
		homePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel innerHomePanel = new JPanel();
		homePanel.add(innerHomePanel, BorderLayout.CENTER);
		GridBagLayout gbl_innerHomePanel = new GridBagLayout();
		gbl_innerHomePanel.columnWidths = new int[]{0, 0, 0};
		gbl_innerHomePanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_innerHomePanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_innerHomePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		innerHomePanel.setLayout(gbl_innerHomePanel);
		
		JLabel lblFilter = new JLabel("Filter:");
		GridBagConstraints gbc_lblFilter = new GridBagConstraints();
		gbc_lblFilter.insets = new Insets(0, 0, 5, 5);
		gbc_lblFilter.anchor = GridBagConstraints.EAST;
		gbc_lblFilter.gridx = 0;
		gbc_lblFilter.gridy = 0;
		innerHomePanel.add(lblFilter, gbc_lblFilter);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 0;
		innerHomePanel.add(comboBox, gbc_comboBox);
		
		JLabel space1 = new JLabel(" ");
		GridBagConstraints gbc_space1 = new GridBagConstraints();
		gbc_space1.insets = new Insets(0, 0, 5, 0);
		gbc_space1.gridx = 1;
		gbc_space1.gridy = 1;
		innerHomePanel.add(space1, gbc_space1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		innerHomePanel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel space2 = new JLabel(" ");
		GridBagConstraints gbc_space2 = new GridBagConstraints();
		gbc_space2.insets = new Insets(0, 0, 5, 0);
		gbc_space2.gridx = 1;
		gbc_space2.gridy = 3;
		innerHomePanel.add(space2, gbc_space2);
		
		JButton btnNewButton = new JButton("Filter");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 4;
		innerHomePanel.add(btnNewButton, gbc_btnNewButton);
		
		JLabel label = new JLabel(" ");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 1;
		gbc_label.gridy = 5;
		innerHomePanel.add(label, gbc_label);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
		innerHomePanel.add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		JLabel lblItemsToBid = new JLabel("Items to Bid On");
		scrollPane.setColumnHeaderView(lblItemsToBid);
		
		JList<String> list = new JList<String>();
		JTextField itemField = new JTextField();
		scrollPane.setViewportView(list);
		
//		List<Item> items = Auction.
		String[] items = new String[20]; //20 is the number of items
		for (int i = 0; i < 20; i++)
		{
			items[i] = i + ": hello" + i;
			itemField.setText(items[i]);
			list.setModel(new AbstractListModel()
			{
				String[] values = items;
				public int getSize()
				{
					return values.length;
				}
				public Object getElementAt(int index)
				{
					return values[index];
				}
			});
		}
		
		//registration panel
		JPanel registrationPanel = new Registration();
		contentPane.add(registrationPanel);
		
		//donate panel
		JPanel donatePanel = new Donor();
		contentPane.add(donatePanel);
		
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
	/** End 'pages' */
		
	/** Start listeners */
		//the home listener
		mntmHome.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				donatePanel.setVisible(false);
				generalStatsPanel.setVisible(false);
				registrationPanel.setVisible(false);
				QRPanel.setVisible(false);
				specificStatsPanel.setVisible(false);
				itemPanel.setVisible(false);
				
				homePanel.setVisible(true);
			}
		});
		
		//the register listener
		mntmRegister.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				homePanel.setVisible(false);
				donatePanel.setVisible(false);
				generalStatsPanel.setVisible(false);
				QRPanel.setVisible(false);
				specificStatsPanel.setVisible(false);
				itemPanel.setVisible(false);
				
				registrationPanel.setVisible(true);
				
			}
		});

		//the donate listener
		mntmDonate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				homePanel.setVisible(false);
				generalStatsPanel.setVisible(false);
				registrationPanel.setVisible(false);
				QRPanel.setVisible(false);
				specificStatsPanel.setVisible(false);
				itemPanel.setVisible(false);
				
				donatePanel.setVisible(true);
			}
		});
		
		//the stats listener
		mntmStatistics.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				homePanel.setVisible(false);
				donatePanel.setVisible(false);
				registrationPanel.setVisible(false);
				QRPanel.setVisible(false);
				specificStatsPanel.setVisible(false);
				itemPanel.setVisible(false);
				
				generalStatsPanel.setVisible(true);
			}
		});
		
		//the help listener
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
	/** End listeners */
	}
	
//Methods	
	
	/**
	 * Builds the general basic things that a JFrame needs.
	 * Including the title, size, location, exit operation, and the custom icon.
	 */
	private void basicSetup()
	{
		setTitle("Silent Auction");
		setBounds(100, 100, 700, 500);
		setLocation((int)(screenwidth - getWidth()) / 2, (int)(screenheight - getHeight()) / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("assets/logo.png");
		setIconImage(img.getImage());
	}
	
}

