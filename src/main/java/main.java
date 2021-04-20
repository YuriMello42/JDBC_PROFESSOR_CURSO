import java.sql.Connection;
import java.sql.SQLException;

import Classes.cCursos;
import Classes.cProfessor;
import Conexao.ConnectionFactory;
import DAO.CursosDAO;
import DAO.ProfessorDAO;

public class main {

	public static void main(String[] args) throws SQLException {

		Connection conn = ConnectionFactory.getInstance().getConnection();
		
		cProfessor professor = new cProfessor("Lord", 32);
		cCursos curso = new cCursos("JK Tracer", 1);
		
		CursosDAO.inserir(curso);
		
	}

}
