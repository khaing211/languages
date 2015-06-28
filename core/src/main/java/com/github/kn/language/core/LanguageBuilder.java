package com.github.kn.language.core;

public interface LanguageBuilder<L extends Language<L, B, P>, 
								 B extends LanguageBuilder<L, B, P>,
								 P extends LanguageParser<L, B, P>> {
	
}
