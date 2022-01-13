import com.dnavault.*;

public class DnaApp
{
    public static void main(String[] args) throws Exception {
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
        Student student = GsonTester.deSerialize(jsonString,Student.class);
        System.out.println(student);
    }


}
