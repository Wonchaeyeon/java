import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI2_Components {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Components");
        JPanel panel = new JPanel();
        JLabel lb0 = new JLabel("JLabel");
        JButton bt0 = new JButton("JButton");
        JCheckBox cb0 = new JCheckBox("JCheckBox0");
        JCheckBox cb1 = new JCheckBox("JCheckBoc1");
        JRadioButton rb0 = new JRadioButton("미성년자");
        JRadioButton rb1 = new JRadioButton("성인");
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb0);
        bg.add(rb1);
        JTextField tf0 = new JTextField("JTextField");
        JTextArea ta0 = new JTextArea(2,10);
        String a[]={"서강준","송강","금동현","박서준"};
        JComboBox<String> cbox0 = new JComboBox<>(a);
        cbox0.addItem("지금은 자바시간");
        cbox0.addItem("지금은 파이썬시간");

        JLabel lbResult = new JLabel("Result");

        cb1.setSelected(true);
        rb0.setSelected(true);
        tf0.setText("전화번호를 입력하세요.");

        tf0.addFocusListener(new FocusListener() {        //관심받기
            @Override
            public void focusGained(FocusEvent focusEvent) {
                if (tf0.getText().equals("전화번호를 입력하세요.")) {
                    tf0.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent focusEvent) {     //관심읽기
                if (tf0.getText().equals("")){
                    tf0.setText("전화번호를 입력하세요.");
                }
            }
        });

        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String result = "";
                result += lb0.getText();
                result += bt0.getText();
                result += cb0.isSelected();
                result += cb1.isSelected();
                result += rb0.isSelected();
                result += rb1.isSelected();
                result += tf0.getText();
                result += ta0.getText();
                result += cbox0.getSelectedIndex();
                result += cbox0.getSelectedItem();

                lbResult.setText(result);
            }
        });
        ItemListener il = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == cb0){
                    System.out.println("JCheckbox0: "+cb0.isSelected());
                }else if(e.getSource() ==cb1){
                    System.out.println("JCheckbox1: "+cb1.isSelected());
                }else if(e.getSource() == rb0){
                    System.out.println("미성년자: "+rb0.isSelected());
                }else if (e.getSource() == rb1){
                    System.out.println("성인: "+rb1.isSelected());
                }else if (e.getSource() == cbox0){
                    System.out.println(cbox0.getSelectedItem());
                }
            }
        };
        cb0.addItemListener(il);   //둘 중 암거나 체크를 하면 il로 들어가서 실행.
        cb1.addItemListener(il);
        rb0.addItemListener(il);
        rb1.addItemListener(il);
        cbox0.addItemListener(il);

        panel.add(lb0);
        panel.add(bt0);
        panel.add(cb0);
        panel.add(cb1);
        panel.add(rb0);
        panel.add(rb1);
        panel.add(tf0);
        panel.add(ta0);
        panel.add(cbox0);
        panel.add(lbResult);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
