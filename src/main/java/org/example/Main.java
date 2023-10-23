package org.example;
import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        List<String> suiteFiles = new ArrayList<>();
        suiteFiles.add("testng.xml");
        testNG.setTestSuites(suiteFiles);
        testNG.run();
    }
}