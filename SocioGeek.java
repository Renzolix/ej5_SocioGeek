public class SocioGeek {
    private int numeroSocio;
    private String nombre;
    private int puntosFidelidad;

    public SocioGeek(int numeroSocio, String nombre, int puntosFidelidad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        if (puntosFidelidad >= 0) {
            this.puntosFidelidad = puntosFidelidad;
        } else {
            this.puntosFidelidad = 0;
            System.out.println("Atención: Puntos iniciales inválidos. Se asignó 0.");
        }
    }

    // Getters
    public int getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosFidelidad() {
        return puntosFidelidad;
    }

    // Setter defensivo para puntosFidelidad
    public void setPuntosFidelidad(int puntosFidelidad) {
        if (puntosFidelidad >= 0) {
            this.puntosFidelidad = puntosFidelidad;
            System.out.println("Puntos de fidelidad actualizados a: " + this.puntosFidelidad);
        } else {
            System.out.println("Error: No se pueden asignar puntos de fidelidad negativos (" + puntosFidelidad + "). Operación rechazada.");
        }
    }

    public static void main(String[] args) {
        SocioGeek socio = new SocioGeek(101, "Renzo Gonzalez", 150);

        System.out.println("Socio: " + socio.getNombre() + " | Puntos actuales: " + socio.getPuntosFidelidad());

        System.out.println("\nIntentando asignar puntaje válido (300)...");
        socio.setPuntosFidelidad(300);

        System.out.println("\nIntentando asignar puntaje negativo (-50)...");
        socio.setPuntosFidelidad(-50);

        System.out.println("\nPuntos finales comprobados: " + socio.getPuntosFidelidad());
    }
}