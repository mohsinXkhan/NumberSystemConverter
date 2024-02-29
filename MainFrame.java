import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;

public class MainFrame extends JFrame implements ActionListener {
	private CardLayout cardLayout;
	private JPanel mainPanel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	// private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	// private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	// private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	// private JTextField textField_14;
	// private JTextField textField_11;

	public MainFrame() {
		cardLayout = new CardLayout();
		mainPanel = new JPanel(cardLayout);
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBounds(0, 0, 591, 436);
		getContentPane().add(mainPanel);

		getContentPane().setLayout(null);

		// Set up your menu bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu_5 = new JMenu("Home");
		menuBar.add(mnNewMenu_5);

		JMenuItem mntmInfo = new JMenuItem("Info");
		mnNewMenu_5.add(mntmInfo);
		mntmInfo.setActionCommand("Info");
		mntmInfo.addActionListener(this);

		JMenuItem mntmHelp = new JMenuItem("Help");
		mnNewMenu_5.add(mntmHelp);
		mntmHelp.setActionCommand("Help");
		mntmHelp.addActionListener(this);

		JMenu mnNewMenu = new JMenu("Binary");
		menuBar.add(mnNewMenu);

		JMenuItem mntmBinaryToDecimal = new JMenuItem("-> Decimal");
		mntmBinaryToDecimal.setActionCommand("BinaryToDecimal");
		mntmBinaryToDecimal.addActionListener(this);
		mnNewMenu.add(mntmBinaryToDecimal);

		JMenuItem mntmBinaryToHexa = new JMenuItem("-> Hexadecimal");
		mntmBinaryToHexa.setActionCommand("BinaryToHexa");
		mntmBinaryToHexa.addActionListener(this);
		mnNewMenu.add(mntmBinaryToHexa);

		JMenuItem mntmBinaryToOctal = new JMenuItem("-> Octal");
		mntmBinaryToOctal.setActionCommand("BinaryToOctal");
		mntmBinaryToOctal.addActionListener(this);
		mnNewMenu.add(mntmBinaryToOctal);

		/*
		 * JMenuItem mntmBinaryToBCD = new JMenuItem("-> BCD");
		 * mntmBinaryToBCD.setActionCommand("BinaryToBCD");
		 * mntmBinaryToBCD.addActionListener(this);
		 * mnNewMenu.add(mntmBinaryToBCD);
		 */

		JMenu mnNewMenu_1 = new JMenu("Decimal");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmDecimalToBinary = new JMenuItem("-> Binary");
		mntmDecimalToBinary.setActionCommand("DecimalToBinary");
		mntmDecimalToBinary.addActionListener(this);
		mnNewMenu_1.add(mntmDecimalToBinary);

		JMenuItem mntmDecimalToHexa = new JMenuItem("-> Hexadecimal");
		mntmDecimalToHexa.setActionCommand("DecimalToHexa");
		mntmDecimalToHexa.addActionListener(this);
		mnNewMenu_1.add(mntmDecimalToHexa);

		JMenuItem mntmDecimalToOctal = new JMenuItem("-> Octal");
		mntmDecimalToOctal.setActionCommand("DecimalToOctal");
		mntmDecimalToOctal.addActionListener(this);
		mnNewMenu_1.add(mntmDecimalToOctal);

		/*
		 * JMenuItem mntmDecimalToBCD = new JMenuItem("-> BCD");
		 * mntmDecimalToBCD.setActionCommand("DecimalToBCD");
		 * mntmDecimalToBCD.addActionListener(this);
		 * mnNewMenu_1.add(mntmDecimalToBCD);
		 */

		// Menu: Octal
		JMenu mnNewMenu_2 = new JMenu("Octal");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmOctalToBinary = new JMenuItem("-> Binary");
		mntmOctalToBinary.setActionCommand("OctalToBinary");
		mntmOctalToBinary.addActionListener(this);
		mnNewMenu_2.add(mntmOctalToBinary);

		JMenuItem mntmOctalToDecimal = new JMenuItem("-> Decimal");
		mntmOctalToDecimal.setActionCommand("OctalToDecimal");
		mntmOctalToDecimal.addActionListener(this);
		mnNewMenu_2.add(mntmOctalToDecimal);

		JMenuItem mntmOctalToHexa = new JMenuItem("-> Hexadecimal");
		mntmOctalToHexa.setActionCommand("OctalToHexa");
		mntmOctalToHexa.addActionListener(this);
		mnNewMenu_2.add(mntmOctalToHexa);

		/*
		 * JMenuItem mntmOctalToBCD = new JMenuItem("-> BCD");
		 * mntmOctalToBCD.setActionCommand("OctalToBCD");
		 * mntmOctalToBCD.addActionListener(this);
		 * mnNewMenu_2.add(mntmOctalToBCD);
		 */

		// Menu: Hexadecimal
		JMenu mnNewMenu_3 = new JMenu("Hexadecimal");
		menuBar.add(mnNewMenu_3);

		JMenuItem mntmHexadecimalToDecimal = new JMenuItem("-> Decimal");
		mntmHexadecimalToDecimal.setActionCommand("HexaToDecimal");
		mntmHexadecimalToDecimal.addActionListener(this);
		mnNewMenu_3.add(mntmHexadecimalToDecimal);

		JMenuItem mntmHexadecimalToBinary = new JMenuItem("-> Binary");
		mntmHexadecimalToBinary.setActionCommand("HexaToBinary");
		mntmHexadecimalToBinary.addActionListener(this);
		mnNewMenu_3.add(mntmHexadecimalToBinary);

		JMenuItem mntmHexadecimalToOctal = new JMenuItem("-> Octal");
		mntmHexadecimalToOctal.setActionCommand("HexaToOctal");
		mntmHexadecimalToOctal.addActionListener(this);
		mnNewMenu_3.add(mntmHexadecimalToOctal);

		/*
		 * JMenuItem mntmHexadeciToBCD = new JMenuItem("-> BCD");
		 * mntmHexadeciToBCD.setActionCommand("HexaToBCD");
		 * mntmHexadeciToBCD.addActionListener(this);
		 * mnNewMenu_3.add(mntmHexadeciToBCD);
		 */

		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		getContentPane().setLayout(null);

		// Create and add your conversion panels to the mainPanel
		JPanel info = new JPanel();
		info.setBackground(Color.WHITE);
		// Add components to info
		mainPanel.add(info, "Info");
		info.setLayout(null);

		JLabel lblNewLabel_12 = new JLabel("Number System Converter");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(50, 57, 488, 106);
		info.add(lblNewLabel_12);

		JLabel lblNewLabel_35 = new JLabel("     A Java Application for AlphaNumeric Conversions");
		lblNewLabel_35.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblNewLabel_35.setBounds(79, 129, 444, 21);
		info.add(lblNewLabel_35);

		JLabel lblNewLabel_36 = new JLabel("Welcome to our Number System Converter project.");
		lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_36.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_36.setBounds(50, 177, 488, 42);
		info.add(lblNewLabel_36);

		JLabel lblNewLabel_6 = new JLabel("Created by:");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_6.setBounds(266, 270, 140, 27);
		info.add(lblNewLabel_6);

		JLabel lblNewLabel_70 = new JLabel(
				"................................................................................................................................................................................");
		lblNewLabel_70.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_70.setForeground(new Color(100, 149, 237));
		lblNewLabel_70.setBounds(205, 230, 201, 14);
		info.add(lblNewLabel_70);

		JLabel lblNewLabel_18 = new JLabel("Mohsin Khan");
		lblNewLabel_18.setForeground(Color.BLACK);
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_18.setBounds(-78, 308, 764, 27);
		info.add(lblNewLabel_18);

		JLabel lblNewLabel_92 = new JLabel("Yuvraj Kadam");
		lblNewLabel_92.setForeground(Color.BLACK);
		lblNewLabel_92.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_92.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_92.setBounds(-78, 362, 764, 27);
		info.add(lblNewLabel_92);

		JLabel lblNewLabel_120 = new JLabel("Taqi Khan");
		lblNewLabel_120.setForeground(Color.BLACK);
		lblNewLabel_120.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_120.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_120.setBounds(99, 336, 407, 27);
		info.add(lblNewLabel_120);

		JPanel help = new JPanel();
		help.setBackground(Color.WHITE);
		// Add components to helpPanel
		mainPanel.add(help, "Help");
		help.setLayout(null);

		JLabel lblNewLabel_13 = new JLabel("User Guide:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13.setBounds(33, 11, 100, 53);
		help.add(lblNewLabel_13);

		JLabel lblNewLabel_37 = new JLabel("1. Choose Conversion:");
		lblNewLabel_37.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_37.setBounds(43, 64, 142, 14);
		help.add(lblNewLabel_37);

		JLabel lblNewLabel_38 = new JLabel("From the menu, select Conversion.");
		lblNewLabel_38.setBounds(173, 64, 394, 14);
		help.add(lblNewLabel_38);

		JLabel lblNewLabel_39 = new JLabel("2. Enter the Number:");
		lblNewLabel_39.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_39.setBounds(42, 95, 122, 14);
		help.add(lblNewLabel_39);

		JLabel lblNewLabel_40 = new JLabel("In the input field, enter the number you want to convert.");
		lblNewLabel_40.setBounds(161, 95, 356, 14);
		help.add(lblNewLabel_40);

		JLabel lblNewLabel_41 = new JLabel("3. Conversion:");
		lblNewLabel_41.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_41.setBounds(43, 120, 100, 14);
		help.add(lblNewLabel_41);

		JLabel lblNewLabel_42 = new JLabel("Click the \"Submit\" button.");
		lblNewLabel_42.setBounds(129, 120, 388, 14);
		help.add(lblNewLabel_42);

		JLabel lblNewLabel_43 = new JLabel("4. Result:");
		lblNewLabel_43.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_43.setBounds(43, 145, 74, 14);
		help.add(lblNewLabel_43);

		JLabel lblNewLabel_44 = new JLabel("The binary equivalent will be displayed in the output area.");
		lblNewLabel_44.setBounds(97, 145, 379, 14);
		help.add(lblNewLabel_44);

		JLabel lblNewLabel_45 = new JLabel("Additional Tips:");
		lblNewLabel_45.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_45.setBounds(32, 211, 186, 25);
		help.add(lblNewLabel_45);

		JLabel lblNewLabel_46 = new JLabel("Ensure you enter valid input for accurate conversions.");
		lblNewLabel_46.setBounds(42, 250, 489, 14);
		help.add(lblNewLabel_46);

		JLabel lblNewLabel_47 = new JLabel("Enjoy quick and hassle-free number system conversions!");
		lblNewLabel_47.setBounds(43, 275, 403, 14);
		help.add(lblNewLabel_47);

		JPanel binaryToDecimal = new JPanel();
		binaryToDecimal.setBackground(Color.WHITE);
		binaryToDecimal.setBounds(0, 0, 591, 436);
		// Add components to binaryToDecimalPanel
		mainPanel.add(binaryToDecimal, "BinaryToDecimal");
		binaryToDecimal.setLayout(null);

		JLabel lblNewLabel = new JLabel("Binary to Decimal");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 571, 26);
		binaryToDecimal.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Enter a Binary number:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 48, 135, 26);
		binaryToDecimal.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(142, 52, 98, 20);
		binaryToDecimal.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Result:");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setBounds(10, 85, 571, 340);
		binaryToDecimal.add(lblNewLabel_2);

