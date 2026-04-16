public class Module {
    private String code;
    private String nomModule;
    private int credit;
    private String professeur;

    public Module(String code, String nomModule, int credit, String professeur) {
        this.code = code;
        this.nomModule = nomModule;
        this.credit = credit;
        this.professeur = professeur;
    }

    public String getCode() {
        return code;
    }

    public String getNomModule() {
        return nomModule;
    }

    public int getCredit() {
        return credit;
    }

    public String getProfesseur() {
        return professeur;
    }
}