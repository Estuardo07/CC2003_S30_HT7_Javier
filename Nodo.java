//Javier Hernández 19202

//Clase Nodo
public class Nodo{

	private int valor;
	//variable para asignar valor al elemento

	private Nodo siguiente;
	//variable para enlazar los elementos de la lista

	//Constructor donde se inicializan las variables
	public void Nodo(){
		this.valor = 0;
        this.siguiente = null;
	}

	public int getValor(){
		return valor;
	}

	public void setValor(int valor){
		this.valor = valor;
	}

	public Nodo getSiguiente(){
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente){
		this.siguiente = siguiente;
	}
}
