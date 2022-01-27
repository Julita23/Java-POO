/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class CuentaBancaria {
    
    private int NumDeCuenta;
    private String DNI;
    private Double SaldoActual;
    private Double Interes;
    
    public CuentaBancaria(){}
    
    public CuentaBancaria(int NumDeCuenta, String DNI, Double SaldoActual, Double Interes){
        
        this.NumDeCuenta=NumDeCuenta;
        this.DNI=DNI;
        this.SaldoActual=SaldoActual;
        this.Interes=Interes;
    }
    public void setNumDeCuenta (int NumDeCuenta){
        
        this.NumDeCuenta=NumDeCuenta;
    }
    
    public int getNumDeCuenta(){
        return NumDeCuenta;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(Double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public Double getInteres() {
        return Interes;
    }

    public void setInteres(Double Interes) {
        this.Interes = Interes;
    }
    
    public void crearCuenta(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Bienvenido!");
        System.out.println("");
        System.out.println("Por favor, ingrese su numero de cuenta: ");
        NumDeCuenta= leer.nextInt();
        System.out.println("Ingrese su DNI: ");
        DNI= leer.next();
        System.out.println("Ingrese su saldo actual: ");
        SaldoActual= leer.nextDouble();
        System.out.println("Ingrese el interes: ");
        Interes= leer.nextDouble();
    }
    
    public void Ingreso(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor, digite el saldo a ingresar: ");
        Double ingreso= leer.nextDouble();
        
        SaldoActual=SaldoActual+ingreso;
    }
    
    public void Retiro(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Double retiro;
     
        do{
        System.out.println("Por favor, ingrese la cantidad de dinero a retirar: ");
        retiro = leer.nextDouble();
       
        if (retiro>SaldoActual){
           
            System.out.println("El valor del retiro supera a su saldo actual, intente nuevamente, su saldo actual es igual a 0");
        }else{
            SaldoActual=SaldoActual-retiro;
        }
        }while(retiro>SaldoActual);
    }
    
    public void ExtraccionRapida(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double retiroRapido;
        
        do{
        System.out.println("Ingrese valor a retirar, menor al 20%: ");
        retiroRapido= leer.nextDouble();
        
        if(retiroRapido>SaldoActual*0.2){
            System.out.println("El monto ingresado excede lo permitido, intente nuevamente.");
        }else{
            SaldoActual=SaldoActual-retiroRapido;
        }
        }while(retiroRapido>SaldoActual*0.2);
        
    }
    
    public void ConsultarSaldo(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean ConsultaSaldo;
        
       
        System.out.println("Desea conocer su saldo actual? ");
        ConsultaSaldo= leer.nextBoolean();
        
        if(ConsultaSaldo==true){
           
            System.out.println("Su saldo actual es igual a: "+SaldoActual);
            
        }else{
            System.out.println("Usted ha finalizado ");
        }  
    }
    
    public void MostrarDatos(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean MostrarDatos;
        System.out.println("Desea conocer sus datos?");
        MostrarDatos= leer.nextBoolean();
        
        if(MostrarDatos==true){
        System.out.println("Su numero de cuenta es: "+NumDeCuenta);
        System.out.println("Su DNI es: "+DNI);
        System.out.println("Su saldo actual es: "+SaldoActual);
        System.out.println("Su Interes es de: "+Interes);
        }
        else{
            System.out.println("Usted ha finalizado");
        }
    }
}
