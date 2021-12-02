package patterns.abs.factory;

public class Main {
    public static void main(String[] args) {
        MainFactory mainFactory = new MediaFactory();
        Developer developer = mainFactory.getDeveloper();
        Tester tester = mainFactory.getTester();
        ContentProvider contentProvider = mainFactory.getContentProvider();

        System.out.println("Создан мобильный сервис видео-контента");
        developer.writeCode();
        tester.testCode();
        contentProvider.provideContent();
    }
}