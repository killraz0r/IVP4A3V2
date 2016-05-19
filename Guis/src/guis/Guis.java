package guis;

import java.awt.*;
import javax.swing.*;

/**
 * @author Menno
 */
public class Guis extends JFrame {
    public Guis() {
        initComponents();
    }


    public static void main(String[] args) {
        new Guis().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Menno
        tabbedPane1 = new JTabbedPane();
        this2 = new JPanel();
        orderFormLabel2 = new JLabel();
        separator4 = new JSeparator();
        orderFormLabel3 = new JLabel();
        separator5 = new JSeparator();
        orderFormLabel4 = new JLabel();
        separator6 = new JSeparator();
        checkBox1 = new JCheckBox();
        orderFormLabel5 = new JLabel();
        orderFormLabel6 = new JLabel();
        checkBox2 = new JCheckBox();
        orderFormLabel7 = new JLabel();
        separator7 = new JSeparator();
        separator8 = new JSeparator();
        orderFormLabel8 = new JLabel();
        separator9 = new JSeparator();
        orderFormLabel9 = new JLabel();
        orderFormLabel10 = new JLabel();
        checkBox3 = new JCheckBox();
        orderFormLabel11 = new JLabel();
        separator10 = new JSeparator();
        separator11 = new JSeparator();
        separator12 = new JSeparator();
        separator13 = new JSeparator();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        orderFormLabel12 = new JLabel();
        checkBox4 = new JCheckBox();
        orderFormLabel13 = new JLabel();
        checkBox5 = new JCheckBox();
        separator14 = new JSeparator();
        label4 = new JLabel();
        orderFormLabel14 = new JLabel();
        orderFormLabel15 = new JLabel();
        checkBox6 = new JCheckBox();
        checkBox7 = new JCheckBox();
        separator15 = new JSeparator();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        panel1 = new JPanel();
        orderFormLabel16 = new JLabel();
        separator16 = new JSeparator();
        orderFormLabel17 = new JLabel();
        orderFormLabel18 = new JLabel();
        orderFormLabel19 = new JLabel();
        orderFormLabel20 = new JLabel();
        orderFormLabel21 = new JLabel();
        orderFormLabel22 = new JLabel();
        orderFormLabel23 = new JLabel();
        separator17 = new JSeparator();
        label5 = new JLabel();
        separator1 = new JSeparator();
        separator2 = new JSeparator();
        label6 = new JLabel();
        comboBox1 = new JComboBox<>();
        label7 = new JLabel();
        comboBox2 = new JComboBox<>();
        separator3 = new JSeparator();
        label8 = new JLabel();
        comboBox3 = new JComboBox<>();
        label9 = new JLabel();
        comboBox4 = new JComboBox<>();
        label10 = new JLabel();
        comboBox5 = new JComboBox<>();
        label11 = new JLabel();
        comboBox6 = new JComboBox<>();
        separator18 = new JSeparator();
        separator19 = new JSeparator();
        separator20 = new JSeparator();
        separator21 = new JSeparator();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        panel2 = new JPanel();
        label12 = new JLabel();
        comboBox7 = new JComboBox<>();
        separator22 = new JSeparator();
        label13 = new JLabel();
        separator23 = new JSeparator();
        label14 = new JLabel();
        separator24 = new JSeparator();
        label15 = new JLabel();
        separator25 = new JSeparator();
        label16 = new JLabel();
        separator26 = new JSeparator();
        comboBox8 = new JComboBox<>();
        comboBox9 = new JComboBox<>();
        comboBox10 = new JComboBox<>();
        comboBox11 = new JComboBox<>();
        separator27 = new JSeparator();
        label17 = new JLabel();
        separator28 = new JSeparator();
        comboBox12 = new JComboBox<>();
        label18 = new JLabel();
        comboBox13 = new JComboBox<>();
        separator29 = new JSeparator();
        label19 = new JLabel();
        comboBox14 = new JComboBox<>();
        separator30 = new JSeparator();
        label20 = new JLabel();
        comboBox15 = new JComboBox<>();
        separator31 = new JSeparator();
        label21 = new JLabel();
        comboBox16 = new JComboBox<>();
        separator32 = new JSeparator();
        label22 = new JLabel();
        comboBox17 = new JComboBox<>();
        separator33 = new JSeparator();
        label23 = new JLabel();
        label24 = new JLabel();
        label25 = new JLabel();
        separator34 = new JSeparator();
        separator35 = new JSeparator();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== tabbedPane1 ========
        {

            //======== this2 ========
            {
                this2.setPreferredSize(new Dimension(670, 520));
                this2.setMinimumSize(new Dimension(670, 520));

                // JFormDesigner evaluation mark
                this2.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), this2.getBorder())); this2.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

