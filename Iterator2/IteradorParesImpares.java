public class IteradorParesImpares {
    private int[] _vector;
    private int _posicion;

    public IteradorVector(VectorDatos vector) {
        _vector = vector._datos;
        _posicion = 0;
    } 

 public void filtrarPares()
     {
          for(int i=0;i<5;i++)
          {
                if(getValor(i) / 2 ==0)
                   {
                               imprimirPosicion(i);
                   }
           }             
     }

 public void filtrarImpares()
     {
          for(int i=0;i<5;i++)
          {
                if(getValor(i) / 2 !=0)
                   {
                               imprimirPosicion(i);
                   }
           }             
     }

  public void imprimirPosicion(int pos)
   {
            System.out.printf("Valor : "+getValor(pos) .toString());
    }


    public boolean hasNext(){
        if (_posicion < _vector.length) 
                    return true;
            else
                    return false;
    } 
    public Object next(){
            int valor = _vector[_posicion];
            _posicion++;
            return valor;
    }    
 public int getValor(int pos){
        return datos[pos];
    }
    public void setValor(int pos, int valor){
        datos[pos] = valor;
    } 
}
