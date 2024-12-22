import java.util.Scanner;
class Complex{
    int realPart;
    int imagPart;

    Complex(int r,int i){
        this.realPart=r;
        this.imagPart=i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.realPart+b.realPart),(a.imagPart+b.imagPart));
    }

    public static Complex diff(Complex a,Complex b){
        return new Complex((a.realPart-b.realPart),(a.imagPart-b.imagPart));
    }

    public static Complex product(Complex a, Complex b){
        return new Complex((a.realPart*b.realPart)-(a.imagPart*b.imagPart),((a.realPart*b.imagPart)+(a.imagPart*b.realPart)));
    }

    public void printResult(){
        if(realPart==0 && imagPart!=0){
            System.out.println(imagPart+"i");
        }
        else if(realPart!=0 && imagPart==0){
            System.out.println(realPart);
        }
        else{
            System.out.println(realPart+" "+imagPart+"i");
        }
    }
}

public class OopsAssig {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real part for first complex number");
        int real=sc.nextInt();
        System.out.println("Enter imaginary part for first complex number");
        int imaginary=sc.nextInt();
        Complex a=new Complex(real, imaginary);

        System.out.println("Enter real part for Second complex number");
        int real1=sc.nextInt();
        System.out.println("Enter imaginary part for Second complex number");
        int imaginary1=sc.nextInt();
        Complex b=new Complex(real1, imaginary1);

        Complex c1=Complex.add(a, b);
        Complex c2=Complex.diff(a, b);
        Complex c3=Complex.product(a, b);

        c1.printResult();
        c2.printResult();
        c3.printResult();
    }
}



// Better code

/*
import java.util.Scanner;

class Complex {
    private int realPart;
    private int imagPart;

    public Complex(int r, int i) {
        this.realPart = r;
        this.imagPart = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.realPart + b.realPart, a.imagPart + b.imagPart);
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex(a.realPart - b.realPart, a.imagPart - b.imagPart);
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex((a.realPart * b.realPart) - (a.imagPart * b.imagPart), 
                           (a.realPart * b.imagPart) + (a.imagPart * b.realPart));
    }

    public static Complex inputComplex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        int real = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        int imaginary = sc.nextInt();
        return new Complex(real, imaginary);
    }

    @Override
    public String toString() {
        if (realPart == 0 && imagPart != 0) {
            return imagPart + "i";
        } else if (realPart != 0 && imagPart == 0) {
            return String.valueOf(realPart);
        } else {
            String sign = (imagPart > 0) ? " + " : " - ";
            return realPart + sign + Math.abs(imagPart) + "i";
        }
    }
}

public class OopsAssig {
    public static void main(String[] args) {
        Complex a = Complex.inputComplex();
        Complex b = Complex.inputComplex();

        Complex c1 = Complex.add(a, b);
        Complex c2 = Complex.diff(a, b);
        Complex c3 = Complex.product(a, b);

        System.out.println("Sum: " + c1);
        System.out.println("Difference: " + c2);
        System.out.println("Product: " + c3);
    }
}

 */