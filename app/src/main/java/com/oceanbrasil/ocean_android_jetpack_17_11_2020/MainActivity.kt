package com.oceanbrasil.ocean_android_jetpack_17_11_2020

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // BoilerPlate é aquele código que não necessariamente precisamos entender
        // como ele funciona, mas precisamos saber como utilizá-lo
        // É aquele código essencial para algo funcionar, e que toda vez
        // precisamos escrevê-lo e mantê-lo
        // Geralmente as bibliotecas servem para evitar com que a gente tenha
        // que ficar escrevendo e mantendo um monte de código boilerplate

        // Obtém a instância do ViewModel utilizando o ViewModelProvider, ViewModelProvider.Factory
        // e a própria classe do ViewModel, que no caso é a TextViewModel
        val viewModel =
                ViewModelProvider(this, TextViewModelFactory())
                        .get(TextViewModel::class.java)

        // Atualiza a UI com o texto presente no ViewModel atualmente
        textView.text = viewModel.text

        // Quando o textView for clicado, altera o texto do ViewModel
        // e atualiza a UI
        textView.setOnClickListener {
            viewModel.text = "Texto alterado"
            textView.text = viewModel.text
        }
    }
}

/*
class Impressora(val tinta: Boolean) {

    fun imprimir() {
        print("Resultado!")
    }
}

object ImpressoraFactory {
    fun create(tinta: Boolean = true): Impressora {
        return Impressora(tinta)
    }
}

object ProgramaFactory {
    fun create(): Programa {
        return Programa()
    }
}

class Programa {
    fun executar(impressora: Impressora) {
        impressora.imprimir()

        print("Execução finalizada")
    }
}

object ProgramaTeste {
    fun testarExecucaoFuncionando() {
        val programa = ProgramaFactory.create()
        val impressora = ImpressoraFactory.create()
        programa.executar(impressora)

        // Validar se a execução foi bem sucedida
    }

    fun testarExecucaoSemTinta() {
        val programa = ProgramaFactory.create()
        val impressoraSemTinta = ImpressoraFactory.create(false)
        programa.executar(impressoraSemTinta)

        // Validar se a execução falhou informando que estava sem tinta
    }
}
*/
