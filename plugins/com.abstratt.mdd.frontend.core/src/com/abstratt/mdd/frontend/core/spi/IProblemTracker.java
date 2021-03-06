package com.abstratt.mdd.frontend.core.spi;

import com.abstratt.mdd.core.IProblem;
import com.abstratt.mdd.core.IProblem.Severity;

public interface IProblemTracker {
	public void add(IProblem toReport);

	public IProblem[] getAllProblems();

	public boolean hasProblems(Severity minimumSeverity);
}
