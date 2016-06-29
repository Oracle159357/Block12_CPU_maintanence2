package CPU;

/**
 * defines class with parameters such as: random time interval between processes, name of the process
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 27.06.2016)
 */
public class Process {
    /**
     * time interval for the next process generation
     */
    private int time;
    /**
     * name of the process
     */
    private int name;
    /**
     * static incrementing int  value
     */
    static volatile int counter;

    /**
     * defines the upper and lower bounds for random generator of the  {@code time}
     * name corresponds to the current value of static incremented  counter
     *
     * @param min
     * @param max
     */
    public Process(int min, int max) {
        this.time = generateRandomNumber(min, max);
        name = counter++;
    }

    /**
     * generates the randomly distributed value between min and max bounds inclusively
     *
     * @param min
     * @param max
     * @return random int value
     */
    public int generateRandomNumber(int min, int max) {
        int number = (int) (min + Math.random() * (max - min + 1)) * 10;
        return number;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Process{" +
                "name=" + name +
                '}';
    }
}
