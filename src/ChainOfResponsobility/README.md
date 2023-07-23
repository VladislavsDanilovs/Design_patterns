# Chain of Responsibility

Organization has hierarchy CEO <- Division Director <- Subdivision Manager <- Program Manager <- Project Manager.

Project Manager has the authorization to approve costs up to 500$, Program Manager up to 2'000$, Subdivision Manager up to 5'000$, Division Director up to 20'000$ and CEO up to 100'000$.

Choose your favorite OOP language and implement CLI application using _Chain of Responsibility_ pattern (https://refactoring.guru/design-patterns/chain-of-responsibility)

CLI must take in as an input expense request amount and print out who did approve the request.


/*

To complete this task, I decided to create an interface “Worker”, which contains 2 methods: a)SetNextWorker  - which will create chain of responsibility in Main class. 
b) Method costs – which sets costs for worker using static method GiveAmountOfMoney().

After that, I created an abstract class AbstractWorker which implements interface Worker.

Then I created private field nextWorker and constructor that sets this field to null. Also, I overrode 2 methods from interface, setter setNextWorker and method costs where I’m setting costs to worker. 
Thereafter, as demanded in task, I created organization workers in separate classes, where I was checking amount of costs, and if condition false, then returned this amount of costs to extended class, where this costs will check NextWorker in his conditions according to chain of responsibility written in Main class.

To run this program locally use java Main.java.
*/