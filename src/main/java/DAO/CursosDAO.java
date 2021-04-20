package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classes.cCursos;

public class CursosDAO implements DAO<cCursos> {
	private final Connection conexao;

	public CursosDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public cCursos findById(Long id) throws SQLException {
		cCursos curso = null;

		PreparedStatement preparedStatement = this.conexao.prepareStatement("select * from cursos where id = ?");
		preparedStatement.setLong(1, id);

		ResultSet resultset = preparedStatement.executeQuery();

		while (resultset.next()) {
			String nome = resultset.getString("nome");
			int idProfessor = resultset.getInt("idprofessor");

			curso = new cCursos(nome, idProfessor);
		}

		return curso;
	}

	public void inserir(cCursos curso) throws SQLException {
		PreparedStatement prepareStatement = this.conexao
				.prepareStatement("Insert int Cursos (nome_curso, id_professor)values (?,?)");
		prepareStatement.setString(1, curso.getNome());
		prepareStatement.setInt(2, curso.getProfessor());
		prepareStatement.execute();
	}

	public void deletar(Long id) throws SQLException {

		PreparedStatement prepareStatement = this.conexao.prepareStatement("delete from cursos where id = ?");
		prepareStatement.setLong(1, id);
		prepareStatement.execute();

	}

	public void alterar(Long id, cCursos curso) throws SQLException {

		PreparedStatement prepareStatement = this.conexao
				.prepareStatement("update cursos set nome_curso = ?,id_professor = ? where id = ?; ");
		
		prepareStatement.setString(1, curso.getNome());
		prepareStatement.setInt(2, curso.getProfessor());
		prepareStatement.setLong(3, curso.getId());

	}

}
