package atm;

import java.util.Scanner;

class CommandLineAtm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CommandRouterComponent commandRouterComponent = DaggerCommandRouterComponent.create();
        CommandRouter commandRouter = commandRouterComponent.router();

        while (scanner.hasNextLine()) {
            commandRouter.route(scanner.nextLine());
        }
    }
}
