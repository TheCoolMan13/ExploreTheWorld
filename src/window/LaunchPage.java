package window;

import inventory.Inventory;
import inventory.Item;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("Show Inventory");
    JButton addItem = new JButton("Add a new item");
    JTextArea displayArea = new JTextArea();

    // 1. Declare the JScrollPane
    JScrollPane scrollPane;
    Inventory inventory;

    public LaunchPage(Inventory inventory) {
        this.inventory = inventory;

        // --- FRAME SETUP ---
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);

        // --- BUTTON SETUP ---
        myButton.setBounds(100, 20, 100, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);


        addItem.setBounds(220, 20 , 100 , 40);
        addItem.setFocusable(false);
        addItem.addActionListener(this);

        // --- TEXT AREA & SCROLL PANE SETUP ---
        displayArea.setEditable(false);
        // Notice we removed displayArea.setBounds()!

        // 2. Initialize the scroll pane and put the displayArea inside it
        scrollPane = new JScrollPane(displayArea);
        // Give the size and position to the SCROLL PANE instead
        scrollPane.setBounds(50, 80, 500, 400);
        // Optional: Force the vertical scrollbar to always show
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        // --- ADD TO FRAME ---
        frame.add(myButton);
        frame.add(addItem);
        frame.add(scrollPane); // 3. Add the scroll pane, NOT the displayArea!

        // --- MAKE VISIBLE ---
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            String invText = inventory.getInventoryString();
            displayArea.setText(invText);

            // Pro-tip: This forces the scrollbar to jump to the top when loaded
            displayArea.setCaretPosition(0);
        }
        if (e.getSource() == addItem){
            System.out.println("CLICK");
            String itemName = "Placeholder"; int itemQuantity = 0;
            Item itemToAdd = new Item(itemName , itemQuantity);
            inventory.addItem(itemToAdd);
        }
    }
}
