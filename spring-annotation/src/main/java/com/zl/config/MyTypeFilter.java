package com.zl.config;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyTypeFilter implements TypeFilter {
	
	/**
	 * Determine whether this filter matches for the class described by
	 * the given metadata.
	 * @param metadataReader the metadata reader for the target class
	 * @param metadataReaderFactory a factory for obtaining metadata readers
	 * for other classes (such as superclasses and interfaces)
	 * @return whether this filter matches
	 * @throws IOException in case of I/O failure when reading metadata
	 */
	
	/**
	 * metadataReader, 读取当前正在被扫描的类的信息
	 * metadataReaderFactory， 获取当前的类的其他的信息，子类，接口
	 */
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		
		//获取当前类的原信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		
		String className = classMetadata.getClassName();
		System.out.println("============>"+className);
		
		if(className.contains("controller")) return true;
		
		String[] interfaceNames = classMetadata.getInterfaceNames();
		String[] memberClassNames = classMetadata.getMemberClassNames();

		
		Resource resource = metadataReader.getResource();
		Class<? extends MetadataReader> clz = metadataReader.getClass();
		return false;
	}

}
