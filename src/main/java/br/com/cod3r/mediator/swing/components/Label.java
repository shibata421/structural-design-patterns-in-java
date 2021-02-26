package br.com.cod3r.mediator.swing.components;

import javax.swing.JLabel;

import br.com.cod3r.mediator.swing.Mediator;

public class Label extends JLabel {
	private static final long serialVersionUID = 4136663121512778435L;
	private Mediator mediator;
	
	public Label(Mediator mediator) {
		super("Times Clicked: 0");
		this.mediator = mediator;
	}

	public void refresh() {
		super.setText("Times Clicked: " + mediator.getCounter());
	}
}
