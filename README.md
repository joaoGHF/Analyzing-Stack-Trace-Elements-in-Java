# Analyzing-Stack-Trace-Elements-in-Java
A project to analyze the Stack Trace Elements in Java.

This projetc have the class <a href="StackTraceTest/src/stacktrace/StackTraceTest.java">StackTraceTest</a> with the methods `main` and `factorial`. The `factorial` method calculates the factorial recursively and also prints the Stack Trace Elements.

## One possible output

For the entry `3`, one possible output is:

```
Enter n: 3
factorial(3):
stacktrace.StackTraceTest.factorial(StackTraceTest.java:27)
stacktrace.StackTraceTest.main(StackTraceTest.java:16)
factorial(2):
stacktrace.StackTraceTest.factorial(StackTraceTest.java:27)
stacktrace.StackTraceTest.factorial(StackTraceTest.java:38)
stacktrace.StackTraceTest.main(StackTraceTest.java:16)
factorial(1):
stacktrace.StackTraceTest.factorial(StackTraceTest.java:27)
stacktrace.StackTraceTest.factorial(StackTraceTest.java:38)
stacktrace.StackTraceTest.factorial(StackTraceTest.java:38)
stacktrace.StackTraceTest.main(StackTraceTest.java:16)
return 1.0
return 2.0
return 6.0
```
