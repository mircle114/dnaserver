package com.dnavault;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;
import java.util.Arrays;


public class DnaBuilder 
{
    private DnaBuilder(){}

    public static void build(String pathToBuild) throws IOException 
    {
        try
        {
            //File sourceFile = new File(pathToBuild);
            File sourcePath = new File(pathToBuild);
            File[] files = sourcePath.listFiles();

            // https://stackabuse.com/java-list-files-in-a-directory/


            /* //FileWriter writer = new FileWriter(sourceFile);
           // writer.write("package com.dnavault;\n public class Hello{ \n" + " public Hello(){}\n public void doit(String msg) { \n"
           //   + "   System.out.printf(\"Hello %s\\n\",msg); \n" + " }\n" + "}");
          //  writer.close();*/
    
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager fileManager = compiler.getStandardFileManager(
                null, null, null);
    
                fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Arrays
              .asList(new File("target/classes/consume/")));
          // Compile the file
          compiler.getTask(null, fileManager, null, null, null,
              fileManager.getJavaFileObjectsFromFiles(Arrays.asList(files)))
              .call();
          fileManager.close();
          
        }
        catch(Exception e)
        {
            throw e;
            
        }
        
    }
}
