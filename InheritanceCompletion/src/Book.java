public class Book extends Product
{
    private String author;

    public Book()
    {
    	this.author = "";
    	super.setCode("");
    	super.description = "";
    	super.price = 0;
    	
     	
        count++;
        
    }
    
    
    public void setAuthor(String author)
    {
        this.author = author;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Author:      " +
            author + "\n";
    }
}


/*The constructors of the subclasses should set the default 
 * values of the objects attributes and increase the product count. 
 * The default values should be those values that would be set when a 
 * new instance of your class is created.
 */