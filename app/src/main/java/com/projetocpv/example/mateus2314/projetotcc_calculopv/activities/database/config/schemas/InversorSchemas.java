package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.schemas;

public class InversorSchemas {

    //Definecoes de tabela inversor

    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_Modelo_Inv = "Modelo_Inv";
    public static final String COLUMN_Potencia_Nom = "Potencia_Nominal";
    public static final String COLUMN_TensaoVmppMax = "TensaoVmppMax";
    public static final String COLUMN_TensaoVmppMin = "TensaoVmppMin";
    public static final String COLUMN_Coefi_MPPT = "Coefi_MPPT";
    public static final String COLUMN_Corrente_MaxEntrada = "Corrente_MaxEntrada";
    public static final String COLUMN_Eficiencia_media_Inv = "Eficiencia_med_Inv";
    public static final String COLUMN_Pot_Max_CC_Entrada = "Potencia_Max_CC_Entrada";
    public static final String COLUMN_String_entrada = "String_Entrada";
    public static final String COLUMN_Tensao_Max_Saida_AC = "Tensao_Max_Saida_AC";
    public static final String COLUMN_Tensao_Fase_Neutro = "Tensao_Fase_Neutro";
    public static final String TABLE_NAME = "inversores";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS "
            + TABLE_NAME + " ("
            + COLUMN_ID + " INTERGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_Modelo_Inv + " TEXT, "
            + COLUMN_Potencia_Nom + " TEXT, "
            + COLUMN_TensaoVmppMax + " TEXT, "
            + COLUMN_TensaoVmppMin + " TEXT, "
            + COLUMN_Coefi_MPPT + " TEXT, "
            + COLUMN_Corrente_MaxEntrada + " TEXT, "
            + COLUMN_Eficiencia_media_Inv + " TEXT, "
            + COLUMN_Pot_Max_CC_Entrada + " TEXT, "
            + COLUMN_String_entrada + " TEXT, "
            + COLUMN_Tensao_Max_Saida_AC + " TEXT, "
            + COLUMN_Tensao_Fase_Neutro + " TEXT, "
            + ")";
    // Lista com todas as colunas da tabela inversor
    public static String[] INVER_COLUMNS = new String[]{COLUMN_ID, COLUMN_Modelo_Inv, COLUMN_Potencia_Nom,
    COLUMN_TensaoVmppMax, COLUMN_TensaoVmppMin, COLUMN_Coefi_MPPT, COLUMN_Corrente_MaxEntrada, COLUMN_Eficiencia_media_Inv
    , COLUMN_Pot_Max_CC_Entrada, COLUMN_String_entrada, COLUMN_Tensao_Max_Saida_AC, COLUMN_Tensao_Fase_Neutro};

    // Indices das colunas da tabela Inversor

    public static int idIndex;
    public static int Modelo_Inv_Index;
    public static int Potencia_Nominal_Inv_Index;
    public static int TensaoVmppMax_Index;
    public static int TensaoVmppMin_Index;
    public static int Coefi_MPPT_Index;
    public static int Corrente_MaxEntradaIndex;
    public static int Eficiencia_Media_InvIndex;
    public static int PotenciaMaxCCEntradaIndex;
    public static int StringEntradaIndex;
    public static int Tensao_Max_Saida_AC_Index;
    public static int Tensao_Fase_Neutro_Index;


}
