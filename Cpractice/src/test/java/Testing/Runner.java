package Testing;
import com.intuit.karate.Results;
import com.intuit.karate.Runner.Builder;

public class Runner {

	public static void main(String ar[]) {
		
		Builder obj= new Builder();
		
				
	Results rs=obj.path("classpath:Testing").parallel(5);

	}

	
}
