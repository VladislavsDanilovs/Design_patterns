package ChainOfResponsobility;

import ChainOfResponsobility.AbstractWorker;

class ProjectManager extends AbstractWorker {

    @Override
    public int costs(int costs) {
        if (costs <= 500) {
            System.out.println("Project manager approved " + costs + "$" + " cost");
            return costs;
        }
        return super.costs(costs);
    }
}
