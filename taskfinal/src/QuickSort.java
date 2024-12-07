import java.util.List;

public class QuickSort {
    public static void sort(List<Task> tasks) {
        quickSort(tasks, 0, tasks.size() - 1);
    }

    private static void quickSort(List<Task> tasks, int low, int high) {
        if (low < high) {
            int pi = partition(tasks, low, high);
            quickSort(tasks, low, pi - 1);
            quickSort(tasks, pi + 1, high);
        }
    }

    private static int partition(List<Task> tasks, int low, int high) {
        Task pivot = tasks.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tasks.get(j).getPriority() <= pivot.getPriority()) {
                i++;
                swap(tasks, i, j);
            }
        }
        swap(tasks, i + 1, high);
        return i + 1;
    }

    private static void swap(List<Task> tasks, int i, int j) {
        Task temp = tasks.get(i);
        tasks.set(i, tasks.get(j));
        tasks.set(j, temp);
    }
}
