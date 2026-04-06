
public class strings {
    public static void main(String[] args) {

        String name = "Ronit Raj";

        String name1 = name.toUpperCase();
        String name2 = name.toLowerCase();
        char arr[] = name.toCharArray();

        System.out.println(name1);
        System.out.println(name2);

        int length = name.length();
        System.out.println(length);

        System.out.println(arr[4]);

        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }

        String newName = "Rohan";
        newName = newName.concat(" kumar");

        System.out.println(newName);
    }
}