package Modelos;

public class ContaBancaria {
    private Integer numero;
    private String proprietario;
    private Double balanco;
    private Double limiteSaque;

    public ContaBancaria(Integer numero, String proprietario, Double balanco, Double limiteSaque) {
        this.numero = numero;
        this.proprietario = proprietario;
        this.balanco = balanco;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Double getBalanco() {
        return balanco;
    }

    public void setBalanco(Double balanco) {
        this.balanco = balanco;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(Double quantidade){
        balanco += quantidade;
    }

    public void saque (Double quantidade){
        validarSaque(quantidade);
        balanco -= quantidade;
    }

    private void validarSaque(Double quantidade){
        if(quantidade> getLimiteSaque()){
            throw new Excecoes("Erro de saque! Quantia excede o limite de saque");
        }
        if(quantidade>getBalanco()){
            throw new Excecoes("Erro de saque: saldo insuficiente!");
        }
    }
}
