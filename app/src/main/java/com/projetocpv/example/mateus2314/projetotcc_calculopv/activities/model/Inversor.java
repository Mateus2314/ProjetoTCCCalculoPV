package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.model;

public class Inversor {

    private long id;
    private String Modelo_Inv;
    private String Potencia_Nominal_Inv;
    private String TensaoVmppMax;
    private String TensaoVmppMin;
    private String Coefi_MPPT;
    private String Corrente_MaxEntrada;
    private String Eficiencia_med_Inv;
    private String Potencia_Max_CC_Entrada;
    private String String_entrada;
    private String Tensao_max_AC_saida;
    private String Tensao_Fase_Neutro;

    public Inversor(){

    }

    public Inversor(String modelo_Inv, String potencia_Nominal_Inv, String tensaoVmppMax,
                    String tensaoVmppMin, String coefi_MPPT, String corrente_MaxEntrada,
                    String eficiencia_med_Inv, String potencia_Max_CC_Entrada, String string_entrada,
                    String tensao_Fase_Neutro, String tensao_max_AC_saida){
        super();
        this.Modelo_Inv = modelo_Inv;
        this.Potencia_Nominal_Inv = potencia_Nominal_Inv;
        this.TensaoVmppMax = tensaoVmppMax;
        this.TensaoVmppMin = tensaoVmppMin;
        this.Coefi_MPPT = coefi_MPPT;
        this.Corrente_MaxEntrada = corrente_MaxEntrada;
        this.Eficiencia_med_Inv = eficiencia_med_Inv;
        this.Potencia_Max_CC_Entrada = potencia_Max_CC_Entrada;
        this.String_entrada = string_entrada;
        this.Tensao_Fase_Neutro = tensao_Fase_Neutro;
        this.Tensao_max_AC_saida = tensao_max_AC_saida;
    }
    public long getId(){ return id;}

    public void setId(long id){this.id = id;}

    // Modelo do inversor

    public String getModelo_Inv() { return Modelo_Inv; }

    public void setModelo_Inv(String modelo_Inv) { this.Modelo_Inv = modelo_Inv;}

    //Potencia nominal

    public String getPotencia_Nominal_Inv() { return Potencia_Nominal_Inv; }

    public void setPotencia_Nominal_Inv(String potencia_Nominal_Inv) { this.Potencia_Nominal_Inv = potencia_Nominal_Inv; }

    // Tensao VmppMax

    public String getTensaoVmppMax() { return TensaoVmppMax; }

    public void setTensaoVmppMax(String tensaoVmppMax) { this.TensaoVmppMax = tensaoVmppMax; }

    // Tensao VmppMin

    public String getTensaoVmppMin() { return TensaoVmppMin; }

    public void setTensaoVmppMin(String tensaoVmppMin) { this.TensaoVmppMin = tensaoVmppMin; }

    // Tensao Coeficiente MPPT

    public String getCoefi_MPPT() { return Coefi_MPPT; }

    public void setCoefi_MPPT(String coefi_MPPT) { this.Coefi_MPPT = coefi_MPPT; }

    // Corrente maxima de entrada

    public String getCorrente_MaxEntrada() { return Corrente_MaxEntrada; }

    public void setCorrente_MaxEntrada(String corrente_MaxEntrada) { this.Corrente_MaxEntrada = corrente_MaxEntrada; }

    // Eficiencia media do invesor

    public String getEficiencia_med_Inv() { return Eficiencia_med_Inv; }

    public void setEficiencia_med_Inv(String eficiencia_med_Inv) { this.Eficiencia_med_Inv = eficiencia_med_Inv; }

    // Pontecia maxima de corrente de CC de entrada

    public String getPotencia_Max_CC_Entrada() { return Potencia_Max_CC_Entrada; }

    public void setPotencia_Max_CC_Entrada(String potencia_Max_CC_Entrada) { this.Potencia_Max_CC_Entrada = potencia_Max_CC_Entrada; }

    //Quantidade de strings e entradas

    public String getString_entrada() { return String_entrada; }

    public void setString_entrada(String string_entrada) { this.String_entrada = string_entrada; }

    //tensao fase neutro

    public String getTensao_Fase_Neutro() { return Tensao_Fase_Neutro; }

    public void setTensao_Fase_Neutro(String tensao_Fase_Neutro) { this.Tensao_Fase_Neutro = tensao_Fase_Neutro; }

    //tensao AC maxima de saida

    public String getTensao_max_AC_saida() { return Tensao_max_AC_saida; }

    public void setTensao_max_AC_saida(String tensao_max_AC_saida) { this.Tensao_max_AC_saida = tensao_max_AC_saida; }


    @Override
    public String toString() {
        return "Inversor{" +
                "id=" + id +
                ", modeloInv='" + Modelo_Inv +'\'' +
                ", potencianominal='" + Potencia_Nominal_Inv + '\'' +
                ", tensaoVmppMax='" + TensaoVmppMax + '\'' +
                ", tensaoVmppMin='" + TensaoVmppMin + '\'' +
                ", coeficienteMppt='" + Coefi_MPPT + '\'' +
                ", correntemaxEntrada='" + Corrente_MaxEntrada + '\'' +
                ", eficienciamedInv='" + Eficiencia_med_Inv + '\'' +
                ", potenciamaxccntrada='" + Potencia_Max_CC_Entrada + '\'' +
                ", quantidadestringentrada='" + String_entrada + '\'' +
                ", tensaoFaseNeutro='" + Tensao_Fase_Neutro + '\'' +
                ", tensaomaxACsaida='" + Tensao_max_AC_saida + '\'' +
                '}';

    }

}




