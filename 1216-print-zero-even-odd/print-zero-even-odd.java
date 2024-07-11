class ZeroEvenOdd {
    private int n;
    private Semaphore szero = new Semaphore(1);
    private Semaphore seven = new Semaphore(0);
    private Semaphore sodd = new Semaphore(0);

    public ZeroEvenOdd(int n) {
        this.n = n;
    }
   
    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        
        

        for(int i = 1; i <=n; i++){
            szero.acquire();
            printNumber.accept(0);
            if(i % 2 ==0){
                seven.release();
            }else {
                sodd.release();
            }
        }
        
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
      

        for(int i = 2; i <= n; i= i+2){
            seven.acquire();
            printNumber.accept(i);
            szero.release();
        }
        
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
      
       for(int i = 1; i <= n; i += 2){
            sodd.acquire();
            printNumber.accept(i);
            szero.release();
       }
    }
}