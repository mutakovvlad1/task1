package patterns.abs.factory;

public class TelecomProvider implements ContentProvider {
    @Override
    public void provideContent() {
        System.out.println("Провайдер предоставил видео-контент");
    }
}
