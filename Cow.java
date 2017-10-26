class Cow implements Animal 
{     
  private String myType;     
  private String mySound1;   

  public Cow(String type, String sound1) 
  {         
    myType = type;         
    mySound1 = sound1;
  }     
  public Cow() {         
    myType = "unknown";         
    mySound1 = "unknown";

  }      
  public String getSound() 
  {
      return mySound1;
    
  }     
  public String getType() {
    return myType;
  }
}