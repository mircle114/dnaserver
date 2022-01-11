import com.dnavault.*;

public class DnaApp
{
    public static void main(String[] args)
    {
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
        Student student = GsonTester.deser(jsonString);
        System.out.println(student);
    }


}
