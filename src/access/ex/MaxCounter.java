package access.ex;

public class MaxCounter {
    private int counter;
    private int curCounter;

    public MaxCounter(int number) {
        counter = number;
    }

    public void increment() {
        if(isMaxCounter(curCounter)) {
            curCounter++;
        } else {
            System.out.println("최대 값을 넘을 수없습니다.");
        }
    }

    public int getCounter() {
        return curCounter;
    }

    private boolean isMaxCounter(int curCounter) {
        return (this.counter > curCounter);
    }
}

