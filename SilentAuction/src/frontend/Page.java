package frontend;

import java.awt.CardLayout;
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

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

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
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
		contentPane.add(homePanel);
		homePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel innerHomePanel = new JPanel();
		homePanel.add(innerHomePanel, BorderLayout.CENTER);
		GridBagLayout gbl_innerHomePanel = new GridBagLayout();
		gbl_innerHomePanel.columnWidths = new int[]{0, 0, 0};
		gbl_innerHomePanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_innerHomePanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_innerHomePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
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
		gbc_panel.insets = new Insets(0, 0, 5, 0);
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
		
		JButton btnNewButton_1 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 7;
		innerHomePanel.add(btnNewButton_1, gbc_btnNewButton_1);
		
//		List<Item> items = Auction.
		String[] items = new String[20]; //20 is the number of items
		for (int i = 0; i < 20; i++)
		{
			items[i] = i + ": hello" + i;//"index: item_name highest_price"
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
		contentPane.add(generalStatsPanel);
		generalStatsPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		generalStatsPanel.add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblTotalNumberOf = new JLabel("Total Number of Bids Placed During the Event:");
		GridBagConstraints gbc_lblTotalNumberOf = new GridBagConstraints();
		gbc_lblTotalNumberOf.anchor = GridBagConstraints.WEST;
		gbc_lblTotalNumberOf.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalNumberOf.gridx = 0;
		gbc_lblTotalNumberOf.gridy = 0;
		panel_1.add(lblTotalNumberOf, gbc_lblTotalNumberOf);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 0;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel(" ");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 1;
		panel_1.add(label_1, gbc_label_1);
		
		JLabel lblAverageNumberOf = new JLabel("Average Number of Bids Per Item:");
		GridBagConstraints gbc_lblAverageNumberOf = new GridBagConstraints();
		gbc_lblAverageNumberOf.anchor = GridBagConstraints.WEST;
		gbc_lblAverageNumberOf.insets = new Insets(0, 0, 5, 5);
		gbc_lblAverageNumberOf.gridx = 0;
		gbc_lblAverageNumberOf.gridy = 2;
		panel_1.add(lblAverageNumberOf, gbc_lblAverageNumberOf);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 2;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel(" ");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 2;
		gbc_label_2.gridy = 3;
		panel_1.add(label_2, gbc_label_2);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 3;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 4;
		panel_1.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_2.add(scrollPane_1, BorderLayout.CENTER);
		
		JList list_1 = new JList();
		scrollPane_1.setViewportView(list_1);
		
		JLabel lblListOfAll = new JLabel("List of All Items");
		scrollPane_1.setColumnHeaderView(lblListOfAll);
		
		//QR panel
		JPanel QRPanel = new JPanel();
		contentPane.add(QRPanel);
		
		//specific stats panel
		JPanel specificStatsPanel = new JPanel();
		contentPane.add(specificStatsPanel);
		specificStatsPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		specificStatsPanel.add(panel_3, BorderLayout.CENTER);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblItemName = new JLabel("Item Name:");
		GridBagConstraints gbc_lblItemName = new GridBagConstraints();
		gbc_lblItemName.anchor = GridBagConstraints.WEST;
		gbc_lblItemName.insets = new Insets(0, 0, 5, 5);
		gbc_lblItemName.gridx = 0;
		gbc_lblItemName.gridy = 0;
		panel_3.add(lblItemName, gbc_lblItemName);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 0;
		panel_3.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel label_4 = new JLabel(" ");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 1;
		panel_3.add(label_4, gbc_label_4);
		
		JLabel label_3 = new JLabel(" ");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 2;
		gbc_label_3.gridy = 1;
		panel_3.add(label_3, gbc_label_3);
		
		JLabel lblCurrentBidl = new JLabel("Current Bid:");
		GridBagConstraints gbc_lblCurrentBidl = new GridBagConstraints();
		gbc_lblCurrentBidl.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentBidl.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrentBidl.gridx = 0;
		gbc_lblCurrentBidl.gridy = 2;
		panel_3.add(lblCurrentBidl, gbc_lblCurrentBidl);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 2;
		panel_3.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel label_5 = new JLabel(" ");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 3;
		panel_3.add(label_5, gbc_label_5);
		
		JLabel lblDonor = new JLabel("Total Number of bids:");
		GridBagConstraints gbc_lblDonor = new GridBagConstraints();
		gbc_lblDonor.anchor = GridBagConstraints.WEST;
		gbc_lblDonor.insets = new Insets(0, 0, 5, 5);
		gbc_lblDonor.gridx = 0;
		gbc_lblDonor.gridy = 4;
		panel_3.add(lblDonor, gbc_lblDonor);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 4;
		panel_3.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel label_6 = new JLabel(" ");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 1;
		gbc_label_6.gridy = 5;
		panel_3.add(label_6, gbc_label_6);
		
		JLabel lblNewLabel = new JLabel("Starting Bid:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 6;
		panel_3.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 0, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 6;
		panel_3.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		//item panel
		JPanel itemPanel = new JPanel();
		contentPane.add(itemPanel);
		itemPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		itemPanel.add(panel_4, BorderLayout.CENTER);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0};
		gbl_panel_4.rowHeights = new int[]{0};
		gbl_panel_4.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
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

