import java.util.Comparator;
import java.util.PriorityQueue;

// Main Solution Class
public class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<ClassRecord> classPriorityQueue = new PriorityQueue<>(new IncrementComparator());

        // Populate the Priority Queue with Class Records
        for (int[] classInfo : classes) {
            classPriorityQueue.add(ClassRecord.builder()
                .withPass(classInfo[0])
                .withTotal(classInfo[1])
                .build());
        }

        // Distribute Extra Students to Maximize Average Pass Ratio
        while (extraStudents-- > 0) {
            ClassRecord topClass = classPriorityQueue.poll();
            if (topClass != null) {
                classPriorityQueue.add(topClass.addOneStudent());
            }
        }

        // Calculate the Final Average Pass Ratio
        double totalPassRatio = 0;
        while (!classPriorityQueue.isEmpty()) {
            ClassRecord currentClass = classPriorityQueue.poll();
            totalPassRatio += currentClass.getPassRatio();
        }

        return totalPassRatio / classes.length;
    }
}

// Class Record representing individual class details
class ClassRecord {
    private int pass;
    private int total;
    private double increment;

    // Private Constructor
    private ClassRecord(int pass, int total) {
        this.pass = pass;
        this.total = total;
        this.increment = calculateIncrement();
    }

    // Public Builder for creating instances
    public static Builder builder() {
        return new Builder();
    }

    // Add one student to the class and recalculate the increment
    public ClassRecord addOneStudent() {
        this.pass++;
        this.total++;
        this.increment = calculateIncrement();
        return this;
    }

    // Get the current pass ratio
    public double getPassRatio() {
        return (double) pass / total;
    }

    // Get the increment value for priority comparison
    public double getIncrement() {
        return this.increment;
    }

    // Calculate the increment of adding one more student
    private double calculateIncrement() {
        return (double) (pass + 1) / (total + 1) - (double) pass / total;
    }

    // Builder Class for ClassRecord
    public static class Builder {
        private int pass;
        private int total;

        public Builder withPass(int pass) {
            this.pass = pass;
            return this;
        }

        public Builder withTotal(int total) {
            this.total = total;
            return this;
        }

        public ClassRecord build() {
            return new ClassRecord(pass, total);
        }
    }
}

// Comparator for sorting based on the increment value
class IncrementComparator implements Comparator<ClassRecord> {
    @Override
    public int compare(ClassRecord class1, ClassRecord class2) {
        return Double.compare(class2.getIncrement(), class1.getIncrement());
    }
}
