/**
 * Classe que representa um carro.
 */
package br.com.lucas;

public class Carro {
    /**
     * Marca do carro.
     */
    private String marca;

    /**
     * Modelo do carro.
     */
    private String modelo;

    /**
     * Ano de fabricação do carro.
     */
    private int ano;

    /**
     * Preço do carro.
     */
    private double preco;

    /**
     * Lista de acessórios do carro.
     */
    private String[] acessorios;

    /**
     * Velocidade atual do carro.
     */
    private double velocidade;

    /**
     * Estado de ligado/desligado do carro.
     */
    private boolean ligado;

    /**
     * Obtém a marca do carro.
     * @return A marca do carro.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define a marca do carro.
     * @param marca A nova marca do carro.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtém o modelo do carro.
     * @return O modelo do carro.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define o modelo do carro.
     * @param modelo O novo modelo do carro.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtém o ano de fabricação do carro.
     * @return O ano de fabricação do carro.
     */
    public int getAno() {
        return ano;
    }

    /**
     * Define o ano de fabricação do carro.
     * @param ano O novo ano de fabricação do carro.
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Obtém o preço do carro.
     * @return O preço do carro.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do carro.
     * @param preco O novo preço do carro.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Obtém a lista de acessórios do carro.
     * @return A lista de acessórios do carro.
     */
    public String[] getAcessorios() {
        return acessorios;
    }

    /**
     * Define a lista de acessórios do carro.
     * @param acessorios A nova lista de acessórios do carro.
     */
    public void setAcessorios(String[] acessorios) {
        this.acessorios = acessorios;
    }

    /**
     * Obtém a velocidade atual do carro.
     * @return A velocidade atual do carro.
     */
    public double getVelocidade() {
        return velocidade;
    }

    /**
     * Define a velocidade do carro.
     * @param velocidade A nova velocidade do carro.
     */
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * Verifica se o carro está ligado.
     * @return true se o carro estiver ligado, false caso contrário.
     */
    public boolean isLigado() {
        return ligado;
    }

    /**
     * Define se o carro está ligado.
     * @param ligado O novo valor de ligado.
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    /**
     * Liga o carro.
     */
    public void ligar() {
        setLigado(true);
    }

    /**
     * Desliga o carro.
     */
    public void desligar() {
        setLigado(false);
    }

    /**
     * Acelera o carro aumentando a velocidade em 10 unidades.
     */
    public void acelerar() {
        setVelocidade(getVelocidade() + 10);
        System.out.println("Carro acelerado! Velocidade atual: " + getVelocidade());
    }

    /**
     * Reduz a velocidade do carro em 10 unidades.
     */
    public void reduzir() {
        setVelocidade(getVelocidade() - 10);
        System.out.println("Velocidade reduzida! Velocidade atual: " + getVelocidade());
    }

    /**
     * Para o carro, zerando a velocidade.
     */
    public void parar() {
        setVelocidade(0);
        System.out.println("Carro parado!");
    }
}
