package workshop3;

public class questionThreeW3 {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "grape", "mango"};

        String elementToFind = "orange";

        boolean found = false;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elementToFind)) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element '" + elementToFind + "' found at index: " + index);
        } else {
            System.out.println("Element '" + elementToFind + "' not found in the array.");
        }
    }
}

