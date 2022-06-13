/** 
 * NewTeamPanel.java
 * Runs window for creating new Team
 *
 * @author Anna Lehner
 * @version 6/12/22 Sprint 2
 */
package main.java.memoranda.ui;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class NewTeamPanel {
	
	/**
	 * Opening New Team Window
	 */
	public NewTeamPanel() {

        JFrame NAframe = new JFrame("New Team");
        JPanel buttonPane = new JPanel();
        JPanel fieldsPanel = new JPanel();

        JLabel teamName = new JLabel("Team Name:");
        JTextField teamNameField = new JTextField("");
        JLabel teamMembers = new JLabel("Team Members:");
        JLabel teamM1 = new JLabel("User 1:");
        JTextField teamM1Field = new JTextField("");
        JRadioButton scrumMaster1 = new JRadioButton();
        scrumMaster1.setActionCommand("S");
        JRadioButton gitMaster1 = new JRadioButton();
        gitMaster1.setActionCommand("G");
        JRadioButton coder1 = new JRadioButton();
        coder1.setActionCommand("C");
        scrumMaster1.setText("Scrum Master");
        gitMaster1.setText("Git Master");
        coder1.setText("Coder");
        scrumMaster1.setSelected(true);
        JLabel teamM2 = new JLabel("User 2:");
        JTextField teamM2Field = new JTextField("");
        JRadioButton scrumMaster2 = new JRadioButton();
        scrumMaster2.setActionCommand("S");
        JRadioButton gitMaster2 = new JRadioButton();
        gitMaster2.setActionCommand("G");
        JRadioButton coder2 = new JRadioButton();
        coder2.setActionCommand("C");
        scrumMaster2.setText("Scrum Master");
        gitMaster2.setText("Git Master");
        coder2.setText("Coder");
        gitMaster2.setSelected(true);
        JLabel teamM3 = new JLabel("User 3:");
        JTextField teamM3Field = new JTextField("");
        JRadioButton scrumMaster3 = new JRadioButton();
        scrumMaster3.setActionCommand("S");
        JRadioButton gitMaster3 = new JRadioButton();
        gitMaster3.setActionCommand("G");
        JRadioButton coder3 = new JRadioButton();
        coder3.setActionCommand("C");
        scrumMaster3.setText("Scrum Master");
        gitMaster3.setText("Git Master");
        coder3.setText("Coder");
        coder3.setSelected(true);
        JLabel teamM4 = new JLabel("User 4:");
        JTextField teamM4Field = new JTextField("");
        JRadioButton scrumMaster4 = new JRadioButton();
        scrumMaster4.setActionCommand("S");
        JRadioButton gitMaster4 = new JRadioButton();
        gitMaster4.setActionCommand("G");
        JRadioButton coder4 = new JRadioButton();
        coder4.setActionCommand("C");
        scrumMaster4.setText("Scrum Master");
        gitMaster4.setText("Git Master");
        coder4.setText("Coder");
        coder4.setSelected(true);
        JButton create = new JButton("Create");
        JButton cancel = new JButton("Cancel");

        fieldsPanel.setLayout(new BoxLayout(fieldsPanel, BoxLayout.PAGE_AXIS));
        buttonPane.setLayout(new FlowLayout());
        
        ButtonGroup group1 = new ButtonGroup();
        group1.add(scrumMaster1);
        group1.add(gitMaster1);
        group1.add(coder1);
        ButtonGroup group2 = new ButtonGroup();
        group2.add(scrumMaster2);
        group2.add(gitMaster2);
        group2.add(coder2);
        ButtonGroup group3 = new ButtonGroup();
        group3.add(scrumMaster3);
        group3.add(gitMaster3);
        group3.add(coder3);
        ButtonGroup group4 = new ButtonGroup();
        group4.add(scrumMaster4);
        group4.add(gitMaster4);
        group4.add(coder4);

        
        fieldsPanel.add(teamName);
        fieldsPanel.add(teamNameField);
        fieldsPanel.add(teamMembers);
        fieldsPanel.add(teamM1);
        fieldsPanel.add(teamM1Field);
        fieldsPanel.add(scrumMaster1);
        fieldsPanel.add(gitMaster1);
        fieldsPanel.add(coder1);
        fieldsPanel.add(teamM2);
        fieldsPanel.add(teamM2Field);
        fieldsPanel.add(scrumMaster2);
        fieldsPanel.add(gitMaster2);
        fieldsPanel.add(coder2);
        fieldsPanel.add(teamM3);
        fieldsPanel.add(teamM3Field);
        fieldsPanel.add(scrumMaster3);
        fieldsPanel.add(gitMaster3);
        fieldsPanel.add(coder3);
        fieldsPanel.add(teamM4);
        fieldsPanel.add(teamM4Field);
        fieldsPanel.add(scrumMaster4);
        fieldsPanel.add(gitMaster4);
        fieldsPanel.add(coder4);
        buttonPane.add(create);
        buttonPane.add(cancel);
        NAframe.add(fieldsPanel, BorderLayout.PAGE_START);
        NAframe.add(buttonPane, BorderLayout.PAGE_END);

        NAframe.pack();
        NAframe.setLocationRelativeTo(null);
        NAframe.setVisible(true);
        
        /**
         * Action Listener for "Create" button, calls constructor and write() for UserAccount
         */
        create.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String inTeamName = teamNameField.getText();
            	String inTeamM1 = teamM1Field.getText();
            	String inTeamM2 = teamM2Field.getText();
            	String inTeamM3 = teamM3Field.getText();
            	String inTeamM4 = teamM4Field.getText();
            	int inTM1R, inTM2R, inTM3R, inTM4R;
            	if(group1.getSelection().getActionCommand().compareTo("S") == 0) {
            		inTM1R = 0;
            		}
            	else if (group1.getSelection().getActionCommand().compareTo("G") == 0) {
            		inTM1R = 1;
            		}
            	else {
            		inTM1R = 2;
            	}
            	if(group2.getSelection().getActionCommand().compareTo("S") == 0) {
            		inTM2R = 0;
            		}
            	else if (group2.getSelection().getActionCommand().compareTo("G") == 0) {
            		inTM2R = 1;
            		}
            	else {
            		inTM2R = 2;
            	}
            	if(group3.getSelection().getActionCommand().compareTo("S") == 0) {
            		inTM3R = 0;
            		}
            	else if (group3.getSelection().getActionCommand().compareTo("G") == 0) {
            		inTM3R = 1;
            		}
            	else {
            		inTM3R = 2;
            	}
            	if(group4.getSelection().getActionCommand().compareTo("S") == 0) {
            		inTM4R = 0;
            		}
            	else if (group1.getSelection().getActionCommand().compareTo("G") == 0) {
            		inTM4R = 1;
            		}
            	else {
            		inTM4R = 2;
            	}
            	Team newTeam = new Team(inTeamName, inTeamM1, inTM1R, inTeamM2, inTM2R,
            			inTeamM3, inTM3R, inTeamM4, inTM4R);
                NAframe.dispose();               
            }
        });
        
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	NAframe.dispose(); 
            }	
        });
	}
}

