import java.util.*;

public class P11TaskScheduler {
    
    public static int taskScheduler(char[] tasks, int n) {

        int[] taskFreqs = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            taskFreqs[tasks[i] - 'A']++;
        }

        Arrays.sort(taskFreqs);
        int maxTask = taskFreqs[25] - 1;
        int totalCooldown = maxTask * n;

        for (int i = 24; i >= 0 && taskFreqs[i] > 0; i--) {
            totalCooldown -= (taskFreqs[i] > maxTask) ? maxTask : taskFreqs[i];
        }

        return tasks.length + ((totalCooldown > 0) ? totalCooldown : 0);
    }
}
