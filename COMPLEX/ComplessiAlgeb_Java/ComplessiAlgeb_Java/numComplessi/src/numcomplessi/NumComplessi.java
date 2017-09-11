package numcomplessi;

import java.io.*;

public class NumComplessi {
    public static void main(String[] args) throws IOException{
        char operando,operazione;
        float real,immag;
        char scelta='O';
        Complex z3=new Complex();
        InputStreamReader tasto=new InputStreamReader(System.in);
        BufferedReader tastiera=new BufferedReader(tasto);
        while(scelta!='U'){
            System.out.print("\n\n\n\n\n");
            System.out.print("\t\t****CALCOLATRICE PER NUMERI COMPLESSI****");
            System.out.print("\n\nInserisci la parte reale di z1: ");
            real=Float.parseFloat(tastiera.readLine().trim());
            System.out.print("\n\nInserisci la parte immaginaria di z1: ");
            immag=Float.parseFloat(tastiera.readLine().trim());
            Complex z1=new Complex(real,immag);
            System.out.print("\n\nInserisci la parte reale di z2: ");
            real=Float.parseFloat(tastiera.readLine().trim());
            System.out.print("\n\nInserisci la parte immaginaria di z2: ");
            immag=Float.parseFloat(tastiera.readLine().trim());
            Complex z2=new Complex(real,immag);
            scelta='O';
            while(scelta=='O'){
                System.out.print("\n\n\n\n\n");
                System.out.print("\t\t****CALCOLATRICE PER NUMERI COMPLESSI****");
                System.out.println("\n\nScegli il primo operando. Premi:\n1 - z1="+z1.getReal()+"i*"+z1.getImmag());
                System.out.print("2 - z2="+z2.getReal()+"i*"+z2.getImmag()+"\n\nScelta: ");
                do{
                  operando=(char)tasto.read();
                  if(operando!='1'&&operando!='2'){
                      System.out.print("\nScelta non valida. Scelta: ");
                  }
                }while(operando!='1'&&operando!='2');
                System.out.print("\n\n\n\n\n");
                System.out.print("\t\t****CALCOLATRICE PER NUMERI COMPLESSI****");
                System.out.print("\n\nScegli l'operazione da effettuare. Premi:\n");
                System.out.print("+ per effettuare l'addizione z1+z2\n- per effettuare la sottrazione z1-z2");
                System.out.print("\n* per effettuare la moltiplicazione z1*z2\n/ per effettuare la divisione z1/z2");
                System.out.print("\n\nScelta: ");
                do{
                    operazione=(char)tasto.read();
                    if(operazione!='+'&&operazione!='-'&&operazione!='*'&&operazione!='/'){
                        System.out.print("\nScelta non valida. Scelta: ");
                    }
                }while(operazione!='+'&&operazione!='-'&&operazione!='*'&&operazione!='/');
                switch(operando){
                    case '1':switch(operazione){
                                 case '+':z3=z1.add(z2);
                                          break;
                                 case '-':z3=z1.sub(z2);
                                          break;
                                 case '*':z3=z1.mul(z2);
                                          break;
                                 case '/':z3=z1.div(z2);
                             }
                             System.out.print("\n\n\n\n\n");
                             System.out.print("\t\t****CALCOLATRICE PER NUMERI COMPLESSI****");
                             if(operazione=='/'&&z2.getReal()==0&&z2.getImmag()==0){
                                 System.out.print("\n\n\t\t\tOPERAZIONE IMPOSSIBILE");
                             }
                             else{
                                 System.out.print("\n\n\t\t\tz1"+operazione+"z2 = "+z3.getReal()+"i*"+z3.getImmag());
                             }
                             break;
                    case '2':switch(operazione){
                                 case '+':z3=z2.add(z1);
                                          break;
                                 case '-':z3=z2.sub(z1);
                                          break;
                                 case '*':z3=z2.mul(z1);
                                          break;
                                 case '/':z3=z2.div(z1);
                             }
                             System.out.print("\n\n\n\n\n");
                             System.out.print("\t\t****CALCOLATRICE PER NUMERI COMPLESSI****");
                             if(operazione=='/'&&z1.getReal()==0&&z1.getImmag()==0){
                                 System.out.print("\n\n\t\t\tOPERAZIONE IMPOSSIBILE");
                             }
                             else{
                                 System.out.print("\n\n\t\t\tz2"+operazione+"z1 = "+z3.getReal()+"i*"+z3.getImmag());
                             }
                }
                System.out.print("\n\nPremi U per uscire dal programma.");
                System.out.print("\nPremi I per inserire due nuovi numeri complessi.");
                System.out.print("\nPremi O pre effettuare un'altra operazione con gli stessi due numeri.\n\nScelta: ");
                do{
                    scelta=(char)tasto.read();
                    if(scelta!='O'&&scelta!='I'&&scelta!='U'){
                        System.out.print("\nScelta non valida. Scelta: ");
                    }
                }while(scelta!='O'&&scelta!='I'&&scelta!='U');
            }
        }
        System.out.print("\n\n");
    }
}
