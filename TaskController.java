import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private Map<Integer, String> taskStore = new HashMap<>();

    @GetMapping
    public Collection<String> getTasks() {
        return taskStore.values();
    }

    @PostMapping
    public String addTask(@RequestParam int id, @RequestParam String task) {
        taskStore.put(id, task);
        return "Task added successfully";
    }

    @PutMapping
    public String updateTask(@RequestParam int id, @RequestParam String task) {
        taskStore.put(id, task);
        return "Task updated";
    }

    @DeleteMapping
    public String deleteTask(@RequestParam int id) {
        taskStore.remove(id);
        return "Task deleted";
    }
}
