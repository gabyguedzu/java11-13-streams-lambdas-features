public class TextBlock {

    public static void main(String[] args) {
        String jediWithTextBlock = """
            <html>
                <body>
                    <p>Master Yoda</p>%s
                </body>
            </html>
            """.strip().formatted("Luke");

        String jediWithoutTextBlock = "" + 
            "<html>\n" +
            "   <body>\n" +
            "       <p>Master Yoda</p>%s\n" +
            "   </body>\n" +
            "</html>".strip().formatted("Luke");

        System.out.println(jediWithTextBlock);
        System.out.println(jediWithoutTextBlock);

        System.out.println(jediWithTextBlock.equals(jediWithoutTextBlock));
        System.out.println(jediWithTextBlock == jediWithoutTextBlock);

    }
}