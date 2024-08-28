
package clases;
public class Rectangulo {
    private int  base ;
    private int altura;
    //constructor para  inicializar  la base y la altura
    
    public Rectangulo(int b, int a){
        base = b;
        altura = a;
    }
    public void setbase(int b){
        base = b;
    }
public int getbase(){
    return base;
}    
public void setaltura(int a){
altura=a;
}
public int getaltura(){
return altura;


}
public int area(){
return base* altura;
        
}
public int perimetro (){
    return base* 2+altura*2;
}
}
