package Runner;

import java.io.IOException;

import org.testing.TestScripts.Delete_TC5;
import org.testing.TestScripts.GetRequestTC2;
import org.testing.TestScripts.GetRequestWithQueryParameter;
import org.testing.TestScripts.PostRequestTC1;
import org.testing.TestScripts.PutRequest_TC4;
//import org.testing.TestScripts.Read_update_TC6;

public class RunnerClass {
	public static void main(String[] args) throws IOException{
		PostRequestTC1 post=new PostRequestTC1();
		post.tc1();
		
		GetRequestTC2 get=new GetRequestTC2();
		get.tc2();
		
		GetRequestWithQueryParameter get1=new GetRequestWithQueryParameter();
		get1.tc3();
		
		PutRequest_TC4 put=new PutRequest_TC4();
		put.tc4();
		
		Delete_TC5 delete=new Delete_TC5();
		delete.tc5();
		
		/*Read_update_TC6 obj=new Read_update_TC6();
		obj.tc6();*/
	}

}
