public class App {
    public static void main(String[] args) {
       /*  Caja<String> cajaString = new Caja<>();
        cajaString.guardar("Hola Mundo");
        System.out.println("Valor de la caja String " + cajaString.obtener());

        Caja<Integer> cajaInteger = new Caja<>();
        cajaInteger.guardar(123);
        System.out.println("Valor de la caja Integer " + cajaInteger.obtener());

        Caja<Double> cajaDouble = new Caja<>();
        cajaDouble.guardar(123.45);
        System.out.println("Valor de la caja Double " + cajaDouble.obtener());

        Par<String, Integer> par1 = new Par<>();
        par1.establecerClave("Uno");
        par1.establecerValor(1);
        System.out.println("Clave: " + par1.obtenerClave() + ", Valor: " + par1.obtenerValor());

        Par<Integer, String> par2 = new Par<>();
        par2.establecerClave(10000);
        par2.establecerValor("Valor nuevo");
        System.out.println("Clave: " + par2.obtenerClave() + ", Valor: " + par2.obtenerValor());*/
  
                Persona[] personas = {
                    new Persona("Juan", 30),
                    new Persona("Ana", 20),
                    new Persona("Pedro", 40),
                    new Persona("Lucia", 25),
                    new Persona("Carlos", 35),
                    new Persona("Maria", 15),
                    new Persona("Sofia", 10),
                    new Persona("Luis", 45),
                    new Persona("Elena", 5),
                    new Persona("Pablo", 50)
                };
        
                int personasMayores = 0;
                int personasMenores = 0;
        
                for (Persona p : personas) {
                    if (p.getEdad() >= 18) {
                        personasMayores++;
                    } else {
                        personasMenores++;
                    }
                }
        
                Par<Integer, String>[] mayores = new Par[personasMayores];
                Par<String, Integer>[] menores = new Par[personasMenores];
        
                int iMayor = 0;
                int iMenor = 0;
        
                for (Persona p : personas) {
                    if (p.getEdad() >= 18) {
                        mayores[iMayor] = new Par<>();
                        mayores[iMayor].establecerClave(p.getEdad());
                        mayores[iMayor].establecerValor(p.getNombre());
                        iMayor++;
                    } else {
                        menores[iMenor] = new Par<>();
                        menores[iMenor].establecerClave(p.getNombre());
                        menores[iMenor].establecerValor(p.getEdad());
                        iMenor++;
                    }
                }
        
                System.out.println("Menores de edad");
                for (Par<String, Integer> par : menores) {
                    System.out.println(par.obtenerValor() + " - " + par.obtenerClave());
                }
        
                System.out.println("Mayores de edad");
                for (Par<Integer, String> par : mayores) {
                    System.out.println(par.obtenerValor() + " - " + par.obtenerClave());
                }
            }
        }
        


