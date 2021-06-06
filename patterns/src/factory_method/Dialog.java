package factory_method;

//Classe básica da fábrica
public abstract  class Dialog {
	 public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

	/**
	 * As subclasses irao sobrescrever este metodo para criar um botao especifico.
	 *
	 */
    public abstract Button createButton();
}
