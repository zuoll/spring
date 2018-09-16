package com.zl.condition;

import java.util.Set;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import com.alibaba.fastjson.JSON;

//批量导入
public class MyImportSelector implements ImportSelector {

	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		
		Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
		System.out.println(JSON.toJSONString(annotationTypes));
		return new String[] {"com.zl.bean.Blue","com.zl.bean.Yellow"};
	}

}
