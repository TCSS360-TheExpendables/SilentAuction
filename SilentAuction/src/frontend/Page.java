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
		
		//pack();
		setLocation((int)(screenwidth - getWidth()) / 2, (int)(screenheight - getHeight()) / 2);
		
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