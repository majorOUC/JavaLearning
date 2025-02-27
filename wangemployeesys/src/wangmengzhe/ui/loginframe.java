package wangmengzhe.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import wangmengzhe.bean.*;


public class loginframe extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPanel buttonPanel;
    private JButton loginBtn;
    private JButton registerBtn;

    //创建一个集合容器来存储注册过的用户信息
    private static ArrayList<User> allUsers = new ArrayList<>();

    static {
        allUsers.add(new User("wmz", "123456", "梦"));
    }

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
        //为按钮添加监听器，监听到登录按钮点击事件时，执行登录操作，监听到注册按钮点击事件时，执行注册操作
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        loginBtn = new JButton("登录");
        loginBtn.addActionListener(this);
        registerBtn = new JButton("注册");
        registerBtn.addActionListener(this);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        //登录事件
        //根据用户输入的用户名查找集合中的用户信息，如果找到，则比较密码是否匹配，如果匹配，则登录成功，否则登录失败
        if (e.getSource() == loginBtn) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            User user = findUserByUsername(username);
            if (user != null && user.getPassword().equals(password)) {
                new EmployeeManagementSystem(user.getUsername());
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "用户名或密码错误！");
            }
        }else{//注册事件，添加用户信息到集合中
            if (e.getSource() == registerBtn) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "用户名或密码不能为空！");
                } else {//请求用户输入一个名字
                    String name = JOptionPane.showInputDialog(this, "请输入您的姓名：");
                    if (name != null && !name.isEmpty()) {
                        User newUser = new User(username, password, name);
                        allUsers.add(newUser);
                        JOptionPane.showMessageDialog(this, "注册成功！");
                    }
                }
            }
        }
    }

    //查找用户信息
    private User findUserByUsername(String username) {
        for (User user : allUsers) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
