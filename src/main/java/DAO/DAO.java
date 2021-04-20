package DAO;

import java.sql.SQLException;

import Classes.cProfessor;

public interface DAO<T> {
	
public T findById(Long id) throws SQLException ;
public void inserir(T t) throws SQLException ; 
public void deletar(final Long id)throws SQLException ;
public void alterar(final Long id, T t)throws SQLException ; 

}
