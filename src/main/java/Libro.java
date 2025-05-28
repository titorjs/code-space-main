public class Libro {
    private boolean disponible = true;

    public Libro() {
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        if (!disponible) throw new IllegalStateException("Libro no disponible");
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }
}