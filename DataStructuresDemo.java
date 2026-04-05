import java.util.*;

public class DataStructuresDemo {
    public static void main(String[] args) {

        // Array
        int[] numbers = {1,2,3,4,5};

        // String
        String name = "Task Manager";

        // List
        List<String> tasks = new ArrayList<>();
        tasks.add("Learn Spring");
        tasks.add("Build API");

        // Set
        Set<String> uniqueTasks = new HashSet<>(tasks);

        // Map
        Map<Integer, String> taskMap = new HashMap<>();
        taskMap.put(1, "Task A");
        taskMap.put(2, "Task B");

        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("Process Task 1");
        queue.add("Process Task 2");

        System.out.println("Array length: " + numbers.length);
        System.out.println("App Name: " + name);
        System.out.println("Tasks: " + tasks);
        System.out.println("Unique Tasks: " + uniqueTasks);
        System.out.println("Task Map: " + taskMap);
        System.out.println("Queue: " + queue);
    }
}
