package com.sly.common.tools.gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 * 布局类
 * 
 * @author sly
 * @time 2019年5月14日
 */
public class Layout {

	public void layout() {

		// 菜单栏
		JMenuBar jMenuBar = new JMenuBar();
		JMenu menu1 = new JMenu("模型生成");
		JMenu menu2 = new JMenu("Mybatis");
		JMenu menu3 = new JMenu("UUID生成");
		JMenu menu4 = new JMenu("时间生成");
		JMenu menu5 = new JMenu("正则验证");

		// 将菜单加入菜单栏
		jMenuBar = addMenuToMenuBar(jMenuBar, menu1, menu2, menu3, menu4, menu5);

		// 布局框
		JFrame jFrame = new JFrame("Common-Tools");
		// 不设置位置自动放最上面
		jFrame.setJMenuBar(jMenuBar);
		jFrame.setLocation(200, 200);
		jFrame.setSize(1000, 600);
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
