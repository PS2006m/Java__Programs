/*
 * Write an application that searches through its command-line argument. If an argument is found that does not begin with and upper case letter,
display error message and terminate.
 */
 class Main4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }
        for (String arg : args) {
            if (!Character.isUpperCase(arg.charAt(0))) {
                System.out.println("Error: Argument \"" + arg + "\" does not begin with an uppercase letter.");
                return; 
            }
        }
        System.out.println("All arguments start with an uppercase letter.");
    }
}
