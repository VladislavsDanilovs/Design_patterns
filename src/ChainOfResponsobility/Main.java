package ChainOfResponsobility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager();
        ProgramManager programManager = new ProgramManager();
        SubdivisionManager subdivisionManager = new SubdivisionManager();
        DivisionDirector divisionDirector = new DivisionDirector();
        CEO ceo = new CEO();

        System.out.println("Write expense request amount and person which have authorization rights will approve the request");
        int expenseRequestAmount = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            //Requesting expense amount
            expenseRequestAmount = scanner.nextInt();
            //Validating users input
        } catch (InputMismatchException e) {
            System.out.println("Incorrect data input! Should contain only integer numbers !");
        }

        //Setting chain of responsibility
        projectManager.setNextWorker(programManager).setNextWorker(subdivisionManager).setNextWorker(divisionDirector)
                .setNextWorker(ceo);

        GiveAmountOfMoney(projectManager, expenseRequestAmount);

    }

    private static void GiveAmountOfMoney(Worker worker, int costs) {
        int AmountOfMoney = worker.costs(costs);
    }
}
