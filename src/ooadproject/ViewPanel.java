/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadproject;

/**
 *
 * @author komalshirore
 */
public class ViewPanel extends javax.swing.JPanel {
    

    /**
     * Creates new form ViewPanel
     */
    public ViewPanel() {
        initComponents();
        
        StringBuilder sb = new StringBuilder();
        sb.append("<HTML><div align=center><H1>My Projects</h1><h2>").append("<br>----------------------------------<br>");
        ProjectModel projectModel = new ProjectModel();
        for(String projectName : projectModel.getProjectsForUser(Login.array)){
            sb.append(projectName).append("<br>");
        }
        sb.append("----------------------------------</h2></div></HTML>");
        projectNamesLabel.setText(sb.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        projectNamesLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setMaximumSize(new java.awt.Dimension(6666666, 6666666));

        projectNamesLabel.setBackground(new java.awt.Color(255, 255, 255));
        projectNamesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectNamesLabel.setText("ProjectNames");
        projectNamesLabel.setOpaque(true);
        jScrollPane1.setViewportView(projectNamesLabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel projectNamesLabel;
    // End of variables declaration//GEN-END:variables
}