package wangmengzhe.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EmployeeManagementSystem extends JFrame {
    private JTextField searchField;
    private JButton searchButton, addButton;
    private JTable table;
    private DefaultTableModel tableModel;

    public EmployeeManagementSystem() {
        this.setTitle("员工信息管理系统");
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

        // 添加20个示例员工信息
        for (int i = 1; i <= 20; i++) {
            tableModel.addRow(new Object[]{i, "员工" + i, "职位" + i, "部门" + i});
        }

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
                    JOptionPane.showMessageDialog(EmployeeManagementSystem.this, "当前行ID: " + id);
                    tableModel.removeRow(selectedRow);
                }
            }
        });

//
//        // 修改功能
//        editMenuItem.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int selectedRow = table.getSelectedRow();
//                if (selectedRow != -1) {
//                    int id = (int) tableModel.getValueAt(selectedRow, 0);
//                    String name = (String) tableModel.getValueAt(selectedRow, 1);
//                    String position = (String) tableModel.getValueAt(selectedRow, 2);
//                    String department = (String) tableModel.getValueAt(selectedRow, 3);
//
//                    String newName = JOptionPane.showInputDialog(EmployeeManagementSystem.this, "修改姓名", name);
//                    String newPosition = JOptionPane.showInputDialog(EmployeeManagementSystem.this, "修改职位", position);
//                    String newDepartment = JOptionPane.showInputDialog(EmployeeManagementSystem.this, "修改部门", department);
//
//                    if (newName != null && newPosition != null && newDepartment != null) {
//                        tableModel.setValueAt(newName, selectedRow, 1);
//                        tableModel.setValueAt(newPosition, selectedRow, 2);
//                        tableModel.setValueAt(newDepartment, selectedRow, 3);
//                    }
//                }
//            }
//        });
//
//        // 删除功能
//        deleteMenuItem.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int selectedRow = table.getSelectedRow();
//                if (selectedRow != -1) {
//                    tableModel.removeRow(selectedRow);
//                }
//            }
//        });

        // 添加功能
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog(EmployeeManagementSystem.this, "输入姓名");
                String position = JOptionPane.showInputDialog(EmployeeManagementSystem.this, "输入职位");
                String department = JOptionPane.showInputDialog(EmployeeManagementSystem.this, "输入部门");

                if (name != null && position != null && department != null) {
                    int id = tableModel.getRowCount() + 1;
                    tableModel.addRow(new Object[]{id, name, position, department});
                }
            }
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
}
