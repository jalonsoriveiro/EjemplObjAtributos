package exobxatributos;

/**
 *
 * @author jalonsoriveiro
 */
public class Alumno {

    private String nome;
    private int nota;
    private Direccion dire = new Direccion();
public Alumno(){


}    
public Alumno(String nome,int not,Direccion di){

    this.nome = nome;
    nota = not;
    dire = di;
}    

public void setNome(String nome){

  this.nome = nome;

}
public String getNome(){

    return this.nome;
}
public void setNota(int nota){

    this.nota = nota;
}
public int getNota(){

    return nota;
}
public Direccion getDire(){

    return dire;
}
public void setDire(Direccion dire){

   this.dire = dire;
}
public void amosar(){

      
System.out.print("nombre:"+nome+"\n Nota: "+nota+"\n Direccion "+dire.getEmail()+"\n Telefono "+dire.getTelefono());
}
}
