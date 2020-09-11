/* *****************************************************************************
 *  Name:              Sean Staples
 *  Last modified:     August 27th, 2020
 **************************************************************************** */

public class DataStats {
    double Array[];
    int counter;
    public DataStats(int N) {
        // set up an array (to accept up to N doubles) and other member variables
        Array = new double[N];
    }
    public double mean() {
        //compute and return the mean of the set of numbers added so far
        double sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += Array[i];
        }
            return sum/counter;
    }
    public void append(double in) {
        //append number to the set; throw error if more than N numbers added
        Array[counter] = in;
        counter++;
    }
}
