package ooadproject;

import com.toedter.calendar.JDateChooser;
//import static frugallab.Project_.projectId;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static ooadproject.Login.pj;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author komalshirore
 */
public class CreateProject extends javax.swing.JPanel {

    private JTable jtable1;
    ProjectJpaController p;
    BudgetJpaController b;
    static ProfilePage pj1;
    /**
     * Creates new form CreateProject
     */
    public CreateProject() {
         p = new ProjectJpaController();
         b = new BudgetJpaController(this);
        initComponents();
    }
    

    public void setEquipmentDetails(JTextField equipmentDetails) {
        this.equipmentDetails = equipmentDetails;
    }

    public void setExpectedBudget(JTextField expectedBudget) {
        this.expectedBudget = expectedBudget;
    }

    public void setLink(JTextField link) {
        this.link = link;
    }

    public void setProjectedBudget(JTextField projectedBudget) {
        this.projectedBudget = projectedBudget;
    }


    public void setDescriptionValue(JTextField descriptionValue) {
        this.descriptionValue = descriptionValue;
    }

    public void setjComboBox1(JComboBox jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public void setOutcomeValue(JTextField outcomeValue) {
        this.outcomeValue = outcomeValue;
    }

    public void setProjEndDate(JDateChooser projEndDate) {
        this.projEndDate = projEndDate;
    }

    public void setProjStartDate(JDateChooser projStartDate) {
        this.projStartDate = projStartDate;
    }

   

    public void setProjectNameValue(JTextField projectNameValue) {
        this.projectNameValue = projectNameValue;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outcomeValue = new javax.swing.JTextField();
        projectOutcome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        catagory = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        descriptionValue = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        budget = new javax.swing.JLabel();
        projectDesciption = new javax.swing.JLabel();
        projectNameValue = new javax.swing.JTextField();
        projectName = new javax.swing.JLabel();
        saveProject = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        cancelProject = new javax.swing.JButton();
        createProjectLabel = new javax.swing.JLabel();
        projStartDate = new com.toedter.calendar.JDateChooser();
        projEndDate = new com.toedter.calendar.JDateChooser();
        equipmentLabel = new javax.swing.JLabel();
        linkLabel = new javax.swing.JLabel();
        projectedBudgetLabel = new javax.swing.JLabel();
        expectedBudgetLabel = new javax.swing.JLabel();
        equipmentDetails = new javax.swing.JTextField();
        link = new javax.swing.JTextField();
        projectedBudget = new javax.swing.JTextField();
        expectedBudget = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        projectOutcome.setText("Project Outcome");

        jLabel5.setText("End Date");

        catagory.setText("Project Catagory");

        jLabel3.setText("Start Date");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Timeline Details:");

        budget.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        budget.setText("Budget");

        projectDesciption.setText("Project Description");

        projectNameValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectNameValueActionPerformed(evt);
            }
        });

        projectName.setText("Project Name:");

        saveProject.setText("Save");
        saveProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProjectActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CS", "MECH", "ELECTRICAL", "CIVIL" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        cancelProject.setText("Cancel");
        cancelProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelProjectActionPerformed(evt);
            }
        });

        createProjectLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        createProjectLabel.setText("Create New Project:");

        equipmentLabel.setText("Equipment Details");

        linkLabel.setText("Link");

        projectedBudgetLabel.setText("Projected Budget");

        expectedBudgetLabel.setText("Expected Budget");

        equipmentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipmentDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(catagory)
                                    .addComponent(projectName)
                                    .addComponent(projectDesciption)
                                    .addComponent(projectedBudgetLabel)
                                    .addComponent(projectOutcome)
                                    .addComponent(equipmentLabel)
                                    .addComponent(linkLabel)
                                    .addComponent(expectedBudgetLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(projectNameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                            .addComponent(descriptionValue)
                                            .addComponent(outcomeValue)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(139, 139, 139)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(equipmentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(projectedBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(expectedBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(179, 179, 179)
                                            .addComponent(saveProject))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(187, 187, 187)
                                            .addComponent(projEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelProject)
                                    .addComponent(projStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(budget))
                    .addComponent(createProjectLabel))
                .addContainerGap(270, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(createProjectLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catagory))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectDesciption))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outcomeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectOutcome))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(budget)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipmentLabel)
                    .addComponent(equipmentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linkLabel)
                    .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectedBudgetLabel)
                    .addComponent(projectedBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expectedBudgetLabel)
                    .addComponent(expectedBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(projStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(projEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelProject)
                    .addComponent(saveProject))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProjectActionPerformed
       
        if(projectNameValue.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this, "All Fields are Mandatory!","Warning",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
        System.out.println("Save Action");
       // String[] array = new String[projectData.getColumnCount()];
         String[] array = new String[7];
    	array[0] = projectNameValue.getText();
    	array[1] = descriptionValue.getText();
        //status
        String status=("New");
        array[2] = status;
        array[3] = (String) jComboBox1.getSelectedItem();
        //catagory
        array[4] = outcomeValue.getText();
        
        //Budget
         String[] array2 = new String[5];
        array2[0] = equipmentDetails.getText();
        array2[1] = link.getText();
        array2[2] = projectedBudget.getText();
        array2[3] = expectedBudget.getText();
        array2[4] = projectNameValue.getText();
        
        
        
         Date dateFromDateChooser1 = projStartDate.getDate();
         try
         {
         SimpleDateFormat sfd=new SimpleDateFormat("yyyy-MM-dd"+" "+ "00:00:00");
        array[5] = sfd.format(dateFromDateChooser1);
        DateFormat dt=new SimpleDateFormat("yyyy-MM-dd"+" "+ "00:00:00");
        Date startDate=dt.parse(array[5]);
        Date dateFromDateChooser2 = projEndDate.getDate();
        array[6] = sfd.format(dateFromDateChooser2);
        Date endDate=dt.parse(array[6]);
       
   	    p.addRow(array);
         
             }
         catch(ParseException ex)
         {
             ex.getMessage();
         }
         b.addRow(array2);
         ProfilePage.frame.dispose();
         JOptionPane.showMessageDialog(this, "Project Created!","Message",JOptionPane.PLAIN_MESSAGE);
         pj1=new ProfilePage();
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                pj1.createAndShowGUI();
            }
        });
        } 
         
    }//GEN-LAST:event_saveProjectActionPerformed

    private void cancelProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelProjectActionPerformed
        // TODO add your handling code here:
        descriptionValue.setText("");
        outcomeValue.setText("");
        projEndDate.cleanup();
        projStartDate.cleanup();
        projectNameValue.setText("");
    }//GEN-LAST:event_cancelProjectActionPerformed

    private void projectNameValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectNameValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectNameValueActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void equipmentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipmentDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipmentDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel budget;
    private javax.swing.JButton cancelProject;
    private javax.swing.JLabel catagory;
    private javax.swing.JLabel createProjectLabel;
    private javax.swing.JTextField descriptionValue;
    private javax.swing.JTextField equipmentDetails;
    private javax.swing.JLabel equipmentLabel;
    private javax.swing.JTextField expectedBudget;
    private javax.swing.JLabel expectedBudgetLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField link;
    private javax.swing.JLabel linkLabel;
    private javax.swing.JTextField outcomeValue;
    public com.toedter.calendar.JDateChooser projEndDate;
    public com.toedter.calendar.JDateChooser projStartDate;
    private javax.swing.JLabel projectDesciption;
    private javax.swing.JLabel projectName;
    private javax.swing.JTextField projectNameValue;
    private javax.swing.JLabel projectOutcome;
    private javax.swing.JTextField projectedBudget;
    private javax.swing.JLabel projectedBudgetLabel;
    private javax.swing.JButton saveProject;
    // End of variables declaration//GEN-END:variables
}
