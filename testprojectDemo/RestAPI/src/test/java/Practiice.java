

import io.testproject.sdk.internal.exceptions.AgentConnectException;
import io.testproject.sdk.internal.exceptions.InvalidTokenException;
import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class Practiice
{
   @Test()
   public void test1() throws InvalidTokenException, AgentConnectException, ObsoleteVersionException, IOException {
       System.out.println("In test1");
      
   }

    @Test()
    public void test2()
   {

       System.out.println("In test2");
   }
}
