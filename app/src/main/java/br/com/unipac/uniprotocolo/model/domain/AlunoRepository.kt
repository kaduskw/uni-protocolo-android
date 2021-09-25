package br.com.unipac.uniprotocolo.model.domain

import android.content.Context


class AlunoRepository (context: Context){

    var alunos: ArrayList<Aluno>? = null

    fun save(aluno: Aluno) {
        alunos?.add(aluno)
    }

    fun list(): ArrayList<Aluno>? {
        return alunos
    }
}