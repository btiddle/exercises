package general;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LinkedList<T> {
    private T element;
    private LinkedList<T> next;

    public LinkedList(T element, LinkedList<T> next) {
        this.element = element;
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public LinkedList<T> getNext() {
        return next;
    }

    public static <T> LinkedList<T> reverse(final LinkedList<T> original) {
        if (original == null) {
            throw new NullPointerException("Cannot reverse a null list");
        }

        if(original.getNext() == null) {
            return original;
        }
        final LinkedList<T> next = original.next;
        original.next = null;

        final LinkedList<T> othersReversed = reverse(next);

        next.next = original;

        return othersReversed;
    }
}

/*
Todo: Ideally, move the tests from "LinkedListTest" to here, but cannot because getting error:
org.testng.TestNGException:
    An error occurred while instantiating class general.LinkedList. Check to make sure it can be instantiated
at org.testng.internal.InstanceCreator.createInstanceUsingObjectFactory(InstanceCreator.java:134)
at org.testng.internal.InstanceCreator.createInstance(InstanceCreator.java:79)
at org.testng.internal.ClassImpl.getDefaultInstance(ClassImpl.java:109)
at org.testng.internal.ClassImpl.getInstances(ClassImpl.java:167)
at org.testng.TestClass.getInstances(TestClass.java:102)
at org.testng.TestClass.initTestClassesAndInstances(TestClass.java:82)
at org.testng.TestClass.init(TestClass.java:74)
at org.testng.TestClass.<init>(TestClass.java:39)
at org.testng.TestRunner.initMethods(TestRunner.java:459)
at org.testng.TestRunner.init(TestRunner.java:338)
at org.testng.TestRunner.init(TestRunner.java:291)
at org.testng.TestRunner.<init>(TestRunner.java:179)
at org.testng.SuiteRunner$DefaultTestRunnerFactory.newTestRunner(SuiteRunner.java:613)
at org.testng.SuiteRunner.init(SuiteRunner.java:178)
at org.testng.SuiteRunner.<init>(SuiteRunner.java:112)
at org.testng.TestNG.createSuiteRunner(TestNG.java:1275)
at org.testng.TestNG.createSuiteRunners(TestNG.java:1251)
at org.testng.TestNG.runSuitesLocally(TestNG.java:1100)
at org.testng.TestNG.runSuites(TestNG.java:1039)
at org.testng.TestNG.run(TestNG.java:1007)
at org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:73)
at org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:123)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.base/java.lang.reflect.Method.invoke(Method.java:564)
at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)


https://github.com/cbeust/testng/issues/1953
* TestNG should fail with a proper error message stating "No instances were produced".

*/
