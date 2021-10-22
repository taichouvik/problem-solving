// Default constructor is 			public Classname(){}
// If you create a 'non Default constructor' then it will not be automatically created.

// Child class calls super() by default. We can make it call super(1,2) instead
// Doesn’t calls this() by default

class Ex {
    public Ex() {
        System.out.println("example");
    }
}

public class LearnConstructor {
    private LearnConstructor() {
        System.out.println("def");
    }

    public static void main(String[] s) {
        Ex ex = new Ex();
    }

}
