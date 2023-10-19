class Addition{
	static int add(int a, int b)
		          throws NegativeNumberException{
	if(a<0 || b<0)
    	throw new NegativeNumberException(
	                "Inputs should be only positive values");
		return a+b;
	}
}