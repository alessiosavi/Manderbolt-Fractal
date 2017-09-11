package numcomplessi;

public class Complex {
    private float real;
    private float immag;
    
    public Complex(){
        real=0;
        immag=0;
    }
    
    public Complex(float x,float y){
        real=x;
        immag=y;
    }
    
    public float getReal(){
        return real;
    }
    
    public float getImmag(){
        return immag;
    }
    
    public double getMod(){
        return Math.sqrt(real*real+immag*immag);
    }

    public double getArg(){
        return Math.atan2(immag,real);
    }

    Complex add(Complex w){
        float x,y;
        x=real+w.real;
        y=immag+w.immag;
        Complex z=new Complex(x,y);
        return z;
    }

    Complex sub(Complex w){
        float x,y;
        x=real-w.real;
        y=immag-w.immag;
        Complex z=new Complex(x,y);
        return z;
    }

    Complex mul(Complex w){
        float x,y;
        x=real*w.real-immag*w.immag;
        y=real*w.immag+immag*w.real;
        Complex z=new Complex(x,y);
        return z;
    }

    Complex div(Complex w){
        float x,y,denom;
        denom=w.real*w.real+w.immag*w.immag;
        x=(real*w.real+immag*w.immag)/denom;
        y=(immag*w.real-real*w.immag)/denom;
        Complex z=new Complex(x,y);
        return z;
    }
}
