
package Classes;

public class Candidato extends Pessoas{

  
    String partido_candidato;
    String cargo_candidato;
    Pessoas pessoas;
    Partido partido;
    Cargo cargo;        


    public String getPartido_candidato() {
        return partido_candidato;
    }

    public void setPartido_candidato(String partido_candidato) {
        this.partido_candidato = partido_candidato;
    }

    public String getCargo_candidato() {
        return cargo_candidato;
    }

    public void setCargo_candidato(String cargo_candidato) {
        this.cargo_candidato = cargo_candidato;
    }

    public Pessoas getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoas pessoas) {
        this.pessoas = pessoas;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    
    
}
