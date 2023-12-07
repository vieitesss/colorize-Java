# Colorized Java

This is a really simple library that I developed to print colored text whitin the Java console.

The need appears while I was working on an assigment and I wanted to print colored text. I did not find any library that does this in the first searches on the Internet, so I decided to create it myself.

So know, instead of surfing the web for ANSI codes every time I need colored text for Java, I have got this library ready to go. Keeping it stored is a no-brainer, no need spend time searching for ANSI codes online.

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

## More

Feel free to download even the .jar or the source code.

If you like it leave a ⭐️
