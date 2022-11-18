package alura.com.br.agenda;

import android.app.Application;

import alura.com.br.agenda.dao.AlunoDAO;
import alura.com.br.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunoDeTeste();
    }
    private void criaAlunoDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Francisco ", "32132654654", "fmaia@gmail.com"));
        dao.salva(new Aluno("Patricia ", "987987987987", "paty@gmail.com"));
    }
}
