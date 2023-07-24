package sharing;

public class Strings {

    public static void main(String[] args) {

        String webTitle = "This is a web title";
        String webHeader = "   This is a header of webpage  ";

        // String methods
        System.out.println(webTitle + webHeader); // Combined strings
        System.out.println(webTitle.charAt(6));
        System.out.println(webTitle.toLowerCase());
        System.out.println(webTitle.toUpperCase());
        System.out.println(webHeader.trim());
        System.out.println(webHeader.length());
        System.out.println(webHeader.contains("This"));


    }

}
