package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classes.cProfessor;

public class ProfessorDAO implements DAO<cProfessor> {

	private final Connection conexao;

	public ProfessorDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public cProfessor findById(Long id) throws SQLException {
		cProfessor professor = null;

		PreparedStatement preparedStatement = this.conexao.prepareStatement("select * from Professores where id = ?");
		preparedStatement.setLong(1, id);

		ResultSet resultset = preparedStatement.executeQuery();

		while (resultset.next()) {
			String nome = resultset.getString("nome");
			int idade = resultset.getInt("idade");

			professor = new cProfessor(nome, idade);

		}
		return professor;

	}

	
	
	
	
	public void inserir(cProfessor professor) throws SQLException {
		PreparedStatement preparedStatement = this.conexao
				.prepareStatement("Insert into PROFESSORES (nome , idade) values (?,?)");
		preparedStatement.setString(1, professor.getNome());
		preparedStatement.setInt(2, professor.getIdade());
		preparedStatement.execute();
	}

	public void deletar(Long id) throws SQLException {
		PreparedStatement preparedStatement = this.conexao.prepareStatement("delete from PROFESSORES where id=?");
		preparedStatement.setLong(1, id);
		preparedStatement.execute();
	}

	public void alterar(Long id, cProfessor t) throws SQLException {
		PreparedStatement preparedStatement = this.conexao
				.prepareStatement("update professores set nome = ?, idade = ? where id = ?; ");
		preparedStatement.setString(1, t.getNome());
		preparedStatement.setInt(2, t.getIdade());
		preparedStatement.setLong(3, t.getId());
		preparedStatement.execute();
	}

}