		JButton btnBinaryToDeci = new JButton("Submit");
		btnBinaryToDeci.setBounds(256, 51, 89, 23);
		binaryToDecimal.add(btnBinaryToDeci);

		// Set the action command for the Binary to Decimal menu item
		mntmBinaryToDecimal.setActionCommand("BinaryToDecimal");

		// Add ActionListener logic to perform the Binary to Decimal conversion
		btnBinaryToDeci.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");// to debugg
				// Get the binary input from binaryInputTextField
				String binaryInput = textField.getText();
				// Perform the binary to decimal conversion logic
				try {
					int decimalResult = Integer.parseInt(binaryInput, 2);
					// Display the result in the resultLabel or update a text area
					lblNewLabel_2.setText("Result: " + decimalResult);
				} catch (NumberFormatException ex) {
					lblNewLabel_2.setText("Invalid binary input.");
				}
				cardLayout.show(mainPanel, "BinaryToDecimal");
			}
		});

		JPanel binaryToHexa = new JPanel();
		binaryToHexa.setBackground(Color.WHITE);
		// Add components to binaryToHexaPanel
		mainPanel.add(binaryToHexa, "BinaryToHexa");
		// binaryToOctal = new JPanel();
		binaryToHexa.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Binary to Hexa");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 11, 571, 23);
		binaryToHexa.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Enter a Binary number:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 45, 132, 23);
		binaryToHexa.add(lblNewLabel_4);

		textField_1 = new JTextField();
		textField_1.setBounds(139, 47, 86, 20);
		binaryToHexa.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Result:");
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setBounds(10, 79, 571, 346);
		binaryToHexa.add(lblNewLabel_5);

		JButton btnBinaryToHexa = new JButton("Submit");
		btnBinaryToHexa.setBounds(247, 46, 89, 23);
		binaryToHexa.add(btnBinaryToHexa);

		// Set the action command for the Binary to Hexadecimal menu item
		mntmBinaryToHexa.setActionCommand("BinaryToHexa");

		// Add ActionListener logic to perform the Binary to Hexadecimal conversion
		btnBinaryToHexa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");// to debugg
				// Get the binary input from binaryInputTextField
				String binaryInput = textField.getText();
				// Perform the binary to hexadecimal conversion logic
				try {
					int decimalResult = Integer.parseInt(binaryInput, 2);
					String hexa = Integer.toHexString(decimalResult);
					// Display the result in the resultLabel or update a text area
					lblNewLabel_5.setText("Result: " + hexa.toUpperCase(getLocale()));
				} catch (NumberFormatException ex) {
					lblNewLabel_5.setText("Invalid binary input.");
				}
				cardLayout.show(mainPanel, "BinaryToHexa");
			}
		});

		JPanel binaryToOctal = new JPanel();
		binaryToOctal.setBackground(Color.WHITE);
		// Add components to binaryToOctalPanel
		mainPanel.add(binaryToOctal, "BinaryToOctal");
		binaryToOctal.setLayout(null);

		JLabel lblNewLabel_556 = new JLabel("Binary to Octal");
		lblNewLabel_556.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_556.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_556.setBounds(10, 11, 571, 27);
		binaryToOctal.add(lblNewLabel_556);

		JLabel lblNewLabel_7 = new JLabel("Enter a Binary number:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 49, 136, 20);
		binaryToOctal.add(lblNewLabel_7);

		textField_2 = new JTextField();
		textField_2.setBounds(141, 50, 86, 20);
		binaryToOctal.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Result:");
		lblNewLabel_8.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_8.setBounds(10, 80, 571, 345);
		binaryToOctal.add(lblNewLabel_8);

		JButton btnBinaryToOctal = new JButton("Submit");
		btnBinaryToOctal.setBounds(237, 49, 89, 23);
		binaryToOctal.add(btnBinaryToOctal);

		// Set the action command for the Binary to octal menu item
		mntmBinaryToOctal.setActionCommand("BinaryToOctal");

		// Add ActionListener logic to perform the Binary to octal conversion
		btnBinaryToOctal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");// to debugg
				// Get the binary input from binaryInputTextField
				String binaryInputToOctal = textField_2.getText();
				// Perform the binary to octal conversion logic
				try {
					int decimalResult = Integer.parseInt(binaryInputToOctal, 2);
					String octal = Integer.toOctalString(decimalResult);
					// Display the result in the resultLabel or update a text area
					lblNewLabel_8.setText("Result: " + octal);
				} catch (NumberFormatException ex) {
					lblNewLabel_8.setText("Invalid binary input.");
				}
				cardLayout.show(mainPanel, "BinaryToOctal");
			}
		});

		/*
		 * JPanel binaryToBCD = new JPanel();
		 * binaryToBCD.setBackground(Color.WHITE);
		 * // Add components to binaryToBCDPanel
		 * mainPanel.add(binaryToBCD, "BinaryToBCD");
		 * binaryToBCD.setLayout(null);
		 * 
		 * JLabel lblNewLabel_9 = new JLabel("Binary to BCD");
		 * lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		 * lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		 * lblNewLabel_9.setBounds(10, 11, 571, 27);
		 * binaryToBCD.add(lblNewLabel_9);
		 * 
		 * JLabel lblNewLabel_10 = new JLabel("Enter a Binary number:");
		 * lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 * lblNewLabel_10.setBounds(10, 48, 151, 21);
		 * binaryToBCD.add(lblNewLabel_10);
		 * 
		 * textField_3 = new JTextField();
		 * textField_3.setBounds(141, 49, 86, 20);
		 * binaryToBCD.add(textField_3);
		 * textField_3.setColumns(10);
		 * 
		 * JLabel lblNewLabel_11 = new JLabel("Result:");
		 * lblNewLabel_11.setVerticalAlignment(SwingConstants.TOP);
		 * lblNewLabel_11.setBounds(10, 80, 571, 345);
		 * binaryToBCD.add(lblNewLabel_11);
		 * 
		 * JButton btnBinaryToBCD = new JButton("Submit");
		 * btnBinaryToBCD.setBounds(237, 48, 89, 23);
		 * binaryToBCD.add(btnBinaryToBCD);
		 */

		JPanel decimalToBinary = new JPanel();
		decimalToBinary.setBackground(Color.WHITE);
		// Add components to decimalToBinaryPanel

		mainPanel.add(decimalToBinary, "DecimalToBinary");
		decimalToBinary.setLayout(null);

		JLabel lblNewLabel_14 = new JLabel("Decimal to Binary");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_14.setBounds(10, 11, 571, 22);
		decimalToBinary.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("Enter a number:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15.setBounds(10, 44, 122, 22);
		decimalToBinary.add(lblNewLabel_15);

		textField_4 = new JTextField();
		textField_4.setBounds(105, 46, 86, 20);
		decimalToBinary.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_16 = new JLabel("Result:");
		lblNewLabel_16.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_16.setBounds(10, 77, 571, 348);
		decimalToBinary.add(lblNewLabel_16);

		JButton btnDeciToBinary = new JButton("Submit");
		btnDeciToBinary.setBounds(204, 45, 89, 23);
		decimalToBinary.add(btnDeciToBinary);

		// Set the action command for the deciaml to binary menu item
		mntmDecimalToBinary.setActionCommand("DecimalToBinary");

		// Add ActionListener logic to perform the decimal to binary conversion
		btnDeciToBinary.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");// to debugg
				// Get the decimal input from InputTextField
				String deciamlInput = textField_4.getText();
				// Perform the decimal to binary conversion logic
				try {
					int intDeciamlInput = Integer.parseInt(deciamlInput);
					String binary = Integer.toBinaryString(intDeciamlInput);
					// Display the result in the resultLabel or update a text area
					lblNewLabel_16.setText("Result: " + binary);
				} catch (NumberFormatException ex) {
					lblNewLabel_16.setText("Invalid decimal input.");
				}
				cardLayout.show(mainPanel, "DecimalToBinary");
			}
		});

		JPanel decimalToHexa = new JPanel();
		decimalToHexa.setBackground(Color.WHITE);
		// Add components to decimalToHexaPanel
		mainPanel.add(decimalToHexa, "DecimalToHexa");
		decimalToHexa.setLayout(null);

		JLabel lblNewLabel_17 = new JLabel("Decimal to Hexadecimal");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_17.setBounds(10, 11, 571, 23);
		decimalToHexa.add(lblNewLabel_17);

		JLabel lblNewLabel_198 = new JLabel("Enter a number:");
		lblNewLabel_198.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_198.setBounds(10, 45, 112, 23);
		decimalToHexa.add(lblNewLabel_198);

		textField_5 = new JTextField();
		textField_5.setBounds(104, 47, 86, 20);
		decimalToHexa.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_19 = new JLabel("Result:");
		lblNewLabel_19.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_19.setBounds(10, 79, 571, 346);
		decimalToHexa.add(lblNewLabel_19);

		JButton btnDeciToHexa = new JButton("Submit");
		btnDeciToHexa.setBounds(206, 46, 89, 23);
		decimalToHexa.add(btnDeciToHexa);

		// Set the action command for the decimal to hexaDecimal menu item
		mntmDecimalToHexa.setActionCommand("DecimalToHexa");

		// Add ActionListener logic to perform the decimal to hexaDecimal conversion
		btnDeciToHexa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");// to debugg
				// Get the decimal input from InputTextField
				String deciamlInput = textField_5.getText();
				// Perform the decimal to hexadecimal conversion logic
				try {
					int intDeciamlInput = Integer.parseInt(deciamlInput);
					String hexa = Integer.toHexString(intDeciamlInput);
					// Display the result in the resultLabel or update a text area
					lblNewLabel_19.setText("Result: " + hexa.toUpperCase(getLocale()));
				} catch (NumberFormatException ex) {
					lblNewLabel_19.setText("Invalid decimal input.");
				}
				cardLayout.show(mainPanel, "DecimalToHexa");
			}
		});

		// new panel added for decimal to octal which was missing
		JPanel decimalToOctal = new JPanel();
		decimalToOctal.setBackground(Color.WHITE);
		// Add components to decimalToHexaPanel
		mainPanel.add(decimalToOctal, "DecimalToOctal");
		decimalToOctal.setLayout(null);

		JLabel lblNewLabel_171 = new JLabel("Decimal to Octal");
		lblNewLabel_171.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_171.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_171.setBounds(10, 11, 571, 23);
		decimalToOctal.add(lblNewLabel_171);

		JLabel lblNewLabel_1981 = new JLabel("Enter a number:");
		lblNewLabel_1981.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1981.setBounds(10, 45, 112, 23);
		decimalToOctal.add(lblNewLabel_1981);

		textField_5 = new JTextField();
		textField_5.setBounds(104, 47, 86, 20);
		decimalToOctal.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_191 = new JLabel("Result:");
		lblNewLabel_191.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_191.setBounds(10, 79, 571, 346);
		decimalToOctal.add(lblNewLabel_191);

		JButton btnDeciToOctal = new JButton("Submit");
		btnDeciToOctal.setBounds(206, 46, 89, 23);
		decimalToOctal.add(btnDeciToOctal);

		// Set the action command for the decimal to octal menu item
		mntmDecimalToOctal.setActionCommand("DecimalToOctal");

		// Add ActionListener logic to perform the decimal to octal conversion
		btnDeciToOctal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");// to debugg
				// Get the decimal input from InputTextField
				String deciamlInput = textField_5.getText();
				// Perform the decimal to octal conversion logic
				try {
					int intDeciamlInput = Integer.parseInt(deciamlInput);
					String octal = Integer.toOctalString(intDeciamlInput);
					// Display the result in the resultLabel or update a text area
					lblNewLabel_191.setText("Result: " + octal.toUpperCase(getLocale()));
				} catch (NumberFormatException ex) {
					lblNewLabel_191.setText("Invalid decimal input.");
				}
				cardLayout.show(mainPanel, "DecimalToOctal");
			}
		});

		/*
		 * JPanel decimalToBCD = new JPanel();
		 * decimalToBCD.setBackground(Color.WHITE);
		 * // Add components to decimalToBCDPanel
		 * mainPanel.add(decimalToBCD, "DecimalToBCD");
		 * decimalToBCD.setLayout(null);
		 * 
		 * JLabel lblNewLabel_20 = new JLabel("Decimal to BCD");
		 * lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		 * lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		 * lblNewLabel_20.setBounds(10, 11, 571, 24);
		 * decimalToBCD.add(lblNewLabel_20);
		 * 
		 * JLabel lblNewLabel_21 = new JLabel("Enter a number:");
		 * lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 * lblNewLabel_21.setBounds(10, 46, 107, 24);
		 * decimalToBCD.add(lblNewLabel_21);
		 * 
		 * textField_6 = new JTextField();
		 * textField_6.setBounds(103, 49, 86, 20);
		 * decimalToBCD.add(textField_6);
		 * textField_6.setColumns(10);
		 * 
		 * JLabel lblNewLabel_22 = new JLabel("Result:");
		 * lblNewLabel_22.setVerticalAlignment(SwingConstants.TOP);
		 * lblNewLabel_22.setBounds(10, 81, 571, 344);
		 * decimalToBCD.add(lblNewLabel_22);
		 * 
		 * JButton btnDeciToBCD = new JButton("Submit");
		 * btnDeciToBCD.setBounds(206, 48, 89, 23);
		 * decimalToBCD.add(btnDeciToBCD);
		 */

		JPanel octalToBinary = new JPanel();
		octalToBinary.setBackground(Color.WHITE);
		// Add components to octalToBinaryPanel
		mainPanel.add(octalToBinary, "OctalToBinary");
		octalToBinary.setLayout(null);

		JLabel lblNewLabel_23 = new JLabel("Octal to Binary");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setBounds(10, 11, 571, 24);
		octalToBinary.add(lblNewLabel_23);

		JLabel lblNewLabel_24 = new JLabel("Enter a number:");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_24.setBounds(10, 46, 133, 24);
		octalToBinary.add(lblNewLabel_24);

		textField_7 = new JTextField();
		textField_7.setBounds(106, 49, 86, 20);
		octalToBinary.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel_25 = new JLabel("Result:");
		lblNewLabel_25.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_25.setBounds(10, 81, 571, 344);
		octalToBinary.add(lblNewLabel_25);

		JButton btnOctalToBinary = new JButton("Submit");
		btnOctalToBinary.setBounds(202, 48, 89, 23);
		octalToBinary.add(btnOctalToBinary);

		// Set the action command for the octal to binary menu item
		mntmOctalToBinary.setActionCommand("OctalToBinary");

		// Add ActionListener logic to perform the octal to binary conversion
		btnOctalToBinary.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");// to debugg
				// Get the octal input from InputTextField
				String octalInput = textField_7.getText();
				// Perform the octal to binary conversion logic
				try {
					String binary = Integer.toBinaryString(Integer.parseInt(octalInput, 8));
					// Display the result in the resultLabel or update a text area
					lblNewLabel_25.setText("Result: " + binary);
				} catch (NumberFormatException ex) {
					lblNewLabel_25.setText("Invalid decimal input.");
				}
				cardLayout.show(mainPanel, "OctalToBinary");
			}
		});

		JPanel octalToDecimal = new JPanel();
		octalToDecimal.setBackground(Color.WHITE);
		// Add components to octalToDecimalPanel
		mainPanel.add(octalToDecimal, "OctalToDecimal");
		octalToDecimal.setLayout(null);

		JLabel lblNewLabel_26 = new JLabel("Octal to Decimal");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setBounds(10, 11, 571, 22);
		octalToDecimal.add(lblNewLabel_26);

		JLabel lblNewLabel_27 = new JLabel("Enter a number:");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_27.setBounds(10, 44, 111, 22);
		octalToDecimal.add(lblNewLabel_27);

		textField_8 = new JTextField();
		textField_8.setBounds(104, 46, 86, 20);
		octalToDecimal.add(textField_8);
		textField_8.setColumns(10);

		JLabel lblNewLabel_28 = new JLabel("Result:");
		lblNewLabel_28.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_28.setBounds(10, 77, 571, 348);
		octalToDecimal.add(lblNewLabel_28);

		JButton btnOctalToDeci = new JButton("Submit");
		btnOctalToDeci.setBounds(202, 45, 89, 23);
		octalToDecimal.add(btnOctalToDeci);

		// Set the action command for the octal to Decimal menu item
		mntmOctalToDecimal.setActionCommand("OctalToDecimal");

		// Add ActionListener logic to perform the octal to Decimal conversion
		btnOctalToDeci.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");// to debugg
				// Get the octal input from InputTextField
				String octalInput = textField_8.getText();
				// Perform the octal to decimal conversion logic
				try {
					int octToDec = Integer.parseInt(octalInput, 8);
					// Display the result in the resultLabel or update a text area
					lblNewLabel_28.setText("Result: " + octToDec);
				} catch (NumberFormatException ex) {
					lblNewLabel_28.setText("Invalid decimal input.");
				}
				cardLayout.show(mainPanel, "OctalToDecimal");
			}
		});

		JPanel octalToHexa = new JPanel();
		octalToHexa.setBackground(Color.WHITE);
		// Add components to octalToHexaPanel
		mainPanel.add(octalToHexa, "OctalToHexa");
		octalToHexa.setLayout(null);

		JLabel lblNewLabel_29 = new JLabel("Octal to Hexadecimal");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_29.setBounds(10, 11, 571, 24);
		octalToHexa.add(lblNewLabel_29);

		JLabel lblNewLabel_30 = new JLabel("Enter a number:");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_30.setBounds(10, 46, 123, 24);
		octalToHexa.add(lblNewLabel_30);

		textField_9 = new JTextField();
		textField_9.setBounds(103, 49, 86, 20);
		octalToHexa.add(textField_9);
		textField_9.setColumns(10);

		JLabel lblNewLabel_31 = new JLabel("Result:");
		lblNewLabel_31.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_31.setBounds(10, 81, 571, 344);
		octalToHexa.add(lblNewLabel_31);

		JButton btnOctalToHexa = new JButton("Submit");
		btnOctalToHexa.setBounds(199, 48, 89, 23);
		octalToHexa.add(btnOctalToHexa);

		// Set the action command for the octal to hexaDecimal menu item
		mntmOctalToHexa.setActionCommand("OctalToHexa");

		// Add ActionListener logic to perform the octal to hexaDecimal conversion
		btnOctalToHexa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");// to debugg
				// Get the octal input from InputTextField
				String octalInput = textField_9.getText();
				// Perform the octal to hexadecimal conversion logic
				try {
					int decimalValue = Integer.parseInt(octalInput, 8);// octal to deciaml
					String hexaValue = Integer.toHexString(decimalValue);// deciaml to hexa
					// Display the result in the resultLabel or update a text area
					lblNewLabel_31.setText("Result: " + hexaValue.toUpperCase(getLocale()));
				} catch (NumberFormatException ex) {
					lblNewLabel_31.setText("Invalid decimal input.");
				}
				cardLayout.show(mainPanel, "OctalToHexa");
			}
		});

		/*
		 * JPanel octalToBCD = new JPanel();
		 * octalToBCD.setBackground(Color.WHITE);
		 * // Add components to octalToBCDPanel
		 * mainPanel.add(octalToBCD, "OctalToBCD");
		 * octalToBCD.setLayout(null);
		 * 
		 * JLabel lblNewLabel_32 = new JLabel("Octal to BCD");
		 * lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		 * lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 14));
		 * lblNewLabel_32.setBounds(10, 11, 571, 23);
		 * octalToBCD.add(lblNewLabel_32);
		 * 
		 * JLabel lblNewLabel_33 = new JLabel("Enter a number:");
		 * lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 * lblNewLabel_33.setBounds(10, 45, 104, 14);
		 * octalToBCD.add(lblNewLabel_33);
		 * 
		 * textField_10 = new JTextField();
		 * textField_10.setBounds(104, 43, 86, 20);
		 * octalToBCD.add(textField_10);
		 * textField_10.setColumns(10);
		 * 
		 * JLabel lblNewLabel_34 = new JLabel("Result:");
		 * lblNewLabel_34.setVerticalAlignment(SwingConstants.TOP);
		 * lblNewLabel_34.setBounds(10, 77, 571, 348);
		 * octalToBCD.add(lblNewLabel_34);
		 * 
		 * JButton btnOctalToBCD = new JButton("Submit");
		 * btnOctalToBCD.setBounds(200, 42, 89, 23);
		 * octalToBCD.add(btnOctalToBCD);
		 */

		// yaha se gadbad ho rahi hai mohsin, jaise tune upar sare dummy banay hai
		// (eg.textField, lblNewLabel, etc.. waise hi aage ke bhi bana de)

		// neeche wala commented part delete karke tu apna daal de

		/*
		 * ye maine try kiya lekin nhi ho raha hai
		 * JPanel hexaToDecimal = new JPanel();
		 * hexaToDecimal.setBackground(Color.WHITE);
		 * // Add components to hexaToDecimalPanel
		 * mainPanel.add(hexaToDecimal, "HexaToDecimal");
		 * hexaToDecimal.setLayout(null);
		 * 
		 * JLabel lblNewLabel_35 = new JLabel("hexa to deci");
		 * lblNewLabel_35.setFont(new Font("Tahoma", Font.BOLD, 14));
		 * lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
		 * lblNewLabel_35.setBounds(10, 11, 571, 14);
		 * hexaToDecimal.add(lblNewLabel_35);
		 * 
		 * JLabel lblNewLabel_36 = new JLabel("Enter a number:");
		 * lblNewLabel_36.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 * lblNewLabel_36.setBounds(10, 46, 123, 24);
		 * hexaToDecimal.add(lblNewLabel_36);
		 * 
		 * textField_11 = new JTextField();
		 * textField_11.setBounds(103, 49, 86, 20);
		 * hexaToDecimal.add(textField_11);
		 * textField_11.setColumns(10);
		 * 
		 * JLabel lblNewLabel_37 = new JLabel("Result:");
		 * lblNewLabel_37.setVerticalAlignment(SwingConstants.TOP);
		 * lblNewLabel_37.setBounds(10, 81, 571, 344);
		 * hexaToDecimal.add(lblNewLabel_37);
		 * 
		 * JButton btnHexaToDecimal = new JButton("Submit");
		 * btnHexaToDecimal.setBounds(199, 48, 89, 23);
		 * hexaToDecimal.add(btnHexaToDecimal);
		 * 
		 * // Set the action command for the Binary to Decimal menu item
		 * mntmHexadecimalToDecimal.setActionCommand("HexaToDecimal");
		 * 
		 * // Add ActionListener logic to perform the Binary to Decimal conversion
		 * btnOctalToHexa.addActionListener(new ActionListener() {
		 * 
		 * @Override
		 * public void actionPerformed(ActionEvent e) {
		 * System.out.println("Button clicked");// to debugg
		 * // Get the binary input from binaryInputTextField
		 * String hexaInput = textField_11.getText();
		 * // Perform the binary to decimal conversion logic
		 * try {
		 * // int intOctalInput = Integer.parseInt(octalInput);
		 * int decimalValue = Integer.parseInt(hexaInput, 16);// octal to deciaml
		 * // String hexaValue = Integer.toHexString(decimalValue);// deciaml to hexa
		 * // Display the result in the resultLabel or update a text area
		 * lblNewLabel_37.setText("Result: " + decimalValue);
		 * } catch (NumberFormatException ex) {
		 * lblNewLabel_37.setText("Invalid decimal input.");
		 * }
		 * cardLayout.show(mainPanel, "HexaToDecimal");
		 * }
		 * });
		 * 
		 */

		JPanel hexaToDecimal = new JPanel();
		hexaToDecimal.setBackground(Color.WHITE);
		// Add components to hexaToDecimalPanel
		mainPanel.add(hexaToDecimal, "HexaToDecimal");
		hexaToDecimal.setLayout(null);

		JLabel lblNewLabel_48 = new JLabel("Hexadecimal to Decimal");
		lblNewLabel_48.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_48.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_48.setBounds(10, 11, 571, 39);
		hexaToDecimal.add(lblNewLabel_48);

		JLabel lblNewLabel_49 = new JLabel("Enter a number:");
		lblNewLabel_49.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_49.setBounds(10, 74, 134, 14);
		hexaToDecimal.add(lblNewLabel_49);

		textField_11 = new JTextField();
		textField_11.setBounds(103, 72, 86, 20);
		hexaToDecimal.add(textField_11);
		textField_11.setColumns(10);

		JButton btnHexatoDeci = new JButton("Submit");
		btnHexatoDeci.setBounds(198, 71, 89, 23);
		hexaToDecimal.add(btnHexatoDeci);

		JLabel lblNewLabel_50 = new JLabel("Result:");
		lblNewLabel_50.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_50.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_50.setBounds(10, 116, 559, 309);
		hexaToDecimal.add(lblNewLabel_50);

		// Set the action command for the hexa to Decimal menu item
		mntmHexadecimalToDecimal.setActionCommand("HexaToDecimal");

		// Add ActionListener logic to perform the octal to Decimal conversion
		btnHexatoDeci.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");// to debugg
				// Get the hexa input from InputTextField
				String hexInput = textField_11.getText();
				// Perform the hexa to decimal conversion logic
				try {
					int hexaToDec = Integer.parseInt(hexInput, 16);
					// Display the result in the resultLabel or update a text area
					lblNewLabel_50.setText("Result: " + hexaToDec);
				} catch (NumberFormatException ex) {
					lblNewLabel_50.setText("Invalid decimal input.");
				}
				cardLayout.show(mainPanel, "HexaToDecimal");
			}
		});

		JPanel hexaToBinary = new JPanel();
		hexaToBinary.setBackground(Color.WHITE);
		// Add components to hexaToBinaryPanel
		mainPanel.add(hexaToBinary, "HexaToBinary");
		hexaToBinary.setLayout(null);

		JLabel lblNewLabel_51 = new JLabel("Hexadecimal to Binary");
		lblNewLabel_51.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_51.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_51.setBounds(10, 11, 571, 39);
		hexaToBinary.add(lblNewLabel_51);

		JLabel lblNewLabel_52 = new JLabel("Enter a number:");
		lblNewLabel_52.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_52.setBounds(20, 61, 161, 14);
		hexaToBinary.add(lblNewLabel_52);

		textField_12 = new JTextField();
		textField_12.setBounds(114, 59, 86, 20);
		hexaToBinary.add(textField_12);
		textField_12.setColumns(10);

		JButton btnHexatoBinary = new JButton("Submit");
		btnHexatoBinary.setBounds(210, 58, 89, 23);
		hexaToBinary.add(btnHexatoBinary);

		JLabel lblNewLabel_53 = new JLabel("Result:");
		lblNewLabel_53.setBounds(20, 98, 302, 14);
		hexaToBinary.add(lblNewLabel_53);

		// Set the action command for the hexa to binary menu item
		mntmHexadecimalToBinary.setActionCommand("HexaToBinary");

		// Add ActionListener logic to perform the Hexa to Binary conversion
		btnHexatoBinary.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");// to debugg
				// Get the hexa input from InputTextField
				String hexInput = textField_12.getText();
				// Perform the hexa to binary conversion logic
				try {
					String binary = Integer.toBinaryString(Integer.parseInt(hexInput, 16));
					// Display the result in the resultLabel or update a text area
					lblNewLabel_53.setText("Result: " + binary);
				} catch (NumberFormatException ex) {
					lblNewLabel_53.setText("Invalid decimal input.");
				}
				cardLayout.show(mainPanel, "HexaToBinary");
			}
		});

		JPanel hexaToOctal = new JPanel();
		hexaToOctal.setBackground(Color.WHITE);
		// Add components to hexaToOctalPanel
		mainPanel.add(hexaToOctal, "HexaToOctal");
		hexaToOctal.setLayout(null);

		JLabel lblNewLabel_54 = new JLabel("Hexadecimal to Octal");
		lblNewLabel_54.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_54.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_54.setBounds(10, 11, 571, 47);
		hexaToOctal.add(lblNewLabel_54);

		JLabel lblNewLabel_55 = new JLabel("Enter a number:");
		lblNewLabel_55.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_55.setBounds(20, 69, 143, 14);
		hexaToOctal.add(lblNewLabel_55);

		JButton btnHexatoOctal = new JButton("Submit");
		btnHexatoOctal.setBounds(209, 66, 89, 23);
		hexaToOctal.add(btnHexatoOctal);

		textField_13 = new JTextField();
		textField_13.setBounds(113, 67, 86, 20);
		hexaToOctal.add(textField_13);
		textField_13.setColumns(10);

		JLabel lblNewLabel_56 = new JLabel("Result: ");
		lblNewLabel_56.setBounds(20, 105, 302, 14);
		hexaToOctal.add(lblNewLabel_56);

		// Set the action command for the hexa to octal menu item
		mntmHexadecimalToOctal.setActionCommand("HexaToOctal");

		// Add ActionListener logic to perform the octal to Decimal conversion
		btnHexatoOctal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");// to debugg
				// Get the hexa input from InputTextField
				String hexInput = textField_13.getText();
				// Perform the hexa to octal conversion logic
				try {
					String octal = Integer.toOctalString(Integer.parseInt(hexInput, 16));
					// Display the result in the resultLabel or update a text area
					lblNewLabel_56.setText("Result: " + octal);
				} catch (NumberFormatException ex) {
					lblNewLabel_56.setText("Invalid decimal input.");
				}
				cardLayout.show(mainPanel, "HexaToOctal");
			}
		});

		/*
		 * JPanel hexaToBCD = new JPanel();
		 * hexaToBCD.setBackground(Color.WHITE);
		 * // Add components to hexaToBCDPanel
		 * mainPanel.add(hexaToBCD, "hexaToBCD");
		 * hexaToBCD.setLayout(null);
		 * 
		 * JLabel lblNewLabel_57 = new JLabel("Hexadecimal to BCD");
		 * lblNewLabel_57.setHorizontalAlignment(SwingConstants.CENTER);
		 * lblNewLabel_57.setFont(new Font("Tahoma", Font.BOLD, 14));
		 * lblNewLabel_57.setBounds(10, 11, 571, 33);
		 * hexaToBCD.add(lblNewLabel_57);
		 * 
		 * JLabel lblNewLabel_58 = new JLabel("Enter a number:");
		 * lblNewLabel_58.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 * lblNewLabel_58.setBounds(20, 55, 159, 14);
		 * hexaToBCD.add(lblNewLabel_58);
		 * 
		 * textField_14 = new JTextField();
		 * textField_14.setBounds(112, 53, 86, 20);
		 * hexaToBCD.add(textField_14);
		 * textField_14.setColumns(10);
		 * 
		 * JButton btnHexatoBCD = new JButton("Submit");
		 * btnHexatoBCD.setBounds(208, 52, 89, 23);
		 * hexaToBCD.add(btnHexatoBCD);
		 * 
		 * JLabel lblNewLabel_59 = new JLabel("Result: ");
		 * lblNewLabel_59.setBounds(22, 94, 441, 14);
		 * hexaToBCD.add(lblNewLabel_59);
		 * 
		 */

		// Add more conversion panels in a similar way

		/*
		 * JPanel BinaryToDecimal = new JPanel();
		 * BinaryToDecimal.setBackground(Color.WHITE);
		 * BinaryToDecimal.setBounds(0, 0, 588, 423);
		 * getContentPane().add(BinaryToDecimal);
		 * BinaryToDecimal.setLayout(null);
		 * 
		 * JPanel panel = new JPanel();
		 * panel.setBackground(Color.WHITE);
		 * panel.setBounds(0, 0, 588, 423);
		 * BinaryToDecimal.add(panel);
		 * panel.setLayout(null);
		 * 
		 * JLabel lblNewLabel = new JLabel("New label");
		 * lblNewLabel.setBounds(250, 11, 46, 14);
		 * panel.add(lblNewLabel);
		 * 
		 * JLabel lblNewLabel_1 = new JLabel("New label");
		 * lblNewLabel_1.setBounds(31, 67, 46, 14);
		 * panel.add(lblNewLabel_1);
		 * 
		 * textField = new JTextField();
		 * textField.setBounds(102, 64, 86, 20);
		 * panel.add(textField);
		 * textField.setColumns(10);
		 * 
		 * JLabel lblNewLabel_2 = new JLabel("New label");
		 * lblNewLabel_2.setBounds(31, 108, 316, 212);
		 * panel.add(lblNewLabel_2);
		 * 
		 * JLabel lblNewJgoodiesTitle =
		 * DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
		 * lblNewJgoodiesTitle.setBounds(134, 11, 88, 14);
		 * panel.add(lblNewJgoodiesTitle);
		 * 
		 * JPanel BinaryToHexa = new JPanel();
		 * BinaryToHexa.setBackground(Color.WHITE);
		 * BinaryToHexa.setBounds(0, 0, 588, 423);
		 * getContentPane().add(BinaryToHexa);
		 * 
		 * JPanel BinaryToOctal = new JPanel();
		 * BinaryToOctal.setBounds(0, 0, 588, 423);
		 * getContentPane().add(BinaryToOctal);
		 * 
		 * JPanel BinaryToBCD = new JPanel();
		 * BinaryToBCD.setBounds(0, 0, 588, 423);
		 * getContentPane().add(BinaryToBCD);
		 * 
		 * JPanel DecimalToBinary = new JPanel();
		 * DecimalToBinary.setBounds(0, 0, 588, 423);
		 * getContentPane().add(DecimalToBinary);
		 * 
		 * JPanel DecimalToHexa = new JPanel();
		 * DecimalToHexa.setBounds(0, 0, 588, 423);
		 * getContentPane().add(DecimalToHexa);
		 * 
		 * JPanel DecimalToOctal = new JPanel();
		 * DecimalToOctal.setBounds(0, 0, 588, 423);
		 * getContentPane().add(DecimalToOctal);
		 * 
		 * JPanel DecimalToBCD = new JPanel();
		 * DecimalToBCD.setBounds(0, 0, 588, 423);
		 * getContentPane().add(DecimalToBCD);
		 * 
		 * JPanel OctalToBinary = new JPanel();
		 * OctalToBinary.setBounds(0, 0, 588, 423);
		 * getContentPane().add(OctalToBinary);
		 * 
		 * JPanel OctalToDecimal = new JPanel();
		 * OctalToDecimal.setBounds(0, 0, 588, 423);
		 * getContentPane().add(OctalToDecimal);
		 * 
		 * JPanel OctalToHexa = new JPanel();
		 * OctalToHexa.setBounds(0, 0, 588, 423);
		 * getContentPane().add(OctalToHexa);
		 * 
		 * JPanel OctalToBCD = new JPanel();
		 * OctalToBCD.setBounds(0, 0, 588, 423);
		 * getContentPane().add(OctalToBCD);
		 * 
		 * JPanel HexaToDecimal = new JPanel();
		 * HexaToDecimal.setBounds(0, 0, 588, 423);
		 * getContentPane().add(HexaToDecimal);
		 * 
		 * JPanel HexaToBinary = new JPanel();
		 * HexaToBinary.setBounds(0, 0, 588, 423);
		 * getContentPane().add(HexaToBinary);
		 * 
		 * JPanel HexaToOctal = new JPanel();
		 * HexaToOctal.setBounds(0, 0, 588, 423);
		 * getContentPane().add(HexaToOctal);
		 * 
		 * JPanel HexaToBCD = new JPanel();
		 * HexaToBCD.setBounds(0, 0, 588, 423);
		 * getContentPane().add(HexaToBCD);
		 * 
		 * JPanel BcdToDecimal = new JPanel();
		 * BcdToDecimal.setBounds(0, 0, 588, 423);
		 * getContentPane().add(BcdToDecimal);
		 * 
		 * JPanel BcdToHexa = new JPanel();
		 * BcdToHexa.setBounds(0, 0, 588, 423);
		 * getContentPane().add(BcdToHexa);
		 * 
		 * JPanel BcdToOctal = new JPanel();
		 * BcdToOctal.setBounds(0, 0, 588, 423);
		 * getContentPane().add(BcdToOctal);
		 * 
		 * JPanel BcdToBinary = new JPanel();
		 * BcdToBinary.setBounds(0, 0, 588, 423);
		 * getContentPane().add(BcdToBinary);
		 */

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(607, 499);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		cardLayout.show(mainPanel, command); // Show the panel with the specified name
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new MainFrame();
		});
	}
}
