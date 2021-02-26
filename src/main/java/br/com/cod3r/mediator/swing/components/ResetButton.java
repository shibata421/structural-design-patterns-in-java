package br.com.cod3r.mediator.swing.components;

import javax.swing.JButton;

import br.com.cod3r.mediator.swing.Mediator;

public class ResetButton extends JButton {
	private static final long serialVersionUID = -6170178595314483794L;

	public ResetButton(Mediator mediator) {
		super("Reset");

		this.addActionListener(e -> {
			mediator.setCounter(0);
			mediator.setEnabled(true);
			mediator.refresh();
		});
	}

}
