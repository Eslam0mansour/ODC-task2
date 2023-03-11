public class Complex{

    public double real,imag;

    Complex(){
        real=0;
        imag=0;
    }

    Complex(double real,double imag){
        this.real=real;
        this.imag=imag;
    }

    static Complex add(Complex c1,Complex c2){
        Complex x= new Complex();
        x.real=c1.real+c2.real;
        x.imag=c1.imag+c2.imag;
        return x;
    }

    static Complex subtract(Complex c1, Complex c2){
        Complex x=new Complex();
        x.real=c1.real-c2.real;
        x.imag=c1.imag-c2.imag;
        return x;
    }
    static void print(Complex x){

        if(x.imag<0){
            System.out.println(x.real +""+ x.imag+'i');
        }
        else if(x.imag==0){
            System.out.println(x.real);
        }
        else if(x.imag==1){
            System.out.println(x.real +"+"+'i');
        }
        else{
            System.out.println(x.real +"+"+ x.imag+'i');
        }
    }
}