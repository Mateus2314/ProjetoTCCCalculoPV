package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.interfaces.IInversorDao;
import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.schemas.InversorSchemas;
import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.schemas.UsuarioSchema;
import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.model.Inversor;
import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class InversorDao implements IInversorDao {

    private Cursor cursor;
    private ContentValues contentValues;
    private SQLiteDatabase db;

    public InversorDao(SQLiteDatabase db){this.db = db;}

    /* Salvar um usuario */

    @Override
    public  boolean save(Inversor inversor){
        try{
            contentValues = new ContentValues();
            contentValues.put(InversorSchemas.COLUMN_Modelo_Inv, inversor.getModelo_Inv());
            contentValues.put(InversorSchemas.COLUMN_Potencia_Nom, inversor.getPotencia_Nominal_Inv());
            contentValues.put(InversorSchemas.COLUMN_TensaoVmppMax, inversor.getTensaoVmppMax());
            contentValues.put(InversorSchemas.COLUMN_TensaoVmppMin, inversor.getTensaoVmppMin());
            contentValues.put(InversorSchemas.COLUMN_Coefi_MPPT, inversor.getCoefi_MPPT());
            contentValues.put(InversorSchemas.COLUMN_Corrente_MaxEntrada, inversor.getCorrente_MaxEntrada());
            contentValues.put(InversorSchemas.COLUMN_Eficiencia_media_Inv, inversor.getEficiencia_med_Inv());
            contentValues.put(InversorSchemas.COLUMN_Pot_Max_CC_Entrada, inversor.getPotencia_Max_CC_Entrada());
            contentValues.put(InversorSchemas.COLUMN_String_entrada, inversor.getString_entrada());
            contentValues.put(InversorSchemas.COLUMN_Tensao_Max_Saida_AC, inversor.getTensao_max_AC_saida());
            contentValues.put(InversorSchemas.COLUMN_Tensao_Fase_Neutro, inversor.getTensao_Fase_Neutro());
            return  this.db.insert(InversorSchemas.TABLE_INVERSOR,null, contentValues) > 0;
            }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    // Retorna todos os usuarios

    @Override
    public List<Inversor> findAll(){
        try {
            List<Inversor> inversors = new ArrayList<>();
            cursor = this.db.query(InversorSchemas.CREATE_TABLE, InversorSchemas.INVER_COLUMNS,null,null,null,null, InversorSchemas.COLUMN_ID);
            if (cursor != null){
                cursor.moveToFirst();
                while (!cursor.isAfterLast()){
                    Inversor inversor = new Inversor();
                    if (cursor != null){
                        if (cursor.getColumnIndex(InversorSchemas.COLUMN_ID)!= -1){
                            InversorSchemas.idIndex = cursor.getColumnIndexOrThrow(InversorSchemas.COLUMN_ID);
                            inversor.setId(cursor.getInt(InversorSchemas.idIndex));
                        }
                        if (cursor.getColumnIndex(InversorSchemas.COLUMN_Modelo_Inv)!= -1){
                            InversorSchemas.Modelo_Inv_Index = cursor.getColumnIndexOrThrow(InversorSchemas.COLUMN_Modelo_Inv);
                            inversor.setModelo_Inv(cursor.getString(InversorSchemas.Modelo_Inv_Index));
                        }
                        if (cursor.getColumnIndex(InversorSchemas.COLUMN_Potencia_Nom)!= -1){
                            InversorSchemas.Potencia_Nominal_Inv_Index = cursor.getColumnIndexOrThrow(InversorSchemas.COLUMN_Potencia_Nom);
                            inversor.setPotencia_Nominal_Inv(cursor.getString(InversorSchemas.Potencia_Nominal_Inv_Index));
                        }
                        if (cursor.getColumnIndex(InversorSchemas.COLUMN_TensaoVmppMax)!= -1){
                            InversorSchemas.TensaoVmppMax_Index = cursor.getColumnIndexOrThrow(InversorSchemas.COLUMN_TensaoVmppMax);
                            inversor.setTensaoVmppMax(cursor.getString(InversorSchemas.TensaoVmppMax_Index));
                        }
                        if (cursor.getColumnIndex(InversorSchemas.COLUMN_TensaoVmppMin)!= -1){
                            InversorSchemas.TensaoVmppMin_Index = cursor.getColumnIndexOrThrow(InversorSchemas.COLUMN_TensaoVmppMin);
                            inversor.setTensaoVmppMin(cursor.getString(InversorSchemas.TensaoVmppMin_Index));
                        }
                        if (cursor.getColumnIndex(InversorSchemas.COLUMN_Coefi_MPPT)!= -1){
                            InversorSchemas.Coefi_MPPT_Index = cursor.getColumnIndexOrThrow(InversorSchemas.COLUMN_Coefi_MPPT);
                            inversor.setCoefi_MPPT(cursor.getString(InversorSchemas.Coefi_MPPT_Index));
                        }
                        if (cursor.getColumnIndex(InversorSchemas.COLUMN_Corrente_MaxEntrada) != -1){
                            InversorSchemas.Corrente_MaxEntradaIndex = cursor.getColumnIndexOrThrow(InversorSchemas.COLUMN_Corrente_MaxEntrada);
                            inversor.setCorrente_MaxEntrada(cursor.getString(InversorSchemas.Corrente_MaxEntradaIndex));
                        }
                        if (cursor.getColumnIndex(InversorSchemas.COLUMN_Eficiencia_media_Inv) != -1){
                            InversorSchemas.Eficiencia_Media_InvIndex = cursor.getColumnIndexOrThrow(InversorSchemas.COLUMN_Eficiencia_media_Inv);
                            inversor.setEficiencia_med_Inv(cursor.getString(InversorSchemas.Eficiencia_Media_InvIndex));
                        }
                        if (cursor.getColumnIndex(InversorSchemas.COLUMN_Pot_Max_CC_Entrada) != -1){
                            InversorSchemas.PotenciaMaxCCEntradaIndex = cursor.getColumnIndexOrThrow(InversorSchemas.COLUMN_Pot_Max_CC_Entrada);
                            inversor.setPotencia_Max_CC_Entrada(cursor.getString(InversorSchemas.PotenciaMaxCCEntradaIndex));
                        }
                        if (cursor.getColumnIndex(InversorSchemas.COLUMN_String_entrada) != -1){
                            InversorSchemas.StringEntradaIndex = cursor.getColumnIndexOrThrow(InversorSchemas.COLUMN_String_entrada);
                            inversor.setString_entrada(cursor.getString(InversorSchemas.StringEntradaIndex));
                        }
                        if (cursor.getColumnIndex(InversorSchemas.COLUMN_Tensao_Max_Saida_AC) != -1){
                            InversorSchemas.Tensao_Max_Saida_AC_Index = cursor.getColumnIndexOrThrow(InversorSchemas.COLUMN_Tensao_Max_Saida_AC);
                            inversor.setTensao_max_AC_saida(cursor.getString(InversorSchemas.Tensao_Max_Saida_AC_Index));
                        }
                        if (cursor.getColumnIndex(InversorSchemas.COLUMN_Tensao_Fase_Neutro) != -1){
                            InversorSchemas.Tensao_Fase_Neutro_Index = cursor.getColumnIndexOrThrow(InversorSchemas.COLUMN_Tensao_Fase_Neutro);
                            inversor.setTensao_Fase_Neutro(cursor.getString(InversorSchemas.Tensao_Fase_Neutro_Index));
                        }

                    }inversors.add(inversor);
                    cursor.moveToNext();
                }
            }
            return inversors;
        }catch (SQLException e){
            return null;
        }finally {
            cursor.close();
        }
    }
}
