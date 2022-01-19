import com.dnavault.*;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;



public class DnaApp
{
    public static void main(String[] args) throws Exception {
        /*String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
        Student student = GsonTester.deSerialize(jsonString,Student.class);
        System.out.println(student);
        String serializedJson = GsonTester.serialize(student);
        //System.out.println(serializedJson);*/

        File sourceFile = new File("src/main/java/com/dnavault/Hello.java");
        FileWriter writer = new FileWriter(sourceFile);
        writer.write("package com.dnavault;\n public class Hello{ \n" + " public Hello(){}\n public void doit(String msg) { \n"
          + "   System.out.printf(\"Hello %s\\n\",msg); \n" + " }\n" + "}");
        writer.close();

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(
            null, null, null);

            fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Arrays
          .asList(new File("target/classes/")));
      // Compile the file
      compiler.getTask(null, fileManager, null, null, null,
          fileManager.getJavaFileObjectsFromFiles(Arrays.asList(sourceFile)))
          .call();
      fileManager.close();
      runIt();
  

    }

    @SuppressWarnings("unchecked")
  public static void runIt() {
    try {
      Class params[] = {};
      Object paramsObj[] = {"tester"};
      Class thisClass = Class.forName("com.dnavault.Hello");
      Object iClass = thisClass.newInstance();
      Method thisMethod = thisClass.getMethod("doit", String.class);
      thisMethod.invoke(iClass, paramsObj);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
