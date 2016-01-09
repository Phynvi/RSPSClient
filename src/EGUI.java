public class EGUI
{
	public static void main(String args[])
	{
		if(args.length == 0){
			client.run( new String[]{"174.103.166.8"} ); //can manually enter 0.0.0.0 if necessary
		}
		else{
			client.run( args );
		}
	}
}
