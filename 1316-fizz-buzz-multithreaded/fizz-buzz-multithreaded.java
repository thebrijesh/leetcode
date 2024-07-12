class FizzBuzz {
    private int n;
    Semaphore fi = new Semaphore(0);
    Semaphore bu = new Semaphore(0);
    Semaphore fibu = new Semaphore(0);
    Semaphore num = new Semaphore(1);

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {

        for (int i = 3; i <= n; i += 3) {
            if (i % 15 != 0) {
                fi.acquire();
                printFizz.run();
                num.release();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {

        for (int i = 5; i <= n; i += 5) {
            if (i % 15 != 0) {
                bu.acquire();
                printBuzz.run();
                num.release();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {

        for (int i = 15; i <= n; i += 15) {

            fibu.acquire();
            printFizzBuzz.run();
            num.release();

        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
             num.acquire();
            if (i % 3 != 0 && i % 5 != 0) {

                printNumber.accept(i);
                num.release();
            } else {
                
                if (i % 3 == 0 && i % 5 == 0) {
                   
                    fibu.release();
                } else if (i % 3 == 0 && i % 5 != 0) {
                   
                    fi.release();
                } else if (i % 3 != 0 && i % 5 == 0) {
                    bu.release();
                }
            }
        }
    }
}