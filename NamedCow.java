class NamedCow extends Cow
{
  private String DName, myType, mySound, Cnames;
	public NamedCow(String type, String Cnames,String sound) 
  { 
    myType = type;
    mySound = sound;
    DName = Cnames;
  }
  public String getName()
  {
    return DName;
  }
}  
  