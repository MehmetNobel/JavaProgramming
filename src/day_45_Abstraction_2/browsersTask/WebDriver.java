package day_45_Abstraction_2.browsersTask;

public interface WebDriver extends SearchContext{  // an iterface extending another interface

    void get(String url);
    void close();
    void quit();
    void getTitle();
}
