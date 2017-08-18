package com.star.sud.processor;

/*
 * @Author Sudarshan
 */

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractAttributeTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

import com.star.sud.service.StarPlayerDataService;

@Component("starMenuProcessor")
public class StarMenuProcessor extends AbstractAttributeTagProcessor {

	@Resource(name = "starPlayerDataService")
	protected StarPlayerDataService starPlayerDataService;

	private static final String DIALECT_PREFIX = "dia";

	private static final String ATTR_NAME = "star";

	public StarMenuProcessor() {
		super(TemplateMode.HTML, DIALECT_PREFIX, null, false, ATTR_NAME, true, 10000, true);
	}

	@Override
	protected void doProcess(ITemplateContext context, IProcessableElementTag tag, AttributeName attributeName,
			String attributeValue, IElementTagStructureHandler structureHandler) {

		String attrbName = tag.getAttributeValue("sn");

		structureHandler.setLocalVariable(attrbName, starPlayerDataService.getPlayerData());

	}

}
