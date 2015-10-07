public class Software extends Product
{
    private String version;

    public Software()
    {
    	this.version = "";
    	super.setCode("");
    	super.description = "";
    	super.price = 0;
    
     	
        count++;
    }

    public String getVersion()
    {
        return version;
    }
    @Override
    public String toString()
    {
        return "Code:        " + super.getCode() + "\n" +
               "Description: " + description + "\n" +
        		"Version:     " + version + "\n"+
               "Price:       " + this.getFormattedPrice() + 
               "\n";
    }
   
}