package Controller;

import Dao.AlunoDao;
import Model.Aluno;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class AlunoController {
        AlunoDao alunoDao;

    public AlunoController() {
        if (alunoDao == null) {
            alunoDao = new AlunoDao();
        }
    }

    public boolean insereAluno(Aluno aluno) {

        if (aluno.getAlunoid() != 0) {
            return alunoDao.updateAluno(aluno);
        } else {
            return alunoDao.insereAluno(aluno);
        }
    }

    public ArrayList<Aluno> getAlunos() {
        return alunoDao.getAlunos();
    }

    public boolean deleteAluno(int id) {
        return alunoDao.deleteAluno(id);
    }
}