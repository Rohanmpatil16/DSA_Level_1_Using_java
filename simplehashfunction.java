public class simplehashfunction {
    public static int hashFunction(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash += key.charAt(i);  // add ASCII value of each character
        }
        return hash % 10;  // simple modulo hash
    }  // <-- this closing brace was missing!

    public static void main(String[] args) {
        String[] keys = {"apple", "banana", "grape", "mango"};

        for (String key : keys) {
            int hashValue = hashFunction(key);
            System.out.println("Key: " + key + " | Hash: " + hashValue);
        }
    }
}