                this2.setLayout(null);

                //---- orderFormLabel2 ----
                orderFormLabel2.setText("Tafel 1");
                this2.add(orderFormLabel2);
                orderFormLabel2.setBounds(45, 50, 55, 16);

                //---- separator4 ----
                separator4.setForeground(Color.white);
                separator4.setOrientation(SwingConstants.VERTICAL);
                this2.add(separator4);
                separator4.setBounds(165, 50, 20, 15);

                //---- orderFormLabel3 ----
                orderFormLabel3.setText("Tijd");
                this2.add(orderFormLabel3);
                orderFormLabel3.setBounds(230, 50, 55, 16);

                //---- separator5 ----
                separator5.setForeground(Color.white);
                this2.add(separator5);
                separator5.setBounds(-10, 70, 350, 15);

                //---- orderFormLabel4 ----
                orderFormLabel4.setText("Bestelling 1");
                this2.add(orderFormLabel4);
                orderFormLabel4.setBounds(45, 85, 85, 16);

                //---- separator6 ----
                separator6.setForeground(Color.white);
                this2.add(separator6);
                separator6.setBounds(-15, 35, 715, 15);

                //---- checkBox1 ----
                checkBox1.setSelected(true);
                this2.add(checkBox1);
                checkBox1.setBounds(new Rectangle(new Point(145, 85), checkBox1.getPreferredSize()));

                //---- orderFormLabel5 ----
                orderFormLabel5.setText("16:11");
                this2.add(orderFormLabel5);
                orderFormLabel5.setBounds(230, 85, 55, 16);

                //---- orderFormLabel6 ----
                orderFormLabel6.setText("16:52");
                this2.add(orderFormLabel6);
                orderFormLabel6.setBounds(230, 125, 55, 16);
                this2.add(checkBox2);
                checkBox2.setBounds(145, 125, 20, 20);

                //---- orderFormLabel7 ----
                orderFormLabel7.setText("Bestelling 1");
                this2.add(orderFormLabel7);
                orderFormLabel7.setBounds(45, 125, 85, 16);

                //---- separator7 ----
                separator7.setForeground(Color.white);
                this2.add(separator7);
                separator7.setBounds(-10, 105, 350, 15);

                //---- separator8 ----
                separator8.setForeground(Color.white);
                this2.add(separator8);
                separator8.setBounds(-10, 145, 350, 15);

                //---- orderFormLabel8 ----
                orderFormLabel8.setText("Tafel 2");
                this2.add(orderFormLabel8);
                orderFormLabel8.setBounds(45, 185, 55, 16);

                //---- separator9 ----
                separator9.setForeground(Color.white);
                separator9.setOrientation(SwingConstants.VERTICAL);
                this2.add(separator9);
                separator9.setBounds(165, 185, 20, 15);

                //---- orderFormLabel9 ----
                orderFormLabel9.setText("Tijd");
                this2.add(orderFormLabel9);
                orderFormLabel9.setBounds(230, 185, 55, 16);

                //---- orderFormLabel10 ----
                orderFormLabel10.setText("Bestelling 1");
                this2.add(orderFormLabel10);
                orderFormLabel10.setBounds(45, 220, 85, 16);
                this2.add(checkBox3);
                checkBox3.setBounds(145, 220, 20, 20);

                //---- orderFormLabel11 ----
                orderFormLabel11.setText("16:43");
                this2.add(orderFormLabel11);
                orderFormLabel11.setBounds(230, 220, 55, 16);

                //---- separator10 ----
                separator10.setForeground(Color.white);
                this2.add(separator10);
                separator10.setBounds(-10, 170, 350, 15);

