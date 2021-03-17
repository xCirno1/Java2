import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jennifer");
        names.add("Mark");
        names.add("David");

        System.out.println("Names : " + names);

        // Sort an ArrayList using its sort() method. You must pass a Comparator to the ArrayList.sort() method.
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name2.compareTo(name1);
            }
        });
        System.out.println("Reversed Names : " + names);

        // The above `sort()` method call can also be written simply using lambda expression
        names.sort((name1, name2) -> name1.compareTo(name2));
        System.out.println("Sorted Names : " + names);

        // Following is an even more concise solution
        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted Names : " + names);
        names.sort(Comparator.reverseOrder());
        System.out.println("Reversed Names : " + names);
    }
}