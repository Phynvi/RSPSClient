public class EGUI
{
	public static void main(String args[])
	{
		if(args.length == 0){
			client.run( new String[]{"0.0.0.0"} ); 
		}
		else{
			client.run( args );
		}
	}
}
