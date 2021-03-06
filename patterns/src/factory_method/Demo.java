package factory_method;


public class Demo {
	
	private static Dialog dialog;

	public static void main(String[] args) {
		configure();
        runBusinessLogic();

	}
	
	/*
	 * 
	 * O objeto geralmente ? escolhido dependendo da configura??o ou op??es de ambiente.
	 * 
	 * */
	static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
	
	/*
	 * 
	 * 	Todo o c?digo do cliente deve funcionar com f?bricas e produtos por meio de
	 *	interfaces abstratas. Desta forma, n?o importa com qual f?brica ela funciona
	 *	e que tipo de produto ela retorna.
	 * 
	 * */
	static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
