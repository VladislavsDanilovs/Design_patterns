package ChainOfResponsobility;

interface Worker {
    Worker setNextWorker(Worker worker);

    int costs(int costs);
}
