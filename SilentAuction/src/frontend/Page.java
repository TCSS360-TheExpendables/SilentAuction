package frontend;

import java.awt.BorderLayout;
<<<<<<< HEAD
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page frame = new Page();
					frame.setVisible(true);
				} catch (Exception e) {
=======
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuItem;

import java.awt.CardLayout;

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
>>>>>>> origin/master
					e.printStackTrace();
				}
			}
		});
	}
<<<<<<< HEAD
=======
	
//Constructor	
>>>>>>> origin/master

	/**
	 * Create the frame.
	 */
<<<<<<< HEAD
	public Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
=======
	public Page()
	{
		setTitle("Silent Auction");
		
		ImageIcon img = new ImageIcon("assets/logo.png");
		setIconImage(img.getImage());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmHome = new JMenuItem("Home");

		menuBar.add(mntmHome);
		
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
		

		JPanel homePanel = new JPanel();
		homePanel.setBackground(Color.BLUE);
		contentPane.add(homePanel);
		
		JPanel donatePanel = new JPanel();
		donatePanel.setBackground(Color.GREEN);
		contentPane.add(donatePanel);
		
		JPanel generalStatsPanel = new JPanel();
		generalStatsPanel.setBackground(Color.ORANGE);
		contentPane.add(generalStatsPanel);
		
		JPanel QRPanel = new JPanel();
		QRPanel.setBackground(Color.GRAY);
		contentPane.add(QRPanel);
		
		JPanel specificStatsPanel = new JPanel();
		specificStatsPanel.setBackground(Color.MAGENTA);
		contentPane.add(specificStatsPanel);
		
		JPanel itemPanel = new JPanel();
		itemPanel.setBackground(Color.PINK);
		contentPane.add(itemPanel);
		
		JPanel registrationPanel = new JPanel();
		registrationPanel.setBackground(Color.RED);
		contentPane.add(registrationPanel);
		
		
		
		pack();
		setLocation((int)(screenwidth - getWidth()) / 2, (int)(screenheight - getHeight()) / 2);
		
		mntmHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				donatePanel.setVisible(false);
				generalStatsPanel.setVisible(false);
				
				homePanel.setVisible(true);
			}
		});
		

		mntmDonate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homePanel.setVisible(false);
				generalStatsPanel.setVisible(false);
				
				donatePanel.setVisible(true);
			}
		});
		
		mntmStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homePanel.setVisible(false);
				donatePanel.setVisible(false);
				
				generalStatsPanel.setVisible(true);
			}
		});
		
		mntmHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CONNER PUT THE DIALOG BOX HERE
			}
		});
	}
	
//Methods

}
>>>>>>> origin/master
