package paquete3;

public class EstudiantePresencial extends Estudiante {

    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;

    public EstudiantePresencial(String n, String ap, String iden, int e) {
        // public Estudiante(String n, String a, String iden, int ed){
        super(n, ap, iden, e); // cumplir con el constructor de la superClase
    }

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }

    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor) {
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial() {
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito() {
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial() {
        return matriculaPresencial;
    }

    /*
    
    @Override
    public String toString(){
    String cadena =String.format("%s\nNumero de creditos: %d \n"
            + "Costo por credito: %.2f\n"
            + "valor matricula Presencial:%.2f\n",
            super.toString(),
            numeroCreditos,
            costoCredito,
            obtenerMatriculaPresencial());
    return cadena;
    }
     */
    @Override
    public String toString() {
        String cadena = String.format("Apellido:%s\n"
                + "Identificacion: %s \n"
                + "Valor matricula presencial:%.2f\n",
                obtenerApellidoEstudiante(),
                obtenerIdentificacionEstudiante(),
                obtenerMatriculaPresencial());
        return cadena;
    }
}
