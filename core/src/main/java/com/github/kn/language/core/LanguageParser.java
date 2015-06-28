package com.github.kn.language.core;

import java.io.InputStream;

public interface LanguageParser<L extends Language<L, B, P>,
								B extends LanguageBuilder<L, B, P>,
							    P extends LanguageParser<L, B, P>> {
	
	L parse(InputStream stream);
}
