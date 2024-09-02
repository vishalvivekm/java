```md
JVM languages: Java, Kotlin, or Scala
Program compiled to bytecode is almost always platform-independent.
```

# Java Virtual Machine (JVM)
A virtual simulation of a physical computer that executes the Java bytecode, which comes after the source code compilation. <br>
JVM lang code ---compile to--> bytecode
> run on any platfrom that has jvm 

- acts as a mediator between the code and the real machine. 
- operates with a set of unified bytecode instructions that are interpreted and translated into machine instructions.

JVMs are available for many hardware and software platforms.

# Java Runtime Environment (JRE)
- an execution environment that includes necessary components for running compiled JVM programs:
1. the JVM itself
2. Java Class Library (JCL).

JCL : a set of standard libraries providing the most common functionality: fundamental classes, input/output, math package, collections, security, user interface toolkits etc.

 When we run a compiled Java program, the **JRE**
 - combines the program's bytecode with the necessary libraries.
-  runs the **JVM**, which executes the resulting bytecode

# Java Development Kit (JDK)

- a package used to develop programs for the Java Platform.
- It includes:
  - **Java Runtime Environment (JRE)** to run Java programs.
  - Tools for developers:
    - **Java compiler** (translates source code to bytecode)
    - **Debugger**
    - **Archiver**
    - **Documentation generator** etc.

## Compilation Process
- At the compilation stage, the **compiler** translates source code into `.class` files.
- These `.class` files contain **bytecode** that can be executed by the JVM.

### JVM Languages
- If we are using JVM languages other than Java (e.g., Kotlin, Scala), we need to download their respective compilers separately since they are not included in the JDK.

### JAR Files
- Programs often consist of multiple `.class` files.
- These files are packed together into a single **Java Archive (JAR) file** using an archiver tool.
- The **JRE** can run the program directly from the JAR file without extracting it.
- **JAR files** are convenient for storage and sharing since they are compressed.

