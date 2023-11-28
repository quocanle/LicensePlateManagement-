/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.Congdan;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import view.congan.*;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import model.CongAn;
import view.Login;

/**
 *
 * @author LENOVO
 */
public class DBCongdan extends javax.swing.JFrame {
    public CongAn ongCan;
    MenuCongdan MenuCongDan = new MenuCongdan();
    MenuXeOto MenuXeOto = new MenuXeOto();
    MenuBienso MenuBienSo = new MenuBienso();
    MenuLoaixe MenuLoaiXe = new MenuLoaixe();
    MenuLichsu MenuLichSu = new MenuLichsu();

    /**
     * Creates new form DBCongan
     */
    Color DefaultColor,ClickedColor;
    public void disposeDB(){
        this.dispose();
    }
    public DBCongdan() {
        initComponents();
        setIcon();
        DefaultColor =new Color(255,255,255);
        ClickedColor =new Color(102,204,255);
        DTPane.add(MenuCongDan);
        DTPane.add(MenuXeOto);
        DTPane.add(MenuBienSo);
        DTPane.add(MenuLoaiXe);
        DTPane.add(MenuLichSu);
    }
    
    public DBCongdan(CongAn ongCan) {
        this.ongCan = ongCan;
        initComponents();
        setIcon();
        
        start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        congDan = new javax.swing.JPanel();
        labelCD = new javax.swing.JLabel();
        xeOto = new javax.swing.JPanel();
        labelXe = new javax.swing.JLabel();
        bienSo = new javax.swing.JPanel();
        labelBS = new javax.swing.JLabel();
        loaiXe = new javax.swing.JPanel();
        labelType = new javax.swing.JLabel();
        lichSu = new javax.swing.JPanel();
        labelLS = new javax.swing.JLabel();
        labelLogout = new javax.swing.JLabel();
        labelDarkmode = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        DTPane = new javax.swing.JDesktopPane();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý biển số xe");

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel13.setText("Xin chào, Minh Nhân");

        jLabel14.setText("Ngày mới tốt lành");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/vnuk100px.png"))); // NOI18N

        congDan.setBackground(new java.awt.Color(255, 255, 255));

        labelCD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user_group_30px.png"))); // NOI18N
        labelCD.setText("Công dân");
        labelCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCDMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelCDMousePressed(evt);
            }
        });

        javax.swing.GroupLayout congDanLayout = new javax.swing.GroupLayout(congDan);
        congDan.setLayout(congDanLayout);
        congDanLayout.setHorizontalGroup(
            congDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, congDanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCD)
                .addGap(22, 22, 22))
        );
        congDanLayout.setVerticalGroup(
            congDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, congDanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCD))
        );

        xeOto.setBackground(new java.awt.Color(255, 255, 255));

        labelXe.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/vehicle (1).png"))); // NOI18N
        labelXe.setText("Xe ô tô");
        labelXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelXeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelXeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout xeOtoLayout = new javax.swing.GroupLayout(xeOto);
        xeOto.setLayout(xeOtoLayout);
        xeOtoLayout.setHorizontalGroup(
            xeOtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xeOtoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelXe, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        xeOtoLayout.setVerticalGroup(
            xeOtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelXe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        bienSo.setBackground(new java.awt.Color(255, 255, 255));

        labelBS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelBS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/data_24px.png"))); // NOI18N
        labelBS.setText("Biển số xe ô tô");
        labelBS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBSMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelBSMousePressed(evt);
            }
        });

        javax.swing.GroupLayout bienSoLayout = new javax.swing.GroupLayout(bienSo);
        bienSo.setLayout(bienSoLayout);
        bienSoLayout.setHorizontalGroup(
            bienSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bienSoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelBS)
                .addGap(10, 10, 10))
        );
        bienSoLayout.setVerticalGroup(
            bienSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bienSoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(labelBS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loaiXe.setBackground(new java.awt.Color(255, 255, 255));

        labelType.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/car (1).png"))); // NOI18N
        labelType.setText("Loại xe ô tô");
        labelType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTypeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelTypeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout loaiXeLayout = new javax.swing.GroupLayout(loaiXe);
        loaiXe.setLayout(loaiXeLayout);
        loaiXeLayout.setHorizontalGroup(
            loaiXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loaiXeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelType)
                .addGap(10, 10, 10))
        );
        loaiXeLayout.setVerticalGroup(
            loaiXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loaiXeLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(labelType)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lichSu.setBackground(new java.awt.Color(255, 255, 255));

        labelLS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/history (1).png"))); // NOI18N
        labelLS.setText("Lịch sử tạo biển");
        labelLS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLSMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelLSMousePressed(evt);
            }
        });

        javax.swing.GroupLayout lichSuLayout = new javax.swing.GroupLayout(lichSu);
        lichSu.setLayout(lichSuLayout);
        lichSuLayout.setHorizontalGroup(
            lichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lichSuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLS)
                .addGap(10, 10, 10))
        );
        lichSuLayout.setVerticalGroup(
            lichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLS, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        labelLogout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelLogout.setText("Logout");
        labelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogoutMouseClicked(evt);
            }
        });

        labelDarkmode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelDarkmode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDarkmode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/darkmode.png"))); // NOI18N
        labelDarkmode.setText("Dark mode");
        labelDarkmode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDarkmodeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(labelDarkmode, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelLogout)
                        .addComponent(lichSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(xeOto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(congDan, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(23, 23, 23)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(congDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xeOto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lichSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelDarkmode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(labelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel17.setText("Trung úy");

        jLabel16.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel16.setText("Nguyễn Minh Nhân");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user (1).png"))); // NOI18N
        jLabel27.setText("jLabel14");

        javax.swing.GroupLayout DTPaneLayout = new javax.swing.GroupLayout(DTPane);
        DTPane.setLayout(DTPaneLayout);
        DTPaneLayout.setHorizontalGroup(
            DTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 947, Short.MAX_VALUE)
        );
        DTPaneLayout.setVerticalGroup(
            DTPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DTPane)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DTPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        new UserInfo(ongCan).setVisible(true);       
    }//GEN-LAST:event_jLabel16MouseClicked

    private void labelCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCDMousePressed
        // TODO add your handling code here:
        congDan.setBackground(ClickedColor);
        xeOto.setBackground(DefaultColor);
        bienSo.setBackground(DefaultColor);
        loaiXe.setBackground(DefaultColor);
        lichSu.setBackground(DefaultColor);
    }//GEN-LAST:event_labelCDMousePressed

    private void labelBSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBSMousePressed
        // TODO add your handling code here:
        congDan.setBackground(DefaultColor);
        xeOto.setBackground(DefaultColor);
        bienSo.setBackground(ClickedColor);
        loaiXe.setBackground(DefaultColor);
        lichSu.setBackground(DefaultColor);
    }//GEN-LAST:event_labelBSMousePressed

    private void labelTypeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTypeMousePressed
        // TODO add your handling code here:
        congDan.setBackground(DefaultColor);
        xeOto.setBackground(DefaultColor);
        bienSo.setBackground(DefaultColor);
        loaiXe.setBackground(ClickedColor);
        lichSu.setBackground(DefaultColor);
    }//GEN-LAST:event_labelTypeMousePressed

    private void labelLSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLSMousePressed
        // TODO add your handling code here:
        congDan.setBackground(DefaultColor);
        xeOto.setBackground(DefaultColor);
        bienSo.setBackground(DefaultColor);
        loaiXe.setBackground(DefaultColor);
        lichSu.setBackground(ClickedColor);
    }//GEN-LAST:event_labelLSMousePressed

    private void labelCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCDMouseClicked
        // TODO add your handling code here:
        DTPane.setSelectedFrame(MenuCongDan);
        MenuCongDan.setVisible(true);
        MenuXeOto.setVisible(false);
        MenuBienSo.setVisible(false);
        MenuLoaiXe.setVisible(false);
        MenuLichSu.setVisible(false);
        MenuCongDan.start();
    }//GEN-LAST:event_labelCDMouseClicked

    private void labelBSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBSMouseClicked
        // TODO add your handling code here:
        DTPane.setSelectedFrame(MenuBienSo);
        MenuCongDan.setVisible(false);
        MenuXeOto.setVisible(false);
        MenuBienSo.setVisible(true);
        MenuLoaiXe.setVisible(false);
        MenuLichSu.setVisible(false);
        MenuBienSo.start();
    }//GEN-LAST:event_labelBSMouseClicked

    private void labelTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTypeMouseClicked
        // TODO add your handling code here:
        DTPane.setSelectedFrame(MenuLoaiXe);
        MenuCongDan.setVisible(false);
        MenuXeOto.setVisible(false);
        MenuBienSo.setVisible(false);
        MenuLoaiXe.setVisible(true);
        MenuLichSu.setVisible(false);
        MenuLoaiXe.start();
    }//GEN-LAST:event_labelTypeMouseClicked

    private void labelLSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLSMouseClicked
        // TODO add your handling code here:
        DTPane.setSelectedFrame(MenuLichSu);
        MenuCongDan.setVisible(false);
        MenuXeOto.setVisible(false);
        MenuBienSo.setVisible(false);
        MenuLoaiXe.setVisible(false);
        MenuLichSu.setVisible(true);
        MenuLichSu.start();
    }//GEN-LAST:event_labelLSMouseClicked

    private void labelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoutMouseClicked
        // TODO add your handling code here:
        Login lg = new Login();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelLogoutMouseClicked

    private void labelDarkmodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDarkmodeMouseClicked
        // TODO add your handling code here:
        try {
            if (UIManager.getLookAndFeel().getClass().getName().equals("com.formdev.flatlaf.FlatDarkLaf")) {
                UIManager.setLookAndFeel(new FlatLightLaf());
                labelDarkmode.setText("Dark mode");
                jPanel1.setBackground(new Color(255, 255, 255));
            } else {
                UIManager.setLookAndFeel(new FlatDarkLaf());
                labelDarkmode.setText("Light mode");
                jPanel1.setBackground(new Color(99, 99, 99));
            }
            SwingUtilities.updateComponentTreeUI(this); // Update UI components
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }//GEN-LAST:event_labelDarkmodeMouseClicked

    private void labelXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelXeMouseClicked
        // TODO add your handling code here:
        DTPane.setSelectedFrame(MenuXeOto);
        MenuCongDan.setVisible(false);
        MenuXeOto.setVisible(true);
        MenuBienSo.setVisible(false);
        MenuLoaiXe.setVisible(false);
        MenuLichSu.setVisible(false);
        MenuXeOto.start();
    }//GEN-LAST:event_labelXeMouseClicked

    private void labelXeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelXeMousePressed
        // TODO add your handling code here:
        congDan.setBackground(DefaultColor);
        xeOto.setBackground(ClickedColor);
        bienSo.setBackground(DefaultColor);
        loaiXe.setBackground(DefaultColor);
        lichSu.setBackground(DefaultColor);
    }//GEN-LAST:event_labelXeMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DBCongdan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DBCongdan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DBCongdan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DBCongdan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DBCongdan().setVisible(true);
                
            }
        });
    }
    
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/vnukmini.png")));
    }
    
    private void start() {
        DefaultColor =new Color(255,255,255);
        ClickedColor =new Color(102,204,255);

        // set default hello text
        jLabel13.setText("Xin chào, " + ongCan.getTen());
        jLabel16.setText(ongCan.getHo() + " " +  ongCan.getTen());
        jLabel17.setText(ongCan.getCapBac());
        
        congDan.setBackground(ClickedColor);
        xeOto.setBackground(DefaultColor);
        bienSo.setBackground(DefaultColor);
        loaiXe.setBackground(DefaultColor);
        lichSu.setBackground(DefaultColor);
        DTPane.add(MenuCongDan);
        DTPane.add(MenuXeOto);
        DTPane.add(MenuBienSo);
        DTPane.add(MenuLoaiXe);
        DTPane.add(MenuLichSu);
        DTPane.setSelectedFrame(MenuCongDan);
        MenuCongDan.setVisible(true);
        MenuBienSo.ongCan = this.ongCan;
        
        checkDarkmode();
    }
    
    private void checkDarkmode() {
        if (UIManager.getLookAndFeel().getClass().getName().equals("com.formdev.flatlaf.FlatDarkLaf")) {
                labelDarkmode.setText("Light mode");
                jPanel1.setBackground(new Color(99, 99, 99));
            } else {
                labelDarkmode.setText("Dark mode");
                jPanel1.setBackground(new Color(255, 255, 255));
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JDesktopPane DTPane;
    private javax.swing.JPanel bienSo;
    private javax.swing.JPanel congDan;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBS;
    private javax.swing.JLabel labelCD;
    private javax.swing.JLabel labelDarkmode;
    private javax.swing.JLabel labelLS;
    private javax.swing.JLabel labelLogout;
    private javax.swing.JLabel labelType;
    private javax.swing.JLabel labelXe;
    private javax.swing.JPanel lichSu;
    private javax.swing.JPanel loaiXe;
    private javax.swing.JPanel xeOto;
    // End of variables declaration//GEN-END:variables
}
