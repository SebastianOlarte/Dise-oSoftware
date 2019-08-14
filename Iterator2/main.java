public static void main(String[] args) {
 

        
        VectorDatos vector = new VectorDatos();

        //Creación del iterador
        IteradorParesImpares iterador = vector.iterador();

        //Recorrido con el iterador
        while (iterador.hasNext())
        System.out.println(iterador.next()); 

       // filtrar pares e impares
          iterador.filtrarPares();
          iterador.filtrarImpares()
 } 
