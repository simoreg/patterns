package template_method;

/**
 * Classe da rede social
 */
public class Facebook extends Network {
	
	public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

	@Override
	boolean logIn(String userName, String password) {
		System.out.println("\nChegando parametros do usu?rio");
        System.out.println("Nome: " + this.userName);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogado com sucesso no Facebook");
        return true;
	}

	@Override
	boolean sendData(byte[] data) {
		boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Mensagem: '" + new String(data) + "' foi postada no Facebook");
            return true;
        } else {
            return false;
        }
	}

	@Override
	void logOut() {
		System.out.println("Usu?rio: '" + userName + "' estava logado no Facebook");
	}
	
	private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
