package com.example.criteriosvacinacao;

import android.content.Intent;
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
    public static final String EXTRA_NAME = "com.example.criteriosvacinacao.name";
    public static final String EXTRA_EMAIL = "com.example.criteriosvacinacao.email";
    public static final String EXTRA_PRIORITY = "com.example.criteriosvacinacao.priority";
    private static final String TAG = "MainActivity";
    private Spinner spinnerLista;

    private EditText nameEditText;
    private EditText emailEditText;
    private EditText telefoneEditText;
    private String name;
    private String email;

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
        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();

        Log.d(TAG, "calcularPrevisaoVacinacao: " + spinnerLista.getSelectedItem().toString());
        //Log.d(TAG, "calcularPrevisaoVacinacao: " + spinnerLista.getItemAtPosition(1).toString());

        String priority;
        String selection = spinnerLista.getSelectedItem().toString();

        switch (selection){
            case "Idade superior a 80 anos":
                priority = "Prioridade 1, Vacinação dia 01/04/2021 à 01/05/2021";
                break;
            case "Índio":
                priority = "Prioridade 2, Vacinação dia 01/05/2021 à 01/06/2021";
                break;
            case "Profissionais Saúde - Atende Covid":
                priority = "Prioridade 3, Vacinação dia 01/06/2021 à 01/07/2021";
                break;
            case "Profissionais da Saúde - Geral":
                priority = "Prioridade 4, Vacinação dia 01/07/2021 à 01/08/2021";
                break;
            case "Idade superior a 70 anos":
                priority = "Prioridade 5, Vacinação dia 01/08/2021 à 01/09/2021";
                break;
            case "Idade superior a 60 anos":
                priority = "Prioridade 6, Vacinação dia 01/09/2021 à 01/10/2021";
                break;
            case "Com Comorbidade Comprovada":
                priority = "Prioridade 7, Vacinação dia 01/10/2021 à 01/11/2021";
                break;
            case "Profissionais Segurança":
                priority = "Prioridade 8, Vacinação dia 01/11/2021 à 01/12/2021";
                break;
            case "Profissionais Área Educação":
                priority = "Prioridade 9, Vacinação dia 01/12/2021 à 01/01/2022";
                break;
            case "Motoristas Transporte Coletivo":
                priority = "Prioridade 10, Vacinação dia 01/01/2022 à 01/02/2022";
                break;
            case "Motoristas Caminhão":
                priority = "Prioridade 11, Vacinação dia 01/02/2022 à 01/03/2022";
                break;
            case "Profissional Atendimento ao Público":
                priority = "Prioridade 12, Vacinação dia 01/03/2022 à 01/04/2022";
                break;
            case "Idade superior a 50 anos":
                priority = "Prioridade 13, Vacinação dia 01/04/2022 à 01/05/2022";
                break;
            case "Grávida":
                priority = "Prioridade 14, Vacinação dia 01/05/2022 à 01/06/2022";
                break;
            case "Idade superior a 40 anos":
                priority = "Prioridade 15, Vacinação dia 01/06/2022 à 01/07/2022";
                break;
            case "Presidiário":
                priority = "Prioridade 16, Vacinação dia 01/07/2022 à 01/08/2022";
                break;
            case "Idade superior a 30 anos":
                priority = "Prioridade 17, Vacinação dia 01/08/2022 à 01/09/2022";
                break;
            case "Idade superior a 25 anos":
                priority = "Prioridade 18, Vacinação dia 01/09/2022 à 01/10/2022";
                break;
            case "Idade superior a 18 anos":
                priority = "Prioridade 19, Vacinação dia 01/10/2022 à 01/11/2022";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selection);
        }
        
        Intent intent = new Intent(this, InformationActivity.class);
        intent.putExtra(EXTRA_NAME, name);
        intent.putExtra(EXTRA_EMAIL, email);
        intent.putExtra(EXTRA_PRIORITY, priority);
        startActivity(intent);
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