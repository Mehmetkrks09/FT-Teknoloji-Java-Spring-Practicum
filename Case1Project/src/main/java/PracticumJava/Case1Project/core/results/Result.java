package PracticumJava.Case1Project.core.results;

public class Result {

	private boolean succes;
	private String message;

	public Result(boolean succes)
	{
		this.succes=succes;
	}
	public Result(boolean succes,String message)
	{
		this(succes);
		this.message=message;
	}
	
	public boolean isSuccess()
	{
		return this.succes;
	}

	public String getMessage()
	{
		return this.message;
	}
	
}
