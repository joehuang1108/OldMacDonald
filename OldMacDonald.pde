Animal[]some = new Animal[2];
void setup()
{
	for (int i = 0; i < some.length; i++)
  {
    some[i] = new Farm();
  }
  some[0] = new Chick();
  some[1] = new Cow();
  
}