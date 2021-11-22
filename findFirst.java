import java.util.stream.*;

public class findFirst {

    public static <T> T
    firstElementInStream(Stream<T> stream)
    {
        T first_element
                = stream

                .findFirst()

                .orElse(null);

        return first_element;
    }

    public static void main(String[] args)
    {

        Stream<String> stream
                = Stream.of("Sahil_First", "Sahil_2",
                "Sahil_3", "Sahil_4",
                "Sahil_Last");

        // Print the first element of a Stream
        System.out.println(
                "First Element: "
                        + firstElementInStream(stream));
    }
}