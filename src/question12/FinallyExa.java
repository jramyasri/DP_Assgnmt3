package question12;

public class FinallyExa
{
void finallyTest() {
try {
System.out.println("Present in  try block");
} finally {
System.out.println("Present in  finally block");
}
}
public static void main(String[] args) {
FinallyExa main = new FinallyExa();
main.finallyTest();
}
}