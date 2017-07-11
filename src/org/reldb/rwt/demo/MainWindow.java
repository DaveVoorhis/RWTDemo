package org.reldb.rwt.demo;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;

public class MainWindow extends Composite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Composite clientArea;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public MainWindow(Composite parent) {
		super(parent, SWT.NONE);
		setLayout(new FormLayout());
		
		Label lblTop = new Label(this, SWT.NONE);
		lblTop.setAlignment(SWT.CENTER);
		FormData fd_lblTop = new FormData();
		fd_lblTop.top = new FormAttachment(0, 10);
		fd_lblTop.left = new FormAttachment(0, 10);
		fd_lblTop.right = new FormAttachment(100, -10);
		lblTop.setLayoutData(fd_lblTop);
		lblTop.setText("TopLabel");
		
		Label lblBottom = new Label(this, SWT.NONE);
		lblBottom.setAlignment(SWT.CENTER);
		FormData fd_lblBottom = new FormData();
		fd_lblBottom.right = new FormAttachment(100, -10);
		fd_lblBottom.bottom = new FormAttachment(100, -10);
		fd_lblBottom.left = new FormAttachment(0, 10);
		lblBottom.setLayoutData(fd_lblBottom);
		lblBottom.setText("BottomLabel");
		
		Label lblLeft = new Label(this, SWT.NONE);
		FormData fd_lblLeft = new FormData();
		fd_lblLeft.top = new FormAttachment(50);
		fd_lblLeft.left = new FormAttachment(0, 10);
		lblLeft.setLayoutData(fd_lblLeft);
		lblLeft.setText("LeftLabel");
		
		Label lblRight = new Label(this, SWT.NONE);
		FormData fd_lblRight = new FormData();
		fd_lblRight.top = new FormAttachment(50);
		fd_lblRight.right = new FormAttachment(100, -10);
		lblRight.setLayoutData(fd_lblRight);
		lblRight.setText("RightLabel");
		
		clientArea = new Composite(this, SWT.BORDER);
		FormData fd_clientArea = new FormData();
		fd_clientArea.top = new FormAttachment(lblTop, 10);
		fd_clientArea.left = new FormAttachment(lblLeft, 10);
		fd_clientArea.right = new FormAttachment(lblRight, -10);
		fd_clientArea.bottom = new FormAttachment(lblBottom, -10);
		clientArea.setLayoutData(fd_clientArea);
		clientArea.setLayout(new FillLayout());
	}
}
