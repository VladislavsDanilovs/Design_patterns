package ChainOfResponsobility;

import ChainOfResponsobility.AbstractWorker;

class SubdivisionManager extends AbstractWorker {

    @Override
    public int costs(int costs) {
        if (costs <= 5000) {
            System.out.println("Subdivision manager approved " + costs + "$" + " cost");
            return costs;
        }
        return super.costs(costs);
    }
}
