package wangmengzhe.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addEmployee extends JFrame {
    private JTextField idField, nameField, positionField, departmentField;
    private JButton addButton, cancelButton;
    private EmployeeManagementSystem mainSystem; // 主界面引用

    public addEmployee(EmployeeManagementSystem mainSystem) {
        this.mainSystem = mainSystem;
        setTitle("添加员工信息");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 关闭窗口时不退出程序
        setLocationRelativeTo(null); // 居中显示

        // 设置窗口图标
        ImageIcon icon = new ImageIcon("icon.png"); // 替换为实际图标路径
        setIconImage(icon.getImage());

        // 创建主面板
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // 添加外边距
        mainPanel.setBackground(new Color(240, 240, 240)); // 设置背景色

        // 创建约束对象
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // 组件间距
        gbc.anchor = GridBagConstraints.WEST; // 左对齐

        // ID输入框
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(new JLabel("ID:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        idField = new JTextField(20);
        idField.setFont(new Font("微软雅黑", Font.PLAIN, 14)); // 设置字体
        mainPanel.add(idField, gbc);

        // 姓名输入框
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(new JLabel("姓名:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        nameField = new JTextField(20);
        nameField.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        mainPanel.add(nameField, gbc);

        // 职位输入框
        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(new JLabel("职位:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        positionField = new JTextField(20);
        positionField.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        mainPanel.add(positionField, gbc);

        // 部门输入框
        gbc.gridx = 0;
        gbc.gridy = 3;
        mainPanel.add(new JLabel("部门:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        departmentField = new JTextField(20);
        departmentField.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        mainPanel.add(departmentField, gbc);

        // 按钮面板
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.setBackground(new Color(240, 240, 240));

        // 添加按钮
        addButton = new JButton("添加");
        addButton.setFont(new Font("微软雅黑", Font.BOLD, 14));
        addButton.setBackground(new Color(0, 150, 136)); // 设置背景色
        addButton.setForeground(Color.WHITE); // 设置文字颜色
        addButton.setFocusPainted(false); // 去除焦点边框
        addButton.setPreferredSize(new Dimension(100, 35)); // 设置按钮大小
        buttonPanel.add(addButton);

        // 添加按钮事件
        addButton.addActionListener(e -> {
            mainSystem.addEmployee(idField.getText(), nameField.getText(), positionField.getText(), departmentField.getText());
            //弹出窗口提示添加成功
            JOptionPane.showMessageDialog(this, "添加成功！", "提示", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        });

        // 取消按钮
        cancelButton = new JButton("取消");
        cancelButton.setFont(new Font("微软雅黑", Font.BOLD, 14));
        cancelButton.setBackground(new Color(255, 87, 34)); // 设置背景色
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setFocusPainted(false);
        cancelButton.setPreferredSize(new Dimension(100, 35));
        buttonPanel.add(cancelButton);


        // 取消按钮事件
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // 关闭窗口
            }
        });

        // 添加主面板和按钮面板到窗口
        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        //setSize(400, 300);
        setVisible(true);
    }

}