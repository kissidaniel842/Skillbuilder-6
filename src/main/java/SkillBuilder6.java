/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * Daniel
 *
 */
public class SkillBuilder6
{
    /**
     * Calculates the prefix average of array data and returns the prefix average
     * in a new array. The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        double[] prefixAverageArray = new double[data.length];
        double cumulativeSum = 0;

        for (int currentIndex = 0; currentIndex < data.length; currentIndex++) {
            cumulativeSum += data[currentIndex];
            prefixAverageArray[currentIndex] = cumulativeSum / (currentIndex + 1);
        }
        return prefixAverageArray;
    }

    /**
     * Finds the location in array anArray where value is located. If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param integerArray array in which to look for a value
     * @return index of the value in the array; -1 otherwise.
     */
    public static int indexOf(int searchValue, int[] integerArray)
    {
        for (int currentIndex = 0; currentIndex < integerArray.length; currentIndex++) {
            if (integerArray[currentIndex] == searchValue) {
                return currentIndex;
            }
        }
        return -1;
    }

    /**
     * Finds the location in array anArray where string s is located. If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param targetString a string to look for in the array
     * @param stringArray array in which to look for a value
     * @return index of the string s in the array; -1 otherwise.
     */
    public static int indexOf(String targetString, String[] stringArray)
    {
        for (int currentIndex = 0; currentIndex < stringArray.length; currentIndex++) {
            if (targetString.equals(stringArray[currentIndex])) {
                return currentIndex;
            }
        }
        return -1;
    }

    /**
     * Finds all occurrences of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param targetString string to search for in array
     * @param stringArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String targetString, String[] stringArray)
    {
        int remainingElementCount = 0;

        for (String currentElement : stringArray) {
            if (!targetString.equals(currentElement)) {
                remainingElementCount++;
            }
        }

        String[] filteredArray = new String[remainingElementCount];
        int newArrayIndex = 0;

        for (String currentElement : stringArray) {
            if (!targetString.equals(currentElement)) {
                filteredArray[newArrayIndex++] = currentElement;
            }
        }
        return filteredArray;
    }

    /**
     * Reverses an array of integers.
     * @param integerArray the array whose contents should be reversed.
     */
    public static void reverse(int[] integerArray)
    {
        int leftIndex = 0;
        int rightIndex = integerArray.length - 1;

        while (leftIndex < rightIndex) {
            int temporaryValue = integerArray[leftIndex];
            integerArray[leftIndex] = integerArray[rightIndex];
            integerArray[rightIndex] = temporaryValue;

            leftIndex++;
            rightIndex--;
        }
    }
}
