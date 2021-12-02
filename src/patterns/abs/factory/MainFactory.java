package patterns.abs.factory;

public interface MainFactory {
    Developer getDeveloper();
    Tester getTester();
    ContentProvider getContentProvider();
}