                //---- separator11 ----
                separator11.setForeground(Color.white);
                this2.add(separator11);
                separator11.setBounds(-40, 205, 380, 15);

                //---- separator12 ----
                separator12.setForeground(Color.white);
                separator12.setOrientation(SwingConstants.VERTICAL);
                this2.add(separator12);
                separator12.setBounds(335, 40, 20, 220);

                //---- separator13 ----
                separator13.setForeground(Color.white);
                this2.add(separator13);
                separator13.setBounds(340, 70, 420, 15);

                //---- label1 ----
                label1.setText("tafel 1");
                this2.add(label1);
                label1.setBounds(new Rectangle(new Point(360, 50), label1.getPreferredSize()));

                //---- label2 ----
                label2.setText("bestelling 1");
                this2.add(label2);
                label2.setBounds(415, 50, 80, 16);

                //---- label3 ----
                label3.setText("Voorgerechen :");
                this2.add(label3);
                label3.setBounds(360, 85, 130, 16);

                //---- orderFormLabel12 ----
                orderFormLabel12.setText("2x Bruschetta");
                this2.add(orderFormLabel12);
                orderFormLabel12.setBounds(360, 110, 110, 16);

                //---- checkBox4 ----
                checkBox4.setSelected(true);
                this2.add(checkBox4);
                checkBox4.setBounds(505, 110, 20, 20);

                //---- orderFormLabel13 ----
                orderFormLabel13.setText("1x Antipasta");
                this2.add(orderFormLabel13);
                orderFormLabel13.setBounds(360, 135, 85, 16);
                this2.add(checkBox5);
                checkBox5.setBounds(505, 135, 20, 20);

                //---- separator14 ----
                separator14.setForeground(Color.white);
                this2.add(separator14);
                separator14.setBounds(340, 160, 430, 15);

                //---- label4 ----
                label4.setText("Hoofdgerechten :");
                this2.add(label4);
                label4.setBounds(360, 180, 130, 16);

                //---- orderFormLabel14 ----
                orderFormLabel14.setText("2x Farfalie Carbonara");
                this2.add(orderFormLabel14);
                orderFormLabel14.setBounds(360, 205, 135, 16);

                //---- orderFormLabel15 ----
                orderFormLabel15.setText("1x Poesana");
                this2.add(orderFormLabel15);
                orderFormLabel15.setBounds(360, 230, 85, 16);
                this2.add(checkBox6);
                checkBox6.setBounds(505, 205, 20, 20);
                this2.add(checkBox7);
                checkBox7.setBounds(505, 230, 20, 20);

                //---- separator15 ----
                separator15.setForeground(Color.white);
                this2.add(separator15);
                separator15.setBounds(-20, 250, 730, 15);

