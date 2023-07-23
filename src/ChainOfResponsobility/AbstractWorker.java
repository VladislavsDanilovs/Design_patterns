package ChainOfResponsobility;

abstract class AbstractWorker implements Worker {

    private Worker nextWorker;

    public AbstractWorker() {
        nextWorker = null;
    }

    @Override
    public Worker setNextWorker(Worker worker) {
        nextWorker = worker;
        return worker;
    }

    @Override
    public int costs(int costs) {
        if (nextWorker != null) {
            return nextWorker.costs(costs);
        }
        return 0;
    }
}
