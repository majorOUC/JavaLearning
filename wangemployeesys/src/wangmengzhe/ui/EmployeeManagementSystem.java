package wangmengzhe.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import wangmengzhe.bean.Employee;

public class EmployeeManagementSystem extends JFrame {
    private JTextField searchField;
    private JButton searchButton, addButton;
    private JTable table;
    private DefaultTableModel tableModel;

    //创建一个静态集合容器来存储员工信息
    private static ArrayList<Employee> allemployee = new ArrayList<>();

    public EmployeeManagementSystem(){
    }

    public EmployeeManagementSystem(String username) {
        super("欢迎"+username+ "使用员工信息管理系统");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        initUI();
        this.setVisible(true);
    }


    private void initUI() {
        // 创建顶部面板
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        searchField = new JTextField(20);
        searchButton = new JButton("搜索");
        addButton = new JButton("添加");

        topPanel.add(searchField);
        topPanel.add(searchButton);
        topPanel.add(addButton);

        // 创建表格
        String[] columnNames = {"ID", "姓名", "职位", "部门"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // 所有单元格不可编辑
                return false;
            }
        };
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);

        // 右键菜单
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem editMenuItem = new JMenuItem("修改");
        JMenuItem deleteMenuItem = new JMenuItem("删除");
        popupMenu.add(editMenuItem);
        popupMenu.add(deleteMenuItem);

        // 右键点击事件
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    int row = table.rowAtPoint(e.getPoint());
                    if (row >= 0 && row < table.getRowCount()) {
                        table.setRowSelectionInterval(row, row);
                        popupMenu.show(table, e.getX(), e.getY());
                    }
                }
            }
        });

        //点击修改后弹出当前行id
        editMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    int id = (int) tableModel.getValueAt(selectedRow, 0);
                    JOptionPane.showMessageDialog(EmployeeManagementSystem.this, "当前行ID: " + id);
                }
            }
        });

        //点击删除后弹出当前行id
        deleteMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    int id = (int) tableModel.getValueAt(selectedRow, 0);
                    allemployee.remove(id);
                    JOptionPane.showMessageDialog(EmployeeManagementSystem.this, "删除成功");
                    tableModel.removeRow(selectedRow);
                }
            }
        });


        // 添加功能
        //点击添加按钮之后跳出一个新的窗口让用户输入员工信息
        addButton.addActionListener(e -> {
            new addEmployee(this);
        });

        // 搜索功能
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = searchField.getText().trim();
                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    String name = (String) tableModel.getValueAt(i, 1);
                    if (name.contains(searchText)) {
                        table.setRowSelectionInterval(i, i);
                        table.scrollRectToVisible(table.getCellRect(i, 0, true));
                        break;
                    }
                }
            }
        });

        // 布局
        this.setLayout(new BorderLayout());
        this.add(topPanel, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);
    }

    public void addEmployee(String text, String text1, String text2, String text3) {
        Employee employee = new Employee(Integer.parseInt(text), text1, text2, text3);
        allemployee.add(employee);
        tableModel.addRow(new Object[]{employee.getId(), employee.getName(), employee.getPosition(), employee.getDepartment()});
    }
}
