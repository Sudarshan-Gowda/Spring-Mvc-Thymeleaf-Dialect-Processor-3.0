package com.star.sud.dialect;

/*
 * @Author Sudarshan
 */

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

public class StarDialect extends AbstractProcessorDialect {

	private static final String DIALECT_NAME = "Footer Dialect";

	private static final String DIALECT_PREFIX = "dia";

	private Set<IProcessor> processors = new HashSet<IProcessor>();

	public StarDialect() {
		super(DIALECT_NAME, DIALECT_PREFIX, StandardDialect.PROCESSOR_PRECEDENCE);
	}

	public Set<IProcessor> getProcessors(final String dialectPrefix) {
		return processors;
	}

	public void setProcessors(Set<IProcessor> processors) {
		this.processors = processors;
	}
}