                //======== scrollPane1 ========
                {

                    //---- textArea1 ----
                    textArea1.setText("Ingredienten: \nBruschetta\nitaliaans brood\n2 tomaten\nolijfolie\n1 snufije kuriden");
                    textArea1.setRows(6);
                    textArea1.setLineWrap(true);
                    scrollPane1.setViewportView(textArea1);
                }
                this2.add(scrollPane1);
                scrollPane1.setBounds(0, 390, 670, 130);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < this2.getComponentCount(); i++) {
                        Rectangle bounds = this2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = this2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    this2.setMinimumSize(preferredSize);
                    this2.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("Besteloverzict", this2);

            //======== panel1 ========
            {
                panel1.setLayout(null);

                //---- orderFormLabel16 ----
                orderFormLabel16.setText("Naam");
                panel1.add(orderFormLabel16);
                orderFormLabel16.setBounds(15, 10, 55, 16);

                //---- separator16 ----
                separator16.setForeground(Color.white);
                separator16.setOrientation(SwingConstants.VERTICAL);
                panel1.add(separator16);
                separator16.setBounds(135, 10, 20, 15);

                //---- orderFormLabel17 ----
                orderFormLabel17.setText("Aantal gerechten");
                panel1.add(orderFormLabel17);
                orderFormLabel17.setBounds(155, 10, 125, 16);

                //---- orderFormLabel18 ----
                orderFormLabel18.setText("Bram");
                panel1.add(orderFormLabel18);
                orderFormLabel18.setBounds(15, 35, 55, 16);

                //---- orderFormLabel19 ----
                orderFormLabel19.setText("3");
                panel1.add(orderFormLabel19);
                orderFormLabel19.setBounds(155, 35, 55, 16);

                //---- orderFormLabel20 ----
                orderFormLabel20.setText("Lars");
                panel1.add(orderFormLabel20);
                orderFormLabel20.setBounds(15, 60, 55, 16);

                //---- orderFormLabel21 ----
                orderFormLabel21.setText("2");
                panel1.add(orderFormLabel21);
                orderFormLabel21.setBounds(155, 55, 55, 16);

                //---- orderFormLabel22 ----
                orderFormLabel22.setText("Menno");
                panel1.add(orderFormLabel22);
                orderFormLabel22.setBounds(15, 85, 55, 16);

                //---- orderFormLabel23 ----
                orderFormLabel23.setText("4");
                panel1.add(orderFormLabel23);
                orderFormLabel23.setBounds(155, 80, 55, 16);

                //---- separator17 ----
                separator17.setForeground(Color.white);
                separator17.setOrientation(SwingConstants.VERTICAL);
                panel1.add(separator17);
                separator17.setBounds(320, 0, 20, 545);

                //---- label5 ----
                label5.setText("Gerechten: ");
                panel1.add(label5);
                label5.setBounds(335, 10, 95, label5.getPreferredSize().height);

                //---- separator1 ----
                separator1.setForeground(Color.white);
                panel1.add(separator1);
                separator1.setBounds(325, 30, 370, 15);

                //---- separator2 ----
                separator2.setForeground(Color.white);
                panel1.add(separator2);
                separator2.setBounds(325, 65, 370, 20);

                //---- label6 ----
                label6.setText("Bruschetta");
                panel1.add(label6);
                label6.setBounds(new Rectangle(new Point(335, 45), label6.getPreferredSize()));

                //---- comboBox1 ----
                comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Kok",
                    "Bram",
                    "Lars",
                    "Menno"
                }));
                panel1.add(comboBox1);
                comboBox1.setBounds(565, 40, 115, comboBox1.getPreferredSize().height);

                //---- label7 ----
                label7.setText("Bruschetta");
                panel1.add(label7);
                label7.setBounds(335, 75, 66, 35);

                //---- comboBox2 ----
                comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Kok",
                    "Bram",
                    "Lars",
                    "Menno"
                }));
                comboBox2.setSelectedIndex(3);
                panel1.add(comboBox2);
                comboBox2.setBounds(565, 75, 115, 30);

                //---- separator3 ----
                separator3.setForeground(Color.white);
                panel1.add(separator3);
                separator3.setBounds(325, 105, 370, 20);

                //---- label8 ----
                label8.setText("Antipasta");
                panel1.add(label8);
                label8.setBounds(335, 115, 66, 35);

                //---- comboBox3 ----
                comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Kok",
                    "Bram",
                    "Lars",
                    "Menno"
                }));
                comboBox3.setSelectedIndex(1);
                panel1.add(comboBox3);
                comboBox3.setBounds(565, 115, 114, 30);

                //---- label9 ----
                label9.setText("Fortalie Carbonara");
                panel1.add(label9);
                label9.setBounds(335, 155, 125, 30);

                //---- comboBox4 ----
                comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Kok",
                    "Bram",
                    "Lars",
                    "Menno"
                }));
                comboBox4.setSelectedIndex(1);
                panel1.add(comboBox4);
                comboBox4.setBounds(565, 155, 114, 30);

                //---- label10 ----
                label10.setText("Fortalie Carbonara");
                panel1.add(label10);
                label10.setBounds(335, 195, 125, 35);

                //---- comboBox5 ----
                comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Kok",
                    "Bram",
                    "Lars",
                    "Menno"
                }));
                comboBox5.setSelectedIndex(2);
                panel1.add(comboBox5);
                comboBox5.setBounds(565, 200, 114, 30);

                //---- label11 ----
                label11.setText("Poesana");
                panel1.add(label11);
                label11.setBounds(335, 240, 125, 37);

                //---- comboBox6 ----
                comboBox6.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Kok",
                    "Bram",
                    "Lars",
                    "Menno"
                }));
                comboBox6.setSelectedIndex(2);
                panel1.add(comboBox6);
                comboBox6.setBounds(565, 240, 114, 32);

                //---- separator18 ----
                separator18.setForeground(Color.white);
                panel1.add(separator18);
                separator18.setBounds(325, 145, 370, 20);

                //---- separator19 ----
                separator19.setForeground(Color.white);
                panel1.add(separator19);
                separator19.setBounds(325, 185, 375, 25);

                //---- separator20 ----
                separator20.setForeground(Color.white);
                panel1.add(separator20);
                separator20.setBounds(325, 230, 370, 30);

                //---- separator21 ----
                separator21.setForeground(Color.white);
                panel1.add(separator21);
                separator21.setBounds(325, 275, 370, 25);

                //======== scrollPane2 ========
                {

                    //---- textArea2 ----
                    textArea2.setText("Bram:\n2x Brushchetta\n1x Fortalle Carbonara");
                    scrollPane2.setViewportView(textArea2);
                }
                panel1.add(scrollPane2);
                scrollPane2.setBounds(0, 200, 320, 310);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel1.getComponentCount(); i++) {
                        Rectangle bounds = panel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel1.setMinimumSize(preferredSize);
                    panel1.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("Planning", panel1);

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //---- label12 ----
                label12.setText("Tafel 1");
                panel2.add(label12);
                label12.setBounds(10, 5, 66, 16);

                //---- comboBox7 ----
                comboBox7.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Geaccepteerd",
                    "Geannuleed",
                    "Gereed"
                }));
                panel2.add(comboBox7);
                comboBox7.setBounds(240, 0, 130, 26);

                //---- separator22 ----
                separator22.setForeground(Color.white);
                panel2.add(separator22);
                separator22.setBounds(0, 25, 370, 20);

                //---- label13 ----
                label13.setText("Bestelling 1");
                panel2.add(label13);
                label13.setBounds(10, 40, 95, 16);

                //---- separator23 ----
                separator23.setForeground(Color.white);
                panel2.add(separator23);
                separator23.setBounds(0, 60, 370, 20);

                //---- label14 ----
                label14.setText("Bestelling 2");
                panel2.add(label14);
                label14.setBounds(10, 75, 90, 16);

                //---- separator24 ----
                separator24.setForeground(Color.white);
                panel2.add(separator24);
                separator24.setBounds(0, 95, 370, 20);

                //---- label15 ----
                label15.setText("Tafel 2");
                panel2.add(label15);
                label15.setBounds(10, 155, 66, 16);

                //---- separator25 ----
                separator25.setForeground(Color.white);
                panel2.add(separator25);
                separator25.setBounds(0, 175, 370, 20);

                //---- label16 ----
                label16.setText("Bestelling 1");
                panel2.add(label16);
                label16.setBounds(10, 205, 95, 16);

                //---- separator26 ----
                separator26.setForeground(Color.white);
                panel2.add(separator26);
                separator26.setBounds(0, 225, 370, 20);

                //---- comboBox8 ----
                comboBox8.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Geaccepteerd",
                    "Geannuleed",
                    "Gereed"
                }));
                comboBox8.setSelectedIndex(2);
                panel2.add(comboBox8);
                comboBox8.setBounds(240, 35, 130, 26);

                //---- comboBox9 ----
                comboBox9.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Geaccepteerd",
                    "Geannuleed",
                    "Gereed"
                }));
                comboBox9.setSelectedIndex(1);
                panel2.add(comboBox9);
                comboBox9.setBounds(240, 70, 130, 26);

                //---- comboBox10 ----
                comboBox10.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Geaccepteerd",
                    "Geannuleed",
                    "Gereed"
                }));
                panel2.add(comboBox10);
                comboBox10.setBounds(230, 150, 130, 26);

                //---- comboBox11 ----
                comboBox11.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Set Status",
                    "Geaccepteerd",
                    "Geannuleed",
                    "Gereed"
                }));
                panel2.add(comboBox11);
                comboBox11.setBounds(230, 195, 130, 26);

                //---- separator27 ----
                separator27.setForeground(Color.white);
                panel2.add(separator27);
                separator27.setBounds(0, 135, 370, 20);

                //---- label17 ----
                label17.setText("Bruschetta");
                panel2.add(label17);
                label17.setBounds(385, 45, 66, 16);

                //---- separator28 ----
                separator28.setForeground(Color.white);
                panel2.add(separator28);
                separator28.setBounds(375, 65, 370, 20);

                //---- comboBox12 ----
                comboBox12.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Geaccepteerd",
                    "Geannuleed",
                    "Gereed"
                }));
                comboBox12.setSelectedIndex(2);
                panel2.add(comboBox12);
                comboBox12.setBounds(520, 40, 110, 26);

                //---- label18 ----
                label18.setText("Bruschetta");
                panel2.add(label18);
                label18.setBounds(385, 80, 66, 16);

                //---- comboBox13 ----
                comboBox13.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Geaccepteerd",
                    "Geannuleed",
                    "Gereed"
                }));
                comboBox13.setSelectedIndex(2);
                panel2.add(comboBox13);
                comboBox13.setBounds(520, 75, 110, 26);

                //---- separator29 ----
                separator29.setForeground(Color.white);
                panel2.add(separator29);
                separator29.setBounds(375, 100, 370, 20);

                //---- label19 ----
                label19.setText("Antipasta");
                panel2.add(label19);
                label19.setBounds(385, 115, 66, 16);

                //---- comboBox14 ----
                comboBox14.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Geaccepteerd",
                    "Geannuleed",
                    "Gereed"
                }));
                comboBox14.setSelectedIndex(2);
                panel2.add(comboBox14);
                comboBox14.setBounds(520, 110, 110, 26);

                //---- separator30 ----
                separator30.setForeground(Color.white);
                panel2.add(separator30);
                separator30.setBounds(375, 135, 370, 20);

                //---- label20 ----
                label20.setText("Farfalle Carbonara");
                panel2.add(label20);
                label20.setBounds(385, 180, 120, 16);

                //---- comboBox15 ----
                comboBox15.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Geaccepteerd",
                    "Geannuleed",
                    "Gereed"
                }));
                comboBox15.setSelectedIndex(2);
                panel2.add(comboBox15);
                comboBox15.setBounds(520, 175, 110, 26);

                //---- separator31 ----
                separator31.setForeground(Color.white);
                panel2.add(separator31);
                separator31.setBounds(375, 200, 370, 20);

                //---- label21 ----
                label21.setText("Farfalle Carbonara");
                panel2.add(label21);
                label21.setBounds(385, 215, 115, 16);

                //---- comboBox16 ----
                comboBox16.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Geaccepteerd",
                    "Geannuleed",
                    "Gereed"
                }));
                comboBox16.setSelectedIndex(2);
                panel2.add(comboBox16);
                comboBox16.setBounds(520, 210, 110, 26);

                //---- separator32 ----
                separator32.setForeground(Color.white);
                panel2.add(separator32);
                separator32.setBounds(370, 235, 370, 20);

                //---- label22 ----
                label22.setText("Poesana");
                panel2.add(label22);
                label22.setBounds(385, 250, 66, 16);

                //---- comboBox17 ----
                comboBox17.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Geaccepteerd",
                    "Geannuleed",
                    "Gereed"
                }));
                comboBox17.setSelectedIndex(2);
                panel2.add(comboBox17);
                comboBox17.setBounds(520, 245, 110, 26);

                //---- separator33 ----
                separator33.setForeground(Color.white);
                panel2.add(separator33);
                separator33.setBounds(370, 270, 370, 20);

                //---- label23 ----
                label23.setText("Hoofdgerechten :");
                panel2.add(label23);
                label23.setBounds(new Rectangle(new Point(385, 155), label23.getPreferredSize()));

                //---- label24 ----
                label24.setText("tafel 1");
                panel2.add(label24);
                label24.setBounds(385, 5, 40, 16);

                //---- label25 ----
                label25.setText("bestelling 1");
                panel2.add(label25);
                label25.setBounds(440, 5, 80, 16);

                //---- separator34 ----
                separator34.setForeground(Color.white);
                panel2.add(separator34);
                separator34.setBounds(365, 25, 420, 15);

                //---- separator35 ----
                separator35.setForeground(Color.white);
                separator35.setOrientation(SwingConstants.VERTICAL);
                panel2.add(separator35);
                separator35.setBounds(365, -10, 20, 545);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("Status", panel2);
        }
        contentPane.add(tabbedPane1);
        tabbedPane1.setBounds(0, 0, 695, 545);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license -  Menno
    private JTabbedPane tabbedPane1;
    private JPanel this2;
    private JLabel orderFormLabel2;
    private JSeparator separator4;
    private JLabel orderFormLabel3;
    private JSeparator separator5;
    private JLabel orderFormLabel4;
    private JSeparator separator6;
    private JCheckBox checkBox1;
    private JLabel orderFormLabel5;
    private JLabel orderFormLabel6;
    private JCheckBox checkBox2;
    private JLabel orderFormLabel7;
    private JSeparator separator7;
    private JSeparator separator8;
    private JLabel orderFormLabel8;
    private JSeparator separator9;
    private JLabel orderFormLabel9;
    private JLabel orderFormLabel10;
    private JCheckBox checkBox3;
    private JLabel orderFormLabel11;
    private JSeparator separator10;
    private JSeparator separator11;
    private JSeparator separator12;
    private JSeparator separator13;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel orderFormLabel12;
    private JCheckBox checkBox4;
    private JLabel orderFormLabel13;
    private JCheckBox checkBox5;
    private JSeparator separator14;
    private JLabel label4;
    private JLabel orderFormLabel14;
    private JLabel orderFormLabel15;
    private JCheckBox checkBox6;
    private JCheckBox checkBox7;
    private JSeparator separator15;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JPanel panel1;
    private JLabel orderFormLabel16;
    private JSeparator separator16;
    private JLabel orderFormLabel17;
    private JLabel orderFormLabel18;
    private JLabel orderFormLabel19;
    private JLabel orderFormLabel20;
    private JLabel orderFormLabel21;
    private JLabel orderFormLabel22;
    private JLabel orderFormLabel23;
    private JSeparator separator17;
    private JLabel label5;
    private JSeparator separator1;
    private JSeparator separator2;
    private JLabel label6;
    private JComboBox<String> comboBox1;
    private JLabel label7;
    private JComboBox<String> comboBox2;
    private JSeparator separator3;
    private JLabel label8;
    private JComboBox<String> comboBox3;
    private JLabel label9;
    private JComboBox<String> comboBox4;
    private JLabel label10;
    private JComboBox<String> comboBox5;
    private JLabel label11;
    private JComboBox<String> comboBox6;
    private JSeparator separator18;
    private JSeparator separator19;
    private JSeparator separator20;
    private JSeparator separator21;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JPanel panel2;
    private JLabel label12;
    private JComboBox<String> comboBox7;
    private JSeparator separator22;
    private JLabel label13;
    private JSeparator separator23;
    private JLabel label14;
    private JSeparator separator24;
    private JLabel label15;
    private JSeparator separator25;
    private JLabel label16;
    private JSeparator separator26;
    private JComboBox<String> comboBox8;
    private JComboBox<String> comboBox9;
    private JComboBox<String> comboBox10;
    private JComboBox<String> comboBox11;
    private JSeparator separator27;
    private JLabel label17;
    private JSeparator separator28;
    private JComboBox<String> comboBox12;
    private JLabel label18;
    private JComboBox<String> comboBox13;
    private JSeparator separator29;
    private JLabel label19;
    private JComboBox<String> comboBox14;
    private JSeparator separator30;
    private JLabel label20;
    private JComboBox<String> comboBox15;
    private JSeparator separator31;
    private JLabel label21;
    private JComboBox<String> comboBox16;
    private JSeparator separator32;
    private JLabel label22;
    private JComboBox<String> comboBox17;
    private JSeparator separator33;
    private JLabel label23;
    private JLabel label24;
    private JLabel label25;
    private JSeparator separator34;
    private JSeparator separator35;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}