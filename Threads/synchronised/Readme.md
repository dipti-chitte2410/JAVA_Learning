Synchronised Methods:
->Automated concurreny management
->Used lock of current object instance
->Enable use of non thread safe classed
->can protect complex blocks of code

All Java Objects have a lock
->can manually acquire that lock
->Use Synchronised statement block
->Availability to any code with reference


4. Initial Balance:450
2. Thread 1 :Deposit 150 (locks the deposit method:450+150=600
3. continues... Thread 1 checks get method if balance is more than 500 condition satisfies
4. continues... Get the 600-500 100*10%:10  and deposits 10 so bal:610
5. At the time 4th process another thread will come but till then bonus is not added to balance:
    Thread 2 (Withdraw 300) so it will be 600-300=300
6. then Thread1 will come and calculate bonus i.e 300-500=-200*10%=-20
7. and will substract 300-20=280 it happend because entire code
    first deposit then calculating bonus if balance>500 was not synchronised
 
