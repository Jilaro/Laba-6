public class Exersice1 {
    private char ch;
    private String text;

    public Exersice1() {
        this.ch = '\0';
        this.text = null;
    }

    public void set(char c) {
        this.ch = c;
    }

    public void set(String s) {
        this.text = s;
    }

    public void set(char[] arr) {
        if (arr == null) {
            return;
        }
        if (arr.length == 1) {
            this.ch = arr[0];
        } else {
            this.text = new String(arr);
        }
    }

    public char getChar() {
        return ch;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Exersice1{ ch=" + (ch == '\0' ? "\\0" : "'" + ch + "'") +
                ", text=" + (text == null ? "null" : "\"" + text + "\"") + " }";
    }

    public static void main(String[] args) {
        Exersice1 obj = new Exersice1();

        System.out.println(obj);

        obj.set('A');
        System.out.println(obj);

        obj.set("Hello");
        System.out.println(obj);

        obj.set(new char[]{'Z'});
        System.out.println(obj);

        obj.set(new char[]{'J', 'a', 'v', 'a'});
        System.out.println(obj);
    }
}
