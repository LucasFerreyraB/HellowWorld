    public class Persona {

        public int Edad;
        public String Nombre;
        public double Telefono;

        public Persona(){
            this.Edad= Edad;
            this.Nombre= Nombre;
            this.Telefono = Telefono;
        }

        public int getEdad() {
            return Edad;
        }

        public void setEdad(int edad) {
            Edad = edad;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }

        public double getTelefono() {
            return Telefono;
        }

        public void setTelefono(double telefono) {
            Telefono = telefono;
        }
    }

    public class Cliente extends Persona{
        double Credito;
    this.Credito = Credito;
        public Cliente() {
            super(Edad, Nombre, Telefono);
        }

        Cliente Cliente1 = new Cliente();



    }
}


}
