package mathAndCollections.splitting.a.string;

public class Main {
    public static void main(String[] args) {
        String string = "Пример строки для разбиения";
        String[] decomposition = string.split("\\s");
        for (String subString : decomposition) {
            System.out.println(subString);
        }
    }
}