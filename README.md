# Colorized Java

This is a really simple library that I made to print colored text in Java console.

## Usage

1. Download the .jar

```shell
wget https://github.com/vieitesss/colorize-Java/blob/main/Color.jar
```

2. Add the library to your classpath.
3. Import it like this:

```java
import color.Color;
```

4. Now you can print colored text in your console:

```java
public class Example{
    public static void main(String[] args) {
        System.out.prinln(Color.colorize(COLOR_RED, "Hello world in red!"));
        System.out.prinln("This is " + Color.colorize(COLOR_YELLOW, "yellow"));
        System.out.prinln(Color.colorize(COLOR_GREEN, "Green") + " is also available");
    }
}
```

