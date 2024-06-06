
import java.awt.Color;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Display extends CalculosCalculosos {
        JFrame d = new JFrame();
        JTextField zTextSubstat1, zTextSubstat2, zTextSubstat3, zTextSubstat4;
        JComboBox<Object> tnivel, tmainStat, tSubstat1Tipo, tSubstat1Valor, tSubstat2Tipo, tSubstat2Valor,
                        tSubstat3Tipo, tSubstat3Valor, tSubstat4Tipo, tSubstat4Valor;
        JLabel picLabel, nivel, mainStat, substat1, substat2, substat3, substat4, fnivel, fmainStat, fSubstat1,
                        fSubstat2, fSubstat3, fSubstat4, vnivel, vmainStat, vSubstat1, vSubstat2, vSubstat3, vSubstat4;
        JButton boton4, boton8, boton12, boton16, boton20;
        JPanel p;
        String Tipo = "1";
        boolean mostrado = false;

        private void addOpcionTipoJComboBox(JComboBox<Object> box) {
                box.addItem("Stat");
                box.addItem("Def");
                box.addItem("DefPorciento");
                box.addItem("HP");
                box.addItem("HPPorciento");
                box.addItem("Atq");
                box.addItem("AtqPorciento");
                box.addItem("Recarga");
                box.addItem("ME");
                box.addItem("Prob");
                box.addItem("Dmg");
        }

        private void addOpcionValorJComboBox(final JComboBox<Object> box, JComboBox<Object> combo) {
                combo.addItemListener(new ItemListener() {
                        public void itemStateChanged(ItemEvent e) {
                                if (e.getStateChange() == 1) {
                                        box.removeAllItems();
                                        String Tipo = (String) e.getItem();
                                        if (Tipo.equals("Stat")) {
                                                box.addItem("Valor");
                                        }

                                        if (Tipo.equals("Def")) {
                                                double[] a = new double[] {
                                                                16.0, 19.0, 21.0, 23.0, 32.0, 35.0, 37.0, 39.0, 38.0,
                                                                40.0, 42.0, 44.0, 46.0, 48.0, 51.0, 53.0, 55.0, 54.0,
                                                                56.0, 57.0, 58.0, 59.0, 60.0, 61.0, 62.0, 63.0, 65.0,
                                                                67.0, 64.0, 69.0, 71.0, 70.0, 72.0, 74.0, 73.0, 75.0,
                                                                76.0, 78.0, 77.0, 79.0, 81.0, 83.0, 80.0, 82.0, 85.0,
                                                                84.0, 86.0, 87.0, 88.0, 90.0, 89.0, 91.0, 92.0
                                                };
                                                for (double i : a) {
                                                        box.addItem(i);
                                                }
                                                ;
                                        }

                                        if (Tipo.equals("DefPorciento")) {
                                                double[] a = new double[] {
                                                                5.1, 5.8, 6.6, 7.3, 10.2, 10.9, 11.6, 11.7, 12.4, 13.1,
                                                                13.2, 13.9, 14.6, 15.3, 16.0, 16.7, 17.4, 17.5, 18.2,
                                                                18.3, 18.9, 19.0, 19.7, 19.8, 20.4, 20.5, 21.1, 21.2,
                                                                21.8, 21.9, 22.5, 22.6, 23.2, 23.3, 23.4, 24.0, 24.1,
                                                                24.7, 24.8, 24.9, 25.6, 26.2, 26.3, 26.4, 26.9, 27.1,
                                                                27.6, 27.7, 27.8, 28.3, 28.4, 28.5, 29.0, 29.1, 29.2
                                                };
                                                for (double i : a) {
                                                        box.addItem(i);
                                                }
                                                ;
                                        }

                                        if (Tipo.equals("HP")) {
                                                double[] a = new double[] {
                                                                209.0, 239.0, 269.0, 299.0, 418.0, 448.0, 478.0, 508.0,
                                                                538.0, 568.0, 598.0, 627.0, 657.0, 687.0, 717.0, 747.0,
                                                                777.0, 807.0, 836.0, 837.0, 866.0, 867.0, 896.0, 897.0,
                                                                926.0, 956.0, 986.0, 1016.0, 1045.0, 1046.0, 1075.0,
                                                                1076.0, 1105.0, 1106.0, 1135.0, 1136.0, 1165.0, 1166.0,
                                                                1195.0, 1196.0
                                                };
                                                for (double i : a) {
                                                        box.addItem(i);
                                                }
                                        }

                                        if (Tipo.equals("HPPorciento")) {
                                                double[] a = new double[] {
                                                                4.1, 4.7, 5.3, 5.8, 8.2, 8.8, 9.4, 9.4, 9.9, 10.0, 10.5,
                                                                10.6, 11.1, 11.6, 12.9, 12.9, 12.3, 13.5, 14.0, 14.0,
                                                                14.1, 14.1, 14.6, 14.6, 14.6, 14.7, 15.2, 15.3, 15.7,
                                                                15.8, 15.9, 16.3, 16.4, 16.9, 17.0, 17.4, 17.6, 17.6,
                                                                18.1, 18.2, 18.7, 18.8, 18.8, 18.9, 19.3, 19.3, 19.4,
                                                                19.4, 19.8, 19.8, 19.9, 20.0, 20.4, 20.4, 20.5, 20.6,
                                                                21.0, 21.1, 21.2, 21.5, 21.6, 21.6, 21.7, 22.1, 22.1,
                                                                22.2, 22.7, 23.2
                                                };
                                                for (double i : a) {
                                                        box.addItem(i);
                                                }
                                        }

                                        if (Tipo.equals("Atq")) {
                                                double[] a = new double[] {
                                                                14.0, 16.0, 18.0, 19.0, 28.0, 30.0, 32.0, 33.0, 34.0,
                                                                35.0, 36.0, 37.0, 38.0, 42.0, 44.0, 46.0, 47.0, 48.0,
                                                                49.0, 50.0, 51.0, 52.0, 53.0, 54.0, 55.0, 56.0, 57.0,
                                                                58.0, 60.0, 61.0, 62.0, 63.0, 64.0, 65.0, 66.0, 67.0,
                                                                68.0, 69.0, 70.0, 71.0, 72.0, 73.0, 74.0, 75.0, 76.0,
                                                };
                                                for (double i : a) {
                                                        box.addItem(i);
                                                }
                                        }

                                        if (Tipo.equals("AtqPorciento")) {
                                                double[] a = new double[] {
                                                                4.1, 4.7, 5.3, 5.8, 8.2, 8.8, 9.4, 9.4, 9.9, 10.0, 10.5,
                                                                10.6, 11.1, 11.6, 12.9, 12.9, 12.3, 13.5, 14.0, 14.0,
                                                                14.1, 14.1, 14.6, 14.6, 14.6, 14.7, 15.2, 15.3, 15.7,
                                                                15.8, 15.9, 16.3, 16.4, 16.9, 17.0, 17.4, 17.6, 17.6,
                                                                18.1, 18.2, 18.7, 18.8, 18.8, 18.9, 19.3, 19.3, 19.4,
                                                                19.4, 19.8, 19.8, 19.9, 20.0, 20.4, 20.4, 20.5, 20.6,
                                                                21.0, 21.1, 21.2, 21.5, 21.6, 21.6, 21.7, 22.1, 22.1,
                                                                22.2, 22.7, 23.2
                                                };
                                                for (double i : a) {
                                                        box.addItem(i);
                                                }
                                        }

                                        if (Tipo.equals("Recarga")) {
                                                double[] a = new double[] {
                                                                4.5, 5.2, 5.8, 6.5, 9.0, 9.7, 10.3, 10.4, 11.0, 11.6,
                                                                11.7, 12.3, 13.0, 13.5, 14.2, 14.8, 14.9, 15.5, 15.6,
                                                                16.1, 16.2, 16.8, 16.9, 17.4, 17.5, 18.0, 18.1, 18.2,
                                                                18.7, 18.8, 19.3, 19.4, 19.5, 20.0, 20.1, 20.6, 20.7,
                                                                20.8, 20.9, 21.3, 21.4, 21.9, 22.0, 22.1, 22.6, 22.7,
                                                                22.9, 23.2, 23.3, 23.4, 23.8, 23.9, 24.0, 24.5, 24.6,
                                                                24.7, 25.1, 25.2, 25.3, 25.8, 25.9, 26.0
                                                };
                                                for (double i : a) {
                                                        box.addItem(i);
                                                }
                                        }

                                        if (Tipo.equals("ME")) {
                                                double[] a = new double[] {
                                                                16.0, 19.0, 21.0, 23.0, 32.0, 35.0, 37.0, 39.0, 38.0,
                                                                40.0, 42.0, 44.0, 46.0, 48.0, 51.0, 53.0, 55.0, 54.0,
                                                                56.0, 57.0, 58.0, 59.0, 60.0, 61.0, 62.0, 63.0, 65.0,
                                                                67.0, 64.0, 69.0, 71.0, 70.0, 72.0, 74.0, 73.0, 75.0,
                                                                76.0, 78.0, 77.0, 79.0, 81.0, 83.0, 80.0, 82.0, 85.0,
                                                                84.0, 86.0, 87.0, 88.0, 90.0, 89.0, 91.0, 92.0
                                                };
                                                for (double i : a) {
                                                        box.addItem(i);
                                                }
                                        }

                                        if (Tipo.equals("Prob")) {
                                                double[] a = new double[] {
                                                                2.7, 3.1, 3.5, 3.9, 5.4, 5.8, 6.2, 6.6, 7.0, 7.4, 7.8,
                                                                8.1, 8.5, 8.9, 9.3, 9.7, 10.1, 10.5, 10.8, 10.9, 11.2,
                                                                11.3, 11.6, 11.7, 12.0, 12.4, 12.8, 12.9, 13.2, 13.6,
                                                                13.9, 14.0, 14.3, 14.4, 14.7, 14.8, 14.9, 15.1, 15.2,
                                                                15.5, 15.6
                                                };
                                                for (double i : a) {
                                                        box.addItem(i);
                                                }
                                        }

                                        if (Tipo.equals("Dmg")) {
                                                double[] a = new double[] {
                                                                5.4, 6.2, 7.0, 7.8, 10.8, 11.6, 12.4, 13.2, 14.0, 14.8,
                                                                15.6, 16.2, 17.0, 17.8, 18.6, 19.4, 20.2, 21.0, 21.6,
                                                                21.8, 22.4, 22.6, 23.2, 24.0, 24.8, 25.6, 26.4, 27.0,
                                                                27.2, 27.8, 28.0, 28.6, 28.8, 29.4, 29.6, 30.2, 30.4,
                                                                31.0, 31.2
                                                };
                                                for (double i : a) {
                                                        box.addItem(i);
                                                }
                                        }
                                }

                        }
                });

        }

        public Display() {
                {
                        this.d.setTitle("Artefacto");
                        this.tnivel = new JComboBox<Object>();
                        this.tnivel.setBounds(120, 40, 180, 20);
                        this.tnivel.addItem("Select lvl");
                        this.tnivel.addItem("1");
                        this.tnivel.addItem("4");
                        this.tnivel.addItem("8");
                        this.tnivel.addItem("12");
                        this.tnivel.addItem("16");
                        this.nivel = new JLabel("Nivel");
                        this.nivel.setBounds(20, 40, 180, 20);
                        this.tmainStat = new JComboBox<Object>();
                        this.tmainStat.setBounds(120, 70, 180, 20);
                        this.addOpcionTipoJComboBox(this.tmainStat);
                        this.mainStat = new JLabel("Main Stat");
                        this.mainStat.setBounds(20, 70, 180, 20);
                        this.tSubstat1Tipo = new JComboBox<Object>();
                        this.zTextSubstat1 = new JTextField();
                        this.zTextSubstat1.setBounds(215, 100, 85, 20);
                        this.tSubstat1Tipo.setBounds(120, 100, 85, 20);
                        this.tSubstat1Valor = new JComboBox<Object>();
                        this.tSubstat1Valor.addItem("Valor");
                        this.tSubstat1Valor.setBounds(215, 100, 85, 20);
                        this.addOpcionTipoJComboBox(this.tSubstat1Tipo);
                        this.addOpcionValorJComboBox(this.tSubstat1Valor, this.tSubstat1Tipo);
                        this.substat1 = new JLabel("1º SubStat");
                        this.substat1.setBounds(20, 100, 200, 20);
                        this.tSubstat2Tipo = new JComboBox<Object>();
                        this.zTextSubstat2 = new JTextField();
                        this.zTextSubstat2.setBounds(215, 130, 85, 20);
                        this.tSubstat2Tipo.setBounds(120, 130, 85, 20);
                        this.tSubstat2Valor = new JComboBox<Object>();
                        this.tSubstat2Valor.setBounds(215, 130, 85, 20);
                        this.tSubstat2Valor.addItem("Valor");
                        this.addOpcionTipoJComboBox(this.tSubstat2Tipo);
                        this.addOpcionValorJComboBox(this.tSubstat2Valor, this.tSubstat2Tipo);
                        this.substat2 = new JLabel("2º SubStat");
                        this.substat2.setBounds(20, 130, 180, 20);
                        this.tSubstat3Tipo = new JComboBox<Object>();
                        this.zTextSubstat3 = new JTextField();
                        this.zTextSubstat3.setBounds(215, 160, 85, 20);
                        this.tSubstat3Tipo.setBounds(120, 160, 85, 20);
                        this.tSubstat3Valor = new JComboBox<Object>();
                        this.tSubstat3Valor.addItem("Valor");
                        this.tSubstat3Valor.setBounds(215, 160, 85, 20);
                        this.addOpcionTipoJComboBox(this.tSubstat3Tipo);
                        this.addOpcionValorJComboBox(this.tSubstat3Valor, this.tSubstat3Tipo);
                        this.substat3 = new JLabel("3º SubStat");
                        this.substat3.setBounds(20, 160, 180, 20);
                        this.tSubstat4Tipo = new JComboBox<Object>();
                        this.zTextSubstat4 = new JTextField();
                        this.zTextSubstat4.setBounds(215, 190, 85, 20);
                        this.tSubstat4Tipo.setBounds(120, 190, 85, 20);
                        this.tSubstat4Valor = new JComboBox<Object>();
                        this.tSubstat4Valor.addItem("Valor");
                        this.tSubstat4Valor.setBounds(215, 190, 85, 20);
                        this.addOpcionTipoJComboBox(this.tSubstat4Tipo);
                        this.addOpcionValorJComboBox(this.tSubstat4Valor, this.tSubstat4Tipo);
                        this.substat4 = new JLabel("4º SubStat");
                        this.substat4.setBounds(20, 190, 180, 20);
                        this.boton4 = new JButton("lvl 4");
                        this.boton4.setBounds(20, 220, 80, 20);
                        this.boton8 = new JButton("lvl 8");
                        this.boton8.setBounds(120, 220, 80, 20);
                        this.boton12 = new JButton("lvl 12");
                        this.boton12.setBounds(220, 220, 80, 20);
                        this.boton16 = new JButton("lvl 16");
                        this.boton16.setBounds(320, 220, 80, 20);
                        this.boton20 = new JButton("lvl 20");
                        this.boton20.setBounds(420, 220, 80, 20);
                        this.fnivel = new JLabel();
                        this.fmainStat = new JLabel();
                        this.fSubstat1 = new JLabel();
                        this.fSubstat2 = new JLabel();
                        this.fSubstat3 = new JLabel();
                        this.fSubstat4 = new JLabel();
                        this.vnivel = new JLabel();
                        this.vmainStat = new JLabel();
                        this.vSubstat1 = new JLabel();
                        this.vSubstat2 = new JLabel();
                        this.vSubstat3 = new JLabel();
                        this.vSubstat4 = new JLabel();
                        this.fnivel.setBounds(350, 40, 180, 20);
                        this.fmainStat.setBounds(350, 70, 85, 20);
                        this.fSubstat1.setBounds(350, 100, 85, 20);
                        this.fSubstat2.setBounds(350, 130, 85, 20);
                        this.fSubstat3.setBounds(350, 160, 85, 20);
                        this.fSubstat4.setBounds(350, 190, 85, 20);
                        this.vnivel.setBounds(450, 40, 85, 20);
                        this.vmainStat.setBounds(450, 70, 85, 20);
                        this.vSubstat1.setBounds(450, 100, 85, 20);
                        this.vSubstat2.setBounds(450, 130, 85, 20);
                        this.vSubstat3.setBounds(450, 160, 85, 20);
                        this.vSubstat4.setBounds(450, 190, 85, 20);
                        this.p = new JPanel();
                        this.p.setLayout((LayoutManager) null);
                        this.p.add(this.tnivel);
                        this.p.add(this.nivel);
                        this.p.add(this.tmainStat);
                        this.p.add(this.mainStat);
                        this.p.add(this.tSubstat1Tipo);
                        this.p.add(this.substat1);
                        this.p.add(this.tSubstat2Tipo);
                        this.p.add(this.substat2);
                        this.p.add(this.tSubstat3Tipo);
                        this.p.add(this.substat3);
                        this.p.add(this.tSubstat4Tipo);
                        this.p.add(this.substat4);
                        this.p.add(this.boton4);
                        this.p.add(this.boton8);
                        this.p.add(this.boton12);
                        this.p.add(this.boton16);
                        this.p.add(this.boton20);
                        this.p.add(this.fnivel);
                        this.p.add(this.fmainStat);
                        this.p.add(this.fSubstat1);
                        this.p.add(this.fSubstat2);
                        this.p.add(this.fSubstat3);
                        this.p.add(this.fSubstat4);
                        this.p.add(this.vnivel);
                        this.p.add(this.vmainStat);
                        this.p.add(this.vSubstat1);
                        this.p.add(this.vSubstat2);
                        this.p.add(this.vSubstat3);
                        this.p.add(this.vSubstat4);
                        this.d.add(this.p);
                        this.d.setVisible(true);
                        this.d.setBounds(700, 350, 540, 300);
                        this.p.setBackground(new Color(212, 175, 55));
                        this.d.setDefaultCloseOperation(3);
                        this.p.add(this.tSubstat1Valor);
                        this.p.add(this.tSubstat2Valor);
                        this.p.add(this.tSubstat3Valor);
                        this.p.add(this.tSubstat4Valor);
                }
                this.tnivel.addItemListener(new ItemListener() {
                        public void itemStateChanged(ItemEvent evt) {
                                Display.this.d.revalidate();
                                Display.this.d.repaint();
                                Display.this.Tipo = (String) Display.this.tnivel.getSelectedItem();

                                int i;
                                for (i = 0; i < Display.this.boton4.getActionListeners().length; ++i) {
                                        if (Display.this.boton4.getActionListeners().length > 0) {
                                                Display.this.boton4.removeActionListener(
                                                                Display.this.boton4.getActionListeners()[0]);
                                        }
                                }

                                for (i = 0; i < Display.this.boton8.getActionListeners().length; ++i) {
                                        if (Display.this.boton8.getActionListeners().length > 0) {
                                                Display.this.boton8.removeActionListener(
                                                                Display.this.boton8.getActionListeners()[0]);
                                        }
                                }

                                for (i = 0; i < Display.this.boton12.getActionListeners().length; ++i) {
                                        if (Display.this.boton12.getActionListeners().length > 0) {
                                                Display.this.boton12.removeActionListener(
                                                                Display.this.boton12.getActionListeners()[0]);
                                        }
                                }

                                for (i = 0; i < Display.this.boton16.getActionListeners().length; ++i) {
                                        if (Display.this.boton16.getActionListeners().length > 0) {
                                                Display.this.boton16.removeActionListener(
                                                                Display.this.boton16.getActionListeners()[0]);
                                        }
                                }

                                for (i = 0; i < Display.this.boton20.getActionListeners().length; ++i) {
                                        if (Display.this.boton20.getActionListeners().length > 0) {
                                                Display.this.boton20.removeActionListener(
                                                                Display.this.boton20.getActionListeners()[0]);
                                        }
                                }

                                switch (Display.this.Tipo) {
                                        case "Select lvl":
                                        default:
                                                break;
                                        case "1":
                                                Display.this.boton4.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if (e.getSource().equals(Display.this.boton4)
                                                                                && Display.this.Tipo
                                                                                                .equals("1")) {
                                                                        if ((Display.this.tSubstat1Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")
                                                                                        || Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString()
                                                                                                        .equals("Stat")
                                                                                        || Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString()
                                                                                                        .equals("Stat"))
                                                                                        && !Display.this.mostrado) {
                                                                                JOptionPane.showMessageDialog(
                                                                                                (Component) null,
                                                                                                "Valor de Stats vacias ");
                                                                                Display.this.mostrado = false;
                                                                        }
                                                                        StatArtefacto aSubstat4 = null;
                                                                        if (!Display.this.tSubstat4Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")) {
                                                                                aSubstat4 = new StatArtefacto(
                                                                                                Display.this.tSubstat4Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat4Valor
                                                                                                                .getSelectedItem());
                                                                        }

                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        Display.this.tmainStat
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat1Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat1Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat2Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat2Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat3Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat3Valor
                                                                                                                        .getSelectedItem()),
                                                                                        aSubstat4);
                                                                        artefacto = CalculosCalculosos
                                                                                        .StatNivel4(artefacto);
                                                                        Display.this.fnivel.setText(
                                                                                        "Nivel");
                                                                        Display.this.fmainStat.setText(
                                                                                        "Main Stat");
                                                                        Display.this.fSubstat1.setText(
                                                                                        "" + artefacto.Substat1.tipo);
                                                                        Display.this.fSubstat2.setText(
                                                                                        "" + artefacto.Substat2.tipo);
                                                                        Display.this.fSubstat3.setText(
                                                                                        "" + artefacto.Substat3.tipo);
                                                                        Display.this.fSubstat4.setText(
                                                                                        "" + artefacto.Substat4.tipo);
                                                                        Display.this.vnivel.setText(""
                                                                                        + artefacto.nivel);
                                                                        Display.this.vmainStat.setText(
                                                                                        "" + artefacto.mainStat);
                                                                        Display.this.vSubstat1.setText(
                                                                                        "" + artefacto.Substat1.valor);
                                                                        Display.this.vSubstat2.setText(
                                                                                        "" + artefacto.Substat2.valor);
                                                                        Display.this.vSubstat3.setText(
                                                                                        "" + artefacto.Substat3.valor);
                                                                        Display.this.vSubstat4.setText(
                                                                                        "" + artefacto.Substat4.valor);
                                                                }
                                                        }

                                                });
                                                Display.this.boton8.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if (e.getSource().equals(Display.this.boton8)) {
                                                                        if (!Display.this.tSubstat1Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")
                                                                                        && !Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString()
                                                                                                        .equals("Stat")
                                                                                        && !Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString()
                                                                                                        .equals("Stat")) {
                                                                                String amainStat = Display.this.tmainStat
                                                                                                .getSelectedItem()
                                                                                                .toString();
                                                                                StatArtefacto aSubstat1 = new StatArtefacto(
                                                                                                Display.this.tSubstat1Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat1Valor
                                                                                                                .getSelectedItem());
                                                                                StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                                Display.this.tSubstat2Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat2Valor
                                                                                                                .getSelectedItem());
                                                                                StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                                Display.this.tSubstat3Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat3Valor
                                                                                                                .getSelectedItem());
                                                                                StatArtefacto aSubstat4 = null;
                                                                                if (!Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                                        aSubstat4 = new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat4Valor
                                                                                                                        .getSelectedItem());
                                                                                }

                                                                                Artefacto artefacto = new Artefacto(
                                                                                                Integer.parseInt(
                                                                                                                Display.this.Tipo),
                                                                                                amainStat,
                                                                                                aSubstat1,
                                                                                                aSubstat2,
                                                                                                aSubstat3,
                                                                                                aSubstat4);
                                                                                artefacto = CalculosCalculosos
                                                                                                .StatNivel8(artefacto);
                                                                                Display.this.fnivel.setText(
                                                                                                "Nivel");
                                                                                Display.this.fmainStat.setText(
                                                                                                "Main Stat");
                                                                                Display.this.fSubstat1.setText(
                                                                                                "" + artefacto.Substat1.tipo);
                                                                                Display.this.fSubstat2.setText(
                                                                                                "" + artefacto.Substat2.tipo);
                                                                                Display.this.fSubstat3.setText(
                                                                                                "" + artefacto.Substat3.tipo);
                                                                                Display.this.fSubstat4.setText(
                                                                                                "" + artefacto.Substat4.tipo);
                                                                                Display.this.vnivel.setText(""
                                                                                                + artefacto.nivel);
                                                                                Display.this.vmainStat.setText(
                                                                                                "" + artefacto.mainStat);
                                                                                Display.this.vSubstat1.setText(
                                                                                                "" + artefacto.Substat1.valor);
                                                                                Display.this.vSubstat2.setText(
                                                                                                "" + artefacto.Substat2.valor);
                                                                                Display.this.vSubstat3.setText(
                                                                                                "" + artefacto.Substat3.valor);
                                                                                Display.this.vSubstat4.setText(
                                                                                                "" + artefacto.Substat4.valor);
                                                                        } else {
                                                                                JOptionPane.showMessageDialog(
                                                                                                (Component) null,
                                                                                                "Valor de Stats vacias");
                                                                        }
                                                                }

                                                        }
                                                });
                                                Display.this.boton12.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if (e.getSource()
                                                                                .equals(Display.this.boton12)) {
                                                                        if (!Display.this.tSubstat1Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")
                                                                                        && !Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString()
                                                                                                        .equals("Stat")
                                                                                        && !Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString()
                                                                                                        .equals("Stat")) {
                                                                                String amainStat = Display.this.tmainStat
                                                                                                .getSelectedItem()
                                                                                                .toString();
                                                                                StatArtefacto aSubstat1 = new StatArtefacto(
                                                                                                Display.this.tSubstat1Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat1Valor
                                                                                                                .getSelectedItem());
                                                                                StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                                Display.this.tSubstat2Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat2Valor
                                                                                                                .getSelectedItem());
                                                                                StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                                Display.this.tSubstat3Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat3Valor
                                                                                                                .getSelectedItem());
                                                                                StatArtefacto aSubstat4 = null;
                                                                                if (!Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                                        aSubstat4 = new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat4Valor
                                                                                                                        .getSelectedItem());
                                                                                }

                                                                                Artefacto artefacto = new Artefacto(
                                                                                                Integer.parseInt(
                                                                                                                Display.this.Tipo),
                                                                                                amainStat,
                                                                                                aSubstat1,
                                                                                                aSubstat2,
                                                                                                aSubstat3,
                                                                                                aSubstat4);
                                                                                artefacto = CalculosCalculosos
                                                                                                .StatNivel12(artefacto);
                                                                                Display.this.fnivel.setText(
                                                                                                "Nivel");
                                                                                Display.this.fmainStat.setText(
                                                                                                "Main Stat");
                                                                                Display.this.fSubstat1.setText(
                                                                                                "" + artefacto.Substat1.tipo);
                                                                                Display.this.fSubstat2.setText(
                                                                                                "" + artefacto.Substat2.tipo);
                                                                                Display.this.fSubstat3.setText(
                                                                                                "" + artefacto.Substat3.tipo);
                                                                                Display.this.fSubstat4.setText(
                                                                                                "" + artefacto.Substat4.tipo);
                                                                                Display.this.vnivel.setText(""
                                                                                                + artefacto.nivel);
                                                                                Display.this.vmainStat.setText(
                                                                                                "" + artefacto.mainStat);
                                                                                Display.this.vSubstat1.setText(
                                                                                                "" + artefacto.Substat1.valor);
                                                                                Display.this.vSubstat2.setText(
                                                                                                "" + artefacto.Substat2.valor);
                                                                                Display.this.vSubstat3.setText(
                                                                                                "" + artefacto.Substat3.valor);
                                                                                Display.this.vSubstat4.setText(
                                                                                                "" + artefacto.Substat4.valor);
                                                                        } else {
                                                                                JOptionPane.showMessageDialog(
                                                                                                (Component) null,
                                                                                                "Valor de Stats vacias");
                                                                        }
                                                                }

                                                        }
                                                });
                                                Display.this.boton16.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if (e.getSource()
                                                                                .equals(Display.this.boton16)) {
                                                                        if (!Display.this.tSubstat1Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")
                                                                                        && !Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString()
                                                                                                        .equals("Stat")
                                                                                        && !Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString()
                                                                                                        .equals("Stat")) {
                                                                                String amainStat = Display.this.tmainStat
                                                                                                .getSelectedItem()
                                                                                                .toString();
                                                                                StatArtefacto aSubstat1 = new StatArtefacto(
                                                                                                Display.this.tSubstat1Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat1Valor
                                                                                                                .getSelectedItem());
                                                                                StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                                Display.this.tSubstat2Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat2Valor
                                                                                                                .getSelectedItem());
                                                                                StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                                Display.this.tSubstat3Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat3Valor
                                                                                                                .getSelectedItem());
                                                                                StatArtefacto aSubstat4 = null;
                                                                                if (!Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                                        aSubstat4 = new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat4Valor
                                                                                                                        .getSelectedItem());
                                                                                }

                                                                                Artefacto artefacto = new Artefacto(
                                                                                                Integer.parseInt(
                                                                                                                Display.this.Tipo),
                                                                                                amainStat,
                                                                                                aSubstat1,
                                                                                                aSubstat2,
                                                                                                aSubstat3,
                                                                                                aSubstat4);
                                                                                artefacto = CalculosCalculosos
                                                                                                .StatNivel16(artefacto);
                                                                                Display.this.fnivel.setText(
                                                                                                "Nivel");
                                                                                Display.this.fmainStat.setText(
                                                                                                "Main Stat");
                                                                                Display.this.fSubstat1.setText(
                                                                                                "" + artefacto.Substat1.tipo);
                                                                                Display.this.fSubstat2.setText(
                                                                                                "" + artefacto.Substat2.tipo);
                                                                                Display.this.fSubstat3.setText(
                                                                                                "" + artefacto.Substat3.tipo);
                                                                                Display.this.fSubstat4.setText(
                                                                                                "" + artefacto.Substat4.tipo);
                                                                                Display.this.vnivel.setText(""
                                                                                                + artefacto.nivel);
                                                                                Display.this.vmainStat.setText(
                                                                                                "" + artefacto.mainStat);
                                                                                Display.this.vSubstat1.setText(
                                                                                                "" + artefacto.Substat1.valor);
                                                                                Display.this.vSubstat2.setText(
                                                                                                "" + artefacto.Substat2.valor);
                                                                                Display.this.vSubstat3.setText(
                                                                                                "" + artefacto.Substat3.valor);
                                                                                Display.this.vSubstat4.setText(
                                                                                                "" + artefacto.Substat4.valor);
                                                                        } else {
                                                                                JOptionPane.showMessageDialog(
                                                                                                (Component) null,
                                                                                                "Valor de Stats vacias");
                                                                        }
                                                                }

                                                        }
                                                });
                                                Display.this.boton20.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if (e.getSource()
                                                                                .equals(Display.this.boton20)) {
                                                                        if (!Display.this.tSubstat1Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")
                                                                                        && !Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString()
                                                                                                        .equals("Stat")
                                                                                        && !Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString()
                                                                                                        .equals("Stat")) {
                                                                                String amainStat = Display.this.tmainStat
                                                                                                .getSelectedItem()
                                                                                                .toString();
                                                                                StatArtefacto aSubstat1 = new StatArtefacto(
                                                                                                Display.this.tSubstat1Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat1Valor
                                                                                                                .getSelectedItem());
                                                                                StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                                Display.this.tSubstat2Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat2Valor
                                                                                                                .getSelectedItem());
                                                                                StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                                Display.this.tSubstat3Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat3Valor
                                                                                                                .getSelectedItem());
                                                                                StatArtefacto aSubstat4 = null;
                                                                                if (!Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                                        aSubstat4 = new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat4Valor
                                                                                                                        .getSelectedItem());
                                                                                }

                                                                                Artefacto artefacto = new Artefacto(
                                                                                                Integer.parseInt(
                                                                                                                Display.this.Tipo),
                                                                                                amainStat,
                                                                                                aSubstat1,
                                                                                                aSubstat2,
                                                                                                aSubstat3,
                                                                                                aSubstat4);
                                                                                artefacto = CalculosCalculosos
                                                                                                .StatNivel20(artefacto);
                                                                                Display.this.fnivel.setText(
                                                                                                "Nivel");
                                                                                Display.this.fmainStat.setText(
                                                                                                "Main Stat");
                                                                                Display.this.fSubstat1.setText(
                                                                                                "" + artefacto.Substat1.tipo);
                                                                                Display.this.fSubstat2.setText(
                                                                                                "" + artefacto.Substat2.tipo);
                                                                                Display.this.fSubstat3.setText(
                                                                                                "" + artefacto.Substat3.tipo);
                                                                                Display.this.fSubstat4.setText(
                                                                                                "" + artefacto.Substat4.tipo);
                                                                                Display.this.vnivel.setText(""
                                                                                                + artefacto.nivel);
                                                                                Display.this.vmainStat.setText(
                                                                                                "" + artefacto.mainStat);
                                                                                Display.this.vSubstat1.setText(
                                                                                                "" + artefacto.Substat1.valor);
                                                                                Display.this.vSubstat2.setText(
                                                                                                "" + artefacto.Substat2.valor);
                                                                                Display.this.vSubstat3.setText(
                                                                                                "" + artefacto.Substat3.valor);
                                                                                Display.this.vSubstat4.setText(
                                                                                                "" + artefacto.Substat4.valor);
                                                                        } else {
                                                                                JOptionPane.showMessageDialog(
                                                                                                (Component) null,
                                                                                                "Valor de Stats vacias");
                                                                        }
                                                                }

                                                        }
                                                });
                                                break;
                                        case "4":
                                                Display.this.boton8.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if ((Display.this.tSubstat1Tipo
                                                                                .getSelectedItem()
                                                                                .toString()
                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat"))
                                                                                && !Display.this.mostrado) {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias ");
                                                                        Display.this.mostrado = false;
                                                                }
                                                                if (!Display.this.tSubstat1Tipo
                                                                                .getSelectedItem().toString()
                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        Display.this.tmainStat
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat1Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat1Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat2Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat2Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat3Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat3Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat4Valor
                                                                                                                        .getSelectedItem()));
                                                                        Artefacto artefactoRes = CalculosCalculosos
                                                                                        .StatNivel8(artefacto);
                                                                        Display.this.fnivel.setText(
                                                                                        "Nivel");
                                                                        Display.this.fmainStat.setText(
                                                                                        "Main Stat");
                                                                        Display.this.fSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.tipo);
                                                                        Display.this.fSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.tipo);
                                                                        Display.this.fSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.tipo);
                                                                        Display.this.fSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.tipo);
                                                                        Display.this.vnivel.setText(""
                                                                                        + artefactoRes.nivel);
                                                                        Display.this.vmainStat.setText(
                                                                                        "" + artefactoRes.mainStat);
                                                                        Display.this.vSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.valor);
                                                                        Display.this.vSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.valor);
                                                                        Display.this.vSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.valor);
                                                                        Display.this.vSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.valor);
                                                                }
                                                        }
                                                });
                                                Display.this.boton12.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if ((Display.this.tSubstat1Tipo
                                                                                .getSelectedItem()
                                                                                .toString()
                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat"))
                                                                                && !Display.this.mostrado) {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias ");
                                                                        Display.this.mostrado = false;
                                                                }
                                                                if (!Display.this.tSubstat1Tipo
                                                                                .getSelectedItem().toString()
                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        Display.this.tmainStat
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat1Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat1Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat2Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat2Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat3Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat3Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat4Valor
                                                                                                                        .getSelectedItem()));
                                                                        Artefacto artefactoRes = CalculosCalculosos
                                                                                        .StatNivel12(artefacto);
                                                                        Display.this.fnivel.setText(
                                                                                        "Nivel");
                                                                        Display.this.fmainStat.setText(
                                                                                        "Main Stat");
                                                                        Display.this.fSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.tipo);
                                                                        Display.this.fSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.tipo);
                                                                        Display.this.fSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.tipo);
                                                                        Display.this.fSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.tipo);
                                                                        Display.this.vnivel.setText(""
                                                                                        + artefactoRes.nivel);
                                                                        Display.this.vmainStat.setText(
                                                                                        "" + artefactoRes.mainStat);
                                                                        Display.this.vSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.valor);
                                                                        Display.this.vSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.valor);
                                                                        Display.this.vSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.valor);
                                                                        Display.this.vSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.valor);
                                                                }
                                                        }
                                                });
                                                Display.this.boton16.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if ((Display.this.tSubstat1Tipo
                                                                                .getSelectedItem()
                                                                                .toString()
                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat"))
                                                                                && !Display.this.mostrado) {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias ");
                                                                        Display.this.mostrado = false;
                                                                }
                                                                if (!Display.this.tSubstat1Tipo
                                                                                .getSelectedItem().toString()
                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        Display.this.tmainStat
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat1Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat1Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat2Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat2Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat3Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat3Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat4Valor
                                                                                                                        .getSelectedItem()));
                                                                        Artefacto artefactoRes = CalculosCalculosos
                                                                                        .StatNivel16(artefacto);
                                                                        Display.this.fnivel.setText(
                                                                                        "Nivel");
                                                                        Display.this.fmainStat.setText(
                                                                                        "Main Stat");
                                                                        Display.this.fSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.tipo);
                                                                        Display.this.fSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.tipo);
                                                                        Display.this.fSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.tipo);
                                                                        Display.this.fSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.tipo);
                                                                        Display.this.vnivel.setText(""
                                                                                        + artefactoRes.nivel);
                                                                        Display.this.vmainStat.setText(
                                                                                        "" + artefactoRes.mainStat);
                                                                        Display.this.vSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.valor);
                                                                        Display.this.vSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.valor);
                                                                        Display.this.vSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.valor);
                                                                        Display.this.vSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.valor);
                                                                }
                                                        }
                                                });
                                                Display.this.boton20.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if ((Display.this.tSubstat1Tipo
                                                                                .getSelectedItem()
                                                                                .toString()
                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat"))
                                                                                && !Display.this.mostrado) {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias ");
                                                                        Display.this.mostrado = false;
                                                                }
                                                                if (!Display.this.tSubstat1Tipo
                                                                                .getSelectedItem().toString()
                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        Display.this.tmainStat
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat1Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat1Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat2Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat2Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat3Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat3Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat4Valor
                                                                                                                        .getSelectedItem()));
                                                                        Artefacto artefactoRes = CalculosCalculosos
                                                                                        .StatNivel20(artefacto);
                                                                        Display.this.fnivel.setText(
                                                                                        "Nivel");
                                                                        Display.this.fmainStat.setText(
                                                                                        "Main Stat");
                                                                        Display.this.fSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.tipo);
                                                                        Display.this.fSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.tipo);
                                                                        Display.this.fSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.tipo);
                                                                        Display.this.fSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.tipo);
                                                                        Display.this.vnivel.setText(""
                                                                                        + artefactoRes.nivel);
                                                                        Display.this.vmainStat.setText(
                                                                                        "" + artefactoRes.mainStat);
                                                                        Display.this.vSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.valor);
                                                                        Display.this.vSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.valor);
                                                                        Display.this.vSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.valor);
                                                                        Display.this.vSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.valor);
                                                                }
                                                        }
                                                });
                                                break;
                                        case "8":
                                                Display.this.boton12.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if ((Display.this.tSubstat1Tipo
                                                                                .getSelectedItem()
                                                                                .toString()
                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat"))
                                                                                && !Display.this.mostrado) {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias ");
                                                                        Display.this.mostrado = false;
                                                                }
                                                                if (!Display.this.tSubstat1Tipo
                                                                                .getSelectedItem().toString()
                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        Display.this.tmainStat
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat1Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat1Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat2Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat2Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat3Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat3Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat4Valor
                                                                                                                        .getSelectedItem()));
                                                                        Artefacto artefactoRes = CalculosCalculosos
                                                                                        .StatNivel12(artefacto);
                                                                        Display.this.fnivel.setText(
                                                                                        "Nivel");
                                                                        Display.this.fmainStat.setText(
                                                                                        "Main Stat");
                                                                        Display.this.fSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.tipo);
                                                                        Display.this.fSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.tipo);
                                                                        Display.this.fSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.tipo);
                                                                        Display.this.fSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.tipo);
                                                                        Display.this.vnivel.setText(""
                                                                                        + artefactoRes.nivel);
                                                                        Display.this.vmainStat.setText(
                                                                                        "" + artefactoRes.mainStat);
                                                                        Display.this.vSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.valor);
                                                                        Display.this.vSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.valor);
                                                                        Display.this.vSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.valor);
                                                                        Display.this.vSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.valor);
                                                                }
                                                        }
                                                });
                                                Display.this.boton16.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if ((Display.this.tSubstat1Tipo
                                                                                .getSelectedItem()
                                                                                .toString()
                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat"))
                                                                                && !Display.this.mostrado) {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias ");
                                                                        Display.this.mostrado = false;
                                                                }
                                                                if (!Display.this.tSubstat1Tipo
                                                                                .getSelectedItem().toString()
                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        Display.this.tmainStat
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat1Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat1Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat2Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat2Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat3Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat3Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat4Valor
                                                                                                                        .getSelectedItem()));
                                                                        Artefacto artefactoRes = CalculosCalculosos
                                                                                        .StatNivel16(artefacto);
                                                                        Display.this.fnivel.setText(
                                                                                        "Nivel");
                                                                        Display.this.fmainStat.setText(
                                                                                        "Main Stat");
                                                                        Display.this.fSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.tipo);
                                                                        Display.this.fSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.tipo);
                                                                        Display.this.fSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.tipo);
                                                                        Display.this.fSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.tipo);
                                                                        Display.this.vnivel.setText(""
                                                                                        + artefactoRes.nivel);
                                                                        Display.this.vmainStat.setText(
                                                                                        "" + artefactoRes.mainStat);
                                                                        Display.this.vSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.valor);
                                                                        Display.this.vSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.valor);
                                                                        Display.this.vSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.valor);
                                                                        Display.this.vSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.valor);
                                                                }
                                                        }
                                                });
                                                Display.this.boton20.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if ((Display.this.tSubstat1Tipo
                                                                                .getSelectedItem()
                                                                                .toString()
                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat"))
                                                                                && !Display.this.mostrado) {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias ");
                                                                        Display.this.mostrado = false;
                                                                }
                                                                if (!Display.this.tSubstat1Tipo
                                                                                .getSelectedItem().toString()
                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        Display.this.tmainStat
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat1Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat1Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat2Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat2Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat3Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat3Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat4Valor
                                                                                                                        .getSelectedItem()));
                                                                        Artefacto artefactoRes = CalculosCalculosos
                                                                                        .StatNivel20(artefacto);
                                                                        Display.this.fnivel.setText(
                                                                                        "Nivel");
                                                                        Display.this.fmainStat.setText(
                                                                                        "Main Stat");
                                                                        Display.this.fSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.tipo);
                                                                        Display.this.fSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.tipo);
                                                                        Display.this.fSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.tipo);
                                                                        Display.this.fSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.tipo);
                                                                        Display.this.vnivel.setText(""
                                                                                        + artefactoRes.nivel);
                                                                        Display.this.vmainStat.setText(
                                                                                        "" + artefactoRes.mainStat);
                                                                        Display.this.vSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.valor);
                                                                        Display.this.vSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.valor);
                                                                        Display.this.vSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.valor);
                                                                        Display.this.vSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.valor);
                                                                }
                                                        }
                                                });
                                                break;
                                        case "12":
                                                Display.this.boton16.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if ((Display.this.tSubstat1Tipo
                                                                                .getSelectedItem()
                                                                                .toString()
                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat"))
                                                                                && !Display.this.mostrado) {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias ");
                                                                        Display.this.mostrado = false;
                                                                }
                                                                if (!Display.this.tSubstat1Tipo
                                                                                .getSelectedItem().toString()
                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        Display.this.tmainStat
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat1Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat1Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat2Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat2Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat3Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat3Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat4Valor
                                                                                                                        .getSelectedItem()));
                                                                        Artefacto artefactoRes = CalculosCalculosos
                                                                                        .StatNivel16(artefacto);
                                                                        Display.this.fnivel.setText(
                                                                                        "Nivel");
                                                                        Display.this.fmainStat.setText(
                                                                                        "Main Stat");
                                                                        Display.this.fSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.tipo);
                                                                        Display.this.fSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.tipo);
                                                                        Display.this.fSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.tipo);
                                                                        Display.this.fSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.tipo);
                                                                        Display.this.vnivel.setText(""
                                                                                        + artefactoRes.nivel);
                                                                        Display.this.vmainStat.setText(
                                                                                        "" + artefactoRes.mainStat);
                                                                        Display.this.vSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.valor);
                                                                        Display.this.vSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.valor);
                                                                        Display.this.vSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.valor);
                                                                        Display.this.vSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.valor);
                                                                }
                                                        }
                                                });
                                                Display.this.boton20.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if ((Display.this.tSubstat1Tipo
                                                                                .getSelectedItem()
                                                                                .toString()
                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat"))
                                                                                && !Display.this.mostrado) {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias ");
                                                                        Display.this.mostrado = false;
                                                                }
                                                                if (!Display.this.tSubstat1Tipo
                                                                                .getSelectedItem().toString()
                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                && !Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        Display.this.tmainStat
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat1Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat1Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat2Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat2Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat3Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat3Valor
                                                                                                                        .getSelectedItem()),
                                                                                        new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        (Double) Display.this.tSubstat4Valor
                                                                                                                        .getSelectedItem()));
                                                                        Artefacto artefactoRes = CalculosCalculosos
                                                                                        .StatNivel20(artefacto);
                                                                        Display.this.fnivel.setText(
                                                                                        "Nivel");
                                                                        Display.this.fmainStat.setText(
                                                                                        "Main Stat");
                                                                        Display.this.fSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.tipo);
                                                                        Display.this.fSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.tipo);
                                                                        Display.this.fSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.tipo);
                                                                        Display.this.fSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.tipo);
                                                                        Display.this.vnivel.setText(""
                                                                                        + artefactoRes.nivel);
                                                                        Display.this.vmainStat.setText(
                                                                                        "" + artefactoRes.mainStat);
                                                                        Display.this.vSubstat1.setText(
                                                                                        "" + artefactoRes.Substat1.valor);
                                                                        Display.this.vSubstat2.setText(
                                                                                        "" + artefactoRes.Substat2.valor);
                                                                        Display.this.vSubstat3.setText(
                                                                                        "" + artefactoRes.Substat3.valor);
                                                                        Display.this.vSubstat4.setText(
                                                                                        "" + artefactoRes.Substat4.valor);
                                                                }
                                                        }
                                                });
                                                break;
                                        case "16":
                                                Display.this.boton20.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if ((Display.this.tSubstat1Tipo
                                                                                .getSelectedItem()
                                                                                .toString()
                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat2Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat3Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")
                                                                                || Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat"))
                                                                                && !Display.this.mostrado) {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias ");
                                                                        Display.this.mostrado = false;
                                                                }
                                                                Artefacto artefacto = new Artefacto(
                                                                                Integer.parseInt(
                                                                                                Display.this.Tipo),
                                                                                Display.this.tmainStat
                                                                                                .getSelectedItem()
                                                                                                .toString(),
                                                                                new StatArtefacto(
                                                                                                Display.this.tSubstat1Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat1Valor
                                                                                                                .getSelectedItem()),
                                                                                new StatArtefacto(
                                                                                                Display.this.tSubstat2Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat2Valor
                                                                                                                .getSelectedItem()),
                                                                                new StatArtefacto(
                                                                                                Display.this.tSubstat3Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat3Valor
                                                                                                                .getSelectedItem()),
                                                                                new StatArtefacto(
                                                                                                Display.this.tSubstat4Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                (Double) Display.this.tSubstat4Valor
                                                                                                                .getSelectedItem()));
                                                                artefacto = CalculosCalculosos
                                                                                .StatNivel20(artefacto);
                                                                Display.this.fnivel.setText("Nivel");
                                                                Display.this.fmainStat
                                                                                .setText("Main Stat");
                                                                Display.this.fSubstat1.setText(""
                                                                                + artefacto.Substat1.tipo);
                                                                Display.this.fSubstat2.setText(""
                                                                                + artefacto.Substat2.tipo);
                                                                Display.this.fSubstat3.setText(""
                                                                                + artefacto.Substat3.tipo);
                                                                Display.this.fSubstat4.setText(""
                                                                                + artefacto.Substat4.tipo);
                                                                Display.this.vnivel.setText(
                                                                                "" + artefacto.nivel);
                                                                Display.this.vmainStat.setText(""
                                                                                + artefacto.mainStat);
                                                                Display.this.vSubstat1.setText(""
                                                                                + artefacto.Substat1.valor);
                                                                Display.this.vSubstat2.setText(""
                                                                                + artefacto.Substat2.valor);
                                                                Display.this.vSubstat3.setText(""
                                                                                + artefacto.Substat3.valor);
                                                                Display.this.vSubstat4.setText(""
                                                                                + artefacto.Substat4.valor);
                                                        }
                                                });
                                }
                        }

                });
        }
}
