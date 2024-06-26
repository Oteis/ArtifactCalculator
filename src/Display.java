
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
                                                box.addItem(16.0);
                                                box.addItem(19.0);
                                                box.addItem(21.0);
                                                box.addItem(23.0);
                                        }

                                        if (Tipo.equals("DefPorciento")) {
                                                box.addItem(5.1);
                                                box.addItem(5.8);
                                                box.addItem(6.6);
                                                box.addItem(7.3);
                                        }

                                        if (Tipo.equals("HP")) {
                                                box.addItem(209.0);
                                                box.addItem(239.0);
                                                box.addItem(269.0);
                                                box.addItem(299.0);
                                        }

                                        if (Tipo.equals("HPPorciento")) {
                                                box.addItem(4.1);
                                                box.addItem(4.7);
                                                box.addItem(5.3);
                                                box.addItem(5.8);
                                        }

                                        if (Tipo.equals("Atq")) {
                                                box.addItem(14.0);
                                                box.addItem(16.0);
                                                box.addItem(18.0);
                                                box.addItem(19.0);
                                        }

                                        if (Tipo.equals("AtqPorciento")) {
                                                box.addItem(4.1);
                                                box.addItem(4.7);
                                                box.addItem(5.3);
                                                box.addItem(5.8);
                                        }

                                        if (Tipo.equals("Recarga")) {
                                                box.addItem(4.5);
                                                box.addItem(5.2);
                                                box.addItem(5.8);
                                                box.addItem(6.5);
                                        }

                                        if (Tipo.equals("ME")) {
                                                box.addItem(16.0);
                                                box.addItem(19.0);
                                                box.addItem(21.0);
                                                box.addItem(23.0);
                                        }

                                        if (Tipo.equals("Prob")) {
                                                box.addItem(2.7);
                                                box.addItem(3.1);
                                                box.addItem(3.5);
                                                box.addItem(3.9);
                                        }

                                        if (Tipo.equals("Dmg")) {
                                                box.addItem(5.4);
                                                box.addItem(6.2);
                                                box.addItem(7.0);
                                                box.addItem(7.8);
                                        }
                                }

                        }
                });
        }

        public Display() {
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

                                switch (Display.this.Tipo) {
                                        case "Select lvl":
                                        default:
                                                break;
                                        case "1":
                                                Display.this.p.remove(Display.this.zTextSubstat1);
                                                Display.this.p.remove(Display.this.zTextSubstat2);
                                                Display.this.p.remove(Display.this.zTextSubstat3);
                                                Display.this.p.remove(Display.this.zTextSubstat4);
                                                Display.this.p.add(Display.this.tSubstat1Valor);
                                                Display.this.p.add(Display.this.tSubstat2Valor);
                                                Display.this.p.add(Display.this.tSubstat3Valor);
                                                Display.this.p.add(Display.this.tSubstat4Valor);
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
                                                                        } else {
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
                                                Display.this.p.remove(Display.this.tSubstat1Valor);
                                                Display.this.p.remove(Display.this.tSubstat2Valor);
                                                Display.this.p.remove(Display.this.tSubstat3Valor);
                                                Display.this.p.remove(Display.this.tSubstat4Valor);
                                                Display.this.p.add(Display.this.zTextSubstat1);
                                                Display.this.p.add(Display.this.zTextSubstat2);
                                                Display.this.p.add(Display.this.zTextSubstat3);
                                                Display.this.p.add(Display.this.zTextSubstat4);
                                                Display.this.boton8.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
                                                                if (e.getSource().equals(Display.this.boton8)
                                                                                && Display.this.Tipo
                                                                                                .equals("8")) {
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
                                                                                                        .equals("Stat")
                                                                                        && !Display.this.tSubstat4Tipo
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
                                                                                                Double.parseDouble(
                                                                                                                Display.this.zTextSubstat1
                                                                                                                                .getText()));
                                                                                StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                                Display.this.tSubstat2Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                Double.parseDouble(
                                                                                                                Display.this.zTextSubstat2
                                                                                                                                .getText()));
                                                                                StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                                Display.this.tSubstat3Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                Double.parseDouble(
                                                                                                                Display.this.zTextSubstat3
                                                                                                                                .getText()));
                                                                                StatArtefacto aSubstat4 = null;
                                                                                if (!Display.this.tSubstat4Tipo
                                                                                                .getSelectedItem()
                                                                                                .toString()
                                                                                                .equals("Stat")) {
                                                                                        aSubstat4 = new StatArtefacto(
                                                                                                        Display.this.tSubstat4Tipo
                                                                                                                        .getSelectedItem()
                                                                                                                        .toString(),
                                                                                                        Double.parseDouble(
                                                                                                                        Display.this.zTextSubstat4
                                                                                                                                        .getText()));
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
                                                                        String amainStat = Display.this.tmainStat
                                                                                        .getSelectedItem()
                                                                                        .toString();
                                                                        StatArtefacto aSubstat1 = new StatArtefacto(
                                                                                        Display.this.tSubstat1Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat1
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                        Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat2
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                        Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat3
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat4 = null;
                                                                        if (!Display.this.tSubstat4Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")) {
                                                                                aSubstat4 = new StatArtefacto(
                                                                                                Display.this.tSubstat4Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                Double.parseDouble(
                                                                                                                Display.this.zTextSubstat4
                                                                                                                                .getText()));
                                                                        }

                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        amainStat, aSubstat1,
                                                                                        aSubstat2, aSubstat3,
                                                                                        aSubstat4);
                                                                        artefacto = CalculosCalculosos
                                                                                        .StatNivel12(artefacto);
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
                                                                } else {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias");
                                                                }

                                                        }
                                                });
                                                Display.this.boton16.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
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
                                                                        String amainStat = Display.this.tmainStat
                                                                                        .getSelectedItem()
                                                                                        .toString();
                                                                        StatArtefacto aSubstat1 = new StatArtefacto(
                                                                                        Display.this.tSubstat1Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat1
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                        Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat2
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                        Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat3
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat4 = null;
                                                                        if (!Display.this.tSubstat4Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")) {
                                                                                aSubstat4 = new StatArtefacto(
                                                                                                Display.this.tSubstat4Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                Double.parseDouble(
                                                                                                                Display.this.zTextSubstat4
                                                                                                                                .getText()));
                                                                        }

                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        amainStat, aSubstat1,
                                                                                        aSubstat2, aSubstat3,
                                                                                        aSubstat4);
                                                                        artefacto = CalculosCalculosos
                                                                                        .StatNivel16(artefacto);
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
                                                                } else {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias");
                                                                }

                                                        }
                                                });
                                                Display.this.boton20.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
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
                                                                        String amainStat = Display.this.tmainStat
                                                                                        .getSelectedItem()
                                                                                        .toString();
                                                                        StatArtefacto aSubstat1 = new StatArtefacto(
                                                                                        Display.this.tSubstat1Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat1
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                        Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat2
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                        Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat3
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat4 = null;
                                                                        if (!Display.this.tSubstat4Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")) {
                                                                                aSubstat4 = new StatArtefacto(
                                                                                                Display.this.tSubstat4Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                Double.parseDouble(
                                                                                                                Display.this.zTextSubstat4
                                                                                                                                .getText()));
                                                                        }

                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        amainStat, aSubstat1,
                                                                                        aSubstat2, aSubstat3,
                                                                                        aSubstat4);
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
                                                                } else {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias");
                                                                }

                                                        }
                                                });
                                                break;
                                        case "8":
                                                Display.this.p.remove(Display.this.tSubstat1Valor);
                                                Display.this.p.remove(Display.this.tSubstat2Valor);
                                                Display.this.p.remove(Display.this.tSubstat3Valor);
                                                Display.this.p.remove(Display.this.tSubstat4Valor);
                                                Display.this.p.add(Display.this.zTextSubstat1);
                                                Display.this.p.add(Display.this.zTextSubstat2);
                                                Display.this.p.add(Display.this.zTextSubstat3);
                                                Display.this.p.add(Display.this.zTextSubstat4);
                                                Display.this.boton12.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
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
                                                                        String amainStat = Display.this.tmainStat
                                                                                        .getSelectedItem()
                                                                                        .toString();
                                                                        StatArtefacto aSubstat1 = new StatArtefacto(
                                                                                        Display.this.tSubstat1Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat1
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                        Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat2
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                        Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat3
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat4 = null;
                                                                        if (!Display.this.tSubstat4Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")) {
                                                                                aSubstat4 = new StatArtefacto(
                                                                                                Display.this.tSubstat4Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                Double.parseDouble(
                                                                                                                Display.this.zTextSubstat4
                                                                                                                                .getText()));
                                                                        }

                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        amainStat, aSubstat1,
                                                                                        aSubstat2, aSubstat3,
                                                                                        aSubstat4);
                                                                        artefacto = CalculosCalculosos
                                                                                        .StatNivel12(artefacto);
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
                                                                } else {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias");
                                                                }

                                                        }
                                                });
                                                Display.this.boton16.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
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
                                                                        String amainStat = Display.this.tmainStat
                                                                                        .getSelectedItem()
                                                                                        .toString();
                                                                        StatArtefacto aSubstat1 = new StatArtefacto(
                                                                                        Display.this.tSubstat1Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat1
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                        Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat2
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                        Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat3
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat4 = null;
                                                                        if (!Display.this.tSubstat4Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")) {
                                                                                aSubstat4 = new StatArtefacto(
                                                                                                Display.this.tSubstat4Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                Double.parseDouble(
                                                                                                                Display.this.zTextSubstat4
                                                                                                                                .getText()));
                                                                        }

                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        amainStat, aSubstat1,
                                                                                        aSubstat2, aSubstat3,
                                                                                        aSubstat4);
                                                                        artefacto = CalculosCalculosos
                                                                                        .StatNivel16(artefacto);
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
                                                                } else {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias");
                                                                }

                                                        }
                                                });
                                                Display.this.boton20.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
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
                                                                        String amainStat = Display.this.tmainStat
                                                                                        .getSelectedItem()
                                                                                        .toString();
                                                                        StatArtefacto aSubstat1 = new StatArtefacto(
                                                                                        Display.this.tSubstat1Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat1
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                        Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat2
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                        Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat3
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat4 = null;
                                                                        if (!Display.this.tSubstat4Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")) {
                                                                                aSubstat4 = new StatArtefacto(
                                                                                                Display.this.tSubstat4Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                Double.parseDouble(
                                                                                                                Display.this.zTextSubstat4
                                                                                                                                .getText()));
                                                                        }

                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        amainStat, aSubstat1,
                                                                                        aSubstat2, aSubstat3,
                                                                                        aSubstat4);
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
                                                                } else {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias");
                                                                }

                                                        }
                                                });
                                                break;
                                        case "12":
                                                Display.this.p.remove(Display.this.tSubstat1Valor);
                                                Display.this.p.remove(Display.this.tSubstat2Valor);
                                                Display.this.p.remove(Display.this.tSubstat3Valor);
                                                Display.this.p.remove(Display.this.tSubstat4Valor);
                                                Display.this.p.add(Display.this.zTextSubstat1);
                                                Display.this.p.add(Display.this.zTextSubstat2);
                                                Display.this.p.add(Display.this.zTextSubstat3);
                                                Display.this.p.add(Display.this.zTextSubstat4);
                                                Display.this.boton16.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
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
                                                                        String amainStat = Display.this.tmainStat
                                                                                        .getSelectedItem()
                                                                                        .toString();
                                                                        StatArtefacto aSubstat1 = new StatArtefacto(
                                                                                        Display.this.tSubstat1Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat1
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                        Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat2
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                        Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat3
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat4 = null;
                                                                        if (!Display.this.tSubstat4Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")) {
                                                                                aSubstat4 = new StatArtefacto(
                                                                                                Display.this.tSubstat4Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                Double.parseDouble(
                                                                                                                Display.this.zTextSubstat4
                                                                                                                                .getText()));
                                                                        }

                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        amainStat, aSubstat1,
                                                                                        aSubstat2, aSubstat3,
                                                                                        aSubstat4);
                                                                        artefacto = CalculosCalculosos
                                                                                        .StatNivel16(artefacto);
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
                                                                } else {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias");
                                                                }

                                                        }
                                                });
                                                Display.this.boton20.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
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
                                                                        String amainStat = Display.this.tmainStat
                                                                                        .getSelectedItem()
                                                                                        .toString();
                                                                        StatArtefacto aSubstat1 = new StatArtefacto(
                                                                                        Display.this.tSubstat1Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat1
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                        Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat2
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                        Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat3
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat4 = null;
                                                                        if (!Display.this.tSubstat4Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")) {
                                                                                aSubstat4 = new StatArtefacto(
                                                                                                Display.this.tSubstat4Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                Double.parseDouble(
                                                                                                                Display.this.zTextSubstat4
                                                                                                                                .getText()));
                                                                        }

                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        amainStat, aSubstat1,
                                                                                        aSubstat2, aSubstat3,
                                                                                        aSubstat4);
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
                                                                } else {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias");
                                                                }

                                                        }
                                                });
                                                break;
                                        case "16":
                                                Display.this.p.remove(Display.this.tSubstat1Valor);
                                                Display.this.p.remove(Display.this.tSubstat2Valor);
                                                Display.this.p.remove(Display.this.tSubstat3Valor);
                                                Display.this.p.remove(Display.this.tSubstat4Valor);
                                                Display.this.p.add(Display.this.zTextSubstat1);
                                                Display.this.p.add(Display.this.zTextSubstat2);
                                                Display.this.p.add(Display.this.zTextSubstat3);
                                                Display.this.p.add(Display.this.zTextSubstat4);
                                                Display.this.boton20.addActionListener(new ActionListener() {
                                                        public void actionPerformed(ActionEvent e) {
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
                                                                        String amainStat = Display.this.tmainStat
                                                                                        .getSelectedItem()
                                                                                        .toString();
                                                                        StatArtefacto aSubstat1 = new StatArtefacto(
                                                                                        Display.this.tSubstat1Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat1
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat2 = new StatArtefacto(
                                                                                        Display.this.tSubstat2Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat2
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat3 = new StatArtefacto(
                                                                                        Display.this.tSubstat3Tipo
                                                                                                        .getSelectedItem()
                                                                                                        .toString(),
                                                                                        Double.parseDouble(
                                                                                                        Display.this.zTextSubstat3
                                                                                                                        .getText()));
                                                                        StatArtefacto aSubstat4 = null;
                                                                        if (!Display.this.tSubstat4Tipo
                                                                                        .getSelectedItem()
                                                                                        .toString()
                                                                                        .equals("Stat")) {
                                                                                aSubstat4 = new StatArtefacto(
                                                                                                Display.this.tSubstat4Tipo
                                                                                                                .getSelectedItem()
                                                                                                                .toString(),
                                                                                                Double.parseDouble(
                                                                                                                Display.this.zTextSubstat4
                                                                                                                                .getText()));
                                                                        }

                                                                        Artefacto artefacto = new Artefacto(
                                                                                        Integer.parseInt(
                                                                                                        Display.this.Tipo),
                                                                                        amainStat, aSubstat1,
                                                                                        aSubstat2, aSubstat3,
                                                                                        aSubstat4);
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
                                                                } else {
                                                                        JOptionPane.showMessageDialog(
                                                                                        (Component) null,
                                                                                        "Valor de Stats vacias");
                                                                }

                                                        }
                                                });
                                }
                        }

                });
        }
}
