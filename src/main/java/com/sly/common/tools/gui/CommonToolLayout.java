package com.sly.common.tools.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 * 布局类
 * 
 * @author sly
 * @time 2019年5月14日
 */
public class CommonToolLayout {

	public void layout() {
		// 布局框
		JFrame jFrame = new JFrame("Common-Tools");

		jFrame.setLocation(200, 200);
		jFrame.setSize(1000, 600);

		// 选项卡
		JTabbedPane jTabbedPane = new JTabbedPane();
		JPanel jPanel1 = new JPanel();
		JPanel jPanel1_1 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		JPanel jPanel1_2 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
		JPanel jPanel2 = new JPanel();
		JPanel jPanel3 = new JPanel();
		JPanel jPanel4 = new JPanel();
		JPanel jPanel5 = new JPanel();
		JTextArea jTextArea = new JTextArea();
		
		JButton jButton1 = new JButton("生成模型类");
		JButton jButton2 = new JButton("复制模型类");
		jTextArea.setBounds(0, 0, 600, 100);
		jPanel1_1.add(jButton1);
		jPanel1_1.add(jButton2);
		jPanel1_2.add(jTextArea);
		
		jPanel1.add(jPanel1_1);
		jPanel1.add(jPanel1_2);

		jTabbedPane.add("模型生成", jPanel1);
		jTabbedPane.add("Mybatis", jPanel2);
		jTabbedPane.add("UUID生成", jPanel3);
		jTabbedPane.add("时间生成", jPanel4);
		jTabbedPane.add("正则验证", jPanel5);

		
		//TextField textField = new TextField(); 
		//textField.setBounds(40, 20,jFrame.getWidth()-100, 50); 
		//textField.setBackground(Color.white);
		//ModelGeneratorListener modelGeneratorListener1 = new ModelGeneratorListener(textField);
		

		// 将菜单加入菜单栏

		// 不设置位置自动放最上面

		
		//ModelGeneratorListener modelGeneratorListener2 = new ModelGeneratorListener(textField); 
		//JButton button1 = new JButton("按钮一");
		//jFrame.add(button1); 
		//button1.addActionListener(modelGeneratorListener2);
		
		jFrame.add(jTabbedPane);
		
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * 为菜单栏添加按钮
	 * 
	 * @param jMenuBar
	 * @param jMenus
	 * @return
	 * @author sly
	 * @time 2019年5月14日
	 */
	public JMenuBar addMenuToMenuBar(JMenuBar jMenuBar, JMenu... jMenus) {
		for (JMenu jMenu : jMenus) {
			jMenuBar.add(jMenu);
		}
		return jMenuBar;
	}

}
