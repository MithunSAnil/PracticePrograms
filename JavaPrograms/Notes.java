public class Notes
{
    public static void main(String[] args)
    {
        // 1: Static methods belong to the class and not to a particular object. So they do not need objects to be called
            public void addNode()
            {
                /*Can be called using ClassName.addNode. There is no need to create an object*/
            }

        // 2 : Public class Main should be named Main only because it is public and needs to be accesses by other classes outside

        // 3 : StringBuilder class objects can append and delete characters from strings
            StringBuilder str = new StringBuilder("0123456789");
            str.append("a"); /*Appends a at the end of the string str */
            str.delete(startIndex, endIndex); /*Deletes characters from start index to end index - 1 */
            str.deleteCharAt(i); /*Deletes characters from a specific index */
    }
}