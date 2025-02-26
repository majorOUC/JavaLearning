package wangmengzhe.ui;

import java.awt.*;
import javax.swing.*;

public class loginframe extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPanel buttonPanel;
    private JButton loginBtn;
    private JButton registerBtn;

    public loginframe() {
        // 窗口基础设置
        this.setTitle("人事管理系统");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        initUI();

    }

    private void initUI() {
        // 使用网格袋布局
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // 系统标题
        JLabel titleLabel = new JLabel("梦氏家族人事管理系统", JLabel.CENTER);
        titleLabel.setFont(new Font("宋体", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 0, 40, 0);
        add(titleLabel, gbc);

        // 用户名组件
        JLabel userLabel = new JLabel("用户名:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 10, 5, 10);
        add(userLabel, gbc);

        usernameField = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(usernameField, gbc);

        // 密码组件
        JLabel passLabel = new JLabel("密码:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(passLabel, gbc);

        passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(passwordField, gbc);

        // 按钮面板
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        loginBtn = new JButton("登录");
        registerBtn = new JButton("注册");

        // 设置按钮尺寸
        Dimension btnSize = new Dimension(100, 30);
        loginBtn.setPreferredSize(btnSize);
        registerBtn.setPreferredSize(btnSize);

        buttonPanel.add(loginBtn);
        buttonPanel.add(registerBtn);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        add(buttonPanel, gbc);

        // 窗口可见
        setVisible(true);
    }
}
