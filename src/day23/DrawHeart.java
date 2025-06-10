package day23;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class DrawHeart {

	public static void main(String[] args) {
		//drawHeart();
		heart2();
	}
	
	public static void drawHeart() {
		for (double y =1.5 ; y>-1.5;y-=0.1) {
			for(double x = -1.5;x<1.5;x+=0.05) {
				double a = x * x + y * y -1;
				if(a * a * a -x * x * y * y * y<=0.0) {
					System.out.println("*");
				}else {
					System.out.println(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static  void heart2(){
        double x,y,a;
        char s[]=new char[]{'I',' ','l','o','v','e',' ','y','o','u','!'};
        int index=0;
        for(y=1.3f;y>-1.1f;y-=0.06f){
            index=0;
            for(x=-1.1f;x<=1.1f;x+=0.025f){
                double result=x*x+pow((5.0*y/4.0-sqrt(abs(x))),2);
                if(result<=1){
                    System.out.print((s[index]));
                    index=(index+1)%11;
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println(" ");
        }
    }

//作者：aikutwo
//链接：https://juejin.cn/post/7094437457441062925
//来源：稀土掘金
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
