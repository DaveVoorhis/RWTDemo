package org.reldb.rwt.demo;

import org.eclipse.rap.rwt.application.AbstractEntryPoint;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public class DemoEntryPoint extends AbstractEntryPoint {
	private static final long serialVersionUID = 1L;
	
	@Override
    protected void createContents(Composite parent) {
        parent.setLayout(new FillLayout());
        new MainWindow(parent);
    }
}
