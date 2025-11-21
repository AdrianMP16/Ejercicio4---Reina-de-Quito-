public abstract class Candidata {
    protected int id;
    protected String nombre;
    protected int edad;
    protected String distrito;
    protected double puntajeJurado;

    public Candidata(int id, String nombre,int edad, String distrito, double puntajeJurado) throws DatoInvalidoException {
        setId(id);
        setNombre(nombre);
        setEdad(edad);
        setDistrito(distrito);
        setPuntajeJurado(puntajeJurado);
    }

    public void setId(int id) throws DatoInvalidoException{
        if (id <=0){
            throw new DatoInvalidoException("Solo se aceptan valores positivos");
        }
        this.id = id;
    }

    public void setNombre(String nombre) throws DatoInvalidoException{
        if (nombre == null || nombre.trim().isEmpty()){
            throw new DatoInvalidoException("No se permiten nombres vacios.");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws DatoInvalidoException{
        if (edad<=16){
            throw new DatoInvalidoException("Solo candidatos mayores a 16 años");
        }
        this.edad = edad;
    }

    public void setDistrito(String distrito) throws DatoInvalidoException {
        if (distrito == null || distrito.trim().isEmpty()){
            throw new DatoInvalidoException("No se permiten Distritos vacios");
        }
        this.distrito = distrito;
    }

    public void setPuntajeJurado(double puntajeJurado)throws DatoInvalidoException {
        if (puntajeJurado<=0 && puntajeJurado>100){
            throw new DatoInvalidoException("El puntaje esta fuera de rango");
        }
        this.puntajeJurado = puntajeJurado;
    }

    public abstract void mostrarDetalles();
}