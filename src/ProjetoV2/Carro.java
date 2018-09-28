package ProjetoV2;
//package solucaocorrida;

import java.util.ArrayList;

public class Carro {

    private String marca;
    private String modelo;
    private String matricula;
    private String condutor;
    private int id;
    private double velocidadeMaxima = 100;
    private double aceleracaoAtual = 0.01;
    private double velocidadeAtual = 0;
    private double capacidadeTanque = 50;
    private double combustivelDisponivel = 50;
    private double porcentagemAtivarReserva = 0.05;
    private double consumoVelocidadeMaximo = 10;
    private double consumoMinimo = 0.1;
    private double distanciaPercorrida = 0;
    private double tempoAcumulado = 0;  
    private ArrayList ListaCarros;

    public Carro() {
        ListaCarros = new ArrayList();
    }

//Metodo para adicionar carros
    public void guardaCarros(String marca, String modelo, String matricula, String condutor) {
        ListaCarros.add(new Carro(marca, modelo, matricula, condutor));
    }

//Construtor Carro
    public Carro(String marca, String modelo, String matricula, String condutor) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.condutor = condutor;
    }

//Gets e sets
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCondutor() {
        return condutor;
    }

    public void setCondutor(String condutor) {
        this.condutor = condutor;
    }

    public double getAceleracaoAtual() {
        return aceleracaoAtual;
    }

    public void setAceleracaoAtual(double aceleracaoAtual) {
        this.aceleracaoAtual = aceleracaoAtual;
    }

    public double getConsumoVelocidadeMaximo() {
        return consumoVelocidadeMaximo;
    }

    public void setConsumoVelocidadeMaximo(double consumoVelocidadeMaximo) {
        this.consumoVelocidadeMaximo = consumoVelocidadeMaximo;
    }

    public double getTempoAcumulado() {
        return tempoAcumulado;
    }

    public void setTempoAcumulado(double tempoAcumulado) {
        this.tempoAcumulado = tempoAcumulado;
    }

    public ArrayList getListaCarros() {
        return ListaCarros;
    }

    public void setListaCarros(ArrayList ListaCarros) {
        this.ListaCarros = ListaCarros;
    }

//    Verifica se o combustivel disponivel está na reserva
    public Carro(int i) {
        id = i;
    }

    public boolean isTanqueReserva() {
        return combustivelDisponivel < capacidadeTanque * porcentagemAtivarReserva;
    }


//    Abastece o carro com a capacidade maxima do tanque
    public void abastecerCarro() {
        combustivelDisponivel = capacidadeTanque;
    }


//    A aceleracao atual sera um valor entre 0.01 e 1.0
    public void acelerar(double fator) {
        aceleracaoAtual = fator;

        if (aceleracaoAtual > 1) {
            aceleracaoAtual = 1;
        } else if (aceleracaoAtual < 0.1) {
            aceleracaoAtual = 0.01; //Marcha lenta
        }

        calculaVelocidadeAtual();
    }

    public void travar(int fator) {
        acelerar(fator);
    }

    private void calculaVelocidadeAtual() {
        velocidadeAtual = velocidadeMaxima * aceleracaoAtual;
    }

    public boolean moverNoTempoEmHoras(double tempoEmHoras) {

        if (temAutonomiaEmHoras(tempoEmHoras)) {
            //Calcula a distância percorrida no tempo
            double distancia = velocidadeAtual * tempoEmHoras;

            //Acumula tempo e distancia
            distanciaPercorrida += distancia;
            tempoAcumulado += tempoEmHoras;

            consumirCombustivel(distancia);
            return true;
        } else {
            return false;
        }
    }

    public double calculaConsumoInstantaneo() {

        if (velocidadeAtual < 5) {
            return consumoVelocidadeMaximo * 3;
        } else {
            double dif = consumoVelocidadeMaximo - ((velocidadeAtual * consumoVelocidadeMaximo) / velocidadeMaxima);
            return consumoVelocidadeMaximo + dif;
        }
    }

    private void consumirCombustivel(double distanciaEmKM) {
        combustivelDisponivel -= (calculaConsumoInstantaneo() / distanciaEmKM);
    }

    public double calculaAutonomiaEmKM() {
        return combustivelDisponivel * calculaConsumoInstantaneo();
    }

    public boolean temAutonomiaEmKM(double distancia) {
        return calculaAutonomiaEmKM() < distancia;
    }

    public double calculaAutonimiaEmHoras() {
        return (combustivelDisponivel * calculaConsumoInstantaneo()) / velocidadeAtual;
    }

    public boolean temAutonomiaEmHoras(double horas) {
        return calculaAutonimiaEmHoras() >= horas;
    }

    public boolean moverNaDistanciaemKM(double distancia) {
        if (temAutonomiaEmKM(distancia)) {
            double tempoEmHoras = distancia / velocidadeAtual;

            //Acumula tempo e distancia
            distanciaPercorrida += distancia;
            tempoAcumulado += tempoEmHoras;

            consumirCombustivel(distancia);
            return true;
        } else {
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getCombustivelDisponivel() {
        return combustivelDisponivel;
    }

    public double getPorcentagemAtivarReserva() {
        return porcentagemAtivarReserva;
    }

    public void setPorcentagemAtivarReserva(double porcentagemAtivarReserva) {
        this.porcentagemAtivarReserva = porcentagemAtivarReserva;
    }

    public double getConsumoMaximo() {
        return consumoVelocidadeMaximo;
    }

    public void setConsumoMaximo(double consumoMaximo) {
        this.consumoVelocidadeMaximo = consumoMaximo;
    }

    public double getConsumoMinimo() {
        return consumoMinimo;
    }

    public void setConsumoMinimo(double consumoMinimo) {
        this.consumoMinimo = consumoMinimo;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getTempo() {
        return tempoAcumulado;
    }

    public void setTempo(double tempo) {
        this.tempoAcumulado = tempo;
    }

    public void addTempo(double tempo) {
        this.tempoAcumulado += tempo;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", "
                + "Marca=" + marca + ","
                + " Modelo=" + modelo + ","
                + " Condutor=" + condutor + ","
                + " capacidadeTanque=" + capacidadeTanque + ", "
                + "combustivelDisponivel=" + combustivelDisponivel + ","
                + " distanciaPercorrida=" + distanciaPercorrida + ","
                + " tempoAcumulado=" + tempoAcumulado + '}';
    }

}
