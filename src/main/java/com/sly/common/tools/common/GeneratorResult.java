package com.sly.common.tools.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 生成后结果封装类
 * 
 * @author sly
 * @time 2019年5月14日
 */
public class GeneratorResult {
	private Map<String, Object> map = new HashMap<String, Object>(16);

	/**
	 * 无参构造方法
	 * 
	 * @author sly
	 * @time 2019年5月14日
	 */
	public GeneratorResult() {
		
	}

	/**
	 * 有参构造方法一
	 * @param key
	 * @param value
	 * @author sly
	 * @time 2019年5月14日
	 */
	public GeneratorResult(String key, Object value) {
		map.put(key, value);
	}
	
	/**
	 * 有参构造方法二
	 * @param data
	 * @author sly
	 * @time 2019年5月14日
	 */
	public GeneratorResult(Map<String, Object> data) {
		Set<String> keySet = data.keySet();
		for (String key : keySet) {
			map.put(key, data.get(key));
		}
	}
	
	/**
	 * 设置值
	 * @param key
	 * @param value
	 * @author sly
	 * @time 2019年5月14日
	 */
	public void setValue(String key, Object value) {
		map.put(key, value);
	}

	/**
	 * 获取值
	 * @param key
	 * @return
	 * @author sly
	 * @time 2019年5月14日
	 */
	public Object getValue(String key) {
		return map.get(key);
	}
	
	/**
	 * 移除值
	 * @param key
	 * @author sly
	 * @time 2019年5月14日
	 */
	public void removeValue(String key) {
		map.remove(key);
	}
	
}
