package net.sourceforge.pmd.jdeveloper;

import oracle.jdeveloper.compiler.CompilerPage;

import java.util.List;

public class RuleViolationPage extends CompilerPage {

    public RuleViolationPage() {
        super(Plugin.TITLE, Plugin.TITLE, null);
    }

    public void add(List list) {
        super.logMsg(list);
    }
}
