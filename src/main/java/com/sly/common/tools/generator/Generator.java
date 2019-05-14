package com.sly.common.tools.generator;

import java.util.List;

import com.sly.common.tools.common.GeneratorResult;

/**
 * 代码生成器接口
 * 
 * @author sly
 * @time 2019年5月14日
 */
public interface Generator {
	/**
	 * 生成器方法
	 * 
	 * @param sqlStr
	 * @param defaultMethods
	 * @return
	 * @author sly
	 * @time 2019年5月14日
	 */
	public GeneratorResult generator(String sqlStr, List<String> defaultMethods);
}
