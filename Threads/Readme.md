**Callable Interface**
->Represents a task to be run on thread
->can return results or throw exception
->Callable interface only method call method
->Handovers the result coming from background thread to main thread

**__Future Interface__**
-> Represents results of thread task
-> Returned by ExecutorService.submit
-> key method: get
   -> Blocks until task gets completes
   -> Returns callable interface result
   -> Throws callable interface exception

**ExecutorService Interface**
-> Creates a thread pool
-> Can submit tasks
-> Request and wait for pool shutdown

**Executor Class**
-> Methods for creating thread pools
-> Dynamically Sized pools
-> size limited pools


