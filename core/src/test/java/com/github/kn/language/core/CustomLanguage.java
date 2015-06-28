package com.github.kn.language.core;

public class CustomLanguage implements Language<CustomLanguage, CustomLanguageBuilder, CustomLanguageParser> {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomLanguageBuilder newBuilder() {
		return new CustomLanguageBuilder();
	}

	@Override
	public CustomLanguageParser newParser() {
		return new CustomLanguageParser();
	}
}
