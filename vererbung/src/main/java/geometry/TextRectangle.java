package geometry;


public class TextRectangle extends Rectangle{
    private String  my_text;
    public TextRectangle(String my_text, Point topLeft, int width, int height) {
        super(topLeft, width, height);
        this.my_text = my_text;


    }

    public java.lang.String getText(){
        return my_text;
    }
}
