package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador(){
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    @Override
    public int compareTo(Object otroFutbolista){
        if(otroFutbolista instanceof Futbolista){
            return getEdad() - ((Futbolista) otroFutbolista).getEdad();
        }

        return 0;
    }

    public boolean jugarConLasManos(){
        return false;
    }

    public String toString(){
        return ((Futbolista) this).toString() + " con el dorsal " + dorsal + ". Ha marcado" + golesMarcados;
    }
}