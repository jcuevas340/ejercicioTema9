import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);

        Trabajador trabajador = new Trabajador();

        System.out.print("Ingresa el nombre del cliente: ");
        cliente.nombre = scanner.nextLine();
        cliente.setNombre(cliente.nombre);
        System.out.print("Ingresa la edad del cliente: ");
        cliente.edad = scanner.nextInt();
        cliente.setEdad(cliente.edad);
        scanner.nextLine();
        System.out.print("Ingresa el telefono del cliente: ");
        cliente.telefono = scanner.nextLine();
        cliente.setTelefono(cliente.telefono);
        System.out.print("Ingresa el credito del cliente: $");
        cliente.credito = scanner.nextDouble();
        scanner.nextLine();
        cliente.setCredito(cliente.credito);

        System.out.println();
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: $" + cliente.getCredito());

        System.out.print("Ingresa el nombre del trabajador: ");
        trabajador.nombre = scanner.nextLine();
        trabajador.setNombre(trabajador.nombre);
        System.out.print("Ingresa la edad del trabajador: ");
        trabajador.edad = scanner.nextInt();
        trabajador.setEdad(trabajador.edad);
        scanner.nextLine();
        System.out.print("Ingresa el telefono del trabajador: ");
        trabajador.telefono = scanner.nextLine();
        trabajador.setTelefono(trabajador.telefono);
        System.out.print("Ingresa el credito del trabajador: $");
        trabajador.salario = scanner.nextDouble();
        scanner.nextLine();
        trabajador.setSalario(trabajador.salario);

        System.out.println();
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: $" + trabajador.getSalario());
    }

    static class Persona{
        protected int edad;
        protected String nombre;
        protected String telefono;

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getNombre(){
            return nombre;
        }

        public void setTelefono(String telefono){
            this.telefono = telefono;
        }

        public String getTelefono(){
            return telefono;
        }

        public void setEdad(int edad){
            this.edad = edad;
        }

        public int getEdad(){
            return edad;
        }
    }

    static class Cliente extends Persona{
        private double credito;

        public void setCredito(double credito){
            this.credito = credito;
        }

        public double getCredito(){
            return credito;
        }
    }

    static class Trabajador extends Persona{
        private double salario;

        public void setSalario(double salario){
            this.salario = salario;
        }

        public double getSalario(){
            return salario;
        }
    }
}