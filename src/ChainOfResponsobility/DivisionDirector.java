package ChainOfResponsobility;

import ChainOfResponsobility.AbstractWorker;

class DivisionDirector extends AbstractWorker {

    @Override
    public int costs(int costs) {
        if (costs <= 20_000) {
            System.out.println("Division director approved " + costs + "$" + " cost");
            return costs;
        }
        return super.costs(costs);
    }
}
