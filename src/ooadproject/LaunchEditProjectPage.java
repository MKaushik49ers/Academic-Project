package ooadproject;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import javafx.embed.swing.JFXPanel;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import ooadproject.EditProjectInfoGUI;
import ooadproject.EditUserInfoGUI;

/**
 *
 * @author Manish
 */
public class LaunchEditProjectPage extends javax.swing.JPanel {

	/**
	 * Creates new form PanelAlignment
	 */
	JPanel EditProjectInfoPanel;//login
	JPanel EditUserInfoPanel;//regedist
//        JPanel EditTaskInfoPanel;
	JPanel cards;
	private String EditProjectInfo = "EditProjectInfo"; //login
	private String EditUserInfo = "EditUserInfo"; //regedist
        private String EditTaskInfo = "EditTaskInfo";

	public LaunchEditProjectPage() {
		initComponents();
	}

	public void addComponentToPane(Container pane) {
		ButtonGroup bg = new ButtonGroup();
		bg.add(EditProjectInfoRadio);
		bg.add(EditUserInfoRadio);
                bg.add(EditTaskInfoRadio);
		EditUserInfoPanel = new JPanel(new GridBagLayout());
		EditUserInfoPanel.setName(EditUserInfo);
		          EditUserInfoGUI edituser = new EditUserInfoGUI();
		EditUserInfoPanel.add(edituser);
                
//                EditTaskInfoGUI edittask = new EditTaskInfoGUI();
//                EditTaskInfoPanel.add(edittask);
                        
		          EditProjectInfoGUI editproject = new EditProjectInfoGUI();
		EditProjectInfoPanel.add(editproject);
		cards = new JPanel(new CardLayout());
		cards.add(EditProjectInfoPanel, EditProjectInfo);
		cards.add(EditUserInfoPanel, EditUserInfo);
//                cards.add(EditTaskInfoPanel, EditTaskInfo);
		cards.setVisible(false);
		pane.add(jPanel1, BorderLayout.PAGE_START);
		pane.add(jPanel2, BorderLayout.CENTER);
		pane.add(jPanel3, BorderLayout.WEST);
		pane.add(cards);
		// PaneForRegisterLogin=new JPanel();
		// PaneForRegisterLogin.add(pane);
		// PaneForRegisterLogin.add(cards);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		EditProjectInfoPanel = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		EditProjectInfoRadio = new javax.swing.JRadioButton();//LOGIN
		EditUserInfoRadio = new javax.swing.JRadioButton();//RIGISTER

		setLayout(new java.awt.BorderLayout());

		jPanel1.setBackground(new java.awt.Color(255, 204, 204));
		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(
				new java.awt.Color(255, 51, 0), 6));
		jPanel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jPanel1.setPreferredSize(new java.awt.Dimension(50, 100));
		jPanel1.setLayout(new java.awt.GridBagLayout());

		jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
		jLabel1.setText("Frugal Lab Project!");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.ipadx = 19;
		gridBagConstraints.ipady = 114;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 206, 6, 222);
		jPanel1.add(jLabel1, gridBagConstraints);

		add(jPanel1, java.awt.BorderLayout.CENTER);

		jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(
				new java.awt.Color(255, 51, 0), 5));
		jPanel2.setPreferredSize(new java.awt.Dimension(100, 120));
		jPanel2.setLayout(new java.awt.BorderLayout());

		EditProjectInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(
				new java.awt.Color(204, 204, 255), null));
		EditProjectInfoPanel.setPreferredSize(new java.awt.Dimension(434, 102));
		EditProjectInfoPanel.setLayout(new java.awt.GridBagLayout());
		jPanel2.add(EditProjectInfoPanel, java.awt.BorderLayout.CENTER);

		add(jPanel2, java.awt.BorderLayout.PAGE_START);

		jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(
				new java.awt.Color(255, 0, 0), 5));
		jPanel3.setPreferredSize(new java.awt.Dimension(200, 200));

		EditProjectInfoRadio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		EditProjectInfoRadio.setText("EditProjectInfo");
		EditProjectInfoRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				EditProjectInfoRadioActionPerformed(evt);
			}
		});

		EditUserInfoRadio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		EditUserInfoRadio.setText("EditUserInfo");
		EditUserInfoRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				EditUserInfoRadioActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																EditProjectInfoRadio)
														.addComponent(
																EditUserInfoRadio))
										.addContainerGap(593, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(EditProjectInfoRadio)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(EditUserInfoRadio)
										.addContainerGap(34, Short.MAX_VALUE)));

		add(jPanel3, java.awt.BorderLayout.PAGE_END);
	}// </editor-fold>

	private void EditProjectInfoRadioActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		cards.setVisible(true);
		CardLayout cl = (CardLayout) (cards.getLayout());
		cl.show(cards, EditProjectInfo);
	}

	private void EditUserInfoRadioActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		cards.setVisible(true);
		CardLayout cl = (CardLayout) (cards.getLayout());
		cl.show(cards, EditUserInfo);
	}
        
        	private void RegisterRadioActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		cards.setVisible(true);
		CardLayout cl = (CardLayout) (cards.getLayout());
		cl.show(cards, EditUserInfo);
	}

	// Variables declaration - do not modify
	private javax.swing.JRadioButton EditProjectInfoRadio;
	private javax.swing.JRadioButton EditUserInfoRadio;
        private javax.swing.JRadioButton EditTaskInfoRadio;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;

	// End of variables declaration
	public static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Frugal Lab Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and set up the content pane.
		LaunchEditProjectPage demo = new LaunchEditProjectPage();
		demo.addComponentToPane(frame.getContentPane());

		// Display the window.
		frame.pack();
                frame.setBounds(0, 0, 1000, 800);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		/* Use an appropriate Look and Feel */
		try {
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		/* Turn off metal's use of bold fonts */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		// Schedule a job for the event dispatch thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}