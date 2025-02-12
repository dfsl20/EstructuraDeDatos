public class BurbujaObjetos {

    public class Persona implements Comparable<Prsona>{
    
        private int edad;
        private String nombre;

        public Persona(int edad, String nombre){
            this.edad = edad;
            this.nombre = nombre;
        }

        public String getNombre(){
            return nombre;
        }

        public int getEdad(){
            return edad;
        }
//modificar para que compare nombre:
        @Override
        public int compareTo(Persona o){
            if(this.getEdad() < o.getEdad())
                return 1;
            else{
                if(this.getEdad()>o.getEdad()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
            //}
        }
    }

    public static void main(String[] args){
        
    }
    

    
}

//public BurbujaObjetos(){
    //Persona persona1= new Persona(edad:62, nombre:"Diego");
    //Persona persona2= new Persona(edad:63, nombre:"Maria");

    //cómo comparar los dos objetos usando comparator y comparable

        //crear arreglo desordenado de 10 objetos 
//}
