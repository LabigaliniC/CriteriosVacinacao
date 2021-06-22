package com.example.criteriosvacinacao;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {
    public static final String EXTRA_MORTALITY = "com.example.criteriosvacinacao.mortality";
    public static final String EXTRA_AGE = "com.example.criteriosvacinacao.age";
    public static final String EXTRA_SCORE = "com.example.criteriosvacinacao.score";
    public static final String EXTRA_SERIOUS = "com.example.criteriosvacinacao.serious";
    private static final String TAG = "MainActivity";
    private Spinner spinnerLista;

    private EditText nameEditText;
    private EditText ageEditText;
    private EditText emailEditText;
    private EditText telefoneEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.name_editText);
        emailEditText = findViewById(R.id.edit_TextEmail);
        telefoneEditText = findViewById(R.id.edit_TextTelefone);

        spinnerLista = findViewById(R.id.spinnerSpecifications);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.specifications, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLista.setAdapter(adapter);
        spinnerLista.setOnItemSelectedListener(this);
    }

    // launchSecondActivity
    public void calculatePrevisaoVacina(View view) {

        Log.d(TAG, "calcularPrevisaoVacinacao: " + spinnerLista.getSelectedItem().toString());
        //Log.d(TAG, "calcularPrevisaoVacinacao: " + spinnerLista.getItemAtPosition(1).toString());

        String priority;

        //String nome = "Vitor";
        //switch (nome.hashcode()) {
        //    case "Vitor".hashCode() : System.out.println("Valor de nome é Vitor");
        //        break;
        //    case "Paulo".hashCode() : System.out.println("Valor de nome é Paulo");
        //        break;
        //    default: System.out.println("Default");
        //}

        if (spinnerLista.getItemAtPosition(1) == "Idade superior a 80 anos"){
            priority = "Prioridade 1 - Data para iniciar a Vacinação dia 01/04/2021 à 01/05/2021 ";
        }
        else if (spinnerLista.getItemAtPosition(2) == "Índio"){
            priority = "Prioridade 2 - Data para iniciar a Vacinação dia 01/05/2021 à 01/06/2021 ";
        }
        else if (spinnerLista.getItemAtPosition(3) == "Profissionais Saúde - Atende Covid"){
            priority = "Prioridade 3 - Data para iniciar a Vacinação dia 01/06/2021 à 01/07/2021 ";
        }
        else if (spinnerLista.getItemAtPosition(4) == "Profissionais da Saúde - Geral"){
            priority = "Prioridade 4 - Data para iniciar a Vacinação dia 01/07/2021 à 01/08/2021 ";
        }
        else if (spinnerLista.getItemAtPosition(5) == "Idade superior a 70 anos"){
            priority = "Prioridade 5 - Data para iniciar a Vacinação dia 01/08/2021 à 01/09/2021 ";
        }
        else if (spinnerLista.getItemAtPosition(6) == "Idade superior a 60 anos"){
            priority = "Prioridade 6 - Data para iniciar a Vacinação dia 01/09/2021 à 01/10/2021 ";
        }
        else if (spinnerLista.getItemAtPosition(7) == ""){
            priority = "Prioridade 7 - Data para iniciar a Vacinação dia 01/10/2021 à 01/11/2021 ";
        }
        else if (spinnerLista.getItemAtPosition(8) == ""){
            priority = "Prioridade 8 - Data para iniciar a Vacinação dia 01/11/2021 à 01/12/2021 ";
        }
        else if (spinnerLista.getItemAtPosition(9) == ""){
            priority = "Prioridade 9 - Data para iniciar a Vacinação dia 01/12/2021 à 01/01/2022 ";
        }
        else if (spinnerLista.getItemAtPosition(10) == ""){
            priority = "Prioridade 10 - Data para iniciar a Vacinação dia 01/01/2022 à 01/02/2022 ";
        }
        else if (spinnerLista.getItemAtPosition(11) == ""){
            priority = "Prioridade 11 - Data para iniciar a Vacinação dia 01/02/2022 à 01/03/2022 ";
        }
        else if (spinnerLista.getItemAtPosition(12) == ""){
            priority = "Prioridade 12 - Data para iniciar a Vacinação dia 01/03/2022 à 01/04/2022 ";
        }
        else if (spinnerLista.getItemAtPosition(13) == ""){
            priority = "Prioridade 13 - Data para iniciar a Vacinação dia 01/04/2022 à 01/05/2022 ";
        }
        else if (spinnerLista.getItemAtPosition(14) == ""){
            priority = "Prioridade 14 - Data para iniciar a Vacinação dia 01/05/2022 à 01/06/2022 ";
        }
        else if (spinnerLista.getItemAtPosition(15) == ""){
            priority = "Prioridade 15 - Data para iniciar a Vacinação dia 01/06/2022 à 01/07/2022 ";
        }
        else if (spinnerLista.getItemAtPosition(16) == ""){
            priority = "Prioridade 16 - Data para iniciar a Vacinação dia 01/07/2022 à 01/08/2022 ";
        }
        else if (spinnerLista.getItemAtPosition(17) == ""){
            priority = "Prioridade 17 - Data para iniciar a Vacinação dia 01/08/2022 à 01/09/2022 ";
        }
        else if (spinnerLista.getItemAtPosition(18) == ""){
            priority = "Prioridade 18 - Data para iniciar a Vacinação dia 01/09/2022 à 01/10/2022 ";
        }
        else if (spinnerLista.getItemAtPosition(19) == ""){
            priority = "Prioridade 19 - Data para iniciar a Vacinação dia 01/10/2022 à 01/11/2022 ";
        }*/

        //Intent intent = new Intent(this, InformationActivity.class);
        //intent.putExtra(EXTRA_AGE, age);
        //intent.putExtra(EXTRA_MORTALITY, mortality);
        //intent.putExtra(EXTRA_AGE, age);
        //intent.putExtra(EXTRA_SCORE, score);
        //intent.putExtra(EXTRA_SERIOUS, serious);
       // startActivity(intent);


    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}