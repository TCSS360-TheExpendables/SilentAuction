package frontend;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 * This class creates the home 'page' which will hold all of the items that are able to be bid on.
 * 
 * @author The Expendables
 * @version 0.0.0.1
 * @since 20.05.2015
 */
public class Home extends JPanel
{

//Fields	
	
	//Text field that holds the filter box.
	private JTextField homeFilterText;
	
//Constructor
	
	/**
	 * Creates the home page.
	 */
	public Home()
	{
		
		//Make the layout border layout.
		setLayout(new BorderLayout(0, 0));
		
		//Creates the inner panel with the gridbag layout.
		JPanel innerHomePanel = new JPanel();
		add(innerHomePanel, BorderLayout.CENTER);
		GridBagLayout gbl_innerHomePanel = new GridBagLayout();
		gbl_innerHomePanel.columnWidths = new int[]{0, 0, 0};
		gbl_innerHomePanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_innerHomePanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_innerHomePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		innerHomePanel.setLayout(gbl_innerHomePanel);
		
	/** Starts fields */
		//filter label
		JLabel homeFilterLabel = new JLabel("Filter:");
		GridBagConstraints gbc_homeFilterLabel = new GridBagConstraints();
		gbc_homeFilterLabel.insets = new Insets(0, 0, 5, 5);
		gbc_homeFilterLabel.anchor = GridBagConstraints.EAST;
		gbc_homeFilterLabel.gridx = 0;
		gbc_homeFilterLabel.gridy = 0;
		innerHomePanel.add(homeFilterLabel, gbc_homeFilterLabel);
		
		//filter combo box (the drop down)
		JComboBox homeFilterCombo = new JComboBox();
		GridBagConstraints gbc_homeFilterCombo = new GridBagConstraints();
		gbc_homeFilterCombo.insets = new Insets(0, 0, 5, 0);
		gbc_homeFilterCombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_homeFilterCombo.gridx = 1;
		gbc_homeFilterCombo.gridy = 0;
		innerHomePanel.add(homeFilterCombo, gbc_homeFilterCombo);
		
		//a space
		JLabel space1 = new JLabel(" ");
		GridBagConstraints gbc_space1 = new GridBagConstraints();
		gbc_space1.insets = new Insets(0, 0, 5, 0);
		gbc_space1.gridx = 1;
		gbc_space1.gridy = 1;
		innerHomePanel.add(space1, gbc_space1);
		
		//filter text box
		homeFilterText = new JTextField();
		GridBagConstraints gbc_homeFilterText = new GridBagConstraints();
		gbc_homeFilterText.insets = new Insets(0, 0, 5, 0);
		gbc_homeFilterText.fill = GridBagConstraints.HORIZONTAL;
		gbc_homeFilterText.gridx = 1;
		gbc_homeFilterText.gridy = 2;
		innerHomePanel.add(homeFilterText, gbc_homeFilterText);
		homeFilterText.setColumns(10);
		
		//a space
		JLabel space2 = new JLabel(" ");
		GridBagConstraints gbc_space2 = new GridBagConstraints();
		gbc_space2.insets = new Insets(0, 0, 5, 0);
		gbc_space2.gridx = 1;
		gbc_space2.gridy = 3;
		innerHomePanel.add(space2, gbc_space2);
		
		//filter button
		JButton homeFilterButton = new JButton("Filter");
		GridBagConstraints gbc_homeFilterButton = new GridBagConstraints();
		gbc_homeFilterButton.insets = new Insets(0, 0, 5, 0);
		gbc_homeFilterButton.anchor = GridBagConstraints.EAST;
		gbc_homeFilterButton.gridx = 1;
		gbc_homeFilterButton.gridy = 4;
		innerHomePanel.add(homeFilterButton, gbc_homeFilterButton);
		
		//a space
		JLabel space3 = new JLabel(" ");
		GridBagConstraints gbc_space3 = new GridBagConstraints();
		gbc_space3.insets = new Insets(0, 0, 5, 0);
		gbc_space3.gridx = 1;
		gbc_space3.gridy = 5;
		innerHomePanel.add(space3, gbc_space3);
		
		//items panel
		JPanel homeItemsPanel = new JPanel();
		GridBagConstraints gbc_homeItemsPanel = new GridBagConstraints();
		gbc_homeItemsPanel.insets = new Insets(0, 0, 5, 0);
		gbc_homeItemsPanel.gridwidth = 2;
		gbc_homeItemsPanel.fill = GridBagConstraints.BOTH;
		gbc_homeItemsPanel.gridx = 0;
		gbc_homeItemsPanel.gridy = 6;
		innerHomePanel.add(homeItemsPanel, gbc_homeItemsPanel);
		homeItemsPanel.setLayout(new BorderLayout(0, 0));
		
		//the scroll pane
		JScrollPane homeScrolPane = new JScrollPane();
		homeItemsPanel.add(homeScrolPane, BorderLayout.CENTER);
		
		//items to bid on label
		JLabel homeItemstoBidLabel = new JLabel("Items to Bid On");
		homeScrolPane.setColumnHeaderView(homeItemstoBidLabel);
		
		//items list
		JList<String> homeItemsList = new JList<String>();
		JTextField itemField = new JTextField();
		homeScrolPane.setViewportView(homeItemsList);
		
		//bid button
		JButton homeBidButton = new JButton("Bid on Selected Item");
		GridBagConstraints gbc_homeBidButton = new GridBagConstraints();
		gbc_homeBidButton.anchor = GridBagConstraints.EAST;
		gbc_homeBidButton.gridx = 1;
		gbc_homeBidButton.gridy = 7;
		innerHomePanel.add(homeBidButton, gbc_homeBidButton);
	/** End fields */
		
//		List<Item> items = Auction.
		String[] items = new String[20]; //20 is the number of items
		for (int i = 0; i < 20; i++)
		{
			items[i] = i + ": hello" + i;//"index: item_name highest_price"
			itemField.setText(items[i]);
			homeItemsList.setModel(new AbstractListModel()
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
	}
}
