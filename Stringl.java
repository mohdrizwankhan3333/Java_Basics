public class Stringl {
    public static void main(String[] args) {
        String jam = "Rizwan Khan";
        System.out.println(jam);
        System.out.println(jam.length());
        System.out.println(jam.toLowerCase());
        System.out.println(jam.toUpperCase());
        System.out.println("Should print [Rizwan] ");
        System.out.println(jam.substring(0, 6));
        System.out.println("Should print [Khan]");
        System.out.println(jam.substring(7, jam.length()));
        String capitalized =
                jam.substring(0, 1).toUpperCase() +
                        jam.substring(1).toLowerCase();

        System.out.println(capitalized);
    }

    }/*
    Output
    Rizwan Khan
11
rizwan khan
RIZWAN KHAN
Should print [Rizwan]
Rizwan
Should print [Khan]
Khan
Rizwan khan
}
