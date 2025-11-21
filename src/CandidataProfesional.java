public class CandidataProfesional extends Candidata{
    private String profesion;
    private int añosExperiencia;
    public CandidataProfesional(int id, String nombre,int edad, String distrito, double puntajeJurado,String profesion,int añosExperiencia) throws DatoInvalidoException{
        super(id, nombre, edad, distrito, puntajeJurado);
        setProfesion(profesion);
        setAñosExperiencia(añosExperiencia);
    }

    public void setProfesion(String profesion) throws DatoInvalidoException{
        if (profesion == null || profesion.trim().isEmpty()){
            throw new DatoInvalidoException("No se permiten profesiones vacias");
        }
        this.profesion = profesion;
    }

    public void setAñosExperiencia(int añosExperiencia) throws DatoInvalidoException {
        if (añosExperiencia <= 0){
            throw new DatoInvalidoException("No se permiten valores negativos");
        }
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("[--Candidata Profesional--]");
        System.out.println("ID: "+ id + " - Nombre: " + nombre + " - Edad: "+ edad + " - Distrito: "+ distrito + " - PuntajeJurado: "+ puntajeJurado + "- Profesion: "+ profesion + " - Experiencia: "+ añosExperiencia);

    }
}