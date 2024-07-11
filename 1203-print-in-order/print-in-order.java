class Foo {
   int num = 0;
    public Foo() {
        
    }
    
    public void first(Runnable printFirst) throws InterruptedException {
        synchronized(this){
            while(num != 0){
                wait();
            }
            printFirst.run();
            num = 1;
            notifyAll();
        }
        // printFirst.run() outputs "first". Do not change or remove this line.
        
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized(this){
            while(num != 1){
                wait();
            }
            printSecond.run();
            num = 2;
            notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized(this){
            while(num != 2){
                wait();
            }
            printThird.run();
        }
    }
}