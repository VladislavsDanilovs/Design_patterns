package ChainOfResponsobility;

import ChainOfResponsobility.AbstractWorker;

class CEO extends AbstractWorker {

    @Override
    public int costs(int costs) {
        if (costs <= 100_000) {
            System.out.println("CEO approved " + costs + "$" + " cost");
            return costs;
        }

        if (costs > 100_000) {
            System.out.println("CEO decided to create a meeting, during which will take a decision about necessity " +
                    "of that expense payment and alternative possibilities to lower expenses");
        }
        return costs;
    }
}
