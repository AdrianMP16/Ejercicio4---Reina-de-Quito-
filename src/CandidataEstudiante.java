public class CandidataEstudiante extends Candidata{
    private String universidad;
    private String carrera;

    public CandidataEstudiante (int id, String nombre,int edad, String distrito, double puntajeJurado,String universidad,String carrera) throws DatoInvalidoException{
        super(id, nombre, edad, distrito, puntajeJurado);
        setUniversidad(universidad);
        setCarrera(carrera);
    }

    public void setCarrera(String carrera) throws DatoInvalidoException {
        if (carrera == null || carrera.trim().isEmpty()){
            throw new DatoInvalidoException("El dato no debe estar vacio");
        }
        this.carrera = carrera;
    }

    public void setUniversidad(String universidad) throws DatoInvalidoException{
        if (universidad == null || universidad.trim().isEmpty()){
            throw new DatoInvalidoException("El dato no dbe estar vacio");
        }
        this.universidad = universidad;
    }
    @Override
    public void mostrarDetalles(){
        System.out.println("[--Candidata Estudiante--]");
        System.out.println("ID: "+ id + " - Nombre: " + nombre + " - Edad: "+ edad + " - Distrito: "+ distrito + " - PuntajeJurado: "+ puntajeJurado+"- Universidad: "+universidad+"- Carrera: "+carrera);

    }
}
