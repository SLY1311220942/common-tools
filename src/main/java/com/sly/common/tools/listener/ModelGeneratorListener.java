package com.sly.common.tools.listener;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 模型生成按钮监听器
 * @author sly
 * @time 2019年5月14日
 */
public class ModelGeneratorListener implements ActionListener {
	private TextField textField;
	int count;
 
	public ModelGeneratorListener(TextField textField) {
		this.textField = textField;
	}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		count++;
		System.out.println(count);
		textField.setText("你点击了按钮  "+ count + " 次");
		
	}

}

