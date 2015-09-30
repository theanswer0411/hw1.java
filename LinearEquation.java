import java.util.Scanner;
public class LinearEquation{
	public static void main (String[]args){
		 
		Linear counter = new Linear(0,0,0,0,0,0);
		//new a object
		System.out.println("Enter six number they will be a b c d e f");
		//run the method
		counter.geta();
		counter.getb();
		counter.getc();
		counter.getd();
		counter.gete();
		counter.getf();
		System.out.println(" X = (e*d-b*f)/(a*d-b*c)     Y = (a*f-e*c)/(a*d-b*c)");
		if (counter.isSolvable()){
			System.out.println(" X = "+counter.getX()+"\n Y = "+counter.getY());
		}
		else{
			System.out.println("The equation has no solution");
		}
		
		
		
	}
}
 class Linear{
	private int a,b,c,d,e,f;
	Scanner sc = new Scanner(System.in);
	
	Linear(int a,int b,int c,int d,int e,int f){
		this.a=a;
		this.b=b;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	int geta(){
		System.out.println("A = ");
		a=sc.nextInt();
		
		return a;
	}
	int getb(){
		System.out.println("B = ");
		b=sc.nextInt();
		return b;
	}
	int getc(){
		System.out.println("C = ");
		c=sc.nextInt();
		
		return c;
	}
	int getd(){
		System.out.println("D = ");
		d=sc.nextInt();
		return d;
	}
	int gete(){
		System.out.println("E = ");
		e=sc.nextInt();
		
		return e;
	}
	int getf(){
		System.out.println("F = ");
		f=sc.nextInt();
		
		return f;
	}
	boolean isSolvable(){
		//decide  the number if a*d-b*c==0 return false
		if (a*d-b*c==0){
			
			return false;
		}
		else {
			
			return true;
		}
		
	}
	double getX(){
		
		
		return (e*d-b*f)/(a*d-b*c);
	}
	double getY(){
		double count =(a*f-e*c)/(a*d-b*c);
		
		return count;
	}
}

	
	
