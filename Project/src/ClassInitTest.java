/**
 * @author zhougang
 * @date 2020/10/14
 */
public class ClassInitTest
{

    public ClassInitTest()
    {
        int d = 22;
    }

    static
    {
        num = 777;
    }

    private static int num = 7;


    public static void main(String[] args)
    {
        System.out.println("ClassInitTest.num = " + ClassInitTest.num);
    }
}
