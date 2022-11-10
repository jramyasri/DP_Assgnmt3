package question25;

@FunctionalInterface  //It is optional  
interface Drawable{  
    public void draw();  
}  
  
public class LambdaExpression {  
    public static void main(String[] args) {  
        int height=10;  
          
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Height "+height);  
        };  
        d2.draw();  
    }  
}  