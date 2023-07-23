package ChainOfResponsobility;

import ChainOfResponsobility.AbstractWorker;

class ProgramManager extends AbstractWorker {

    @Override
    public int costs(int costs) {
        if (costs <= 2000) {
            System.out.println("Program manager approved " + costs + "$" + " cost");
            return costs;
        }
        return super.costs(costs);
    }
}
