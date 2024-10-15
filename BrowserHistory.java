package homework5;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BrowserHistory {
    // Задача 2. История посещения веб-сайтов
    // Реализуйте программу для хранения и анализа историй посещений веб-сайтов.
    // Используйте Deque для хранения истории.
    // ● visitSite(String site): Добавляет сайт в историю посещений.
    // ● back(int steps): Возвращает название сайта, который был посещен
    // steps назад, или null, если таких шагов нет.
    // ● getHistory(): Возвращает список сайтов в истории посещений, от
    // последнего посещенного к первому.

    public Deque<String> history = new LinkedList<>();

    public void visitSite(String site) {
        history.addFirst(site);
        System.out.println("Visited: " + site);
    }

    public String back(int steps) {
        Deque<String> tempStack = new LinkedList<>();

        while (steps > 0 && !history.isEmpty()) {
            tempStack.addFirst(history.removeFirst());
            steps--;
        }

        String currentSite = history.peekFirst();

        while (!tempStack.isEmpty()) {
            history.addFirst(tempStack.removeFirst());
        }

        return currentSite;
    }

    public List<String> getHistory() {
        return new LinkedList<>(history);
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitSite("gb.ru");
    }
}
