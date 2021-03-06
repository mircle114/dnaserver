import com.dnavault.Student;
import com.dnavault.DnaBuilder;
import com.dnavault.GsonTester;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;

public class DnaApp
{
    public static void main(String[] args) throws Exception {
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
        Student student = GsonTester.deSerialize(jsonString,Student.class);
        System.out.println(student);
        String serializedJson = GsonTester.serialize(student);
        System.out.println(serializedJson);

        //"src/main/java/com/dnavault/Hello.java"
        DnaBuilder.build("src/main/java/consume/");
    
        runIt();
  

    }

    @SuppressWarnings("unchecked")
  public static void runIt() {
    try {
      Class params[] = {};
      Object paramsObj[] = {"tester"};
      Class thisClass = Class.forName("Hello");
      Object iClass = thisClass.newInstance();
      Method thisMethod = thisClass.getMethod("doit", String.class);
      thisMethod.invoke(iClass, paramsObj);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
