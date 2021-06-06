package template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Entre com o nome do usuário: ");
        String userName = reader.readLine();
        System.out.print("Entre com o password: ");
        String password = reader.readLine();

        // Mensagem.
        System.out.print("Coloque uma mensagem: ");
        String message = reader.readLine();

        System.out.println("\nEscolha uma rede social para postar uma mensagem.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Criando uma rede social
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }

}

