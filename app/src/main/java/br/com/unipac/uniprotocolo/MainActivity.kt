package br.com.unipac.uniprotocolo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.unipac.uniprotocolo.model.domain.Aluno
import br.com.unipac.uniprotocolo.model.domain.AlunoRepository


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alunoRepository = AlunoRepository(this)

        val nomeAlunoEdt = findViewById<EditText>(R.id.nomeAlunoEdt)
        val matriculaEdt = findViewById<EditText>(R.id.matriculaEdt)
        val cadastrarBtn = findViewById<Button>(R.id.cadastrarBtn)

        cadastrarBtn.setOnLongClickListener {

            val nomeAlunoEdt1 = nomeAlunoEdt.text.toString().trim()
            val matriculaEdt1 = matriculaEdt.text.toString().trim()

            if (nomeAlunoEdt1.isNotEmpty() && matriculaEdt1.isNotEmpty()) {

                var nome = nomeAlunoEdt1
                var matricula = matriculaEdt1.toInt()

                var aluno = Aluno(1, nome, matricula)
                alunoRepository.save(aluno)

                var alunoList = alunoRepository.list()
                Toast.makeText(this, "Lista de alunos $alunoList", Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(this, "Favor colocar dados!", Toast.LENGTH_LONG).show()
            }
        }

    }
}




