package question12;

public class FinalizeExa
{
@Override
protected void finalize() throws Throwable {
System.out.println("Finalize the method");
super.finalize();
}
public static void main(String[] args) throws Exception {
FinalizeExa object = new FinalizeExa();
object = null;
System.gc();
Thread.sleep(2000);
}
}