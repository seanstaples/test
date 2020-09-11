/* *****************************************************************************
 *  Name:              Sean Staples
 *  Last modified:     August 27th, 2020
 **************************************************************************** */
public class ComputePi {
    public static void main(String[] args) {
        int n = 0; //n is the number of “darts”

        try { // Parse the string argument into an integer value.
            n = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException nfe) {
            // The first argument isn't a valid integer.  Print
            // an error message, then exit with an error code.
            System.out.println("The first argument must be an integer.");
            System.exit(1);
        }

        double pi = compute_pi(n);

        //now ... print it!
    }
    private static double compute_pi (int n) {
        double pi = 0.0;
        // compute_pi(n); //n is the number of “darts”

        double inside = 0.0;
        for (int i = 1; i <= n; i++) {
            double x = Math.random();
            double y = Math.random();
            if (Math.sqrt(x*x+y*y)<=1) {
                inside++;
                pi=4*inside/n;
            }
        }
        System.out.println(pi);
        return pi;
    }
}
