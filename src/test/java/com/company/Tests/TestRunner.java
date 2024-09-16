package com.company.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import java.util.ArrayList;
import java.util.List;

public class TestRunner{

    private TestNG testNG;

    @BeforeClass
    @Parameters({"testngXmlFile"})
    public void setUp(String testngXmlFile) {
        testNG = new TestNG();
        List<XmlSuite> suites = new ArrayList<>();
        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(List.of(testngXmlFile));
        suites.add(suite);
        testNG.setXmlSuites(suites);
    }

    @Test
    public void runTests() {
        testNG.run();
    }

    @AfterClass
    public void tearDown() {
        // Code to perform cleanup after tests are run
    }

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestSuites(List.of("testng.xml"));
        testng.run();
    }
}