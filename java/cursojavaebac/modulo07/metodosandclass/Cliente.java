package cursojavaebac.modulo07.metodosandclass;

public class Cliente {

// Variaveis
    private int code;

    private String name;

    private String adress;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void cadastrarAdress (String adress) {
        this.adress = adress;
    }

    public void imprimirAdress () {
        System.out.println(this.adress);
    }

    public String returnNameCliente () {
        return "Endereço do João";
    }

    public int getFullValue () {
        return 20;
    }
}
