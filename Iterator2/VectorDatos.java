public class VectorDatos {
    
    public int[] datos;
 
      int[] datos  = new int[5];
     public VectorDatos(){
           //llenamos el vector con los 5 datos
            datos[0] = 10;
            datos[1] = 3;
            datos[2] = 6;
            datos[3] = 5;
            datos[4] = 1;
      }
    
    public int getValor(int pos){ 
        return _datos[pos]; 
    } 
    public void setValor(int pos, int valor){ 
        _datos[pos] = valor; 
    } 
    public int dimension(){ 
        return _datos.length; 
    } 
//nuevo metodo que manda a llamar al iterador deseado
    public  IteradorParesImpares  iterador(){
        return new IteradorVector(this); 
    }
}
